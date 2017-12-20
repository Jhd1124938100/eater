package com.example.one.eater.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.one.eater.R;

public class PersonalInforActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_personal_text_back;
    private RelativeLayout rl_infor_friend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_infor);
        initDate();
        initEvent();

    }
    private void initDate() {
        tv_personal_text_back=(TextView) findViewById(R.id.tv_personal_text_back);
        rl_infor_friend=findViewById(R.id.rl_infor_friend);
    }

    private void initEvent() {
        tv_personal_text_back.setOnClickListener(this);
        rl_infor_friend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.tv_personal_text_back:
                finish();
                break;
            case R.id.rl_infor_friend:
                intent=new Intent(this,PersonalFriendActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
