package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import com.gssinfotech.bone.mysecurity.SecurityDeviceHistoryActivity;
import com.gssinfotech.bone.mysecurity.SecurityDeviceSettingsActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyDevicesSettingsActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_mydevices_device_settings);
	}

	
	public void myDevicesSettingsHistoryButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "myDevicesSettingsHistoryButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesSettingsActivity.this, SecurityDeviceHistoryActivity.class));
		
	}
	
	public void myDevicesSettingsRulesButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "myDevicesSettingsRulesButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(MyDevicesSettingsActivity.this, MyDevicesMyRulesActivity.class));
	}
	
	
	public void myDevicesAddGroupButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "myDevicesAddGroupButtonClicked", Toast.LENGTH_LONG).show();
	}
	
	
}
