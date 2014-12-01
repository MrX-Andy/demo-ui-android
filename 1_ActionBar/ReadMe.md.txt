    ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().setData(Uri.parse("rong://io.rong.imkit.demo").buildUpon().appendPath("conversation").appendPath("private")
                .appendQueryParameter("targetId","user1").build());
        setContentView(R.layout.activity_test2_fragment);
        mActionBar = (ActionBar)findViewById(R.id.rc_actionbar);
        mActionBar.getTitleTextView().setText("会话自定义Fragment测试");
        mActionBar.setOnBackClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        LayoutInflater inflater = LayoutInflater.from(this);
        mActionBar.addView(inflater.inflate(R.layout.ui_action_btn,mActionBar,false));

    }






    <io.rong.imkit.veiw.ActionBar
        android:id="@id/rc_actionbar"
        style="@style/RcTheme.ActionBar">
    </io.rong.imkit.veiw.ActionBar>

    <fragment
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:name="io.rong.imkit.fragment.ConversationFragment"/>