package com.example.actionbar;

import io.rong.imkit.veiw.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;

/**
 * Created by DragonJ on 14-9-15.
 */
public class ActionBarModifyColorFragmentActivity extends FragmentActivity {

    //io.rong.imkit.veiw.ActionBar
    ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_actionbar_modifycolor_fragment);
        mActionBar = (ActionBar)findViewById(android.R.id.custom);

        mActionBar.setOnBackClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mActionBar.getTitleTextView().setText("ActionBar修改颜色");
    }

    
//    
//    
//        getIntent().setData(Uri.parse("rong://io.rong.imkit.demo").buildUpon().appendPath("conversation").appendPath("private")
//                .appendQueryParameter("targetId","user1").build());
//        setContentView(R.layout.activity_test2_fragment);
//        mActionBar = (ActionBar)findViewById(R.id.rc_actionbar);
//        mActionBar.getTitleTextView().setText("会话自定义Fragment测试");
//        mActionBar.setOnBackClick(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//        LayoutInflater inflater = LayoutInflater.from(this);
//        mActionBar.addView(inflater.inflate(R.layout.ui_action_btn,mActionBar,false));

//    }

}
