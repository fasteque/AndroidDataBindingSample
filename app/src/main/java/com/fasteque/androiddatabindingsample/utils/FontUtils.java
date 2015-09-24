package com.fasteque.androiddatabindingsample.utils;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.widget.TextView;

/**
 * Created by danielealtomare on 06/09/15.
 * Project: AndroidDataBindingSample
 */
@SuppressWarnings("SameParameterValue")
public final class FontUtils {

    private FontUtils() {
    }

    @BindingAdapter({"bind:customFont"})
    public static void setCustomFont(@NonNull TextView textView, @NonNull String fontName) {
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }
}
