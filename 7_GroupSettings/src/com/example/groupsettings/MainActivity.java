package com.example.groupsettings;

import io.rong.imkit.veiw.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements OnClickListener{

    ActionBar mActionBar;
    ImageButton imageButton;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getIntent().setData(Uri.parse("rong://io.rong.imkit.demo").buildUpon().appendPath("conversation").appendPath("private")
                .appendQueryParameter("targetId","user1").build());
        setContentView(R.layout.activity_main);
        mActionBar = (ActionBar)findViewById(android.R.id.custom);
        mActionBar.getTitleTextView().setText("会话页");
        mActionBar.setOnBackClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LayoutInflater inflater = LayoutInflater.from(this);
        imageButton = (ImageButton)inflater.inflate(R.layout.rc_imagebutton_more,mActionBar,false);
        
        mActionBar.addView(imageButton);
        
        imageButton.setOnClickListener(this);
    }


    @Override
  	public void onClick(View v) {
  		// TODO Auto-generated method stub
    	int imageButtonId = imageButton.getId();
    	if(v.getId() == imageButtonId)
    	{
	  		Intent intent = new Intent(MainActivity.this, TextActivity.class);
	        startActivity(intent);
	        finish();
      	}
  		
  	}
    

}
