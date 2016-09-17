package com.ren.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Utils {

	private static Toast toast;

	/**
	 * 显示单例吐司
	 * @param context
	 * @param letter
	 */
	public static void showToast(Context context, String letter) {
		if(toast == null){
			toast = Toast.makeText(context, "", 0);
		}
		
		toast.setText(letter);
		toast.show();
	}

}
