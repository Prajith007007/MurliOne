package com.example.prajith.murlione;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class Listoflink extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    String bk_malayalam_songs = "BK Malayalam Songs";
    String bk_classes = "BK Classes";
    String peace_of_mind_tv = "Peace of Mind TV";
    String shivajyothi_media = "Shivajyothi media";
    String malayalam_murli_video_with_text = "Malayalam Murli Video with text";
    String website = "Website";
    String join_online_course = "Join online course";
    String locate_us = "locate us";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listoflink);

        MyListData[] myListData = new MyListData[] {
                new MyListData(bk_classes, R.drawable.brahmakumaris_keralam,"https://www.youtube.com/channel/UClHQNKoBgxsIdQsSIx3jvtw"),  //brahmakumaris keralam youtube channel
                new MyListData(bk_malayalam_songs, R.drawable.malayalmsong,"https://www.youtube.com/playlist?list=PLVCLYKojwg57MCbeZQYrXnoAgkcabcpBa"),  //brahmakumaris keralam playlist
                new MyListData(peace_of_mind_tv, R.drawable.peace_of_mind_tv,"https://www.youtube.com/channel/UCX7lwu15brT2-1trcCKRxzQ"), //peace of mind tv malayalam channel
                new MyListData(shivajyothi_media, R.drawable.shivjyothimedia,"https://www.youtube.com/channel/UC1Hr15uTzJd1a1WqBGtBXDg"), //shiva jyothi media youtube channel
                new MyListData(malayalam_murli_video_with_text, R.drawable.malayalammurli,"https://www.youtube.com/channel/UCFoXdXGQG1KWiNNIVKkXL1Q"), // murli malayalam.
                new MyListData(website, R.drawable.bklogo,"https://www.kerala.brahmakumaris.com"), //website
                new MyListData(join_online_course, R.drawable.whatsapp,"https://api.whatsapp.com/send?phone=+919446820448&text=Om Shanthi brother, i want to know about ..."), //drafts whatsapp message directly to gk bhai TO-dO : call func.
                new MyListData(locate_us, R.drawable.maps,"https://goo.gl/maps/EkzBRpZp9p5MzJXQ9"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
