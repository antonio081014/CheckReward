package com.antonio081014.checkrewardclient.activity;

import com.antonio081014.checkrewardclient.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * This activity shows the information of the merchant you have checked in at
 * least once.
 * 
 * *************************************************************************
 * 
 * Action:
 * 
 * List your check-in history for this merchant. Also list other information
 * about this merchant, like business time, contact info, and menus.
 * 
 * Order the activity as the latest first order;
 * */

public class MerchantInfo extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_merchant_info);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_merchant_info, menu);
		return true;
	}
}