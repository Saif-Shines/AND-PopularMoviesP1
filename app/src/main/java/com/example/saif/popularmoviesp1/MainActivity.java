package com.example.saif.popularmoviesp1;

import android.app.ProgressDialog;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.saif.popularmoviesp1.adapter.MovieAdapter;
import com.example.saif.popularmoviesp1.model.Movie;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private List<Movie> movieList;
    ProgressDialog pd;
    private SwipeRefreshLayout swipeContainer;
    public static final String LOG_TAG = MovieAdapter.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.main_content);
        swipeContainer.setColorSchemeResources(android.R.color.holo_orange_dark);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initviews();
                Toast.makeText(MainActivity.this, "Movies Refreshed", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initViews(){
        pd =  new ProgressDialog(this);
        pd.setMessage("Bringing Movies to you..");
        pd.setCancelable(false);
        pd.show();
    }
}
