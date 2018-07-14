package org.videolan.vlc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/videolan/vlc/providers/FileBrowserProvider;", "Lorg/videolan/vlc/providers/BrowserProvider;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "filePicker", "", "showHiddenFiles", "(Lorg/videolan/vlc/util/LiveDataset;Ljava/lang/String;ZZ)V", "browseRoot", "", "vlc-android_vanillaARMv7Debug"})
public class FileBrowserProvider extends org.videolan.vlc.providers.BrowserProvider {
    private final boolean filePicker = false;
    
    @java.lang.Override()
    public void browseRoot() {
    }
    
    public FileBrowserProvider(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean filePicker, boolean showHiddenFiles) {
        super(null, null, false);
    }
}