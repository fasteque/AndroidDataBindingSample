package com.fasteque.androiddatabindingsample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.fasteque.androiddatabindingsample.BR;

/**
 * Created by danielealtomare on 14/07/15.
 * Project: AndroidDataBindingSample
 */
public class Movie extends BaseObservable {
    private String title;
    private String genre;
    private int year;

    public Movie(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }

    @Bindable
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        notifyPropertyChanged(BR.year);
    }
}
