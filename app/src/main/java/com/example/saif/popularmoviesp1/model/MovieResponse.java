package com.example.saif.popularmoviesp1.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movie> results;
    @SerializedName("Total_pages")
    private int totalPages;
    private int totalResults;


    public int getPage(){
        return page;
    }
    private void setPage(int page){
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }
    
    public List<Movie> getMovies(){
        return results;
    }
    
    private void setResults(List<Movie> results){
        this.results = results;
     
    public void setMovies(List<Movie> results){
        this.results = results;
    }
    public int getTotalResults(){ 
        return totalResults;
    }
    public void setTotalResults(int totalResults){
    this.totalPages = totalResults;
    }
    public int getTotalPages(){
        return totalPages;
    }
    public void setTotalPages(int totalPages){
        this.totalPages  = totalPages;
    }
    
    
    
}
