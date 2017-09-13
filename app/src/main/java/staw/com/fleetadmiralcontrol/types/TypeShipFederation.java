package staw.com.fleetadmiralcontrol.types;

import staw.com.fleetadmiralcontrol.R;

/**
 * Created by jorge on 15/08/17.
 */

public enum TypeShipFederation {

    FED_FFL_15,
    FED_K_25,
    FED_FFL_25,
    FED_FFL_30,
    FED_FFLT_35,
    FED_FF_40,
    FED_FP_40,
    FED_KE_45,
    FED_FF_55,
    FED_DD_60,
    FED_CL_70,
    FED_F_70,
    FED_FL_75,
    FED_FFE_80,
    FED_CL_80,
    FED_CL_90,
    FED_CA_90,
    FED_FFB_90,
    FED_CA_100,
    FED_CLS_100,
    FED_CW_100,
    FED_CLG_110,
    FED_CL_110,
    FED_CA_130,
    FED_BCL_150,
    FED_BCL_165,
    FED_CB_180,
    FED_BCL_190,
    FED_BCLE_210,
    FED_CBH_220,
    FED_BCF_230,
    FED_BC_240,
    FED_BCH_280,
    FED_SBL_400,
    FED_DN_400,
    FED_DNH_480,
    FED_BB_640;


    public static TypeShipFederation next(TypeShipFederation typeShipFederation) {
        TypeShipFederation salida = null;
        TypeShipFederation[] values = TypeShipFederation.values();
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


    public static int position(TypeShipFederation typeShipFederation) {
        int salida = -1;
        TypeShipFederation[] values = TypeShipFederation.values();
        if (typeShipFederation == null) {
            salida = 0;
        } else {
            for (int i = 0; i < values.length; i++) {
                if (typeShipFederation == values[i]) {
                    salida = i;
                }
            }
        }
        return salida;
    }

}
