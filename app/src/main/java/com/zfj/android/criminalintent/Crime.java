package com.zfj.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zfj_ on 2017/4/6.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        this.mSuspect = suspect;
    }

    public Crime(){
        this(UUID.randomUUID());
    }
    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }
    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }
}
