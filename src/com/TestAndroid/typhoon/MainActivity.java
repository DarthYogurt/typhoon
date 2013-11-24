package com.TestAndroid.typhoon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	public static final String USERNAME = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void callToastBox(View view){
		Toast.makeText(this, "Toastbox called", Toast.LENGTH_LONG).show();
	}
	
	public void sendMessage(View view){
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		
		//Send what's in the text field
		EditText batmanText = (EditText) findViewById(R.id.batmanText);
		String message = batmanText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		
		
		//Now send username
		EditText username = (EditText) findViewById(R.id.username);
		String messageUsername = username.getText().toString();
		intent.putExtra(USERNAME, messageUsername);
		
		
		startActivity(intent);
	}

	
}
