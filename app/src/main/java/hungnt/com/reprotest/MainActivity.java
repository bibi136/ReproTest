package hungnt.com.reprotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import io.repro.android.Repro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Repro.showInAppMessage(this);
        Repro.setLogLevel(Log.DEBUG);

        Log.d("hung", "onResume: " + Repro.getUserID());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Repro.track("Button Click");
                 Repro.showInAppMessage(MainActivity.this);
            }
        });

    }

}
