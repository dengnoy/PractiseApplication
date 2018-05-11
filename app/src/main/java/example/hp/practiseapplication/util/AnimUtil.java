package example.hp.practiseapplication.util;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import example.hp.practiseapplication.R;

public class AnimUtil {
    //view animation

    Animation mTranslate, mScale, mRotate, mAlpha;

    public static AnimUtil sInstant;

    public static enum Type {
        Translate,
        Scale,
        Rotate,
        Alpha,

    }

    public static AnimUtil init(Context context) {
        if (sInstant == null) {
            sInstant = new AnimUtil();
            sInstant.mTranslate = AnimationUtils.loadAnimation(context, R.anim.translate);
            sInstant.mScale = AnimationUtils.loadAnimation(context, R.anim.scale);
            sInstant.mRotate = AnimationUtils.loadAnimation(context, R.anim.rotate);
            sInstant.mAlpha = AnimationUtils.loadAnimation(context, R.anim.alpha);
        }
        return sInstant;


    }

    public void commonAnim(View v, Type animType) {
        switch (animType) {

            case Alpha:
                mAlpha.setFillAfter(true);
                v.startAnimation(mAlpha);
                break;

            case Scale:
                mScale.setFillAfter(true);
                v.startAnimation(mScale);
                break;

            case Rotate:
                mRotate.setFillAfter(true);
                v.startAnimation(mRotate);
                break;

            case Translate:
                mTranslate.setFillAfter(true);
                v.startAnimation(mTranslate);
                break;

        }

    }


    //======================================================
    //proper animation
}
