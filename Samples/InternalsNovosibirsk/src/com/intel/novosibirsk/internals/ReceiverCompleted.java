package com.intel.novosibirsk.internals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiverCompleted extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("NOVSIB", "onReceive in ReceiverCompleted");

	}

}
