package com.fasteque.androiddatabindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.databinding.ObservableBinding;
import com.fasteque.androiddatabindingsample.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by daltomare on 12/07/15.
 */
public class ObservableBindingActivity extends BaseActivity {
    private List<Movie> movies = new ArrayList<>();
    private Button getMovieButton;
    private Movie movie;
    private int currentMovie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_binding);

        // How we get data is not important is this example.
        movies.add(new Movie("The Thomas Crown Affair", "Thriller", 1999));
        movies.add(new Movie("Lost In Translation", "Drama", 2003));
        movies.add(new Movie("Elite Squad", "Action", 2007));
        movies.add(new Movie("Crazy, Stupid, Love", "Comedy", 2011));
        movies.add(new Movie("The Bourne Ultimatum", "Action", 2007));
        movies.add(new Movie("Delivery Man", "Comedy", 2013));
        movies.add(new Movie("Monsters University", "Animation", 2013));
        movies.add(new Movie("Terminator Genisys", "Sci-Fi", 2015));

        movie = movies.get(currentMovie);
        binding.setMovie(movie);

        initToolbar();
        initUserInterface();
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(getString(R.string.observable_example));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void initUserInterface() {
        getMovieButton = (Button) findViewById(R.id.get_movie_button);
        getMovieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dummyGetMovieLogic();
            }
        });
    }

    private void dummyGetMovieLogic() {
        currentMovie = getNextMovie();
        movie.setTitle(movies.get(currentMovie).getTitle());
        movie.setGenre(movies.get(currentMovie).getGenre());
        movie.setYear(movies.get(currentMovie).getYear());
    }

    private int getNextMovie() {
        currentMovie++;
        if(currentMovie == movies.size()) {
            currentMovie = 0;
        }
        return  currentMovie;
    }
}
