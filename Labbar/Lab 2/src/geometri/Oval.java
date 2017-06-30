package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Oval extends AbstractGeoForm{

    /**
     * Constructs an oval with x and y coordinates, width, height and a color
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width of the oval
     * @param height the height of the oval
     * @param c the color of the oval
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
        super(x, y, width, height, c);
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }
    }

    /**
     * Constructs an oval with a Geometrical form, width, height and a color
     * @param f a GeometricalForm from which to extract the coordinates
     * @param width the width of the oval
     * @param height the height of the oval
     * @param c the color of the ovals
     */
    public Oval(GeometricalForm f, int width, int height, Color c) {
        super(f, width, height, c);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return (int) (Math.PI*Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return (int) (Math.PI*(getWidth()/2) * (getHeight()/2));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {

        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getWidth() + 56789123 * getHeight();
    }
}
