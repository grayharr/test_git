package com.js.log;

import android.util.Log;

public class JsLog {
	
	private static final String PREFIX = "[%10s] %s";
	
	public static void i(Object obj, String log) {
		Log.i("PJS", String.format(PREFIX, obj.getClass().getSimpleName(), log));
	}
	
	public static void e(Object obj, String log) {
		Log.e("PJS", String.format(PREFIX, obj.getClass().getSimpleName(), log));
	}
	
	public static void e(Object obj, String log, Throwable tr) {
		Log.e("PJS", String.format(PREFIX, obj.getClass().getSimpleName(), log), tr);
	}
	
	public static void v(Object obj, String log) {
		Log.v("PJS", String.format(PREFIX, obj.getClass().getSimpleName(), log));
	}
	
	public static void d(Object obj, String log) {
		Log.d("PJS", String.format(PREFIX, obj.getClass().getSimpleName(), log));
	}
}
