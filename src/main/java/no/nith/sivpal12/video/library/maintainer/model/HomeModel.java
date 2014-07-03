package no.nith.sivpal12.video.library.maintainer.model;

import java.util.LinkedList;
import java.util.List;

import no.nith.sivpal12.video.library.maintainer.domain.MediaItem;
import no.nith.sivpal12.video.library.maintainer.model.abs.BaseModel;

public class HomeModel extends BaseModel {

    private List<MediaItem> mediaItems = new LinkedList<>();

    public void addMediaItem(MediaItem mediaItem) {
        mediaItems.add(mediaItem);
    }

    public List<MediaItem> getMediaItems() {
        return mediaItems;
    }

}
