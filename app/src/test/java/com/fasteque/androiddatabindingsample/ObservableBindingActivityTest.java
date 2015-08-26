package com.fasteque.androiddatabindingsample;

import android.support.v7.widget.Toolbar;

import com.fasteque.androiddatabindingsample.activities.ObservableBindingActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ObservableBindingActivityTest {

    private ObservableBindingActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(ObservableBindingActivity.class);
    }

    @Test
    public void activityIsInstantiated() throws Exception {
        assertNotNull("activity is null", activity);
    }

    @Test
    public void titleIsCorrect() throws Exception {
        assertTrue(activity.getSupportActionBar().getTitle().toString().equals(activity.getString(R.string
                .observable_example)));
    }

    @Test
    public void layoutIsCorrect() throws Exception {
        final Toolbar toolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        assertNotNull("toolbar is null", toolbar);
    }
}