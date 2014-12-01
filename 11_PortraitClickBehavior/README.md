# 融云

![Mou icon](http://www.rongcloud.cn/images/logo_1.png)





#### 运行条件

**AndroidStudio 0.6+**

**Gradle 1.11+**

**RongIMSDK**

**Android Support V4**

**Google GSON 2.2.+**

**听云SDK(Android Studio自动支持，Eclipse请安装开发插件或屏蔽11_PortraitClickBehavior中引用)**
**插件地址<http://download.networkbench.com/newlens/android_agent/eclipse>**

*如需使用自行申请APP_Key测试，需要搭建自己的auth服务器*

*测试服务器搭建请参照<https://github.com/rongcloud/auth-service-nodejs>*

服务器方面需要配置conf.json中的appKey属性完成验证

*在DemoContext中init方法中填入申请的APP_Key测试，并在DemoApi中配置HOST指向到自己的auth服务上*

*如适用Eclipse开发请Import路径app/src/main，编码请选择为 UTF-8。

#### 注意事项：
11_PortraitClickBehavior这个Demo演示在会话页中自定义点击头像，自定义点击消息事件处理，包括以下：
		
（1）MainActivity.java
		public class MainActivity extends FragmentActivity implements RongIM.ConversationBehaviorListener{
		
		    ActionBar mActionBar;
		    
		    @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
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
		        
		        RongIM.getInstance().setConversationBehaviorListener(this);//这句一定要加
		
		    }
		//自定义消息
			@Override
			public void onClickMessage(Context arg0, Message arg1) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, TextActivity.class);
				startActivity(intent);
			}
		
		//自定义头像
			@Override
			public void onClickUserPortrait(Context arg0, ConversationType arg1,
					UserInfo arg2) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, TextActivity.class);
				startActivity(intent);
			}
		}

（2）activity_main.xml
		<?xml version="1.0" encoding="utf-8"?>
		
		<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		    android:orientation="vertical" android:layout_width="match_parent"
		    android:layout_height="match_parent">
		
		    <io.rong.imkit.veiw.ActionBar
		        android:id="@android:id/custom"
		        style="@style/RcTheme.ActionBar">
		    </io.rong.imkit.veiw.ActionBar>
		
		    <fragment
		        android:layout_width="match_parent"
		        android:layout_height="match_parent"
		        android:name="io.rong.imkit.fragment.ConversationFragment"/>
		
		</LinearLayout>
    	
#### 联系我们
商务合作
Email：<bd@rongcloud.cn>

新浪微博 [@融云RongCloud](http://weibo.com/rongcloud)

客服 QQ 2948214065

公众帐号
融云RongCloud RongCloud 公众账号二维码

![Smaller icon](http://www.rongcloud.cn/images/code1.png "RongCloud")
