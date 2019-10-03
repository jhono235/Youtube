package com.example.youtube.view.activities.detailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.youtube.R;
import com.example.youtube.model.results.Item;
import com.example.youtube.model.results.Results;
import com.example.youtube.model.results.User;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.API_KEY;

public class DetailActivity extends AppCompatActivity implements DetailActivityContract {
    DetailActivityPresenter detailActivityPresenter;

    //bind views
    @BindView(R.id.tvDetailChannelName)
    TextView tvDetailChannelName;

    @BindView(R.id.tvSubscriberCount)
    TextView tvSubscriberCount;

    @BindView(R.id.tvViewCount)
    TextView tvViewCount;

    @BindView(R.id.tvVideoCount)
    TextView tvVideoCount;

    @BindView(R.id.ivBanner)
    ImageView ivBanner;

    //Channel id passed from RecyclerView to retrieve channel details
    String passedId;

    //part requested for youtube api
    String part = "brandingSettings,snippet,statistics";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        detailActivityPresenter = new DetailActivityPresenter(this);

        Intent intent = getIntent();
        passedId = intent.getStringExtra("passedId");
    }

    @Override
    protected void onStart() {
        super.onStart();

        detailActivityPresenter.getUser(part,passedId,API_KEY);

    }



    @Override
    public void onAdapterReady(Item item) {
        tvDetailChannelName.setText(item.getSnippet().getTitle());
        tvSubscriberCount.setText(item.getStatistics().getSubscriberCount());
        tvVideoCount.setText(item.getStatistics().getVideoCount());
        tvViewCount.setText(item.getStatistics().getViewCount());

        Glide
                .with(this)
                .load(item.getBrandingSettings().getImage().getBannerMobileImageUrl())
                .into(ivBanner);


    }

    //banner, channelname, subcount, videocount, viewcount
}
