package no.nith.sivpal12.video.library.maintainer.domain;

public class MediaItem {

    public static class Builder {
        public static Builder init() {
            return new Builder();
        }
        private String link;
        private String image;
        private String title;

        private String description;

        private Builder() {
        }

        public MediaItem build() {
            return new MediaItem(link, image, title, description);
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder link(String link) {
            this.link = link;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

    }

    private String link;
    private String image;
    private String title;

    private String description;

    protected MediaItem(String link, String image, String title,
            String description) {
        this.link = link;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
