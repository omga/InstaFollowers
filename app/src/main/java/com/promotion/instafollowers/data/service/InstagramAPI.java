package com.promotion.instafollowers.data.service;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Andrew on 15.09.2016.
 */
public interface InstagramAPI {
    public static final String API_URL = "https://api.instagram.com";
    public static final String CLIENT_ID = "9034a5ad806f47e7a41d7560dab8858d";
    public static final String CLIENT_SECRET = " 038ca432b73f4337b47c6997f18b2a8f";


    @GET("/oauth/authorize/?client_id={CLIENT_ID}&redirect_uri=REDIRECT-URI&response_type=token")
    Call<JSONObject> doAuth(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> getFollowers(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> getFollowing(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> searchByTag(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> searchByLocation(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> getMediaInfo(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> followUser(@Path("CLIENT_ID") String client_id);

    Call<JSONObject> likePost(@Path("CLIENT_ID") String client_id);
}
