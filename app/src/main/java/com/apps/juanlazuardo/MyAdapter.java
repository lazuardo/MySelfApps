package com.apps.juanlazuardo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct,String s1[], String s2[], int img[]){
    context = ct;
    data1 = s1;
    data2 = s2;
    images = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt1.setText(data1[position]);
        holder.txt2.setText(data2[position]);
        holder.img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt1,txt2;
        ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);
            txt1 = itemView.findViewById(R.id.Musictxt);
            txt2 = itemView.findViewById(R.id.AlbumNametxt);
            img = itemView.findViewById(R.id.MusicImgView);

        }
    }
}
