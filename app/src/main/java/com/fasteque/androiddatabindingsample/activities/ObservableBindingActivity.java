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

/**
 * Created by daltomare on 12/07/15.
 */
public class ObservableBindingActivity extends BaseActivity {
    private Button getMovieButton;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_binding);
        movie = new Movie("Terminator Genisys", "Sci-Fi", 2015);
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
        // TODO
    }
}
