package geometri;

import java.awt.*;

/**
 * Created by Yunalescca on 19/11/15.
 */
public class Line extends AbstractGeoForm{

    private boolean isNegative;

    /**
     * Constructs a line with start and end coordinates and a color
     * @param x1 the start x coordinate
     * @param y1 the start y coordinate
     * @param x2 the end x coordinate
     * @param y2 the end y coordinate
     * @param c the color of the line
     * @throws IllegalPositionException if negative coordinates were entered
     */
    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
        super(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1-x2), Math.abs(y1-y2), c);
        if((x1 < 0) || (y1 < 0) || (x2 < 0) || (y2 < 0)) {
            throw new IllegalPositionException("Negative coordinates not allowed");
        }

        //If the coordinates of the top left corner answer to our (x1,y1) or (x2,y2)
        //then the line is declining
        isNegative = (getX() == x1 && getY() == y1 || getX() == x2 && getY() == y2);
    }

    /**
     * Constructs a line with two GeometricalForm:s and a Color
     * @param f1 a GeometricalForm from which to extract the start coordinates
     * @param f2 a GeometricalForm from which to extract the end coordinates
     * @param c the color of the line
     */
    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        super(f1, Math.abs(f1.getX() - f2.getX()), Math.abs(f1.getY() - f2.getY()), c);

        try{
            this.place(Math.min(f1.getX(), f2.getX()), Math.min(f1.getY(), f2.getY()));
        } catch (IllegalPositionException e){
            throw new RuntimeException("Negative coordinates not allowed");
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            Line l = (Line) obj;
            return l.isDeclining() == this.isDeclining();
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return (int) (Math.sqrt((Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2))));
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
        if(isNegative){
            g.drawLine(getX(), getY(), (getX()+getWidth()), (getY()+getHeight()));
        } else {
            g.drawLine(getX(), (getY()+getHeight()), getX()+getWidth(), getY());
        }

    }

    public boolean isDeclining(){
        return isNegative;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 23456789 * getX() + 56789123 * getY();
    }
}
