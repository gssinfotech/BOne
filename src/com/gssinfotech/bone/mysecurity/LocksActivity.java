/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class LocksActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_locks);
	}
	
	public void onYaleLockButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onYaleLockButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}

}
