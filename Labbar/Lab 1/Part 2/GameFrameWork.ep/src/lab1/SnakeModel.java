package lab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

/**
 * Created by Yunalescca on 12/11/15
 * Our SnakeModel implementation
 * The player (the snake) starts out as just the head,
 * and for every food collected, body will increase by one.
 * Food will replace itself every time the snake
 * gets to its position.
 * The game will end if the player hits the walls or
 * the body of the snake.
 */
public class SnakeModel extends GameModel {
    public enum Directions {
        EAST(1, 0),
        WEST(-1, 0),
        NORTH(0, -1),
        SOUTH(0, 1),
        NONE(0, 0);

        private final int xDelta;
        private final int yDelta;

        Directions(final int xDelta, final int yDelta) {
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }

        public int getXDelta() {
            return this.xDelta;
        }

        public int getYDelta() {
            return this.yDelta;
        }
    }


    /** Graphical representation of the food. */
    private static final GameTile FOOD_TILE = new RoundTile(new Color(255, 215,
            0),
            new Color(255, 255, 0), 2.0);

    /** Graphical representation of the collector */
    private static final GameTile COLLECTOR_TILE = new HeadTile(new Color(0,150,0));

    /** Graphical representation of a blank tile. */
    private static final GameTile BLANK_TILE = new GameTile();

    private static final GameTile BODY_TILE = new RectangularTile(new Color(0,150,0));

    /** A list containing the position of the food. */
    private final List<Position> food = new ArrayList<Position>();

    private final Deque<Position> body = new LinkedList<Position>();
	/*
	 * The declaration and object creation above uses the new language feature
	 * 'generic types'. It can be declared in the old way like this:
	 * private java.util.List coins = new ArrayList();
	 * This will however result in a warning at compilation
	 * "Position" in this case is the type of the objects that are going
	 * to be used in the List
	 */

    /** The position of the collector. */
    private Position collectorPos;

    /** The direction of the collector. */
    private Directions direction = Directions.NORTH;

    /** The number of food pieces found. */
    private int score;

    /**
     * Create a new model for the snake game.
     */
    public SnakeModel() {
        Dimension size = getGameboardSize();

        // Blank out the whole game board
        for (int i = 0; i < size.width; i++) {
            for (int j = 0; j < size.height; j++) {
                setGameboardState(i, j, BLANK_TILE);
            }
        }

        // Insert the collector in the middle of the game board.
        this.collectorPos = new Position(size.width / 2, size.height / 2);
        setGameboardState(this.collectorPos, COLLECTOR_TILE);

        // Insert food into the game board.
        addFood();
    }

    /**
     * Insert a food piece into the game board.
     */
    private void addFood() {
        Position newFoodPos;
        Dimension size = getGameboardSize();
        // Loop until a blank position is found and ...
        do {
            newFoodPos = new Position((int) (Math.random() * size.width),
                    (int) (Math.random() * size.height));
        } while (!isPositionEmpty(newFoodPos));

        // ... add a new coin to the empty tile.
        setGameboardState(newFoodPos, FOOD_TILE);
        this.food.add(newFoodPos);
    }

    /**
     * Return whether the specified position is empty.
     *
     * @param pos
     *            The position to test.
     * @return true if position is empty.
     */
    private boolean isPositionEmpty(final Position pos) {
        return (getGameboardState(pos) == BLANK_TILE);
    }

    /**
     * Update the direction of the collector
     * according to the user's key press, but only
     * if the current direction is not the opposite one
     */
    private void updateDirection(final int key) {
        switch (key) {
            case KeyEvent.VK_LEFT:
                if(this.direction != Directions.EAST) {
                    this.direction = Directions.WEST;
                }
                break;
            case KeyEvent.VK_UP:
                if(this.direction != Directions.SOUTH) {
                    this.direction = Directions.NORTH;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(this.direction != Directions.WEST) {
                    this.direction = Directions.EAST;
                }
                break;
            case KeyEvent.VK_DOWN:
                if(this.direction != Directions.NORTH) {
                    this.direction = Directions.SOUTH;
                }
                break;
            default:
                // Don't change direction if another key is pressed
                break;
        }
    }

    /**
     * Get next position of the collector.
     */
    private Position getNextCollectorPos() {
        return new Position(
            this.collectorPos.getX() + this.direction.getXDelta(),
            this.collectorPos.getY() + this.direction.getYDelta());
    }


    /**
     * This method is called repeatedly so that the
     * game can update its state.
     *
     * @param lastKey
     *            The most recent keystroke.
     */
    @Override
    public void gameUpdate(final int lastKey) throws GameOverException {
        updateDirection(lastKey);

        // Erase the previous position.
        setGameboardState(this.collectorPos, BLANK_TILE);

        // We add the first part of the body at the old position of the head
        this.body.addFirst(collectorPos);
        Position first = this.body.getFirst();

        // Change collector position.
        this.collectorPos = getNextCollectorPos();


        // Either if we hit the walls or if the head hit the rest of the body
        if (isOutOfBounds(this.collectorPos) || getGameboardState(collectorPos) == BODY_TILE
                || body.size() + 1 == getGameboardSize().getHeight() * getGameboardSize().getWidth()) {
            throw new GameOverException(this.score);
        }



        // Draw collector and the rest of the body at new positions.
        setGameboardState(this.collectorPos, COLLECTOR_TILE);
        setGameboardState(first, BODY_TILE);


        // Remove the food at the new collector position (if any), and replace it.
        if (this.food.remove(this.collectorPos)) {
            this.score++;
            addFood();

        // If we don't eat then we erase the last position in body.
        } else {
            Position last = this.body.getLast();
            this.body.removeLast();
            setGameboardState(last, BLANK_TILE);
        }
    }

    /**
     *
     * @param pos The position to test.
     * @return <code>false</code> if the position is outside the playing field, <code>true</code> otherwise.
     */
    private boolean isOutOfBounds(Position pos) {
        return pos.getX() < 0 || pos.getX() >= getGameboardSize().width
                || pos.getY() < 0 || pos.getY() >= getGameboardSize().height;
    }

}
