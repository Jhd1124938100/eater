package com.example.one.eater.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.one.eater.R;
import com.example.one.eater.activity.PersonalFriendActivity;
import com.example.one.eater.activity.PersonalInforActivity;

public class BottomBar extends RelativeLayout implements View.OnClickListener {

    private LinearLayout ll_bottom_activity;
    private LinearLayout ll_bottom_home;
    private LinearLayout ll_bottom_food;
    private LinearLayout ll_bottom_admini;
    private LinearLayout ll_bottom_intro;
    public BottomBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.bottombar, this, true);
        initDate();
        initEvent();
    }
    private void initDate() {
        ll_bottom_activity=findViewById(R.id.ll_bottom_activity);
        ll_bottom_home=findViewById(R.id.ll_bottom_home);
        ll_bottom_food=findViewById(R.id.ll_bottom_food);
        ll_bottom_admini=findViewById(R.id.ll_bottom_admini);
        ll_bottom_intro=findViewById(R.id.ll_bottom_intro);
    }
    private void initEvent() {
        ll_bottom_activity.setOnClickListener(this);
        ll_bottom_home.setOnClickListener(this);
        ll_bottom_food.setOnClickListener(this);
        ll_bottom_admini.setOnClickListener(this);
        ll_bottom_intro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.ll_bottom_activity:
//                intent=new Intent(this,)
                break;
            case R.id.ll_bottom_home:
                break;
            case R.id.ll_bottom_food:
                break;
            case R.id.ll_bottom_admini:
                intent=new Intent(getContext(), PersonalInforActivity.class);
                getContext().startActivity(intent);
                break;
            case R.id.ll_bottom_intro:
                break;
            default:
                break;
        }
    }
}
