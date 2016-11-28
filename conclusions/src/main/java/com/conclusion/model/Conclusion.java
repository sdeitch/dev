package com.conclusion.model;

/**
 * Created by Shimon on 4/5/2016.
 */
public class Conclusion {

    String userId;
    String bookCid;
    String path;
    String conclusion;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookCid() {
        return bookCid;
    }

    public void setBookCid(String bookCid) {
        this.bookCid = bookCid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
