package com.example.actionbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);     
        button6 = (Button)findViewById(R.id.button6);     
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }



    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
    	switch(v.getId())
    	{
    	case R.id.button1:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarModifyColorFragmentActivity.class);
    		startActivity(intent);
    	}break;
    	case R.id.button2:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarModifyOneLogoFragmentActivity.class);
    		startActivity(intent);
    	}break;
    	case R.id.button3:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarModifyAllLogoFragmentActivity.class);
    		startActivity(intent);
    	}break;
    	case R.id.button4:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarAddImageButtonFragmentActivity.class);
    		startActivity(intent);
    	}break;
    	case R.id.button5:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarModifyImageButtonFragmentActivity.class);
    		startActivity(intent);
    	}break;
    	case R.id.button6:
    	{
    		Intent intent = new Intent(MainActivity.this, ActionBarDeleteBackFragmentActivity.class);
    		startActivity(intent);
    	}break;
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
