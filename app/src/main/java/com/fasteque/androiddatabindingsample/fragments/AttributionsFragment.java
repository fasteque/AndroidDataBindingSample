package com.fasteque.androiddatabindingsample.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
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

    private OnPreferenceSelectedListener onPreferenceSelectedListener;

    public interface OnPreferenceSelectedListener {
        void onPreferenceWithUriSelected(Uri uri);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            onPreferenceSelectedListener = (OnPreferenceSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnPreferenceSelectedListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.attributions);
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if(preference.getIntent() != null && preference.getIntent().getData() != null) {
            onPreferenceSelectedListener.onPreferenceWithUriSelected(preference.getIntent().getData());
            return true;
        }

        return super.onPreferenceTreeClick(preferenceScreen,preference);
    }
}
