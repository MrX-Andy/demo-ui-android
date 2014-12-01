package com.example.sendmessagecusomization;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import android.app.Application;
import android.util.Log;

public class App extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		RongIM.getInstance().init(this, Const.APP_KEY, R.drawable.ic_launcher);
		
		
		String token = Const.TOKEN;
		
		RongIM.connect(token, new RongIMClient.ConnectCallback()
				{

					@Override
					public void onError(ErrorCode arg0) {
						// TODO Auto-generated method stub
						Log.d("Connect:", "Login Failed "+ arg0.getValue());
					}

					@Override
					public void onSuccess(String arg0) {
						// TODO Auto-generated method stub
						Log.d("Connect:", "Login Success "+arg0);
					}
			
				});
	}
	

}
