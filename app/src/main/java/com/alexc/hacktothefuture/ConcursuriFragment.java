package com.alexc.hacktothefuture;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ConcursuriFragment extends Fragment {

    Button concursuri,olimpiade,altele;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_concursuri, null);
        concursuri= (Button)view.findViewById(R.id.buttonConcursuri);
        altele=view.findViewById(R.id.buttonAltele);
        olimpiade=view.findViewById(R.id.buttonOlimpiade);
        olimpiade.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //loadFragment(new lists());
            }
        });
        return view;
    }

}
