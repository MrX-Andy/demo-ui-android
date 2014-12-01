# 融云

![Mou icon](http://www.rongcloud.cn/images/logo_1.png)





#### 运行条件

**AndroidStudio 0.6+**

**Gradle 1.11+**

**RongIMSDK**

**Android Support V4**

**Google GSON 2.2.+**

**听云SDK(Android Studio自动支持，Eclipse请安装开发插件或屏蔽1_ActionBar中引用)**
**插件地址<http://download.networkbench.com/newlens/android_agent/eclipse>**

*如需使用自行申请APP_Key测试，需要搭建自己的auth服务器*

*测试服务器搭建请参照<https://github.com/rongcloud/auth-service-nodejs>*

服务器方面需要配置conf.json中的appKey属性完成验证

*在DemoContext中init方法中填入申请的APP_Key测试，并在DemoApi中配置HOST指向到自己的auth服务上*

*如适用Eclipse开发请Import路径app/src/main，编码请选择为 UTF-8。

#### 注意事项：
1_ActionBar这个Demo演示对ActionBar的各种操作，包括以下：
（1）ActionBar修改背景颜色
		对应页面：ActionBarModifyColorFragmentActivity
		rc_colors.xml文件中修改：name这个值即可，如
		原值：
		<color name="rc_title_bg">#3498DB</color>
		修改为：
    <color name="rc_title_bg">#CCCC00</color>
    
（2）ActionBar修改指定页Logo图标
		对应页面：ActionBarModifyOneLogoFragmentActivity
  	定义类成员：
  	private ImageView mLogoImageView;
  	onCreate()方法中加：
    mLogoImageView = mActionBar.getLogoView();
    mLogoImageView.setImageResource(R.drawable.rc_add_people);//括号中加上新换的图标ID即可
    
（3）ActionBar修改所有页Logo图标
		对应页面：ActionBarModifyAllLogoFragmentActivity
		rc_theme.xml文件中修改：android:src这个值即可，如
		原值：
    <style name="RcTheme.ActionBar.Logo" >
        <item name="android:src">@drawable/rc_bar_logo</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_width">wrap_content</item>
    </style>
    修改为：
        <style name="RcTheme.ActionBar.Logo" >
        <item name="android:src">@drawable/rc_add_people</item>//此处替换新的图标名即可
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_width">wrap_content</item>
    </style>
    
（4）ActionBar添加图标按钮
		对应页面：ActionBarAddImageButttonFragmentActivity
		定义类成员：
    ImageButton imageButton;
  	onCreate()方法中加：
       
  
    getIntent().setData(Uri.parse("rong://com.example.actionbar").buildUpon().appendPath("conversationlist").appendPath("private")
            .appendQueryParameter("targetId","user1").build());
    LayoutInflater inflater = LayoutInflater.from(this);
    imageButton = (ImageButton)inflater.inflate(R.layout.rc_imagebutton_selector,mActionBar,false);
    mActionBar.addView(imageButton);
    imageButton.setOnClickListener(this);
  
		并添加重载以下方法
    @Override
  	public void onClick(View v) {
  		// TODO Auto-generated method stub
    	int imageButtonId = imageButton.getId();
    	if(v.getId() == imageButtonId)
      	{
      		    //启动选择好友页
    		  		Intent intent = new Intent(ActionBarAddImageButtonFragmentActivity.this, RongActivity.class);
              intent.putExtra(RCloudConst.EXTRA.CONTENT, FriendMultiChoiceFragment.class.getName());
              startActivity(intent);
              finish();
      	}
  	}
  	
  	同时添加布局文件：
		rc_imagebutton_selector.xml，内容：
  	<?xml version="1.0" encoding="utf-8"?>

		<ImageButton xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_margin="5dp"
    android:layout_height="wrap_content"
    style="@style/RcTheme.ActionBar.ButtonAdd"/>
    并在rc_theme.xml中，添加style:
    <style name="RcTheme.ActionBar.ButtonAdd" parent="@android:TextAppearance.Small.Inverse">
	    <item name="android:gravity">center</item>
	    <item name="android:layout_height">wrap_content</item>
	    <item name="android:layout_width">wrap_content</item>
	    <item name="android:background">@drawable/rc_add_people</item>
	    <item name="android:textColor">@drawable/rc_co_select_selector</item>
    </style>

    
（5）ActionBar修改图标按钮
		对应页面：ActionBarModifyImageButtonFragmentActivity
		在（4）ActionBar添加图标按钮基础上修改下句：
		原值：
  	imageButton = (ImageButton)inflater.inflate(R.layout.rc_imagebutton_selector,mActionBar,false);
    修改为：
    imageButton = (ImageButton)inflater.inflate(R.layout.rc_imagebutton_more,mActionBar,false);//R.layout.rc_imagebutton_more是新imageButton对应的布局文件
  	
		同时添加布局文件：
		rc_imagebutton_more.xml，内容：
		<?xml version="1.0" encoding="utf-8"?>

		<ImageButton xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_margin="5dp"
    android:layout_height="wrap_content"
    style="@style/RcTheme.ActionBar.ButtonMore"/>
    并在rc_theme.xml中，添加style:
    <style name="RcTheme.ActionBar.ButtonMore" parent="@android:TextAppearance.Small.Inverse">
	    <item name="android:gravity">center</item>
	    <item name="android:layout_height">wrap_content</item>
	    <item name="android:layout_width">wrap_content</item>
	    <item name="android:background">@drawable/rc_bar_more</item>
	    <item name="android:textColor">@drawable/rc_co_select_selector</item>
    </style>
	    
（6）ActionBar删除返回按钮
		对应页面：ActionBarDeleteBackFragmentActivity
		定义类成员：
  	private ImageView mImageView;
  	onCreate()方法中加：
    mImageView = mActionBar.getBackView();
    mImageView.setVisibility(View.GONE);
    	
    	
    	
#### 联系我们
商务合作
Email：<bd@rongcloud.cn>

新浪微博 [@融云RongCloud](http://weibo.com/rongcloud)

客服 QQ 2948214065

公众帐号
融云RongCloud RongCloud 公众账号二维码

![Smaller icon](http://www.rongcloud.cn/images/code1.png "RongCloud")
