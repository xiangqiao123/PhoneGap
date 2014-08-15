package com.xiangqiao.phonegap;

import org.apache.cordova.DroidGap;

import android.widget.Toast;


public class AA {

	DroidGap d;

	public AA(DroidGap d) {
		this.d = d;
	}

	public void show(String s) {
		Toast.makeText(d.getApplicationContext(), s, Toast.LENGTH_SHORT).show();
	}

	public String forAlert(String s) {
		return "java_" + s;
	}
}
