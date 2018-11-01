package com.example.ekky.bestfoodintheworld;

import android.content.Context;
import android.content.Intent;
import android.icu.util.ULocale;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Locale;

public class CardViewFoodAdapater extends RecyclerView.Adapter<CardViewFoodAdapater.CardViewHolder> {
    private ArrayList<Food>listFood;
    private Context context;
    public static final String TITLE="title";
    public static final String IMAGE="image";



    public ArrayList<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }

    public CardViewFoodAdapater(Context context) {
        this.context = context;
    }



    @Override
    public CardViewFoodAdapater.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_food, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final CardViewFoodAdapater.CardViewHolder holder, int position) {

        Food f = getListFood().get(position);

        Glide.with(context)
                .load(f.getPhoto())
                .override(350,350)
                .into(holder.imgPhoto);

        holder.tvName.setText((f.getName()));
        holder.tvRemarks.setText(f.getRemarks());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite"+getListFood().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Food f = getListFood().get(position);
                Toast.makeText(context, "Detail"+getListFood().get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent i=new Intent(holder.itemView.getContext(),Detail.class);

                i.putExtra(TITLE,f.getName());
                i.putExtra("gambar",f.getPhoto());
                holder.itemView.getContext().startActivity(i);


            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListFood().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        //atribut di method

        ImageView imgPhoto;
        TextView tvName, tvRemarks, tvAsal,tvDes, tvBahan, tvHarga;
        Button btnFavorite, btnDetail;

          public CardViewHolder(View itemView) {
            super(itemView);

            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            tvAsal = (TextView)itemView.findViewById(R.id.tv_item_asal);
            tvDes = (TextView)itemView.findViewById(R.id.tv_item_deskripsi);
            tvBahan = (TextView)itemView.findViewById(R.id.tv_item_bahan);
            tvHarga = (TextView)itemView.findViewById(R.id.tv_item_bahan);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);

        }

    }
}
