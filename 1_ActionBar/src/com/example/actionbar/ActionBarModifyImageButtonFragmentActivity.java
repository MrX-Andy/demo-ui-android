package com.example.actionbar;

import io.rong.imkit.veiw.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

/**
 * Created by DragonJ on 14-9-15.
 */
public class ActionBarModifyImageButtonFragmentActivity extends FragmentActivity  implements OnClickListener {

	  	ActionBar mActionBar;
	    ImageButton imageButton;
	    

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getIntent().setData(Uri.parse("rong://com.example.actionbar").buildUpon().appendPath("conversationlist").appendPath("private")
	                .appendQueryParameter("targetId","user1").build());
	        setContentView(R.layout.activity_actionbar_modifyimagebutton_fragment);
	        mActionBar = (ActionBar)findViewById(android.R.id.custom);
	        mActionBar.getTitleTextView().setText("ActionBar修改图标按钮");
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
	      		Intent intent = new Intent(ActionBarModifyImageButtonFragmentActivity.this, TextActivity.class);
	      		startActivity(intent);
	      		finish();
	      	}
	  		
	  	}

}
