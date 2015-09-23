package com.fasteque.androiddatabindingsample.model;

/**
 * Created by daltomare on 12/07/15.
 * Project: AndroidDataBindingSample
 */
@SuppressWarnings("SameParameterValue")
public class User {
    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
