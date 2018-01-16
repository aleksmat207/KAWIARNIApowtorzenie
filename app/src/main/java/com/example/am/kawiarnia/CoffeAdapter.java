package com.example.am.kawiarnia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.jar.Attributes;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by am on 16.01.2018.
 */

public class CoffeAdapter extends RecyclerView.Adapter<CoffeAdapter.ViewHolder> {

    private ArrayList<Coffe> coffeArrayList = new ArrayList<>();

    public CoffeAdapter(ArrayList<Coffe> coffeArrayList) {
        this.coffeArrayList = coffeArrayList;
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_listy, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(coffeArrayList.get(position).getName() + "");
        holder.setPrice(coffeArrayList.get(position).getPrice() + "");
    }

    @Override
    public int getItemCount() {
        return coffeArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.Name)
        TextView Name;

        @BindView(R.id.Price)
        TextView Price;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setName(String name) {
        Name.setText(name);
        }

        public void setPrice(String s) {
            Price.setText(s);
        }
    }
}
