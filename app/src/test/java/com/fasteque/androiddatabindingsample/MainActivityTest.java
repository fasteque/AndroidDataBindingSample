package com.fasteque.androiddatabindingsample;

import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.fasteque.androiddatabindingsample.activities.MainActivity;

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
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void activityIsInstantiated() throws Exception {
        assertNotNull("activity is null", activity);
    }

    @Test
    public void titleIsCorrect() throws Exception {
        assertTrue(activity.getTitle().toString().equals(activity.getString(R.string.app_name)));
    }

    @Test
    public void layoutIsCorrect() throws Exception {
        final NavigationView navigationView = (NavigationView) activity.findViewById(R.id.navigation_view);
        assertNotNull("toolbar is null", navigationView);

        final Toolbar toolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        assertNotNull("toolbar is null", toolbar);

        final TextView text = (TextView) activity.findViewById(R.id.context_text);
        assertNotNull("text is null", text);
        assertTrue(text.getText().toString().equals(activity.getString(R.string.activity_main_text)));
    }
}