package staw.com.fleetadmiralcontrol.factory;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import staw.com.fleetadmiralcontrol.R;
import staw.com.fleetadmiralcontrol.ShipControlActivity;
import staw.com.fleetadmiralcontrol.listener.TokenTouchListener;

/**
 * Created by jorge on 15/08/17.
 */

public class FactoryToken {


    public static ImageView createTokenEnergy(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_energy);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }


    public static ImageView createTokenDial(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_dial);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }

    public static ImageView createTokenShield(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_shield);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }

    public static ImageView createTokenShield5(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_shield5);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }

    public static ImageView createTokenHull(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_hull);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }



    public static ImageView createTokenHull5(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_hull5);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }


    public static ImageView createTokenArmor(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_armor);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }


    public static ImageView createTokenDetection(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_deteccion);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50, 50);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }

    public static ImageView createTokenCritical(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_critical);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }

    public static ImageView createTokenTime(int posx, int posy, ShipControlActivity activity) {

        ImageView img = new ImageView(activity);
        img.setImageResource(R.drawable.token_time);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(80, 80);
        params.leftMargin = posx;
        params.topMargin = posy;
        img.setLayoutParams(params);


        TokenTouchListener touchListener = new TokenTouchListener(activity.getWindowwidth(), activity.getWindowheight());
        img.setOnTouchListener(touchListener);

        return img;
    }




}
