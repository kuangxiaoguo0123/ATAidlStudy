package com.asiatravel.ataidlstudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import service.DataService;

/**
 * Created by asiatravel on 2016/11/16.
 */

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    public class MyBinder extends DataService.Stub {

        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public String getName() throws RemoteException {
            return "hello world";
        }
    }
}
