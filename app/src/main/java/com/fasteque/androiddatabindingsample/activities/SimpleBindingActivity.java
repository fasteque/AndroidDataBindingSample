package com.fasteque.androiddatabindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.databinding.ActivitySimpleBindingBinding;
import com.fasteque.androiddatabindingsample.model.User;

/**
 * Created by daltomare on 08/07/15.
 */
public class SimpleBindingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_binding);

        // Create data to bind.
        User user = new User("Daniele", "Altomare");

        // Bind data.
        binding.setUser(user);
    }
}
