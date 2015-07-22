package com.fasteque.androiddatabindingsample.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.databinding.RecyclerViewBinding;
import com.fasteque.androiddatabindingsample.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielealtomare on 22/07/15.
 * Project: AndroidDataBindingSample
 */
public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private List<Car> cars = new ArrayList<>();


    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final RecyclerViewBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item, parent, false);

        return new ViewHolder(binding.getRoot(), binding);
    }

    @Override
    public void onBindViewHolder(CarAdapter.ViewHolder holder, int position) {
        final Car car = this.cars.get(position);
        holder.bind(car);
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    @UiThread
    public void addItems(final List<Car> cars) {
        this.cars = cars;
        this.notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final RecyclerViewBinding binding;

        public ViewHolder(final View view, final RecyclerViewBinding binding) {
            super(view);
            this.binding = binding;
        }

        @UiThread
        public void bind(final Car car) {
            this.binding.setCar(car);
        }
    }
}
