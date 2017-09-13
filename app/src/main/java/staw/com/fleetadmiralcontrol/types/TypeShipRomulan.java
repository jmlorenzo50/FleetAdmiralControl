package staw.com.fleetadmiralcontrol.types;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipRomulan {
    ROM_FF_20,
    ROM_F_40,
    ROM_KE_50,
    ROM_KS_50,
    ROM_FW_50,
    ROM_K0_50,
    ROM_DW_65,
    ROM_DW_80,
    ROM_CL_80,
    ROM_CA_100,
    ROM_CW_120,
    ROM_BCL_160,
    ROM_BC_170,
    ROM_BCF_210,
    ROM_BCF_220,
    ROM_BC_220,
    ROM_BCH_250,
    ROM_BCH_280,
    ROM_DN_360,
    ROM_DNH_500,
    ROM_BB_800;



    public static TypeShipRomulan next(TypeShipRomulan typeShipRomulan) {
        TypeShipRomulan salida = null;
        TypeShipRomulan[] values = TypeShipRomulan.values();
        if (typeShipRomulan == null) {
            salida = values[0];
        } else {
            int encontrado = -1;
            for (int i = 0; i < values.length; i++) {
                if (typeShipRomulan == values[i]) {
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

    public static int position(TypeShipRomulan typeShipRomulan) {
        int salida = -1;
        TypeShipRomulan[] values = TypeShipRomulan.values();
        if (typeShipRomulan == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (typeShipRomulan == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }



}
