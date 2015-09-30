package com.quinn.githubknife.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;

/**
 * SharedPreferences工具类
 * @author Quinn
 * @date 2015-2-1
 */
public class PreferenceUtils {
	
	public static class Key{
		public static final String ACCOUNT = "ACCOUNT";
		public static final String AVATAR = "AVATAR";
	}
	
	public static final String DEFAULT_STRING = "";
	public static final int DEFAULT_INT = 0;
	public static final boolean DEFAULT_BOOLEAN = false;
	public static final long DEFAULT_LONG = 0;
	public static final float DEFAULT_FLOAT = 0.0f;

	
	
	
	public static String getString(Context context, String key) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getString(key, DEFAULT_STRING);
	}

	public static void putString(Context context, final String key,
			final String value) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putString(key, value).commit();
	}

	public static boolean getBoolean(Context context, final String key) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getBoolean(key, DEFAULT_BOOLEAN);
	}

	public static boolean hasKey(Context context, final String key) {
		return PreferenceManager.getDefaultSharedPreferences(context).contains(
				key);
	}

	public static void putBoolean(Context context, final String key,
			final boolean value) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putBoolean(key, value).commit();
	}

	public static void putInt(Context context, final String key,
			final int value) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putInt(key, value).commit();
	}

	public static int getInt(Context context, final String key) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getInt(key, DEFAULT_INT);
	}

	public static void putFloat(Context context, final String key,
			final float value) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putFloat(key, value).commit();
	}

	public static float getFloat(Context context, final String key) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getFloat(key, DEFAULT_FLOAT);
	}

	public static void putLong(Context context, final String key,
			final long value) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putLong(key, value).commit();
	}

	public static long getLong(Context context, final String key) {
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getLong(key, DEFAULT_LONG);
	}

	public static Set<String> getStringSet(Context context, final String key){
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		return settings.getStringSet(key, new HashSet<String>());
	}

	public static void putStringSet(Context context, final String key,
									final Set<String> value){
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		settings.edit().putStringSet(key, value).commit();
	}

	public static void appendStringToSet(Context context, final String key,
										 String value){
		final SharedPreferences settings = PreferenceManager
				.getDefaultSharedPreferences(context);
		Set<String> set = settings.getStringSet(key, null);
		if(set == null){
			set = new HashSet<String>();
		}
		set.add(value);
		settings.edit().putStringSet(key, set).commit();
	}

	public static void clearPreference(Context context,
			final SharedPreferences p) {
		final Editor editor = p.edit();
		editor.clear();
		editor.commit();
	}
}
