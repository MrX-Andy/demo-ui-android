package com.example.portraitclickbehavior;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class TextActivity extends Activity implements OnClickListener{

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_text);
		button = (Button)findViewById(R.id.button);
		
		button.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button)
		{
			
			Intent intent = new Intent(TextActivity.this, MainActivity.class);
			startActivity(intent);
		}
	}
	
	

}
