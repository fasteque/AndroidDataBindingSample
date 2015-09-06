package com.fasteque.androiddatabindingsample.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.TextView;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.utils.FontUtils;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
public class CustomFontBindingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_font);

        initToolbar();
        initText();
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(getString(R.string.custom_font_example));
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

    private void initText() {
        TextView text = (TextView) findViewById(R.id.custom_font_text);
        FontUtils.setCustomFont(text, "SourceSansPro-SemiboldItalic.ttf");
    }
}
