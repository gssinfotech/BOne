/**
 * 
 */
package com.gssinfotech.bone.mydevices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gssinfotech.bone.R;

/**
 * @author jnanendra.kumar
 *
 */
public class MyDevicesScenesActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_mydevices_scenes);
	}
	
	public void onAddSceneButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onAddSceneButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MyDevicesDeviceHistoryActivity.this, MyDevicesDeviceCentralActivity.class));
	}
	
}
