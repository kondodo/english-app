package com.kk.english_app.helper;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastHelper {

	private static Toast toast;

	public static void shortMessage(Context context, String msg) {
		toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	public static void longMessage(Context context, String msg) {
		toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

}
