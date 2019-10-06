package com.example.youtube.view.activities.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.youtube.R;
import com.example.youtube.view.adapters.MainActivityRvAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements MainActivityContract{

    @BindView(R.id.rvUserList)
            RecyclerView rvUserList;

    @BindView(R.id.etSearchUser)
    EditText etUserSearch;

    MainActivityPresenter mainActivityPresenter;



    public static final String part = "snippet";
    public static final String maxResults = "20";
    public static final String order = "relevance";
    public static final String type = "channel";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainActivityPresenter = new MainActivityPresenter(this);

        etUserSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    performSearch();
                    return true;
                }
                return false;
            }


        });

    }
    @Override
    public void onAdapterReady(MainActivityRvAdapter adapter) {
        rvUserList.setLayoutManager(new LinearLayoutManager(this));
        rvUserList.setAdapter(adapter);

    }






    public void performSearch(){
        final String userRequested = etUserSearch.getText().toString();

        mainActivityPresenter.getUserInfo(userRequested);

    }






}
