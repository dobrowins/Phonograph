package com.kabouzeid.gramophone.auto;

import android.support.v4.media.MediaMetadataCompat;

import java.util.Iterator;

/**
 * Created by Beesham Sarendranauth (Beesham)
 */
public interface MusicProviderSource {
    String CUSTOM_METADATA_TRACK_SOURCE = "__SOURCE__";
    String CUSTOM_METADATA_ALBUM_ID = "__ALBUM_ID__";

    Iterator<MediaMetadataCompat> iterator();
}
