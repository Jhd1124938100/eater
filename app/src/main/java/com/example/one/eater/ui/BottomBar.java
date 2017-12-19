package com.example.one.eater.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.one.eater.R;

public class BottomBar extends RelativeLayout {

    public BottomBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.bottombar, this, true);

    }

}
