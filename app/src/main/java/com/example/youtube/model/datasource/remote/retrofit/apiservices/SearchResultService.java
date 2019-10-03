package com.example.youtube.model.datasource.remote.retrofit.apiservices;


import com.example.youtube.model.listResults.UserListResults;
import com.example.youtube.model.results.Item;
import com.example.youtube.model.results.Results;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.PATH_API;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_ID;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_KEY;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_MAX_RESULTS;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_ORDER;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_PART;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_TERM;
import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.QUERY_TYPE;

import static com.example.youtube.model.datasource.remote.retrofit.UrlConstants.SEARCH_PATH_API;

// ?part=snippet&maxResults=10&order=relevance&q=pewdiepie&type=channel&key=[YOUR_API_KEY]

public interface SearchResultService {
@GET(SEARCH_PATH_API)

Observable<UserListResults> getUserList(
        @Query(QUERY_PART) String part,
        @Query(QUERY_MAX_RESULTS) String maxResults,
        @Query(QUERY_ORDER) String order,
        @Query(QUERY_TERM) String term,
        @Query(QUERY_TYPE) String type,
        @Query(QUERY_KEY) String key);

//?part=brandingSettings%2Csnippet%2Cstatistics&forUsername=pewdiepie&key=AIzaSyAyON6YdgkFrtNHrGGs3IFS4groadJhhts

@GET("channels?part=brandingSettings%2Csnippet%2Cstatistics&id=UC_jYXKaUYk59tqzllnqTp-Q&key=AIzaSyAyON6YdgkFrtNHrGGs3IFS4groadJhhts")
    Observable<Item> getUser(
    @Query(QUERY_PART) String part,
    @Query(QUERY_ID)String userName,
    @Query(QUERY_KEY) String key);





}


