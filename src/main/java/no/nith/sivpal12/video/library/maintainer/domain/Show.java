package no.nith.sivpal12.video.library.maintainer.domain;


public class Show {

    private final String name;
    private final int numberOfSeasons;

    public Show(String name, int numberOfSeasons) {
        this.name = name;
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
