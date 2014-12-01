package com.example.actionbar;

import io.rong.imkit.veiw.ActionBar;
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
public class ActionBarModifyAllLogoFragmentActivity extends FragmentActivity {

  	ActionBar mActionBar;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_actionbar_modifyalllogo_fragment);
        mActionBar = (ActionBar)findViewById(android.R.id.custom);
        mActionBar.getTitleTextView().setText("ActionBar修改所有页Logo图标");
        
    
        mActionBar.setOnBackClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}