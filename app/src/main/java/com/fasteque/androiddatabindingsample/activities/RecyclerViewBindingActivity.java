package com.fasteque.androiddatabindingsample.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.fasteque.androiddatabindingsample.R;

/**
 * Created by daltomare on 12/07/15.
 */
public class RecyclerViewBindingActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_binding);
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setTitle(getString(R.string.recyclerview_example));
        }
    }
}
