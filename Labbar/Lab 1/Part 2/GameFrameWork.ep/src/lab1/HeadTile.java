package lab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Created by Yunalescca on 12/11/15.
 */
public class HeadTile extends GameTile {

    /** The color of the rectangle */
    private final Color color;

    /**
     * Creates a rectangular game tile.
     *
     * @param color
     *            the color of the rectangle.
     */
    public HeadTile(final Color color) {
        this.color = color;
    }


    /**
     * Draws itself in a given graphics context, position and size.
     *
     * @param g
     *            graphics context to draw on.
     * @param x
     *            pixel x coordinate of the tile to be drawn.
     * @param y
     *            pixel y coordinate of the tile to be drawn.
     * @param d
     *            size of this object in pixels.
     */
    @Override
    public void draw(final Graphics g, final int x, final int y,
                     final Dimension d) {
        g.setColor(this.color);
        g.fillRect(x, y, d.width, d.height);

        //Eyes
        g.setColor(Color.WHITE);
        g.fillOval(x + 5, y + 5, d.width - 25, d.height - 25);
        g.fillOval(x + 25, y + 5, d.width - 25, d.height - 25);

        //pupils
        g.setColor(Color.BLACK);
        g.fillOval(x + 9, y + 9, d.width - 30, d.height - 30);
        g.fillOval(x + 29, y + 9, d.width - 30, d.height - 30);

        //tongue
        g.setColor(Color.RED);
        g.fillRect(x+18, y+25, d.width-35, d.height-20);

    }
}
