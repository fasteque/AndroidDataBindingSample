package com.fasteque.androiddatabindingsample.fragments;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

import com.fasteque.androiddatabindingsample.R;
import com.fasteque.androiddatabindingsample.activities.AttributionsActivity;

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

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if(preference.getIntent() != null && preference.getIntent().getData() != null) {
            ((AttributionsActivity) getActivity()).openCustomTab(preference.getIntent().getData());
            return true;
        }

        return super.onPreferenceTreeClick(preferenceScreen,preference);
    }
}
