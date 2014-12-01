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
public class ActionBarModifyOneLogoFragmentActivity extends FragmentActivity {

  	private ActionBar mActionBar;
  	private ImageView mLogoImageView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_actionbar_modifyonelogo_fragment);
        mActionBar = (ActionBar)findViewById(android.R.id.custom);
        mActionBar.getTitleTextView().setText("ActionBar修改指定页Logo图标");
        mLogoImageView = mActionBar.getLogoView();
        mLogoImageView.setImageResource(R.drawable.rc_add_people);
       // rc_add_people
                
        mActionBar.setOnBackClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}