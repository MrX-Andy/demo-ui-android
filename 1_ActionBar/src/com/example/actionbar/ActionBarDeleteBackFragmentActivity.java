package com.example.actionbar;

import io.rong.imkit.veiw.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by DragonJ on 14-9-15.
 */
public class ActionBarDeleteBackFragmentActivity extends FragmentActivity{

    //io.rong.imkit.veiw.ActionBar
    private ActionBar mActionBar;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_actionbar_deleteback_fragment);
        mActionBar = (ActionBar)findViewById(android.R.id.custom);

        mActionBar.getTitleTextView().setText("ActionBar删除返回按钮");
        mImageView = mActionBar.getBackView();
        mImageView.setVisibility(View.GONE);
    		    	
    }

}
