package com.example.android.mogilevcity;

/**
 * Created by katsiarynamashokha on 7/5/16.
 */
public class Information {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Information(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public Information(String name, String description) {
        mName = name;
        mDescription = description;
    }


    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

