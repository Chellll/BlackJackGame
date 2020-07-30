package com.example.blackjackgame.network;

import com.example.blackjackgame.model.sign.NewsGuest;
import com.example.blackjackgame.network.responce.sign.SignGuestRequest;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("json")
    Observable<NewsGuest> getData(@Body SignGuestRequest request);

//    @POST("/api/game/debug.php")
//    Observable<NewsSignIn> getData(@Body RequestSignIn request);
//
//    @POST("/api/game/debug.php")
//    Observable<ProfileBody> getProfile(@Body ProfileRequest request);


}
