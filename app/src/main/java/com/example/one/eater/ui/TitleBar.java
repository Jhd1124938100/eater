package com.example.one.eater.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.example.one.eater.R;

/**
 * Created by one on 2017/12/14.
 */

public class TitleBar extends RelativeLayout {

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.titlebar, this, true);

    }

}
