package hungry.ex_frag.picTest;

import android.graphics.drawable.AnimationDrawable;

/**
 * Created by soy on 2016-09-10.
 */
class Starter implements Runnable {
    AnimationDrawable animation;

    public Starter(AnimationDrawable animation) {
        this.animation = animation;
    }

    public void run() {
        animation.start();
    }
}
