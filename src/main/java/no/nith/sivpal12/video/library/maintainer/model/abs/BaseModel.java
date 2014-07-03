package no.nith.sivpal12.video.library.maintainer.model.abs;

import java.util.LinkedList;
import java.util.List;

import no.nith.sivpal12.video.library.maintainer.constants.ViewMessages;
import no.nith.sivpal12.video.library.maintainer.domain.MenuItem;

public abstract class BaseModel {

    private String title = ViewMessages.WINDOW_TITLE;
    private String brand = ViewMessages.BRAND;
    private List<MenuItem> menuItems = new LinkedList<>();

    public BaseModel() {
            menuItems.add(new MenuItem("Movies", "#", true));
            menuItems.add(new MenuItem("TV Shows", "#"));
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public String getBrand() {
        return brand;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
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

}
