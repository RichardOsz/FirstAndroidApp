package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	public final static String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";
	
	/** Called when the user clicks the Second button */
	public void openSecondActivity(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, SecondActivity.class);
		
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}


	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}


	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart");
	}


	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}


	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.d(TAG, "onRestoreInstanceState");
	}


	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "onSaveInstanceState");
	}


	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}


	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}
    
}
