package com.example.ahmadsheraz.worldanimecommunity.Activites;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.ahmadsheraz.worldanimecommunity.Adapters.DrawerItemCustomAdapter;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.bottomSheetAdapter;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.OnSwipeTouchListener;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.appTheme;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.bottomSheetModal;
import com.example.ahmadsheraz.worldanimecommunity.Adapters.mainScreenAdapter;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.ObjectDrawerItem;
import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.mainScreenModal;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {


    RecyclerView mainRecyclerview;
    RecyclerView bottomRecyclerview;

    ImageView drawerOpen;
    RelativeLayout bottomSheet, rl_parent, rl_mostParent, rl_curve,rl_search;
    LinearLayout mostParent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        bottomSheet = findViewById(R.id.bottomsheet);
        rl_parent = findViewById(R.id.rl_parent);
        rl_mostParent = findViewById(R.id.mparent);
        rl_curve= findViewById(R.id.rl_curve);
        rl_search=findViewById(R.id.rl_search);


        //detector = new SimpleGestureFilter(this,this);






        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerIndicatorEnabled(false);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        drawerRecyclerView();
        setMainRecyclerView();
        setBottomRecyclerView();


        drawerOpen = findViewById(R.id.drawerOpen);
        drawerOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawer.openDrawer(GravityCompat.START);
            }
        });




        rl_parent.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {

                animationUp();

            }
            public void onSwipeRight() {
            }
            public void onSwipeLeft() {
            }
            public void onSwipeBottom() {
                animationDown();

            }

        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    void drawerRecyclerView() {

        RecyclerView leftDrawer = findViewById(R.id.left_drawer);

        List<ObjectDrawerItem> drawerItem = new ArrayList<>();

        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));

        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));

        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));
        drawerItem.add(new ObjectDrawerItem(R.drawable.ic_home_black_24dp, "Home"));


        DrawerItemCustomAdapter mAdapter = new DrawerItemCustomAdapter(drawerItem, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        leftDrawer.setLayoutManager(mLayoutManager);
        leftDrawer.setItemAnimator(new DefaultItemAnimator());
        leftDrawer.setAdapter(mAdapter);
    }


    void setMainRecyclerView() {

        mainRecyclerview = findViewById(R.id.mainRecyclerView);

        List<mainScreenModal> data = new ArrayList<mainScreenModal>();
        data.add(new mainScreenModal(R.drawable.spoiler_icon,"Ali"));
        data.add(new mainScreenModal(R.drawable.artwork_icon,"Hamza"));
        data.add(new mainScreenModal(R.drawable.cosplay_icon,"Ahmad"));
        data.add(new mainScreenModal(R.drawable.story_icon,"Aqib"));

        appTheme mytheme=new appTheme(R.color.appWhite,R.color.appWhite

                ,R.color.appWhite
                ,R.color.appWhite
                ,R.color.appWhite
                ,R.color.appWhite
                ,R.color.appWhite
                ,R.color.appBlack1


                ,R.color.appWhite);






                mainScreenAdapter mAdapter = new mainScreenAdapter(data, this);

                mAdapter.r2=rl_curve;
                mAdapter.bottomsheet=bottomSheet;

                mAdapter.mtheme=mytheme;

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mainRecyclerview.setLayoutManager(mLayoutManager);
        mainRecyclerview.setItemAnimator(new DefaultItemAnimator());
        mainRecyclerview.setAdapter(mAdapter);




    }


    void setBottomRecyclerView() {

        bottomRecyclerview = findViewById(R.id.bottomRecyclerView);

        List<bottomSheetModal> data = new ArrayList<bottomSheetModal>();
        data.add(new bottomSheetModal(R.drawable.new_post));
        data.add(new bottomSheetModal(R.drawable.new_post));
        data.add(new bottomSheetModal(R.drawable.new_post));
        data.add(new bottomSheetModal(R.drawable.new_post));


        if (data.size() % 3 == 0) {


        } else {

            int no = data.size() - 1;

            data.add(no, new bottomSheetModal(R.color.appWhite));


        }


        bottomSheetAdapter mAdapter = new bottomSheetAdapter(this, data);
        bottomRecyclerview.setLayoutManager(new GridLayoutManager(this, 3));
        bottomRecyclerview.setItemAnimator(new DefaultItemAnimator());
        bottomRecyclerview.setAdapter(mAdapter);


    }




    public void animationUp() {

        bottomSheet.setVisibility(View.VISIBLE);

        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                rl_parent.getHeight(),  // fromYDelta
                0);                // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);


        TranslateAnimation manimate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                rl_parent.getHeight(),  // fromYDelta
                0);                // toYDelta
        manimate.setDuration(500);
        manimate.setFillAfter(true);


       /* ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationX", 100f);
        animation.setDuration(2000);
        animation.start();*/



      /*  Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);

        @SuppressLint({"NewApi", "LocalSuppress"})

        ObjectAnimator animator = ObjectAnimator.ofFloat(bottomSheet, View.X, View.Y, path);
        animator.setDuration(2000);
        animator.start();*/





       rl_parent.startAnimation(manimate);
       bottomSheet.startAnimation(animate);


    }





    void  animationDown(){

        bottomSheet.setVisibility(View.GONE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                rl_curve.getHeight()); // toYDelta
        animate.setDuration(700);
        animate.setFillAfter(true);

        /**/







        bottomSheet.startAnimation(animate);





    }



    public void newPost(View view) {

        Intent i = new Intent(this, newPostActivity.class);
        startActivity(i);
    }

    public void selectPostType(View view) {


       final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.post_type_dialog);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

    public void ChatRoom(View view) {

        Intent i = new Intent(this, chatRoom.class);
        startActivity(i);

    }

    public void search(View view) {

        rl_search.setVisibility(View.VISIBLE);

    }

    public void btnDropDown(View view) {

        rl_search.setVisibility(View.GONE);
        Dialog mdialog = new Dialog(this);
        mdialog.setContentView(R.layout.searc_dialog);

       mdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mdialog.show();

    }
}
