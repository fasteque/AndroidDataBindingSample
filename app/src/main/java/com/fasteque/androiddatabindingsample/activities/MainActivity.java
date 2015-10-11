package com.fasteque.androiddatabindingsample.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;

import com.fasteque.androiddatabindingsample.R;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
public class MainActivity extends BaseActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);

        initToolbar();
        setupDrawerLayout();
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void setupDrawerLayout() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView view = (NavigationView) findViewById(R.id.navigation_view);
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();
                startBindingUseCase(menuItem);

                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_attributions) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //noinspection unchecked
                startActivity(new Intent(this, AttributionsActivity.class), ActivityOptions
                        .makeSceneTransitionAnimation(this).toBundle());
            } else {
                startActivity(new Intent(this, AttributionsActivity.class));
            }
            return true;
        } else if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void startBindingUseCase(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.drawer_simple:
                startActivity(new Intent(MainActivity.this, SimpleBindingActivity.class));
                break;
            case R.id.drawer_observable:
                startActivity(new Intent(MainActivity.this, ObservableBindingActivity.class));
                break;
            case R.id.drawer_recycler:
                startActivity(new Intent(MainActivity.this, RecyclerViewBindingActivity.class));
                break;
            case R.id.drawer_custom_font:
                startActivity(new Intent(MainActivity.this, CustomFontBindingActivity.class));
                break;
        }
    }
}
