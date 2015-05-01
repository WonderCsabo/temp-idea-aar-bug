package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;


//public class MyActivity extends android.support.v7.app.ActionBarActivity {  // v7-dep
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        android.support.annotation.AnyRes r; // <- Tha nnotation lib is importet correctly,
        // but this is a .jar dependency
        android.support.v4.app.ActivityCompat a; // This does resolve. Yields compile error:
        // Error:(17, 31) java: package android.support.v4.app does not exist
        // yet, it does exist according to the docs (and by browsing classes.jar in the
        // appcompat lib):
        // http://developer.android.com/reference/android/support/v4/app/ActivityCompat.html
    }
}
