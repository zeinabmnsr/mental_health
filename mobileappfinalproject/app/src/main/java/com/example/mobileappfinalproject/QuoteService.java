package com.example.mobileappfinalproject;
import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteService {
    @GET("random")
    Call<Quote> getRandomQuote();
}
