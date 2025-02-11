package com.irestads;

import com.irestads.util.GenericUtil;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("NewApi")
public class SettingsActivity extends Activity {
	FragmentManager fragmentManager;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);

		GenericUtil.currentActivity = SettingsActivity.class.toString();

		fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

		SettingsUpdateFragment updateFragment = new SettingsUpdateFragment();
		fragmentTransaction.replace(R.id.settings_content, updateFragment);
		fragmentTransaction.commit();
	}

	public void onClickSettingButton(View v) {
		LinearLayout layout = (LinearLayout) v;
		int id = layout.getId();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

		switch (id) {
		case R.id.settings_btn_update:
			SettingsUpdateFragment updateFragment = new SettingsUpdateFragment();
			fragmentTransaction.replace(R.id.settings_content, updateFragment);
			break;
		case R.id.settings_btn_connect:
			SettingsConnectFragment connectFragment = new SettingsConnectFragment();
			fragmentTransaction.replace(R.id.settings_content, connectFragment);
			break;
		case R.id.settings_btn_resetdata:
			SettingsResetFragment restFragment = new SettingsResetFragment();
			fragmentTransaction.replace(R.id.settings_content, restFragment);
			break;
		case R.id.settings_btn_tableinf:
			SettingsTableInfFragment tabFragment = new SettingsTableInfFragment();
			fragmentTransaction.replace(R.id.settings_content, tabFragment);
			break;
		default:
			break;
		}
		fragmentTransaction.commit();
	}

}
