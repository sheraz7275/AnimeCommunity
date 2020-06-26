package com.example.ahmadsheraz.worldanimecommunity.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.ahmadsheraz.worldanimecommunity.Adapters.chatRoomAdapter;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.inboxAdapter;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatRoomData;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.inboxModal;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Myinbox_frag extends Fragment {


    View view;

    RecyclerView inboxRecyclerView;

    public Myinbox_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view=inflater.inflate(R.layout.fragment_myinbox, container, false);
        initialize();

        setInboxRecyclerView();

        return view;
    }


    void initialize(){


        inboxRecyclerView=view.findViewById(R.id.inBoxRecyclerView);

    }




    void setInboxRecyclerView() {


        List<inboxModal> data = new ArrayList<inboxModal>();
        data.add(new inboxModal(R.drawable.img1,"Ali","4 hr ago"));
        data.add(new inboxModal(R.drawable.img2,"Hamza","4 hr ago"));
        data.add(new inboxModal(R.drawable.img3,"Muneeb","4 hr ago"));
        data.add(new inboxModal(R.drawable.img2,"Aqib","4 hr ago"));
        data.add(new inboxModal(R.drawable.img1,"Ahmad","4 hr ago"));








        inboxAdapter mAdapter = new inboxAdapter(getActivity(),data);





        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        inboxRecyclerView.setLayoutManager(mLayoutManager);
        inboxRecyclerView.setItemAnimator(new DefaultItemAnimator());
        inboxRecyclerView.setAdapter(mAdapter);




    }

}
