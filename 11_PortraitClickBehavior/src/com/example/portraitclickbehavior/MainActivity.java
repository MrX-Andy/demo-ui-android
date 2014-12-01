package com.example.portraitclickbehavior;

import io.rong.imkit.RongIM;
import io.rong.imkit.veiw.ActionBar;
import io.rong.imlib.RongIMClient.ConversationType;
import io.rong.imlib.RongIMClient.Message;
import io.rong.imlib.RongIMClient.UserInfo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;




public class MainActivity extends FragmentActivity implements RongIM.ConversationBehaviorListener{

    ActionBar mActionBar;
    
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
        
        RongIM.getInstance().setConversationBehaviorListener(this);

    }

	@Override
	public void onClickMessage(Context arg0, Message arg1) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(MainActivity.this, TextActivity.class);
		startActivity(intent);
	}

	@Override
	public void onClickUserPortrait(Context arg0, ConversationType arg1,
			UserInfo arg2) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(MainActivity.this, TextActivity.class);
		startActivity(intent);
	}
}
