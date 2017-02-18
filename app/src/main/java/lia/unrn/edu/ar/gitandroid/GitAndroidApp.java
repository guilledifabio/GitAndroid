package lia.unrn.edu.ar.gitandroid;

import android.app.Application;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Guillermo on 01/12/2016.
 */

public class GitAndroidApp extends Application {
    GoogleSignInOptions gso;
    GoogleApiClient mGoogleApiClient;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public GoogleSignInOptions getGso() {
        return gso;
    }

    public GoogleApiClient getmGoogleApiClient() {
        return mGoogleApiClient;
    }

    public void setGso(GoogleSignInOptions gso) {
        this.gso = gso;
    }

    public void setmGoogleApiClient(GoogleApiClient mGoogleApiClient) {
        this.mGoogleApiClient = mGoogleApiClient;
    }
}
