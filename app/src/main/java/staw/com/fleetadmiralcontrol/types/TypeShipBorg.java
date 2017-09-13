package staw.com.fleetadmiralcontrol.types;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipBorg {

    BOR_DD_100,
    BOR_CA_150,
    BOR_CC_220,
    BOR_BC_240,
    BOR_DN_400,
    BOR_BB_540,
    BOR_BB_680,
    BOR_JBB_850,
    BOR_SJBB_1280;

    public static TypeShipBorg next(TypeShipBorg typeShipBorg) {
        TypeShipBorg salida = null;
        TypeShipBorg[] values = TypeShipBorg.values();
        if (typeShipBorg == null) {
            salida = values[0];
        } else {
            int encontrado = -1;
            for (int i = 0; i < values.length; i++) {
                if (typeShipBorg == values[i]) {
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

    public static int position(TypeShipBorg typeShipBorg) {
        int salida = -1;
        TypeShipBorg[] values = TypeShipBorg.values();
        if (typeShipBorg == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (typeShipBorg == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }



}
