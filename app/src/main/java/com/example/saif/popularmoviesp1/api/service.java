package com.example.saif.popularmoviesp1.api;

import com.example.saif.popularmoviesp1.adapter.MovieAdapter;
import com.example.saif.popularmoviesp1.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface service {

    @GET("movie/popular")
    Call<MovieAdapter> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

}
