package com.example.one.eater.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.one.eater.R;
import com.example.one.eater.adapter.ViewPagerAdatper;

import java.util.ArrayList;
import java.util.List;


public class GuideActivity extends BaseActivity {

    private View view_1;
    private View view_2;
    private View view_3;

    private Button bt_guide;
    private ViewPager vp_guide;
    private LayoutInflater lf_guide;
    private List<View> mViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initDate();
        initView();
        bt_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuideActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initDate() {
        mViewList = new ArrayList<View>();
        bt_guide = (Button) findViewById(R.id.bt_guide);
        lf_guide = getLayoutInflater().from(GuideActivity.this);
    }

    private void initView() {
        view_1 = lf_guide.inflate(R.layout.guide_first, null);
        view_2 = lf_guide.inflate(R.layout.guide_second, null);
        view_3 = lf_guide.inflate(R.layout.guide_third, null);
        mViewList.add(view_1);
        mViewList.add(view_2);
        mViewList.add(view_3);

        vp_guide = (ViewPager) findViewById(R.id.vp_guide);
        vp_guide.setAdapter(new ViewPagerAdatper(mViewList));
        vp_guide.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                System.out.println("position:" + position);
                if (position == mViewList.size() - 1) {
                    bt_guide.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
