package com.example.youtube.view.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.youtube.R;
import com.example.youtube.model.listResults.Item;
import com.example.youtube.view.activities.detailactivity.DetailActivity;

import java.util.List;

public class MainActivityRvAdapter extends RecyclerView.Adapter<MainActivityRvAdapter.ViewHolder> {
    List<Item> userListResults;

    public MainActivityRvAdapter(List<Item> userListResults){
        this.userListResults = userListResults;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater
                .from(parent.getContext())
        .inflate(R.layout.user_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item currentItem = userListResults.get(position);
        holder.tvChannelName.setText(currentItem.getSnippet().getTitle());
        holder.tvDescription.setText(currentItem.getSnippet().getDescription());

        Glide
                .with(holder.itemView)
                .load(currentItem.getSnippet().getThumbnails().getDefault().getUrl())
                .into(holder.ivThumbnail);









    }

    @Override
    public int getItemCount() {
        return userListResults.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvChannelName;
        TextView tvDescription;
        ImageView ivThumbnail;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvChannelName = itemView.findViewById(R.id.tvChannelName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            ivThumbnail = itemView.findViewById(R.id.ivThumbnail);

            itemView.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                            //Toast.makeText(view.getContext(), userListResults.get(getAdapterPosition()).getSnippet().getChannelId(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(view.getContext(), DetailActivity.class);
                            intent.putExtra("passedId", userListResults.get(getAdapterPosition()).getSnippet().getChannelId());
                            view.getContext().startActivity(intent);


                        }
                    }
            );

        }
    }
}
