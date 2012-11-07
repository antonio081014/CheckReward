package com.antonio081014.checkrewardclient.activity;

import com.antonio081014.checkrewardclient.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * This activity shows the list of the merchant you have checked in.
 * 
 * It also describe the time you have been for each place, and how many times
 * left for the next reward;
 * 
 * *************************************************************************
 * 
 * Action:
 * 
 * Click the Item to go into detailed information about your check-in history
 * for this merchant. Also list other information about this merchant, like
 * business time, contact info, and menus.
 * 
 * Order the list as the latest updated first;
 * */

public class CardListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_card_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_card_list, menu);
		return true;
	}
}
