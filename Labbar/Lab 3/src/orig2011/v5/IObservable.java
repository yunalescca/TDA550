package orig2011.v5;

import java.beans.PropertyChangeListener;

/**
 * Created by Yunalescca on 09/12/15.
 */
public interface IObservable {

    public void addObserver(PropertyChangeListener observer);

    public void removeObserver(PropertyChangeListener observer);
}
