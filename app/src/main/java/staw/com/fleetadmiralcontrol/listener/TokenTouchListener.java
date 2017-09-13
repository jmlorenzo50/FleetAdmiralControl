package staw.com.fleetadmiralcontrol.listener;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by jorge on 15/08/17.
 */

public class TokenTouchListener  implements View.OnTouchListener {

    private int windowwidth;

    private int windowheight;


    public TokenTouchListener(int windowwidth, int windowheight) {
        this.windowwidth = windowwidth;
        this.windowheight = windowheight;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        switch(event.getActionMasked())
        {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                int x_cord = (int) event.getRawX();
                int y_cord = (int) event.getRawY();
                if (x_cord > windowwidth) {
                    x_cord = windowwidth;
                }
                if (y_cord > windowheight) {
                    y_cord = windowheight;
                }
                layoutParams1.leftMargin = x_cord - 250;
                layoutParams1.topMargin = y_cord - 300;
                view.setLayoutParams(layoutParams1);
                break;
            default:
                break;
        }
        return true;
    }

}
