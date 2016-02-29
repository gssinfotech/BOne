/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class AddSecurityDeviceActivity extends Activity{
	
	Spinner deviceSpinner, locationSpinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_add_security_device);
		deviceSpinner=(Spinner)findViewById(R.id.select_device_spinner);
		locationSpinner=(Spinner)findViewById(R.id.select_location_spinner);
		String[] devicesList=new String[]{"Device 1", "Device 2", "Device 3"};
		deviceSpinner.setAdapter(new ArrayAdapter<String>(AddSecurityDeviceActivity.this,android.R.layout.simple_list_item_1,devicesList));
		String[] locationsList=new String[]{"Room 1", "Room 2", "Room 3"};
		locationSpinner.setAdapter(new ArrayAdapter<String>(AddSecurityDeviceActivity.this,android.R.layout.simple_list_item_1,locationsList));
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onSaveButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onSaveButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(AddSecurityDeviceActivity.this, MySecurityActivity.class));
	}
	
	public void onCancelButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onCancelButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
}
