package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmadsheraz.worldanimecommunity.Activites.chatActivity;
import com.example.ahmadsheraz.worldanimecommunity.Activites.chatRoom;
import com.example.ahmadsheraz.worldanimecommunity.Activites.signup;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.bottomSheetModal;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatRoomData;
import com.example.ahmadsheraz.worldanimecommunity.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class chatRoomAdapter extends RecyclerView.Adapter<chatRoomAdapter.chatHolder> {



    Context context;
    List<chatRoomData> mitems =new ArrayList<>();

    public chatRoomAdapter(Context context, List<chatRoomData> mitems) {
        this.context = context;
        this.mitems = mitems;
    }

    @NonNull
    @Override
    public chatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View itemView ;

        itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chat_room_item, viewGroup, false);


        return new  chatRoomAdapter.chatHolder(itemView);
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull chatHolder chatHolder, int i) {




        chatHolder.imageView.setImageDrawable(context.getDrawable(mitems.get(i).getImage()));

        chatHolder.txtPeopleInside.setText(mitems.get(i).getPeopleInside());

        chatHolder.txtUpdateTime.setText(mitems.get(i).getLastUpdate());
       chatHolder.txtFounder.setText(mitems.get(i).getFounder());
       chatHolder.txtChatRoom.setText(mitems.get(i).getChatRoomName());


       chatHolder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(context, chatActivity.class);
               context.startActivity(i);

           }
       });



    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }

    public class chatHolder extends RecyclerView.ViewHolder{


        TextView txtChatRoom,txtFounder,txtUpdateTime,txtPeopleInside;

        ImageView imageView;

        public chatHolder(@NonNull View itemView) {
            super(itemView);


            txtChatRoom=itemView.findViewById(R.id.txt_chatRoomName);
            txtFounder=itemView.findViewById(R.id.txt_founder);
            txtUpdateTime=itemView.findViewById(R.id.txt_lastupdate);
            txtPeopleInside=itemView.findViewById(R.id.txt_people_inside);
            imageView=itemView.findViewById(R.id.img_chatroom);


        }
    }
}
