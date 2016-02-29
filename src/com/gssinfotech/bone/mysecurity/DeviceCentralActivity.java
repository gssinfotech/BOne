package com.gssinfotech.bone.mysecurity;

import com.gssinfotech.bone.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DeviceCentralActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_device_central);
	}
	
	public void onVideoDoorBellButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onVideoDoorBellButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onVideoCameraButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onVideoCameraButtonClicked", Toast.LENGTH_LONG).show();
		Bundle b=new Bundle();
		b.putInt("BUTTON_ID", 2);
		Intent i=new Intent(DeviceCentralActivity.this, DeviceCentralDetailActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	public void onLocksButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onLocksButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
		Bundle b=new Bundle();
		b.putInt("BUTTON_ID", 3);
		Intent i=new Intent(DeviceCentralActivity.this, DeviceCentralDetailActivity.class);
		i.putExtras(b);
		startActivity(i);
	}
	
	public void onMotionSensorButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMotionSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onMultiSensorButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onMultiSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onSmokeSensorButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onSmokeSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onSirenButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onSirenButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onOpenClosedSensorButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onOpenClosedSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onFloodSensorButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onFloodSensorButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
}
