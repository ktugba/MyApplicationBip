package com.example.myapplicationbip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {


    ArrayList<Product> mProductList;

    public ProductAdapter( ArrayList<Product> products) {
        this.mProductList = products;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {
        Product selectProduct = mProductList.get(position);
        holder.setData(selectProduct, position);
    }

    public int getItemCount() {
        return mProductList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nickName, chatDescription;
        ImageView Image, deleteproduct;

        public MyViewHolder(View itemView) {
            super(itemView);
            nickName = itemView.findViewById(R.id.productName);
            chatDescription = itemView.findViewById(R.id.productDescription);
            Image = itemView.findViewById(R.id.productImage);
            deleteproduct = itemView.findViewById(R.id.deleteproduct);
            deleteproduct.setOnClickListener(this);

        }

        public void setData(Product selectedProduct, int position) {

            this.nickName.setText(selectedProduct.getNickName());
            this.chatDescription.setText(selectedProduct.getChatDescription());
            this.Image.setImageResource(selectedProduct.getImageID());

        }

        @Override
        public void onClick(View v) {

        }
    }
}