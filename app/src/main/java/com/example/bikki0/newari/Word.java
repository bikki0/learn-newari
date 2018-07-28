package com.example.bikki0.newari;

/**
 * Created by bikki0 on 11/23/16.
 */

public class Word {

    private String mEnglishTranslation;

    private String mNewariTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String englishTranslation, String newariTranslation) {
        mEnglishTranslation = englishTranslation;
        mNewariTranslation = newariTranslation;
    }

    public Word(String englishTranslation, String newariTranslation, int imageResourceId) {
        mEnglishTranslation = englishTranslation;
        mNewariTranslation = newariTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getNewariTranslation() {
        return mNewariTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
