package orig2011.v7;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Yunalescca on 16/12/15.
 */
public class ReversiScoreView implements PropertyChangeListener{


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getSource().getClass() == ReversiModel.class && evt.getPropertyName().equals("Score Update")) {
            ReversiModel model = (ReversiModel) evt.getSource();
            System.out.println("Turn: " +  model.getTurnColor() + "\nBlack: " + model.getBlackScore()
                + "\nWhite: " + model.getWhiteScore());
        }

    }
}
