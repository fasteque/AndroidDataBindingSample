package com.fasteque.androiddatabindingsample;

import com.fasteque.androiddatabindingsample.activities.RecyclerViewBindingActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class RecyclerViewBindingActivityTest {

    private RecyclerViewBindingActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(RecyclerViewBindingActivity.class);
    }

    @Test
    public void titleIsCorrect() throws Exception {
        System.out.println(activity.getString(R.string.observable_example));
        assertTrue(activity.getSupportActionBar().getTitle().toString().equals(activity.getString(R.string
                .recyclerview_example)));
    }
}