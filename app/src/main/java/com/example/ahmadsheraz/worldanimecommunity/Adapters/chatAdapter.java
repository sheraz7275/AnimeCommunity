package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.chatDataModal;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.mainScreenModal;
import com.example.ahmadsheraz.worldanimecommunity.R;
import com.makeramen.roundedimageview.RoundedImageView;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class chatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<chatDataModal> mlist;

    Context context;

    public chatAdapter(List<chatDataModal> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {




        final RecyclerView.ViewHolder holder;
        View view;

        switch (i){

            case R.layout.item_chat_receving_text:

                view= LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_receving_text, viewGroup, false);
                holder=new chatAdapter.holderSendingText(view);

                break;




            case R.layout.item_chat_receving_image:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_receving_image, viewGroup, false);
                holder=new chatAdapter.holderReceivingImage(view);

                break;

            case R.layout.item_chat_receving_gif:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_receving_gif, viewGroup, false);
                holder=new chatAdapter.holderReceivingGif(view);

                break;

            case R.layout.item_chat_sending_text:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_sending_text, viewGroup, false);
                holder=new chatAdapter.holderSendingText(view);

                break;

            case R.layout.item_chat_sending_image:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_sending_image, viewGroup, false);
                holder=new chatAdapter.holderSendingImage(view);

                break;
            case R.layout.item_chat_sending_gif:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.item_chat_sending_gif, viewGroup, false);
                holder=new chatAdapter.holderSendingGif(view);

                break;



            default:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item2, viewGroup, false);
                holder=new chatAdapter.holderSendingText(view);

                break;


        }




        return holder;    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {





    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }


    @Override
    public int getItemViewType(int position) {




        if(position==0){

            return  R.layout.item_chat_receving_text;
        }
        else if (position==1){

            return  R.layout.item_chat_receving_image;


        }
        else if (position==2){

            return  R.layout.item_chat_receving_gif;


        }
        else if (position==3) {
            return  R.layout.item_chat_sending_text;

        }
        else if (position==4) {
            return R.layout.item_chat_sending_image;

        }
        else  {

            return  R.layout.item_chat_sending_gif;

        }
    }

    public class holderReceivingText extends RecyclerView.ViewHolder{

        CircularImageView user;

        TextView username;
        TextView userContent;

        public holderReceivingText(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            userContent=itemView.findViewById(R.id.txt_chat_content);

            user=itemView.findViewById(R.id.img_chat_image);

        }
    }


    public class holderReceivingImage extends RecyclerView.ViewHolder{
        CircularImageView user;
        RoundedImageView imageView;
        TextView username;


        public holderReceivingImage(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            imageView=itemView.findViewById(R.id.img_chat_content);

            user=itemView.findViewById(R.id.img_chat_image);




        }
    }

    public class holderReceivingGif extends RecyclerView.ViewHolder{
        CircularImageView user;
        RoundedImageView imageView;
        TextView username;
        public holderReceivingGif(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            imageView=itemView.findViewById(R.id.img_chat_content);

            user=itemView.findViewById(R.id.img_chat_image);

        }
    }


    public class holderSendingText extends RecyclerView.ViewHolder{
        TextView username;
        TextView userContent;
        CircularImageView user;

        public holderSendingText(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            userContent=itemView.findViewById(R.id.txt_chat_content);
            user=itemView.findViewById(R.id.img_chat_image);

        }
    }

    public class holderSendingImage extends RecyclerView.ViewHolder{

        CircularImageView user;
        RoundedImageView imageView;
        TextView username;
        public holderSendingImage(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            imageView=itemView.findViewById(R.id.img_chat_content);

            user=itemView.findViewById(R.id.img_chat_image);

        }
    }

    public class holderSendingGif extends RecyclerView.ViewHolder{
        CircularImageView user;
        RoundedImageView imageView;
        TextView username;
        public holderSendingGif(@NonNull View itemView) {
            super(itemView);

            username=itemView.findViewById(R.id.txt_chat_username);
            imageView=itemView.findViewById(R.id.img_chat_content);

            user=itemView.findViewById(R.id.img_chat_image);
        }
    }


}
