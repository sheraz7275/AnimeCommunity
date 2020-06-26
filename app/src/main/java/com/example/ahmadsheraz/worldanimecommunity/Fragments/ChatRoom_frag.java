package com.example.ahmadsheraz.worldanimecommunity.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmadsheraz.worldanimecommunity.Activites.CreateChatRoom;
import com.example.ahmadsheraz.worldanimecommunity.Activites.signup;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.chatRoomAdapter;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.mainScreenAdapter;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.appTheme;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatRoomData;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.mainScreenModal;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatRoom_frag extends Fragment {

    View view;
    ImageView imageView;


    RecyclerView chatRecyclerView;

    public ChatRoom_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_chat_room, container, false);


        initialize();
        setChatRoomRecyclerView();



        return view;
    }




    void initialize(){


        chatRecyclerView=view.findViewById(R.id.chatRoomRecyclerView);
        imageView=view.findViewById(R.id.img_createChatRoom);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), CreateChatRoom.class);
                startActivity(i);

            }
        });

    }

    void setChatRoomRecyclerView() {


        List<chatRoomData> data = new ArrayList<chatRoomData>();
        data.add(new chatRoomData(R.drawable.chatroom_bg1,"ChatRoom","10","4 hr ago","Ali"));
        data.add(new chatRoomData(R.drawable.chatroom_bg2,"ChatRoom","10","4 hr ago","Ali"));
        data.add(new chatRoomData(R.drawable.chatroom_bg3,"ChatRoom","10","4 hr ago","Ali"));
        data.add(new chatRoomData(R.drawable.chatroom_bg1,"ChatRoom","10","4 hr ago","Ali"));








        chatRoomAdapter mAdapter = new chatRoomAdapter( getActivity(),data);





        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        chatRecyclerView.setLayoutManager(mLayoutManager);
        chatRecyclerView.setItemAnimator(new DefaultItemAnimator());
        chatRecyclerView.setAdapter(mAdapter);




    }

}
