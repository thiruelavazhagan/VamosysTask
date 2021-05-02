package com.example.vamosystask.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vamosystask.MainActivity;
import com.example.vamosystask.R;
import com.example.vamosystask.adapter.MyAdapter;
import com.example.vamosystask.adapter.RecyclerViewMargin;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerview;
    private HomeViewModel homeViewModel;
    private MyAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerview = root.findViewById(R.id.rec);

        homeViewModel= ViewModelProviders.of(getActivity()).get(HomeViewModel.class);
        homeViewModel.getMutableLiveData().observe(getActivity(), myListViewModels -> {
            adapter=new MyAdapter(myListViewModels, getContext());
            RecyclerViewMargin decoration = new RecyclerViewMargin(1, 1);
            recyclerview.addItemDecoration(decoration);

            recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));

            recyclerview.setAdapter(adapter);
        });





        return root;
    }
}