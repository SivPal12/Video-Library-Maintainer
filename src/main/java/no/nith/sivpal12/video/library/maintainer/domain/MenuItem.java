package no.nith.sivpal12.video.library.maintainer.domain;

public class MenuItem {

    private String name;
    private String link;
    private boolean active;

    public MenuItem(String name, String link) {
        this(name, link, false);
    }

    public MenuItem(String name, String link, boolean active) {
        this.name = name;
        this.link = link;
        this.active = active;
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public String getActive() {
        if(active) {
            return "class=\"active\"";
        }
        return "";
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setName(String name) {
        this.name = name;
    }

}
