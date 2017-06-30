package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Rectangle extends AbstractGeoForm{

    /**
     * Constructs a Rectangle with x and y coordinates, width, height and a color
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param c the color of the rectangle
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
        super(x,y, width, height, c);
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }
    }

    /**
     * Constructs a Rectangle with a GeometricalForm, width, height and a color
     * @param f a GeometricalForm from which to extract the coordinates
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param c the color of the rectangle
     */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {
        super(f, width, height, c);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return (2*getWidth()+2*getHeight());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return getWidth()*getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getWidth() + 56789123 * getHeight();
    }
}
