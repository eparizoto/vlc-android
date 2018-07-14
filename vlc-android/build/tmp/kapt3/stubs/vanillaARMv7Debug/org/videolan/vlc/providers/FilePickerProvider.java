package org.videolan.vlc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0014\u00a8\u0006\u000e"}, d2 = {"Lorg/videolan/vlc/providers/FilePickerProvider;", "Lorg/videolan/vlc/providers/FileBrowserProvider;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "(Lorg/videolan/vlc/util/LiveDataset;Ljava/lang/String;)V", "addMedia", "", "media", "getFlags", "", "initBrowser", "vlc-android_vanillaARMv7Debug"})
public final class FilePickerProvider extends org.videolan.vlc.providers.FileBrowserProvider {
    
    @java.lang.Override()
    public int getFlags() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initBrowser() {
    }
    
    @java.lang.Override()
    protected void addMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem media) {
    }
    
    public FilePickerProvider(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        super(null, null, false, false);
    }
}