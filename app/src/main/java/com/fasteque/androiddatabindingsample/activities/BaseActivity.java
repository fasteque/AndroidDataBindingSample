package com.fasteque.androiddatabindingsample.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.fasteque.androiddatabindingsample.R;

/**
 * Created by daltomare on 13/07/15.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar toolbar;

    protected void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
