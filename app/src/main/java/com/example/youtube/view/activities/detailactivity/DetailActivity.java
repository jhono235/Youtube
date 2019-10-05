package com.example.youtube.view.activities.detailactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.youtube.R;
import com.example.youtube.model.results.Item;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.API_KEY;

public class DetailActivity extends AppCompatActivity implements DetailActivityContract {
    DetailActivityPresenter detailActivityPresenter;

    //bind views

    @BindView(R.id.tvSubscriberCount)
    TextView tvSubscriberCount;

    @BindView(R.id.tvViewCount)
    TextView tvViewCount;

    @BindView(R.id.tvVideoCount)
    TextView tvVideoCount;

    @BindView(R.id.ivBanner)
    ImageView ivBanner;

    @BindView(R.id.ivDetailThumbnail)
            ImageView ivDetailThimbnail;




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

        //get unique youtube channel id from recyclerview item
        Intent intent = getIntent();
        passedId = intent.getStringExtra("passedId");




    }

    @Override
    protected void onStart() {
        super.onStart();

        detailActivityPresenter.getUser(part,passedId,API_KEY);

    }


//points to list item indexed at zero for details for channel
    @Override
    public void onAdapterReady(List<Item> item) {
        //populates values for subcriber count, view count, and video count
        tvSubscriberCount.setText(item.get(0).getStatistics().getSubscriberCount());
        tvVideoCount.setText(item.get(0).getStatistics().getVideoCount());
        tvViewCount.setText(item.get(0).getStatistics().getViewCount());

       //gets banner image
        Glide
              .with(this)
              .load(item.get(0).getBrandingSettings().getImage().getBannerMobileExtraHdImageUrl())
              .into(ivBanner);

        //gets channel thumbnail
       Glide
               .with(this)
               .load(item.get(0).getSnippet().getThumbnails().getHigh().getUrl())
               .into(ivDetailThimbnail);

       DetailActivity.this.getSupportActionBar().setTitle(item.get(0).getSnippet().getTitle());









    }


}
