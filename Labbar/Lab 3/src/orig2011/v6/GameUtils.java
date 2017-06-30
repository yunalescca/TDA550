package orig2011.v6;

/**
 * Created by Yunalescca on 02/12/15.
 *
 * Help class to help set the game board state for subclasses
 */
public class GameUtils {


    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public static void setGameboardState(final Position pos, final GameTile tile,
                                     final GameTile[][] board) {
        setGameboardState(pos.getX(), pos.getY(), tile, board);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    public static void setGameboardState(final int x, final int y, final GameTile tile,
                                     final GameTile[][] board) {
        board[x][y] = tile;
    }

}
