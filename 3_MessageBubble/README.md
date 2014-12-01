# 融云

![Mou icon](http://www.rongcloud.cn/images/logo_1.png)





#### 运行条件

**AndroidStudio 0.6+**

**Gradle 1.11+**

**RongIMSDK**

**Android Support V4**

**Google GSON 2.2.+**

**听云SDK(Android Studio自动支持，Eclipse请安装开发插件或屏蔽7_GroupSettings中引用)**
**插件地址<http://download.networkbench.com/newlens/android_agent/eclipse>**

*如需使用自行申请APP_Key测试，需要搭建自己的auth服务器*

*测试服务器搭建请参照<https://github.com/rongcloud/auth-service-nodejs>*

服务器方面需要配置conf.json中的appKey属性完成验证

*在DemoContext中init方法中填入申请的APP_Key测试，并在DemoApi中配置HOST指向到自己的auth服务上*

*如适用Eclipse开发请Import路径app/src/main，编码请选择为 UTF-8。

#### 注意事项：
这个Demo演示自定义群组设置，包括以下：
		
（1）会话页面中自定义聊天气泡
		修改布局文件
		//会话列表
		rc_item_image_conversation.xml
		rc_item_image_text_conversation.xml
		rc_item_text_conversation.xml
		rc_item_voice_conversation.xml
		中的搜索android:id="@+id/conversation_left_bubble"和android:id="@+id/conversation_right_bubble"这两个属性值
		四个布局文件中分别有两处
		将这两个id对应的属性android:background，替换新图片就行
		例如：
		原值：
		android:background="@drawable/rc_conversation_bubble_blue"
		修改为：
		android:background="@drawable/rc_conversation_bubble_white"
   	
    	
#### 联系我们
商务合作
Email：<bd@rongcloud.cn>

新浪微博 [@融云RongCloud](http://weibo.com/rongcloud)

客服 QQ 2948214065

公众帐号
融云RongCloud RongCloud 公众账号二维码

![Smaller icon](http://www.rongcloud.cn/images/code1.png "RongCloud")
