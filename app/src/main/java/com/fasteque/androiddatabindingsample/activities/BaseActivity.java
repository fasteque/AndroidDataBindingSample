package com.fasteque.androiddatabindingsample.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.fasteque.androiddatabindingsample.R;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
public abstract class BaseActivity extends AppCompatActivity {

    void initToolbar() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
