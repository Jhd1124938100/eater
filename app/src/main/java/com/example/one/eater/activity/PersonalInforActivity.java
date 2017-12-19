package com.example.one.eater.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.one.eater.R;

public class PersonalInforActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_personal_text_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_infor);
        initDate();
        initEvent();

    }
    private void initDate() {
        tv_personal_text_back=(TextView) findViewById(R.id.tv_personal_text_back);
    }

    private void initEvent() {
        tv_personal_text_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_personal_text_back:
                finish();
                break;
            default:
                break;
        }
    }
}
