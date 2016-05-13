package uni.com.brainprogrammer;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;


import java.util.List;

/**
 * A {@link PreferenceActivity} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p/>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class MainActivity extends Activity {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // get your ToggleButton
       final ToggleButton b = (ToggleButton) findViewById(R.id.toggleButton);
        final EditText TextToToast = (EditText) findViewById(R.id.etWord);

// attach an OnClickListener
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if(b.isChecked()){
                    //Button is ON
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast;
                    toast = Toast.makeText(MainActivity.this, TextToToast.getText().toString(), duration);
                    toast.show();

                }
                else{

                }
                //Button is OFF
                // Do Something
            }
        });

        setContentView(R.layout.activity_main);
    }


}
