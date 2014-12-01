package com.example.groupsettings;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TextActivity extends Activity implements OnClickListener{

	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);
		button = (Button)findViewById(R.id.button);
		
		button.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button)
		{
			
			RongIM.getInstance().startConversationSetting(this, RongIMClient.ConversationType.PRIVATE, "7GroupSettiongs");
		}
	}
	
	

}
