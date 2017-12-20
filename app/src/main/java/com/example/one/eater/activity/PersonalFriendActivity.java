package com.example.one.eater.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.one.eater.Model.FriendModel;
import com.example.one.eater.R;
import com.example.one.eater.adapter.FriendAdapter;

import java.util.ArrayList;
import java.util.List;

public class PersonalFriendActivity extends AppCompatActivity {

    private List<FriendModel>friendList=new ArrayList<>();
    private ListView lv_presonal_friend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_friend);
        initFriend();
        FriendAdapter adapter=new FriendAdapter(PersonalFriendActivity.this,friendList);
        lv_presonal_friend=(ListView)findViewById(R.id.lv_presonal_friend);
        lv_presonal_friend.setAdapter(adapter);
    }

    private void initFriend() {
        FriendModel friendModel1=new FriendModel(R.drawable.person_bg,"100","100");
        friendList.add(friendModel1);
        FriendModel friendModel2=new FriendModel(R.drawable.person_bg,"100","100");
        friendList.add(friendModel2);
        FriendModel friendModel3=new FriendModel(R.drawable.person_bg,"100","100");
        friendList.add(friendModel3);
    }
}
