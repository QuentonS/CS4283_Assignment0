package com.example.quenton.assignment0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Activity1 extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.i(TAG,"I'm in onCreate()");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart(){
        Log.i(TAG, "I'm in onStart()");
        super.onStart();
    }
    @Override
    protected void onRestart(){
        Log.i(TAG, "I'm in onRestart()");
        super.onRestart();
    }
    @Override
    protected void onResume(){
        Log.i(TAG, "I'm in on Resume()");
        super.onResume();
    }
    @Override
    protected void onPause(){
        Log.i(TAG, "I'm in onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "I'm in onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.i(TAG, "I'm in onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPostResume(){
        Log.i(TAG, "I'm in onPostResume()");
        super.onPostResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}



