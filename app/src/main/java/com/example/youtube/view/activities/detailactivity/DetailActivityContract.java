package com.example.youtube.view.activities.detailactivity;

import com.example.youtube.model.results.Item;


import java.util.List;

public interface DetailActivityContract {
    void onAdapterReady(List<Item> item);
}
