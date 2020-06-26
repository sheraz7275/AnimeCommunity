package com.example.ahmadsheraz.worldanimecommunity.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;

import com.example.ahmadsheraz.worldanimecommunity.Adapters.chatAdapter;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.chatRoomAdapter;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatDataModal;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatRoomData;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;

public class chatActivity extends AppCompatActivity {


    RecyclerView chatRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        initialize();
        setChatRecyclerView();

    }

    public void back(View view) {

        finish();


    }


    void initialize(){


        chatRecyclerView=findViewById(R.id.chatRecycler);

    }

    void setChatRecyclerView() {


        List<chatDataModal> data = new ArrayList<chatDataModal>();
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));
        data.add(new chatDataModal("Ali","Excepteur sint occaecat cupidatat",
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1,
                R.drawable.chatroom_bg1));






        chatAdapter mAdapter = new chatAdapter( data,this);





        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        chatRecyclerView.setLayoutManager(mLayoutManager);
        chatRecyclerView.setItemAnimator(new DefaultItemAnimator());
        chatRecyclerView.setAdapter(mAdapter);




    }
}
