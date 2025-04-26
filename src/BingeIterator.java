package com.yourname.streaming;

import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private final List<Season> seasons;
    private int currentSeason = 0;
    private EpisodeIterator episodeIterator;

    public BingeIterator(Series series) {
        this.seasons = series.getSeasons();
        if (!seasons.isEmpty()) {
            episodeIterator = new SeasonIterator(seasons.get(0));
        }
    }

    @Override
    public boolean hasNext() {
        while (episodeIterator != null && !episodeIterator.hasNext()) {
            currentSeason++;
            if (currentSeason < seasons.size()) {
                episodeIterator = new SeasonIterator(seasons.get(currentSeason));
            } else {
                return false;
            }
        }
        return episodeIterator != null && episodeIterator.hasNext();
    }

    @Override
    public Episode next() {
        return episodeIterator.next();
    }
}
