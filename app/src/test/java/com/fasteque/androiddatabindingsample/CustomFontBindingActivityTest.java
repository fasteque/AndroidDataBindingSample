package com.fasteque.androiddatabindingsample;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.fasteque.androiddatabindingsample.activities.CustomFontBindingActivity;

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
public class CustomFontBindingActivityTest {

    private CustomFontBindingActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(CustomFontBindingActivity.class);
    }

    @Test
    public void activityIsInstantiated() throws Exception {
        assertNotNull("activity is null", activity);
    }

    @Test
    public void titleIsCorrect() throws Exception {
        assertTrue(activity.getSupportActionBar().getTitle().toString().equals(activity.getString(R.string
                .custom_font_example)));
    }

    @Test
    public void layoutIsCorrect() throws Exception {
        final Toolbar toolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        assertNotNull("toolbar is null", toolbar);

        TextView text = (TextView) activity.findViewById(R.id.custom_font_text);
        assertNotNull("custom font text is null", text);
        assertTrue(text.getVisibility() == View.VISIBLE);
        assertTrue(text.getText().toString().equals(activity.getString(R.string.activity_custom_font)));
    }
}