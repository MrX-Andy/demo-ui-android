package com.example.friendlist;

import io.rong.imkit.RongActivity;
import io.rong.imkit.common.RCloudConst;
import io.rong.imkit.fragment.FriendMultiChoiceFragment;
import android.app.Activity;
import android.content.Intent;
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
			
  		  Intent intent = new Intent(TextActivity.this, RongActivity.class);
          intent.putExtra(RCloudConst.EXTRA.CONTENT, FriendMultiChoiceFragment.class.getName());
          startActivity(intent);
		}
	}
	
	

}
