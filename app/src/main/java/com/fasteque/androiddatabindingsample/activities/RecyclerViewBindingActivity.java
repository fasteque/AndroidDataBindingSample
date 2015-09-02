package com.fasteque.androiddatabindingsample.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.adapters.CarAdapter;
import com.fasteque.androiddatabindingsample.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
public class RecyclerViewBindingActivity extends BaseActivity {

    private CarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_binding);

        initToolbar();
        initRecyclerView();
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(getString(R.string.recyclerview_example));
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

    private void initRecyclerView() {
        final RecyclerView recycler = (RecyclerView) this.findViewById(R.id.recycler_view);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CarAdapter();
        recycler.setAdapter(adapter);
        generateData();
    }

    /**
     * The focus of the example is the RecyclerView data binding mechanism, so data is simply statically created
     * without any actual logic.
     */
    private void generateData() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "R8"));
        cars.add(new Car("Bmw", "M4"));
        cars.add(new Car("Bmw", "i8"));
        cars.add(new Car("Ferrari", "488"));
        cars.add(new Car("Ferrari", "LaFerrari"));
        cars.add(new Car("Lamborghini", "Huracan"));
        cars.add(new Car("Lamborghini", "Aventador"));
        cars.add(new Car("McLaren", "P1"));
        cars.add(new Car("Mercedes", "AMG GT"));
        cars.add(new Car("Nissan", "GTR"));
        cars.add(new Car("Porsche", "918"));

        adapter.addItems(cars);
    }
}
