package com.fasteque.androiddatabindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.databinding.SimpleBinding;
import com.fasteque.androiddatabindingsample.model.User;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
public class SimpleBindingActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_binding);

        // Create data to bind.
        User user = new User("Daniele", "Altomare");

        // Bind data.
        binding.setUser(user);

        initToolbar();
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(getString(R.string.simple_example));
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
}
