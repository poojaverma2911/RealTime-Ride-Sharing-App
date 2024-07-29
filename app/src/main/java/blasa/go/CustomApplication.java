package blasa.go;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.firebase.client.Firebase;

 

public class CustomApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //iniatializing firebase and facebooksdk before any reference is created or used
        Firebase.setAndroidContext(this);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
