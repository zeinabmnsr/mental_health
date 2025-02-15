package com.example.mobileappfinalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Fragment_Home extends Fragment {
    private TextView tvQuote;
    private Button btnGetQuote;

    public Fragment_Home(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState){

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        /**  tvQuote = view.findViewById(R.id.tvQuote);
        btnGetQuote = view.findViewById(R.id.btnGetQuote);
        getRandomQuote();
 */
        /**btnGetQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRandomQuote();
            }
        }); */
        return view;
    }

   /** private void getRandomQuote(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.quotable.io/").addConverterFactory(GsonConverterFactory.create())
                .build();
        QuoteService quoteService = retrofit.create(QuoteService.class);
        Quote quote = quoteService.getRandomQuote().execute().body();

        quoteService.getRandomQuote().enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Quote quote = response.body();
                    tvQuote.setText(String.format("\"%s\"\n- %s", quote.getQuote(), quote.getAuthor()));
                } else {
                    showToast("Failed to fetch quote");
                }
            }


        }); */

        /** call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Quote quote = response.body();
                    tvQuote.setText("\"" + quote.getQuote() + "\"\n- " + quote.getAuthor());
                } else {
                    Toast.makeText(getActivity(), "Failed to fetch quote", Toast.LENGTH_SHORT).show();
                }
            } */

        /** @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Toast.makeText(getActivity(), "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }*/


}

