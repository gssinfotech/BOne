/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class AddSecurityDeviceActivity extends Activity{
	
	int buttonId=0;
	String screenTitle="";
	Spinner deviceSpinner, locationSpinner;
	TextView screenTitleTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_add_security_device);
		deviceSpinner=(Spinner)findViewById(R.id.select_device_spinner);
		locationSpinner=(Spinner)findViewById(R.id.select_location_spinner);
		screenTitleTextView=(TextView)findViewById(R.id.add_device_heading);
		
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		screenTitle=b.getString("SCREEN_TITLE");
		screenTitleTextView.setText(screenTitle);
		
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
		//startActivity(new Intent(AddSecurityDeviceActivity.this, MySecurityActivity.class));
		switch (buttonId) {
		case 1:
			
			break;
			
		case 2:
			
			break;
		case 3:
			startActivity(new Intent(AddSecurityDeviceActivity.this, LocksActivity.class));
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			break;
		default:
			break;
		}
	}
	
	public void onCancelButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onCancelButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
}
