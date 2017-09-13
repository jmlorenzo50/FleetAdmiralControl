package staw.com.fleetadmiralcontrol.types;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipKlingon {
    KLI_FF_20,
    KLI_DD_30,
    KLI_CL_50,
    KLI_FF_50,
    KLI_FL_70,
    KLI_CL_70,
    KLI_FFE_80,
    KLI_CW_85,
    KLI_CL0_90,
    KLI_CAG_130,
    KLI_BC_180,
    KLI_BCH_260,
    KLI_DCF_300,
    KLI_DN_360;


    public static TypeShipKlingon next(TypeShipKlingon typeShipFederation) {
        TypeShipKlingon salida = null;
        TypeShipKlingon[] values = TypeShipKlingon.values();
        if (typeShipFederation == null) {
            salida = values[0];
        } else {
            int encontrado = -1;
            for (int i = 0; i < values.length; i++) {
                if (typeShipFederation == values[i]) {
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

    public static int position(TypeShipKlingon TypeShipKlingon) {
        int salida = -1;
        TypeShipKlingon[] values = TypeShipKlingon.values();
        if (TypeShipKlingon == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (TypeShipKlingon == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }



}
