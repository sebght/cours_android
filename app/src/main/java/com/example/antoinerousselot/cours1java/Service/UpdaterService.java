package com.example.antoinerousselot.cours1java.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class UpdaterService extends Service {
    static final String Tag="UpdaterService";
    public UpdaterService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate(){
        Log.d(Tag, "Service onCreate");
        super.onCreate();
    }

    public void onDestroy(){
        Log.d(Tag,"Service onDestroy");
        super.onDestroy();
    }

}
