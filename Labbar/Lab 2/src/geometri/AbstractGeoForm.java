package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public abstract class AbstractGeoForm implements GeometricalForm {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color c;

    /**
     * Constructs an AbstractGeoForm with x and y coordinates and a Color
     * @param x the x coordinate
     * @param y the y coordinate
     * @param c the color of the shape
     */
    public AbstractGeoForm(int x, int y, int width, int height, Color c){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }

    public AbstractGeoForm(GeometricalForm f, int width, int height, Color c){
        this.width = width;
        this.height = height;
        this.c = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void place(int x, int y) throws IllegalPositionException {
        if((x < 0) || (y < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }

        this.x = x;
        this.y = y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor(){
        return c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX(){
        return x;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY(){
        return y;
    }

    @Override
    /**
     * {@inheritDoc}
     */
    public void move(int dx, int dy) throws IllegalPositionException {
        if(((x + dx) < 0) || ((y + dy) < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }

        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    /**
     * HashCode
     * @return 0
     */
    @Override
    public abstract int hashCode();

    /**
     * Equals used for comparing two objects
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals (final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        AbstractGeoForm a = (AbstractGeoForm) obj;
        return a.getWidth() == this.getWidth() && a.getHeight() == this.getHeight()
                && a.getColor() == this.getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWidth(){
        return width;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight(){
        return height;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract int getPerimeter();

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract int getArea();

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(GeometricalForm f){
        int diff = getArea() - f.getArea();
        if (diff != 0) {
            return diff;
        }

        return (getPerimeter() - f.getPerimeter());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract void fill(Graphics g);
}
