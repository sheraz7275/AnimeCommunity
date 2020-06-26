package com.example.ahmadsheraz.worldanimecommunity.Activites;

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

import com.example.ahmadsheraz.worldanimecommunity.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.ahmadsheraz.worldanimecommunity.Activites.newPostActivity.PICK_GIF;
import static com.example.ahmadsheraz.worldanimecommunity.Activites.newPostActivity.PICK_IMAGE;

public class CreateChatRoom extends AppCompatActivity {


    public static final int PICK_IMAGE = 1;
    public static final int PICK_GIF = 2;
    Bitmap bitmapImage,bitmapGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_chat_room);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void attachment(View view) {

        List<String> mdata=new ArrayList<>();








            mdata.add("Gif");
            mdata.add("Image");
            launch(mdata);





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



    public void backScreen(View view) {
        finish();
    }
}
