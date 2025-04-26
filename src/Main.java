package com.yourname.streaming;

public class Main {
    public static void main(String[] args) {
        // Creating Season 1 with episodes
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1 - Pilot", 1200));
        season1.addEpisode(new Episode("S1E2 - Setup", 1100));
        season1.addEpisode(new Episode("S1E3 - Conflict", 1150));

        // Creating Season 2 with episodes
        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1 - Return", 1300));
        season2.addEpisode(new Episode("S2E2 - Twist", 1250));

        // Adding seasons to the series
        Series series = new Series();
        series.addSeason(season1);
        series.addSeason(season2);

        // Iterating using different strategies
        System.out.println("== Normal Iterator ==");
        EpisodeIterator normalIterator = new SeasonIterator(season1);
        while (normalIterator.hasNext()) {
            System.out.println(normalIterator.next());
        }

        System.out.println("\n== Reverse Iterator ==");
        EpisodeIterator reverseIterator = new ReverseSeasonIterator(season1);
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("\n== Shuffle Iterator ==");
        EpisodeIterator shuffleIterator = new ShuffleSeasonIterator(season1, 42);
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\n== Binge Iterator (Full Series) ==");
        EpisodeIterator bingeIterator = new BingeIterator(series);
        while (bingeIterator.hasNext()) {
            Syst
