package com.mfelskowski.foodcatalog.domain;

public class Rating {
    private static final float MAX_SCORE = 10.0f;
    private final float score;
    private final String comment;

    public Rating(float score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public boolean hasGoodScore() {
        return score > MAX_SCORE/2;
    }

    public float getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }
}
