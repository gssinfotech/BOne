/**
 * 
 */
package com.gssinfotech.bone.mysecurity;


import com.gssinfotech.bone.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author jnanendra.kumar
 *
 */
public class DeviceCentralDetailActivity extends Activity{
	int buttonId=0;
	TextView screenTitle;
	Button button1,button2, button3;
	ImageView btn1Img, btn2Img,btn3Img;
	ImageView btn1Arrow, btn2Arrow,btn3Arrow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_device_central_detail);
		screenTitle=(TextView)findViewById(R.id.device_central_detail_heading);
		
		button1=(Button)findViewById(R.id.device_central_detail_btn1);
		button2=(Button)findViewById(R.id.device_central_detail_btn2);
		button3=(Button)findViewById(R.id.device_central_detail_btn3);
		
		btn1Img=(ImageView)findViewById(R.id.btn1_icon);
		btn2Img=(ImageView)findViewById(R.id.btn2_icon);
		btn3Img=(ImageView)findViewById(R.id.btn3_icon);
		
		btn1Arrow=(ImageView)findViewById(R.id.btn1_arrow_id);
		btn2Arrow=(ImageView)findViewById(R.id.btn2_arrow_id);
		btn3Arrow=(ImageView)findViewById(R.id.btn3_arrow_id);
		
		Bundle b= getIntent().getExtras();
		buttonId=b.getInt("BUTTON_ID", 0);
		Toast.makeText(getApplicationContext(), "BUTTON ID "+buttonId, Toast.LENGTH_LONG).show();
		displayButtonsForButtonId(buttonId);
	}
	
	public void displayButtonsForButtonId(int button_Id){
		switch (button_Id) {
		case 1:
			
			break;
			
		case 2:
			screenTitle.setText(getResources().getString(R.string.video_cam_title));
			button1.setText(getResources().getString(R.string.video_cam_dropcam));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.video_camera));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;
		case 3:
			screenTitle.setText(getResources().getString(R.string.locks_title));
			button1.setText(getResources().getString(R.string.locks_yale_lock));
			btn1Img.setImageDrawable(getResources().getDrawable(R.drawable.yale_lock_icon));
			button2.setVisibility(Button.INVISIBLE);
			btn2Img.setVisibility(ImageView.INVISIBLE);
			btn2Arrow.setVisibility(ImageView.INVISIBLE);
			button3.setVisibility(Button.INVISIBLE);
			btn3Img.setVisibility(ImageView.INVISIBLE);
			btn3Arrow.setVisibility(ImageView.INVISIBLE);
			break;

		default:
			break;
		}
	}
	
	public void onDeviceCentralDetailButtonOneClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(DeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
	}
	
	public void onDeviceCentralDetailButtonTwoClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(DeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
	}
	
	public void onDeviceCentralDetailButtonThreeClicked(View v){
		//Toast.makeText(getApplicationContext(), "onDropcamButtonClicked", Toast.LENGTH_LONG).show();
		startActivity(new Intent(DeviceCentralDetailActivity.this, AddSecurityDeviceActivity.class));
	}
	
	public void onHomeButtonClicked(View v){
		Toast.makeText(getApplicationContext(), "onHomeButtonClicked", Toast.LENGTH_LONG).show();
		//startActivity(new Intent(MenuSettingsActivity.this, AddLocationActivity.class));
	}

}
