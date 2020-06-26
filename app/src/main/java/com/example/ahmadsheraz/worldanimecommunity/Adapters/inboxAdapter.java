package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatRoomData;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.inboxModal;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;

public class inboxAdapter extends RecyclerView.Adapter<inboxAdapter.inboxHolder> {



    Context context;
    List<inboxModal> mitems =new ArrayList<>();

    public inboxAdapter(Context context, List<inboxModal> mitems) {
        this.context = context;
        this.mitems = mitems;
    }

    @NonNull
    @Override
    public inboxHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView ;

        itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.inbox_item, viewGroup, false);


        return new  inboxAdapter.inboxHolder(itemView);
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull inboxHolder inboxHolder, int i) {


        inboxHolder.imageView.setImageDrawable(context.getDrawable(mitems.get(i).getImage()));
        inboxHolder.txtFullName.setText(mitems.get(i).getFullname());
        inboxHolder.txtUpdateTime.setText(mitems.get(i).getLastUpdate());


    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }

    public  class inboxHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView txtFullName,txtUpdateTime;



        public inboxHolder(@NonNull View itemView) {
            super(itemView);


            imageView=itemView.findViewById(R.id.img_inbox);
            txtUpdateTime=itemView.findViewById(R.id.txt_Inbox_lastupdate);
            txtFullName=itemView.findViewById(R.id.txt_Inbox_fullname);


        }
    }
}
