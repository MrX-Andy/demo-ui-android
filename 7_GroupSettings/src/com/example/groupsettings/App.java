package com.example.groupsettings;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import android.app.Application;
import android.util.Log;

public class App extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		RongIM.getInstance().init(this, Const.APP_KEY, R.drawable.ic_launcher);//只执行一次，中间字符串，写private Key(开发环境的)
		
		
		String token = Const.TOKEN;//用网页调试生成现成的token
		
		RongIM.connect(token, new RongIMClient.ConnectCallback()//工程中只调用一次，如果断线，由融云SDK自动启重连
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
