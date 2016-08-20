package br.caos.guiasw.utilitarios;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class Animacoes {

    public static void animaEntradaMenu(View view, final View viewOpacidade){

        TranslateAnimation animation = new TranslateAnimation(-1000,0,0,0);
        animation.setDuration(200);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                viewOpacidade.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                viewOpacidade.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(animation);

    }

    public static void animaSaidaMenu(final View view, final View viewOpacidade){

        if(view.getVisibility() == View.VISIBLE){
            TranslateAnimation animation = new TranslateAnimation(0,-1000,0,0);
            animation.setDuration(200);

            animation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    viewOpacidade.setVisibility(View.GONE);
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(View.GONE);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });

            view.startAnimation(animation);

        }

    }

}
