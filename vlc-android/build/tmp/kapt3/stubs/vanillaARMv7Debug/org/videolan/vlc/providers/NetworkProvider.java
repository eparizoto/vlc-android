package org.videolan.vlc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0011"}, d2 = {"Lorg/videolan/vlc/providers/NetworkProvider;", "Lorg/videolan/vlc/providers/BrowserProvider;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "showHiddenFiles", "", "(Lorg/videolan/vlc/util/LiveDataset;Ljava/lang/String;Z)V", "browseRoot", "", "fetch", "refresh", "updateFavorites", "", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "vlc-android_vanillaARMv7Debug"})
public final class NetworkProvider extends org.videolan.vlc.providers.BrowserProvider {
    
    @java.lang.Override()
    public void browseRoot() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> p0) {
        return null;
    }
    
    @java.lang.Override()
    public void fetch() {
    }
    
    @java.lang.Override()
    public boolean refresh() {
        return false;
    }
    
    public NetworkProvider(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean showHiddenFiles) {
        super(null, null, false);
    }
}