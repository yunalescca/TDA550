package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Circle extends AbstractGeoForm{

    /**
     * Constructs a Circle with x and y coordinates, a diameter and a Color c
     * @param x the x coordinate
     * @param y the y coordinate
     * @param diameter the diameter of the circle
     * @param c the color of the circle
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
        super(x, y, diameter, diameter, c);
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }
    }

    /**
     * Constructs a circle with a Geometrical form, diameter and a Color
     * @param f a GeometricalForm from which to extract the coordinates
     * @param diameter the diameter of the circle
     * @param c the color of the circle
     */
    public Circle(GeometricalForm f, int diameter, Color c) {
        super(f, diameter, diameter, c);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return (int) (Math.PI*getWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return (int) (Math.pow(getWidth()/2, 2) * Math.PI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getWidth());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getWidth() + 56789123 * getWidth();
    }
}
