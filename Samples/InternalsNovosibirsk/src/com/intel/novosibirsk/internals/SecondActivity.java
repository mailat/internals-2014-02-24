package com.intel.novosibirsk.internals;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_first);
		
		Log.d("NOVSIB","onCreate SecondActivity");
	}


}
