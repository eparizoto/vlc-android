package org.videolan.vlc.viewmodels.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u001f\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u000fH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0018"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/TracksModel;", "Lorg/videolan/vlc/viewmodels/audio/AudioModel;", "parent", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "getParent", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "sortKey", "", "getSortKey", "()Ljava/lang/String;", "canSortByAlbum", "", "canSortByDuration", "onMediaAdded", "", "mediaList", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V", "onMediaUpdated", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "Factory", "vlc-android_vanillaARMv7Debug"})
public final class TracksModel extends org.videolan.vlc.viewmodels.audio.AudioModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    @org.jetbrains.annotations.Nullable()
    private final org.videolan.medialibrary.media.MediaLibraryItem parent = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getSortKey() {
        return null;
    }
    
    @java.lang.Override()
    public boolean canSortByDuration() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByAlbum() {
        return false;
    }
    
    @java.lang.Override()
    public void onMediaAdded(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper[] mediaList) {
    }
    
    @java.lang.Override()
    public void onMediaUpdated(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper[] mediaList) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaLibraryItem getParent() {
        return null;
    }
    
    public TracksModel(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem parent) {
        super();
    }
    
    public TracksModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/TracksModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "parent", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "getParent", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.Nullable()
        private final org.videolan.medialibrary.media.MediaLibraryItem parent = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.videolan.medialibrary.media.MediaLibraryItem getParent() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.media.MediaLibraryItem parent) {
            super();
        }
    }
}