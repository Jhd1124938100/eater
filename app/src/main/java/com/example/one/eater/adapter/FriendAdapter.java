package com.example.one.eater.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.one.eater.Model.FriendModel;
import com.example.one.eater.R;

import java.util.List;

/**
 * Created by Zero on 2017/12/20.
 */

public class FriendAdapter extends BaseAdapter{
    private List<FriendModel> friendList;
    private Context context;

    public FriendAdapter(Context context,List<FriendModel> list)
    {
        super();
        this.friendList= list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return friendList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder item = null;
        if(convertView ==null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_friend, null);
            item = new ViewHolder();
            item.friendBgId= (ImageView) convertView.findViewById(R.id.iv_item_friend);
            item.friendName= (TextView) convertView.findViewById(R.id.tv_item_friend_name);
            item.friendFans= (TextView) convertView.findViewById(R.id.tv_item_friend_fans);
            convertView.setTag(item);//绑定ViewHolder对象
        }
        else
        {
            item = (ViewHolder) convertView.getTag();//取出ViewHolder对象
        }
        /**设置TextView显示的内容，即我们存放在动态数组中的数据*/
        item.friendBgId.setBackgroundResource(friendList.get(position).FriendBgId);
        item.friendName.setText(friendList.get(position).FriendName);
        item.friendFans.setText(friendList.get(position).FriendFans);
//        /**
//         * 设置按钮点击事件
//         */
//        item..setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Log.i("---->","你点击了按钮："+getItemId(position));
//            }
//        });

        return convertView;
    }
    public class ViewHolder
    {
        public ImageView friendBgId;
        public TextView friendName;
        public TextView friendFans;
    }

}
