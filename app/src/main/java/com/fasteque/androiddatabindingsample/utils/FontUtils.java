package com.fasteque.androiddatabindingsample.utils;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by danielealtomare on 06/09/15.
 * Project: AndroidDataBindingSample
 */
public final class FontUtils {

    private FontUtils() {
    }

    @BindingAdapter({"bind:customFont"})
    public static void setCustomFont(TextView textView, String fontName) {
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }
}