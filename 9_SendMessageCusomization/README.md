# 融云

![Mou icon](http://www.rongcloud.cn/images/logo_1.png)





#### 运行条件

**AndroidStudio 0.6+**

**Gradle 1.11+**

**RongIMSDK**

**Android Support V4**

**Google GSON 2.2.+**

**听云SDK(Android Studio自动支持，Eclipse请安装开发插件或屏蔽9_SendMessageCusomization中引用)**
**插件地址<http://download.networkbench.com/newlens/android_agent/eclipse>**

*如需使用自行申请APP_Key测试，需要搭建自己的auth服务器*

*测试服务器搭建请参照<https://github.com/rongcloud/auth-service-nodejs>*

服务器方面需要配置conf.json中的appKey属性完成验证

*在DemoContext中init方法中填入申请的APP_Key测试，并在DemoApi中配置HOST指向到自己的auth服务上*

*如适用Eclipse开发请Import路径app/src/main，编码请选择为 UTF-8。

#### 注意事项：
9_SendMessageCusomization这个Demo演示自定义发送区域颜色和图标（包括删除语音功能），包括以下：
		
（1）MainActivity.java，内置一个Button，按此Button进入单人会话页

		public void onClick(View v) {
			// TODO Auto-generated method stub
	    	switch(v.getId())
	    	{
		    	case R.id.button1:
				 {
		            RongIM.getInstance().startPrivateChat(this, "9SendMessageCusomization", "新媒9");
				 }
		
		    	default:
		    	{
		    		
		    	}break;
		    }
		}
（2）去会话页中发送栏中的语音图标
		rc_view_message_bar.xml中搜索android:id="@+id/conversation_message_bar_voice_btn"
		在这个控件中添加：
		android:visibility="gone"
	
	
（3）换会话页中发送栏中的颜色
		搜索android:background="#F8F8F8"
		例如换为：android:background="#00FF00"

   	
    	
#### 联系我们
商务合作
Email：<bd@rongcloud.cn>

新浪微博 [@融云RongCloud](http://weibo.com/rongcloud)

客服 QQ 2948214065

公众帐号
融云RongCloud RongCloud 公众账号二维码

![Smaller icon](http://www.rongcloud.cn/images/code1.png "RongCloud")
