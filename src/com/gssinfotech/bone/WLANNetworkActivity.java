/**
 * 
 */
package com.gssinfotech.bone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class WLANNetworkActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_wlan_network);
	}
	
	public void onDoneButtonClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDoneButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(WLANNetworkActivity.this, ConnectHubtoHomeWifiActivity.class));
	}
}
