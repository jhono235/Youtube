package com.example.youtube.model.datasource.remote.retrofit;

import com.google.api.services.youtube.YouTube;

//?part=snippet&maxResults=10&order=relevance&q=pewdiepie&type=channel&key=[YOUR_API_KEY]

import static com.google.api.services.youtube.YouTube.DEFAULT_BASE_URL;

public class UrlConstants {
    public static final String API_KEY = "AIzaSyBfpvjysdviQQlWrwpYy0iWDh9qu7FRUqc";
    public static final String BASE_URL = DEFAULT_BASE_URL;

    //queries
    public static final String QUERY_ID = "id";
    public static final String QUERY_PART = "part";
    public static final String QUERY_KEY = "key";
    public static final String QUERY_MAX_RESULTS = "maxResults";
    public static final String QUERY_ORDER = "order";
    public static final String QUERY_TERM ="q";
    public static final String QUERY_TYPE="type";

    public static final String PATH_API = "channels";

    public static final String SEARCH_PATH_API = "search";






}
