package staw.com.fleetadmiralcontrol.types;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipCardassian {

    CAR_CL_65,
    CAR_PG_70,
    CAR_CL_100,
    CAR_CA_130,
    CAR_CAD_130,
    CAR_CLS_130,
    CAR_CA_180,
    CAR_BC_240,
    CAR_SBL_340;


    public static TypeShipCardassian next(TypeShipCardassian typeShipCardassian) {
        TypeShipCardassian salida = null;
        TypeShipCardassian[] values = TypeShipCardassian.values();
        if (typeShipCardassian == null) {
            salida = values[0];
        } else {
            int encontrado = -1;
            for (int i = 0; i < values.length; i++) {
                if (typeShipCardassian == values[i]) {
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

    public static int position(TypeShipCardassian typeShipCardassian) {
        int salida = -1;
        TypeShipCardassian[] values = TypeShipCardassian.values();
        if (typeShipCardassian == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (typeShipCardassian == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }



}
