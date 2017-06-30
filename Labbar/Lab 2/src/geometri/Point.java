package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Point extends AbstractGeoForm{

    /**
     * Constructs a point with x and y coordinates and a color
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the point
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Point(int x, int y, Color c) throws IllegalPositionException{
        super(x, y, 0, 0, c);
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }
    }

    /**
     * Constructs a line with a GeometricalForm and a color
     * @param f a GeometricalForm from which to extract the coordinates
     * @param c the color of the point
     */
    public Point(GeometricalForm f, Color c) {
        super(f, 0, 0, c);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX(), getY(), getX(), getY());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getX() + 56789123 * getY();
    }
}
