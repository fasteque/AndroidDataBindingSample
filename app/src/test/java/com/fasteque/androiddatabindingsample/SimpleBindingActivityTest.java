package com.fasteque.androiddatabindingsample;

import com.fasteque.androiddatabindingsample.activities.SimpleBindingActivity;

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
public class SimpleBindingActivityTest {

    private SimpleBindingActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(SimpleBindingActivity.class);
    }

    @Test
    public void activityIsInstantiated() throws Exception {
        assertNotNull("activity is null", activity);
    }

    @Test
    public void titleIsCorrect() throws Exception {
        assertTrue(activity.getSupportActionBar().getTitle().toString().equals(activity.getString(R.string
                .simple_example)));
    }
}