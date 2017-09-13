package staw.com.fleetadmiralcontrol.types;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipDominion {

    DOM_DD_60,
    DOM_BCH_260,
    DOM_BB_450;


    public static TypeShipDominion next(TypeShipDominion typeShipDominion) {
        TypeShipDominion salida = null;
        TypeShipDominion[] values = TypeShipDominion.values();
        if (typeShipDominion == null) {
            salida = values[0];
        } else {
            int encontrado = -1;
            for (int i = 0; i < values.length; i++) {
                if (typeShipDominion == values[i]) {
                    encontrado = i;
                }
            }
            if (encontrado >= 0) {
                encontrado = (encontrado+1) % values.length;
                salida = values[encontrado];
            }
        }
        return salida;
    }

    public static int position(TypeShipDominion typeShipDominion) {
        int salida = -1;
        TypeShipDominion[] values = TypeShipDominion.values();
        if (typeShipDominion == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (typeShipDominion == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }



}
