package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;


public class ABOSSyncing extends Response<Boolean> {
    public boolean getGasPrice() {
        return getResult();
    }
}
