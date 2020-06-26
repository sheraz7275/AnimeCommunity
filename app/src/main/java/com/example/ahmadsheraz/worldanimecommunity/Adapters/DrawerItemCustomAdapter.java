package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.ObjectDrawerItem;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;


public class DrawerItemCustomAdapter extends RecyclerView.Adapter<DrawerItemCustomAdapter.mViewHolder>{




    Context context;
    int  image[];
    List<ObjectDrawerItem> drawerItem =new ArrayList<>();


    public DrawerItemCustomAdapter( List<ObjectDrawerItem> drawerItem , Context context) {
        this.context = context;
        this.drawerItem=drawerItem;
    }


    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView ;

        itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.drawer_item, viewGroup, false);



        return new DrawerItemCustomAdapter.mViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder mViewHolder, int i) {



        mViewHolder.textView.setText(drawerItem.get(i).name);

    }

    @Override
    public int getItemCount() {
        return drawerItem.size();
    }

    public class mViewHolder extends RecyclerView.ViewHolder{


        TextView textView;

        public mViewHolder(@NonNull View itemView) {
            super(itemView);


            textView=itemView.findViewById(R.id.txtname);

        }
    }

}
