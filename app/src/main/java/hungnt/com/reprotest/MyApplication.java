package hungnt.com.reprotest;

import android.app.Application;

import io.repro.android.Repro;

/**
 * Created by HungNT on 4/10/18.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Repro.disableInAppMessageOnActive();
        Repro.setup(this, "f16cc930-98bc-484a-ab44-699643ca0852");
        Repro.startRecording();

        Repro.setUserID(Repro.getDeviceID() + 1);
    }
}
