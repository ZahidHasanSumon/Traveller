package com.zh.mynews;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EnglishNewspaper extends Fragment {
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

     View v = inflater.inflate(R.layout.fragment_english_newspaper, container, false);

        cardView1=v.findViewById(R.id.card6);
        cardView2=v.findViewById(R.id.card7);
        cardView3=v.findViewById(R.id.card8);
        cardView4=v.findViewById(R.id.card9);
        cardView5=v.findViewById(R.id.card10);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Newspaper6.class));
            }
        });


        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Newspaper7.class));
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Newspaper8.class));
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Newspaper9.class));
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Newspaper10.class));
            }
        });

        return v;
    }
}