package staw.com.fleetadmiralcontrol;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import staw.com.fleetadmiralcontrol.factory.FactoryToken;
import staw.com.fleetadmiralcontrol.listener.TokenTouchListener;
import staw.com.fleetadmiralcontrol.types.TypeShipBorg;
import staw.com.fleetadmiralcontrol.types.TypeShipCardassian;
import staw.com.fleetadmiralcontrol.types.TypeShipDominion;
import staw.com.fleetadmiralcontrol.types.TypeShipFederation;
import staw.com.fleetadmiralcontrol.types.TypeShipKlingon;
import staw.com.fleetadmiralcontrol.types.TypeShipRomulan;

public class ShipControlActivity extends AppCompatActivity {

    private int windowwidth;

    private int windowheight;

    private int numberOfToken;

    private List<ImageView> tokens;

    private TypeShipFederation seleccionadoFed;

    private TypeShipKlingon seleccionadoKli;

    private TypeShipRomulan seleccionadoRom;

    private TypeShipCardassian seleccionadoCar;

    private TypeShipDominion seleccionadoDom;

    private TypeShipBorg seleccionadoBor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_control);

        windowwidth = getWindowManager().getDefaultDisplay().getWidth();
        windowheight = getWindowManager().getDefaultDisplay().getHeight();

        reloadTokens();
    }


    public void reloadTokens() {
        numberOfToken = 20;

        // Se añaden los tokens de energía
        RelativeLayout canvas = (RelativeLayout) findViewById(R.id.canvas);
        tokens = new ArrayList<ImageView>();
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenEnergy(10, 100, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se tokens de dial
        ImageView tokenDial = FactoryToken.createTokenDial(10, 10, this);
        tokens.add(tokenDial);
        canvas.addView(tokenDial);

        // Se añaden tokens escudos
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenShield(10, 200, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens escudos
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenShield5(10, 300, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens hull
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenHull(10, 400, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens hull5
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenHull5(10, 500, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens armor
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenArmor(10, 600, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens detección
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenDetection(10, 700, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens critical
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenCritical(10, 800, this);
            tokens.add(token);
            canvas.addView(token);
        }

        // Se añaden tokens critical
        for (int i = 1; i <= numberOfToken; i++) {
            ImageView token = FactoryToken.createTokenTime(10, 900, this);
            tokens.add(token);
            canvas.addView(token);
        }
    }

    public void removeTokens() {
        RelativeLayout canvas = (RelativeLayout) findViewById(R.id.canvas);
        for (ImageView token: tokens) {
            canvas.removeView(token);
        }
        tokens.clear();
    }


    public int getWindowwidth() {
        return windowwidth;
    }

    public int getWindowheight() {
        return windowheight;
    }


    /**
     * Called when the user touches the button
     */
    public void changeFed(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = TypeShipFederation.next(seleccionadoFed);
        seleccionadoKli = null;
        seleccionadoRom = null;
        seleccionadoCar = null;
        seleccionadoDom = null;
        seleccionadoBor = null;
        int resourceId = getResources().getIdentifier(seleccionadoFed.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipFederation.position(seleccionadoFed) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Federation " + pos + "/" + TypeShipFederation.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }


    /**
     * Called when the user touches the button
     */
    public void changeKli(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = null;
        seleccionadoKli = TypeShipKlingon.next(seleccionadoKli);
        seleccionadoRom = null;
        seleccionadoCar = null;
        seleccionadoDom = null;
        seleccionadoBor = null;
        int resourceId = getResources().getIdentifier(seleccionadoKli.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipKlingon.position(seleccionadoKli) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Klingon " + pos + "/" + TypeShipKlingon.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }

    public void changeRom(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = null;
        seleccionadoKli = null;
        seleccionadoRom = TypeShipRomulan.next(seleccionadoRom);
        seleccionadoCar = null;
        seleccionadoDom = null;
        seleccionadoBor = null;
        int resourceId = getResources().getIdentifier(seleccionadoRom.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipRomulan.position(seleccionadoRom) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Romulan " + pos + "/" + TypeShipRomulan.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }

    public void changeCar(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = null;
        seleccionadoKli = null;
        seleccionadoRom = null;
        seleccionadoCar = TypeShipCardassian.next(seleccionadoCar);
        seleccionadoDom = null;
        seleccionadoBor = null;
        int resourceId = getResources().getIdentifier(seleccionadoCar.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipCardassian.position(seleccionadoCar) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Cardassian " + pos + "/" + TypeShipCardassian.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }

    public void changeDom(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = null;
        seleccionadoKli = null;
        seleccionadoRom = null;
        seleccionadoCar = null;
        seleccionadoDom = TypeShipDominion.next(seleccionadoDom);
        seleccionadoBor = null;
        int resourceId = getResources().getIdentifier(seleccionadoDom.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipDominion.position(seleccionadoDom) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Dominion " + pos + "/" + TypeShipDominion.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }

    public void changeBor(View view) {
        ImageView ship = (ImageView) this.findViewById(R.id.ship);
        seleccionadoFed = null;
        seleccionadoKli = null;
        seleccionadoRom = null;
        seleccionadoCar = null;
        seleccionadoDom = null;
        seleccionadoBor = TypeShipBorg.next(seleccionadoBor);
        int resourceId = getResources().getIdentifier(seleccionadoBor.name().toLowerCase(), "drawable", getPackageName());
        int pos = TypeShipBorg.position(seleccionadoBor) + 1;
        getSupportActionBar().setTitle(getResources().getString(R.string.app_name) + " - " + "Borg " + pos + "/" + TypeShipBorg.values().length);
        ship.setImageResource(resourceId);
        removeTokens();
        reloadTokens();
    }



}

