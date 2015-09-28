package com.fasteque.androiddatabindingsample.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.fasteque.androiddatabindingsample.R;

/**
 * Created by danielealtomare on 28/09/15.
 * Project: AndroidDataBindingSample
 */
public class AttributionsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.attributions);
    }
}
