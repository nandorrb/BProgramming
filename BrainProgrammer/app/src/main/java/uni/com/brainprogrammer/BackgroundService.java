package uni.com.brainprogrammer;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class BackgroundService extends Service {
    int duration = Toast.LENGTH_SHORT;
    Toast toast;

    @Override
   public IBinder onBind(Intent intent){

        return null;
    }

    @Override
    public void onCreate() {
        toast = Toast.makeText(this,"Started Service" ,duration);
        toast.show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String data=(String) intent.getExtras().get("data");
        toast = Toast.makeText(this,data ,duration);
        try{
        while (true){
        toast.show();
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                }
            }, 10000);
/*
* Usually, an infinite loop is a sign of a mistake somewhere; in your code, an infinite loop is exactly what you want.
* */

        }
        }catch(Exception e){

        }

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        int duration = Toast.LENGTH_SHORT;
        Toast toast;
        toast = Toast.makeText(this,"Stopped Service" ,duration);
        toast.show();

        super.onDestroy();
    }

}
