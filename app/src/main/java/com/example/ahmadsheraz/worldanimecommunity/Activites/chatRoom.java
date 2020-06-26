package com.example.ahmadsheraz.worldanimecommunity.Activites;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ahmadsheraz.worldanimecommunity.Adapters.ViewPagerAdapter;
import com.example.ahmadsheraz.worldanimecommunity.Fragments.ChatRoom_frag;
import com.example.ahmadsheraz.worldanimecommunity.Fragments.Myinbox_frag;
import com.example.ahmadsheraz.worldanimecommunity.R;

public class chatRoom extends AppCompatActivity {



    TextView txtChatRoom,txtInbox;
    RelativeLayout rl_inbox,rl_chatRoom;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);




        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


       // Fragment chatRoom_frag = new ChatRoom_frag();
       // this.replaceFragment(chatRoom_frag);

        initialize();
        tabLayoutViewPager();
    }



    @SuppressLint("NewApi")
    void initialize(){

        txtChatRoom=findViewById(R.id.txt_chatRoom);
        txtInbox=findViewById(R.id.txt_inbox);
        rl_chatRoom=findViewById(R.id.rl_chatRoom);
        rl_inbox=findViewById(R.id.rl_inbox);


        rl_chatRoom.setElevation(20);

         viewPager =  findViewById(R.id.pager);


    }



    public void back(View view) {
        finish();
    }










    public void replaceFragment(Fragment fragment)
    {
        android.support.v4.app.FragmentManager fragmentManager = this.getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


       // fragmentTransaction.replace(R.id.frameLayout, fragment);


        fragmentTransaction.commit();
    }



    @SuppressLint("NewApi")
    public void goToChatRoom(View view) {

        viewPager.setCurrentItem(0, true);


        Fragment chatRoom_frag = new ChatRoom_frag();
        this.replaceFragment(chatRoom_frag);

        txtChatRoom.setTextColor(getResources().getColor(R.color.appWhite));
        txtInbox.setTextColor(getResources().getColor(R.color.appDarkGray));

        rl_chatRoom.setBackground(this.getDrawable(R.drawable.round_red));

        rl_inbox.setBackground(this.getDrawable(R.drawable.round_off_white));
        rl_chatRoom.setElevation(20);
        rl_inbox.setElevation(0);




    }

    @SuppressLint("NewApi")
    public void goToInbox(View view) {

        viewPager.setCurrentItem(1, true);

        Fragment chatRoom_frag = new Myinbox_frag();
        this.replaceFragment(chatRoom_frag);


        txtChatRoom.setTextColor(getResources().getColor(R.color.appDarkGray));
        txtInbox.setTextColor(getResources().getColor(R.color.appWhite));

        rl_chatRoom.setBackground(this.getDrawable(R.drawable.round_off_white));

        rl_inbox.setBackground(this.getDrawable(R.drawable.round_red));

        rl_chatRoom.setElevation(0);
        rl_inbox.setElevation(20);
    }



    void tabLayoutViewPager(){

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new ChatRoom_frag(), "ChatRoom");
        adapter.addFragment(new Myinbox_frag(), "MyInbox");
        viewPager.setAdapter(adapter);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @SuppressLint("NewApi")
            @Override
            public void onPageSelected(int position) {

                if(position==0){
                    txtChatRoom.setTextColor(getResources().getColor(R.color.appWhite));
                    txtInbox.setTextColor(getResources().getColor(R.color.appDarkGray));

                    rl_chatRoom.setBackground(getApplication().getDrawable(R.drawable.round_red));

                    rl_inbox.setBackground(getApplication().getDrawable(R.drawable.round_off_white));
                    rl_chatRoom.setElevation(20);
                    rl_inbox.setElevation(0);

                }else{

                    txtChatRoom.setTextColor(getResources().getColor(R.color.appDarkGray));
                    txtInbox.setTextColor(getResources().getColor(R.color.appWhite));

                    rl_chatRoom.setBackground(getApplication().getDrawable(R.drawable.round_off_white));

                    rl_inbox.setBackground(getApplication().getDrawable(R.drawable.round_red));
                    rl_chatRoom.setElevation(0);
                    rl_inbox.setElevation(20);

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


}
