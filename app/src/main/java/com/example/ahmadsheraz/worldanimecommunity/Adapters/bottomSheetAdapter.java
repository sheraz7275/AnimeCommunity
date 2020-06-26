package com.example.ahmadsheraz.worldanimecommunity.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmadsheraz.worldanimecommunity.ModelClasses.bottomSheetModal;
import com.example.ahmadsheraz.worldanimecommunity.R;

import java.util.ArrayList;
import java.util.List;

public class bottomSheetAdapter extends RecyclerView.Adapter<bottomSheetAdapter.bottomHolder> {


    Context context;
    List<bottomSheetModal> mitems =new ArrayList<>();


    public bottomSheetAdapter(Context context, List<bottomSheetModal> mitems) {
        this.context = context;
        this.mitems = mitems;
    }





    @NonNull
    @Override
    public bottomHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View itemView ;

        itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bottom_sheet_item, viewGroup, false);



        return new bottomSheetAdapter.bottomHolder(itemView);

    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull bottomHolder bottomHolder, int i) {


        bottomHolder.view.setImageDrawable(context.getDrawable(mitems.get(i).getImage()));




    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }

    public class bottomHolder extends RecyclerView.ViewHolder{


        ImageView view;

        public bottomHolder(@NonNull View itemView) {
            super(itemView);



            view=itemView.findViewById(R.id.Myimage);
        }
    }

}
