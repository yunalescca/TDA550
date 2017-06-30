package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Square extends AbstractGeoForm{

    /**
     * Constructs a square with x and y coordinates, a side and a color
     * @param x the x coordinate
     * @param y the y coordinate
     * @param side the side of the square
     * @param c the color of the square
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Square(int x, int y, int side, Color c) throws IllegalPositionException {
        super(x, y, side, side, c);
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }
    }

    /**
     * Constructs a square with a Geometrical form, a side and a color
     * @param f a GeometricalForm from which to extract the coordinates
     * @param side the side of the square
     * @param c the color of the square
     */
    public Square(GeometricalForm f, int side, Color c) {
        super(f, side, side, c);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return 4*getWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return getWidth()*getWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getWidth() + 56789123 * getWidth();
    }
}
