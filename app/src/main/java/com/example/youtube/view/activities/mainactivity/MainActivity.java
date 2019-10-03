package com.example.youtube.view.activities.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.youtube.R;
import com.example.youtube.view.adapters.MainActivityRvAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.API_KEY;


public class MainActivity extends AppCompatActivity implements MainActivityContract {
    @BindView(R.id.etSearchUser)
            EditText etUserSearch;
    @BindView(R.id.rvUserList)
            RecyclerView rvUserList;

    MainActivityPresenter mainActivityPresenter;

    // ?part=snippet&maxResults=10&order=relevance&q=pewdiepie&type=channel&key=[YOUR_API_KEY]

    public static final String part = "snippet";
    public static final String maxResults = "10";
    public static final String order = "relevance";
    public static final String type = "channel";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainActivityPresenter = new MainActivityPresenter(this);


    }

    @Override
    public void onAdapterReady(MainActivityRvAdapter adapter) {
        rvUserList.setLayoutManager(new LinearLayoutManager(this));
        rvUserList.setAdapter(adapter);

    }


// part, maxResults, order, term, type, key

    public void onClick(View view){
        final String userRequested = etUserSearch.getText().toString();
        //part,maxResults,order,userRequested,type,API_KEY
        mainActivityPresenter.getUserInfo(part,maxResults,order,userRequested,type,API_KEY);










    }





}
