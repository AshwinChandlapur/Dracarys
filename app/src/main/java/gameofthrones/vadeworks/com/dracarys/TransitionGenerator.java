package gameofthrones.vadeworks.com.dracarys;

import android.graphics.RectF;

public interface TransitionGenerator {


    public Transition generateNextTransition(RectF drawableBounds, RectF viewport);

}
