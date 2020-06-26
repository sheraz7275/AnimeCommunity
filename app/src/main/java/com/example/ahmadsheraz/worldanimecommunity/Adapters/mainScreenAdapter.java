package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.appTheme;
import com.example.ahmadsheraz.worldanimecommunity.R;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.mainScreenModal;

import java.util.ArrayList;
import java.util.List;

public class mainScreenAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {



    List<mainScreenModal> mlist;

    Context context;

    public RelativeLayout bottomsheet,r2;
    public appTheme mtheme;






    public mainScreenAdapter(List<mainScreenModal> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
        this.bottomsheet = bottomsheet;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       final RecyclerView.ViewHolder holder;
        View view;

        switch (i){

            case R.layout.main_item:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item, viewGroup, false);
                holder=new holderPicture(view);

                break;




            case R.layout.main_item2:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item2, viewGroup, false);
                holder=new holderSimple(view);

                break;

            case R.layout.main_item_gif:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item_gif, viewGroup, false);
                holder=new holderGif(view);

                break;

            case R.layout.main_item_movie:

                view=LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.main_item_movie, viewGroup, false);
                holder=new holderMovie(view);

                break;


            default:

                    view=LayoutInflater.from(viewGroup.getContext())
                            .inflate(R.layout.main_item2, viewGroup, false);
                    holder=new holderSimple(view);

                    break;


        }




        return holder;
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {


        if(viewHolder instanceof holderSimple){

            textThemeChanger(((holderSimple) viewHolder).name,
                    ((holderSimple) viewHolder).txtheart,
                    ((holderSimple) viewHolder).txtpoo,((holderSimple) viewHolder).txtmessage,
                    ((holderSimple) viewHolder).txtposTime,((holderSimple) viewHolder).description
            ,((holderSimple) viewHolder).txtusername);

            backgroundChanger(((holderSimple) viewHolder).cardView);
            ((holderSimple) viewHolder).postType.setImageDrawable(context.getDrawable(mlist.get(i).getPostType()));





            ((holderSimple) viewHolder).heart.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderSimple) viewHolder).heart.setImageDrawable(context.getDrawable(R.drawable.selected_heart));


                }
            });
            ((holderSimple) viewHolder).poo.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View view) {

                    ((holderSimple) viewHolder).poo.setImageDrawable(context.getDrawable(R.drawable.mpoo));



                }
            }); ((holderSimple) viewHolder).message.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

            ((holderSimple) viewHolder).popup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    launch();

                }
            });
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    animationDown();
                }
            });



        }
        if(viewHolder instanceof holderPicture) {


            textThemeChanger(((holderPicture) viewHolder).fname,
                    ((holderPicture) viewHolder).txtheart,
                    ((holderPicture) viewHolder).txtpoo,((holderPicture) viewHolder).txtmessage,
                    ((holderPicture) viewHolder).txtposTime,((holderPicture) viewHolder).description
                    ,((holderPicture) viewHolder).txtusername);

            backgroundChanger(((holderPicture) viewHolder).cardView);
            ((holderPicture) viewHolder).postType.setImageDrawable(context.getDrawable(mlist.get(i).getPostType()));

            ((holderPicture) viewHolder).postType.setImageDrawable(context.getDrawable(mlist.get(i).getPostType()));
            ((holderPicture) viewHolder).fname.setText(mlist.get(i).getFullname());



            ((holderPicture) viewHolder).heart.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderPicture) viewHolder).heart.setImageDrawable(context.getDrawable(R.drawable.selected_heart));


                }
            });
            ((holderPicture) viewHolder).poo.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderPicture) viewHolder).poo.setImageDrawable(context.getDrawable(R.drawable.mpoo));




                }
            });
            ((holderPicture) viewHolder).message.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {



                }
            });
            ((holderPicture) viewHolder).popup.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {


                    launch();

                }
            });
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    animationDown();
                }
            });

        }

        if(viewHolder instanceof holderGif) {



            textThemeChanger(((holderGif) viewHolder).name,
                    ((holderGif) viewHolder).txtheart,
                    ((holderGif) viewHolder).txtpoo,((holderGif) viewHolder).txtmessage,
                    ((holderGif) viewHolder).txtposTime,((holderGif) viewHolder).description
                    ,((holderGif) viewHolder).txtusername);

            backgroundChanger(((holderGif) viewHolder).cardView);



            ((holderGif) viewHolder).postType.setImageDrawable(context.getDrawable(mlist.get(i).getPostType()));

            ((holderGif) viewHolder).name.setText(mlist.get(i).getFullname());

            ((holderGif) viewHolder).heart.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderGif) viewHolder).heart.setImageDrawable(context.getDrawable(R.drawable.selected_heart));


                }
            });

            ((holderGif) viewHolder).poo.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderGif) viewHolder).poo.setImageDrawable(context.getDrawable(R.drawable.mpoo));


                }
            });

            ((holderGif) viewHolder).message.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {



                }
            });
            ((holderGif) viewHolder).popup.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {


                    launch();


                }
            });

            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    animationDown();
                }
            });

        }

        if(viewHolder instanceof holderMovie)
        {

            textThemeChanger(((holderMovie) viewHolder).name,
                    ((holderMovie) viewHolder).txtheart,
                    ((holderMovie) viewHolder).txtpoo,((holderMovie) viewHolder).txtmessage,
                    ((holderMovie) viewHolder).txtposTime,((holderMovie) viewHolder).description
                    ,((holderMovie) viewHolder).txtusername);

            backgroundChanger(((holderMovie) viewHolder).cardView);


            ((holderMovie) viewHolder).postType.setImageDrawable(context.getDrawable(mlist.get(i).getPostType()));


            ((holderMovie) viewHolder).name.setText(mlist.get(i).getFullname());

            ((holderMovie) viewHolder).heart.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderMovie) viewHolder).heart.setImageDrawable(context.getDrawable(R.drawable.selected_heart));


                }
            });



            ((holderMovie) viewHolder).poo.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {

                    ((holderMovie) viewHolder).poo.setImageDrawable(context.getDrawable(R.drawable.mpoo));




                }
            });

            ((holderMovie) viewHolder).message.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {



                }
            });

            ((holderMovie) viewHolder).popup.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("NewApi")
                @Override
                public void onClick(View view) {


                    launch();


                }
            });


            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    animationDown();
                }
            });

        }

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    @Override
    public int getItemViewType(int position) {


        if(position==2){

            return  R.layout.main_item2;
        }
        else if (position==1){

            return  R.layout.main_item_movie;


        }
        else if (position==3){

            return  R.layout.main_item_gif;


        }
        else {
            return  R.layout.main_item;

        }

    }







  public class holderPicture extends RecyclerView.ViewHolder {

      TextView fname , description,txtpoo,txtheart,txtmessage,txtposTime,txtusername;

      CardView cardView;

      ImageView heart,poo,message,popup,postType;

      public holderPicture(@NonNull View itemView) {
          super(itemView);

         fname = itemView.findViewById(R.id.fullname);
         cardView=itemView.findViewById(R.id.card);

         heart=itemView.findViewById(R.id.heart);
          poo=itemView.findViewById(R.id.poo);
          message=itemView.findViewById(R.id.message);
          postType=itemView.findViewById(R.id.postType);
          popup=itemView.findViewById(R.id.popup);


          description=itemView.findViewById(R.id.description);
          txtpoo=itemView.findViewById(R.id.txtpoo);
          txtheart=itemView.findViewById(R.id.txtheart);
          txtmessage=itemView.findViewById(R.id.txtmessage);
          txtposTime=itemView.findViewById(R.id.txtposttime);
          txtusername=itemView.findViewById(R.id.txtusername);


      }
  }

    public class holderSimple extends RecyclerView.ViewHolder {

        TextView name , description,txtpoo,txtheart,txtmessage,txtposTime,txtusername;
        CardView cardView;

        ImageView heart,poo,message,popup,postType;
        public holderSimple(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.mname);
            cardView=itemView.findViewById(R.id.card);

            postType=itemView.findViewById(R.id.postType);


            heart=itemView.findViewById(R.id.heart);
            poo=itemView.findViewById(R.id.poo);
            message=itemView.findViewById(R.id.message);
            popup=itemView.findViewById(R.id.popup);

            description=itemView.findViewById(R.id.description);
            txtpoo=itemView.findViewById(R.id.txtpoo);
            txtheart=itemView.findViewById(R.id.txtheart);
            txtmessage=itemView.findViewById(R.id.txtmessage);
            txtposTime=itemView.findViewById(R.id.txtposttime);
            txtusername=itemView.findViewById(R.id.txtusername);



        }
    }

    public class holderGif extends RecyclerView.ViewHolder {

        TextView name , description,txtpoo,txtheart,txtmessage,txtposTime,txtusername;
        ImageView heart,poo,message,popup,postType;
        CardView cardView;



        public holderGif(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtgif);
            cardView=itemView.findViewById(R.id.card);

            postType=itemView.findViewById(R.id.postType);


            heart=itemView.findViewById(R.id.heart);
            poo=itemView.findViewById(R.id.poo);
            message=itemView.findViewById(R.id.message);
            popup=itemView.findViewById(R.id.popup);

            description=itemView.findViewById(R.id.description);
            txtpoo=itemView.findViewById(R.id.txtpoo);
            txtheart=itemView.findViewById(R.id.txtheart);
            txtmessage=itemView.findViewById(R.id.txtmessage);
            txtposTime=itemView.findViewById(R.id.txtposttime);
            txtusername=itemView.findViewById(R.id.txtusername);


        }
    }

    public class holderMovie extends RecyclerView.ViewHolder {

        TextView name , description,txtpoo,txtheart,txtmessage,txtposTime,txtusername;
        ImageView heart,poo,message,popup,postType;
        CardView cardView;



        public holderMovie(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtmovie);
            cardView=itemView.findViewById(R.id.card);

            postType=itemView.findViewById(R.id.postType);


            heart=itemView.findViewById(R.id.heart);
            poo=itemView.findViewById(R.id.poo);
            message=itemView.findViewById(R.id.message);
            popup=itemView.findViewById(R.id.popup);

            description=itemView.findViewById(R.id.description);
            txtpoo=itemView.findViewById(R.id.txtpoo);
            txtheart=itemView.findViewById(R.id.txtheart);
            txtmessage=itemView.findViewById(R.id.txtmessage);
            txtposTime=itemView.findViewById(R.id.txtposttime);
            txtusername=itemView.findViewById(R.id.txtusername);




        }
    }


    public void launch() {


        List<String> mylist = new ArrayList<String>();


        mylist.add( "Adore @ajanasokan");
        mylist.add("Hate @ajanasokan");
        mylist.add("Block @ajanasokan");
        mylist.add("Mute @ajanasokan");


        mylist.add("Report");


        //Create sequence of items
        final CharSequence[]cntry = mylist.toArray(new String[mylist.size()]);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setItems(cntry, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                String selectedText = cntry[item].toString();  //Selected item in listview




                // Toast.makeText(context,selectedText,Toast.LENGTH_LONG).show();


            }
        });

        AlertDialog alertDialogObject = dialogBuilder.create();

        alertDialogObject.show();

    }



    @SuppressLint("NewApi")
    public void textThemeChanger(TextView name ,TextView description, TextView txtpoo, TextView txtheart, TextView txtmessage, TextView txtposTime,TextView txtusername){

        description.setTextColor(context.getColor(mtheme.getPost()));
        txtpoo.setTextColor(context.getColor(mtheme.getPostTime()));

        txtheart.setTextColor(context.getColor(mtheme.getPostTime()));

        txtmessage.setTextColor(context.getColor(mtheme.getPostTime()));

        txtposTime.setTextColor(context.getColor(mtheme.getPostTime()));

        name.setTextColor(context.getColor(mtheme.getFullName()));
        txtusername.setTextColor(context.getColor(mtheme.getFullName()));








    }


    @SuppressLint("NewApi")
    public void backgroundChanger(CardView cardView ){

        cardView.setCardBackgroundColor(context.getColor(mtheme.getBackGround()));


    }


    public void imageThemeChanger(ImageView heart,ImageView poo,ImageView message,ImageView popup){


    }



    void  animationDown(){

        bottomsheet.setVisibility(View.GONE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                r2.getHeight()); // toYDelta
        animate.setDuration(700);
        animate.setFillAfter(true);

        /**/







        bottomsheet.startAnimation(animate);





    }


}
