package com.example.one.eater.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.one.eater.R;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private TextView tv_login_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initDate();
        initEvent();
    }

    private void initDate() {
        tv_login_back=(TextView)findViewById(R.id.tv_login_back);
    }

    private void initEvent() {
        tv_login_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_login_back:
                finish();
                break;
            default:
                break;
        }
    }
}
