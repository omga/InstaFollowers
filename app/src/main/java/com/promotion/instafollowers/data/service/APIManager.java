package com.promotion.instafollowers.data.service;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Path;

/**
 * Created by Andrew on 15.09.2016.
 */
public class APIManager{
    public static int API_TOKEN;

    public Call<JSONObject> doAuth(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> getFollowers(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> getFollowing(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> searchByTag(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> searchByLocation(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> getMediaInfo(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> followUser(@Path("CLIENT_ID") String client_id) {
        return null;
    }

    public Call<JSONObject> likePost(@Path("CLIENT_ID") String client_id) {
        return null;
    }
}
