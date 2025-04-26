package com.yourname.streaming;

public class Episode {
    private final String title;
    private final int durationInSeconds;

    public Episode(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return String.format("%s (%d sec)", title, durationInSeconds);
    }
}
