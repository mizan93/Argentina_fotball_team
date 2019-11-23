package com.example.mrmizan.argentinafootball;

import android.app.Activity;
import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mrmiz on 15-Oct-18.
 */

public class MyListAdapter extends ArrayList<Player>{

    private Context context;
    private List<Player> playerList;

    public MyListAdapter(Context context, List<Player> playerList) {
        this.context = context;
        this.playerList = playerList;
    }
    public View getView(int position,View convertView,ViewGroup parent){

        View listItem=convertView;
        if (listItem==null){
            listItem=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        }
        Player player=playerList.get(position);
        ImageView imageView=listItem.findViewById(R.id.imageViewID);
        imageView.setImageResource(player.getpImage());
        TextView name=listItem.findViewById(R.id.textID);
        name.setText(player.getpName());


        return listItem;
    }



}

