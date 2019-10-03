package com.example.youtube.view.activities.detailactivity;

import com.example.youtube.model.results.Item;
import com.example.youtube.model.results.Results;

public interface DetailActivityContract {
    void onAdapterReady(Item item);
}
