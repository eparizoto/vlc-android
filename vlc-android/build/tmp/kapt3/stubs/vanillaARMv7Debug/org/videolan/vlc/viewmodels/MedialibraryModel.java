package org.videolan.vlc.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J<\u0010\u000f\u001a\u00020\r2,\u0010\u0010\u001a(\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012 \u0013*\u0014\u0012\u000e\b\u0001\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00110\u0011H\u0096\u0001\u00a2\u0006\u0002\u0010\u0014J<\u0010\u0015\u001a\u00020\r2,\u0010\u0010\u001a(\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012 \u0013*\u0014\u0012\u000e\b\u0001\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00110\u0011H\u0096\u0001\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lorg/videolan/vlc/viewmodels/MedialibraryModel;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lorg/videolan/vlc/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/Medialibrary$OnMedialibraryReadyListener;", "Lorg/videolan/medialibrary/interfaces/MediaUpdatedCb;", "Lorg/videolan/medialibrary/interfaces/MediaAddedCb;", "()V", "medialibrary", "Lorg/videolan/medialibrary/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/Medialibrary;", "fetch", "", "onCleared", "onMediaAdded", "p0", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "kotlin.jvm.PlatformType", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V", "onMediaUpdated", "onMedialibraryIdle", "onMedialibraryReady", "vlc-android_vanillaARMv7Debug"})
public abstract class MedialibraryModel<T extends org.videolan.medialibrary.media.MediaLibraryItem> extends org.videolan.vlc.viewmodels.BaseModel<T> implements org.videolan.medialibrary.Medialibrary.OnMedialibraryReadyListener, org.videolan.medialibrary.interfaces.MediaUpdatedCb, org.videolan.medialibrary.interfaces.MediaAddedCb {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.Medialibrary medialibrary = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.Medialibrary getMedialibrary() {
        return null;
    }
    
    @java.lang.Override()
    protected void fetch() {
    }
    
    @java.lang.Override()
    public void onMedialibraryReady() {
    }
    
    @java.lang.Override()
    public void onMedialibraryIdle() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public MedialibraryModel() {
        super();
    }
    
    @java.lang.Override()
    public void onMediaUpdated(org.videolan.medialibrary.media.MediaWrapper[] p0) {
    }
    
    @java.lang.Override()
    public void onMediaAdded(org.videolan.medialibrary.media.MediaWrapper[] p0) {
    }
}