package com.example.sendmessageoptions;

import io.rong.imkit.RongIM;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button)findViewById(R.id.button1);

		
		button1.setOnClickListener(this);

		
	}
	
	

	 @Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
	    	switch(v.getId())
	    	{
	    	case R.id.button1:
    		{
	            RongIM.getInstance().startPrivateChat(this, "9SendmessageCusomization", "新媒5");
    		}
	    	default:
	    	{
	    		
	    	}break;
	    	}
			
		}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}