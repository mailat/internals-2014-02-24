package com.intel.novosibirsk.internals;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_first);
		
		Log.d("NOVSIB","onCreate FirstActivity");
		
		startActivity(new Intent(this, SecondActivity.class).putExtra("NAME", "MARIUS"));


		
//		Intent intent = new Intent(Intent.ACTION_SEND);
//		intent.setType("text/plain");
//		intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//		intent.putExtra(Intent.EXTRA_TEXT, message);
//		Intent mailer = Intent.createChooser(intent, null);
//		startActivity(mailer);
	}
	
	
	

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.first, menu);
//		return true;
//	}

}
