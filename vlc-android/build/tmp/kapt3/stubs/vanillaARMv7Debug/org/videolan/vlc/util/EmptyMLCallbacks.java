package org.videolan.vlc.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u001f\u0010\r\u001a\u00020\t2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lorg/videolan/vlc/util/EmptyMLCallbacks;", "Lorg/videolan/medialibrary/interfaces/MediaAddedCb;", "Lorg/videolan/medialibrary/interfaces/MediaUpdatedCb;", "Lorg/videolan/medialibrary/Medialibrary$ArtistsAddedCb;", "Lorg/videolan/medialibrary/Medialibrary$ArtistsModifiedCb;", "Lorg/videolan/medialibrary/Medialibrary$AlbumsAddedCb;", "Lorg/videolan/medialibrary/Medialibrary$AlbumsModifiedCb;", "()V", "onAlbumsAdded", "", "onAlbumsModified", "onArtistsAdded", "onArtistsModified", "onMediaAdded", "mediaList", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V", "onMediaUpdated", "vlc-android_vanillaARMv7Debug"})
public final class EmptyMLCallbacks implements org.videolan.medialibrary.interfaces.MediaAddedCb, org.videolan.medialibrary.interfaces.MediaUpdatedCb, org.videolan.medialibrary.Medialibrary.ArtistsAddedCb, org.videolan.medialibrary.Medialibrary.ArtistsModifiedCb, org.videolan.medialibrary.Medialibrary.AlbumsAddedCb, org.videolan.medialibrary.Medialibrary.AlbumsModifiedCb {
    public static final org.videolan.vlc.util.EmptyMLCallbacks INSTANCE = null;
    
    @java.lang.Override()
    public void onMediaAdded(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper[] mediaList) {
    }
    
    @java.lang.Override()
    public void onMediaUpdated(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper[] mediaList) {
    }
    
    @java.lang.Override()
    public void onArtistsAdded() {
    }
    
    @java.lang.Override()
    public void onArtistsModified() {
    }
    
    @java.lang.Override()
    public void onAlbumsAdded() {
    }
    
    @java.lang.Override()
    public void onAlbumsModified() {
    }
    
    private EmptyMLCallbacks() {
        super();
    }
}