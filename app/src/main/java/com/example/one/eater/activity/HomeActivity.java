package com.example.one.eater.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.example.one.eater.R;
import com.example.one.eater.ui.ImageViewHolder;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {
    private List<Integer> mImageList = new ArrayList<>();
    private int[] mImages  = {R.drawable.iv_a,R.drawable.iv_b,R.drawable.iv_c,R.drawable.iv_d,R.drawable.iv_d};
    private ConvenientBanner mCb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        initDatas();

        initListener();
    }
    private void initListener() {

        mCb.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(HomeActivity.this,"点击了条目"+position, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initViews() {
        mCb = (ConvenientBanner) findViewById(R.id.home_vp);
    }

    private void initDatas() {

        for (int i = 0; i < 5; i++) {
            mImageList.add(mImages[i]);
        }
        mCb.setPages(new CBViewHolderCreator<ImageViewHolder>() {
            @Override
            public ImageViewHolder createHolder() {
                return new ImageViewHolder();
            }
        },mImageList)
                .setPageIndicator(new int[]{R.drawable.ponit_normal,R.drawable.point_select}) //设置两个点作为指示器
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL); //设置指示器的方向水平居中
             mCb.setCanLoop(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCb.startTurning(2000);      //设置开始轮播以及轮播时间
    }

    @Override
    protected void onPause() {
        if(mCb!=null){
            mCb.stopTurning();   //停止轮播
        }
        super.onPause();
    }
}
