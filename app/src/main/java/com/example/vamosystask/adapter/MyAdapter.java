package com.example.vamosystask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vamosystask.R;
import com.example.vamosystask.databinding.MyListBinding;
import com.example.vamosystask.ui.home.HomeViewModel;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<HomeViewModel> arrayList;
    private Context context;
    private LayoutInflater layoutInflater;

    public MyAdapter(ArrayList<HomeViewModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        MyListBinding myListBinding = DataBindingUtil.inflate(layoutInflater, R.layout.mylist, parent, false);
        return new ViewHolder(myListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeViewModel myListViewModel = arrayList.get(position);
        holder.bind(myListViewModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private MyListBinding myListBinding;

        public ViewHolder(@NonNull MyListBinding myListBinding) {
            super(myListBinding.getRoot());
            this.myListBinding = myListBinding;
        }

        public void bind(HomeViewModel myli) {
            this.myListBinding.setMylistmodel(myli);
            myListBinding.executePendingBindings();
        }

        public MyListBinding getMyListBinding() {
            return myListBinding;
        }
    }
}
