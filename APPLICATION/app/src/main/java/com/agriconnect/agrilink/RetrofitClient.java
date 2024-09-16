package com.agriconnect.agrilink;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitClient {
    private static final String BASE_URL = "https://api.airtable.com/v0/appPUhJG6Yhxb4AWI/";
    private static Retrofit retrofit=null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static AirTableApiService getAirApiService() {
        return getClient().create((AirTableApiService.class));
    }
}