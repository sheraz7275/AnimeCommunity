package com.example.ahmadsheraz.worldanimecommunity.Activites;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ahmadsheraz.worldanimecommunity.Adapters.CustomPagerAdapter;
import com.example.ahmadsheraz.worldanimecommunity.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class newPostActivity extends AppCompatActivity {



    ImageView imgReview,imgReaction,imgAVM,imgCosplay,imgStory,imgArtWork,imgSpoiler;
    TextView txtReview,txtReaction,txtAVM,txtCosplay,txtStory,txtArtWork,txtSpoiler;

    EditText editShare;
    RelativeLayout rl_bottom;


     HorizontalInfiniteCycleViewPager infiniteCycleViewPager ;


     String selectedCategory="story";
     int catSelection=0;
    Bitmap bitmapImage,bitmapGif;
    public static final int PICK_IMAGE = 1;
    public static final int PICK_GIF = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        initialize();
        viewpagerSetup();
    }





    void initialize(){

        imgReview=findViewById(R.id.imgReview);


        imgReaction=findViewById(R.id.imgReaction);
        imgAVM=findViewById(R.id.imgavm);
        imgCosplay=findViewById(R.id.imgCosply);
        imgStory=findViewById(R.id.imgStory);
        imgArtWork=findViewById(R.id.imgArtwork);
        imgSpoiler=findViewById(R.id.imgSpoiler);


        txtReview=findViewById(R.id.txtReview);
        txtReaction=findViewById(R.id.txtReaction);
        txtAVM=findViewById(R.id.txtavm);
        txtCosplay=findViewById(R.id.txtCosplay);
        txtStory=findViewById(R.id.txtStory);
        txtArtWork=findViewById(R.id.txtArtWork);
        txtSpoiler=findViewById(R.id.txtSpoiler);


        infiniteCycleViewPager=findViewById(R.id.mypager);
        editShare=findViewById(R.id.editShare);


        rl_bottom=findViewById(R.id.rl_bottom);
    }

    @SuppressLint("NewApi")
    public void Review(View view) {


        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon_1));
        catSelection=1;


        txtReview.setVisibility(View.VISIBLE);
        selectedCategory=txtReview.getText().toString();





        txtReaction.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);


        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));




    }

    @SuppressLint("NewApi")
    public void Reaction(View view) {


        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon_1));
        catSelection=1;


        txtReaction.setVisibility(View.VISIBLE);
        selectedCategory=txtReaction.getText().toString();


        txtReview.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);

        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));
    }

    @SuppressLint("NewApi")
    public void AVM(View view) {
        txtAVM.setVisibility(View.VISIBLE);
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon_1));
        catSelection=1;

        selectedCategory=txtAVM.getText().toString();


        txtReview.setVisibility(View.INVISIBLE);
        txtReaction.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);

        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));

    }

    @SuppressLint("NewApi")
    public void Cosplay(View view) {
        txtCosplay.setVisibility(View.VISIBLE);
        catSelection=0;

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon_1));

        selectedCategory=txtCosplay.getText().toString();


        txtReview.setVisibility(View.INVISIBLE);
        txtReaction.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);


        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));

    }

    @SuppressLint("NewApi")
    public void story(View view) {
        txtStory.setVisibility(View.VISIBLE);
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon_1));
        selectedCategory=txtStory.getText().toString();
        catSelection=0;



        txtReview.setVisibility(View.INVISIBLE);
        txtReaction.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);


        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));
    }

    @SuppressLint("NewApi")
    public void ArtWork(View view) {
        txtArtWork.setVisibility(View.VISIBLE);
        catSelection=0;

        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon_1));
        selectedCategory=txtArtWork.getText().toString();


        txtReview.setVisibility(View.INVISIBLE);
        txtReaction.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtSpoiler.setVisibility(View.INVISIBLE);

        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon));
    }

    @SuppressLint("NewApi")
    public void Spoiler(View view) {
        txtSpoiler.setVisibility(View.VISIBLE);
        catSelection=0;

        imgSpoiler.setImageDrawable(this.getDrawable(R.drawable.unselect_spoiler_icon_1));
        selectedCategory=txtSpoiler.getText().toString();



        txtReview.setVisibility(View.INVISIBLE);
        txtReaction.setVisibility(View.INVISIBLE);
        txtAVM.setVisibility(View.INVISIBLE);
        txtCosplay.setVisibility(View.INVISIBLE);
        txtStory.setVisibility(View.INVISIBLE);
        txtArtWork.setVisibility(View.INVISIBLE);

        imgReview.setImageDrawable(this.getDrawable(R.drawable.unselect_review_icon));
        imgReaction.setImageDrawable(this.getDrawable(R.drawable.unselct_reaction_icon));
        imgAVM.setImageDrawable(this.getDrawable(R.drawable.unslect_avm_icon));
        imgStory.setImageDrawable(this.getDrawable(R.drawable.unselect_story_icon));

        imgCosplay.setImageDrawable(this.getDrawable(R.drawable.unselect_cosplay_icon));
        imgArtWork.setImageDrawable(this.getDrawable(R.drawable.unselect_artwork_icon));
    }




    @SuppressLint("NewApi")
    void viewpagerSetup(){


        int myResource[] = new int[6];
        myResource[0]=R.drawable.img1;
        myResource[1]=R.drawable.img2;
        myResource[2]=R.drawable.img3;

        myResource[3]=R.drawable.img11;
        myResource[4]=R.drawable.img22;
        myResource[5]=R.drawable.img33;

        CustomPagerAdapter adapter=new CustomPagerAdapter(this,myResource);

        infiniteCycleViewPager.setOffscreenPageLimit(5);




        infiniteCycleViewPager.stopAutoScroll();
        infiniteCycleViewPager.setAdapter(adapter);







    }


    public void Attachment(View view) {

        List<String> mdata=new ArrayList<>();

        if(catSelection==1){



            mdata.add("Movie");

            launch(mdata);





        }else{




            mdata.add("Movie");
            mdata.add("Gif");
            mdata.add("Image");
            launch(mdata);


        }


    }




    public void launch(List<String> mylist) {






        //Create sequence of items
        final CharSequence[] data = mylist.toArray(new String[mylist.size()]);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("Select");
        dialogBuilder.setItems(data, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                String selectedText = data[item].toString();  //Selected item in listview



                if(selectedText.equals("Image")){

                   /* Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);*/


                    Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                    startActivityForResult(galleryIntent, PICK_IMAGE);
                }





                if(selectedText.equals("Gif")){

                    Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                            android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                    startActivityForResult(galleryIntent, PICK_GIF);
                }

            }
        });

        AlertDialog alertDialogObject = dialogBuilder.create();

        alertDialogObject.show();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                 bitmapImage = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                // Log.d(TAG, String.valueOf(bitmap));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (requestCode == PICK_GIF && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                 bitmapGif = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                // Log.d(TAG, String.valueOf(bitmap));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void Share(View view) {


     int a=   infiniteCycleViewPager.getRealItem();


    }

    public void backToMain(View view) {
        finish();
    }

    public void navigate(View view) {


        ObjectAnimator animation = ObjectAnimator.ofFloat(rl_bottom, "translationY", -100);
        animation.setDuration(300);
        animation.start();


    }


}



