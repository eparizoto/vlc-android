package org.videolan.vlc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/videolan/vlc/providers/StorageProvider;", "Lorg/videolan/vlc/providers/FileBrowserProvider;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "showHiddenFiles", "", "(Lorg/videolan/vlc/util/LiveDataset;Ljava/lang/String;Z)V", "addMedia", "", "media", "browseRoot", "vlc-android_vanillaARMv7Debug"})
public final class StorageProvider extends org.videolan.vlc.providers.FileBrowserProvider {
    
    @java.lang.Override()
    public void browseRoot() {
    }
    
    @java.lang.Override()
    protected void addMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem media) {
    }
    
    public StorageProvider(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean showHiddenFiles) {
        super(null, null, false, false);
    }
}