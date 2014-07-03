package no.nith.sivpal12.video.library.maintainer.model.abs;

import java.util.Arrays;
import java.util.List;

import no.nith.sivpal12.video.library.maintainer.constants.ViewMessages;
import no.nith.sivpal12.video.library.maintainer.domain.MenuItem;

public abstract class BaseModel {

    private String title = ViewMessages.WINDOW_TITLE;
    private String brand = ViewMessages.BRAND;
    private List<MenuItem> menuItems = Arrays.asList(new MenuItem[] {
            new MenuItem("Movies", "#", true), new MenuItem("TV Shows", "#") });

    public String getBrand() {
        return brand;
    }

    public String getTitle() {
        return title;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}
