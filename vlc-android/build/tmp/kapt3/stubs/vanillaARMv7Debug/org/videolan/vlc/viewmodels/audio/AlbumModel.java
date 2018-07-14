package org.videolan.vlc.viewmodels.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0011\u0010\u0013\u001a\u00020\u0010H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u0016"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/AlbumModel;", "Lorg/videolan/vlc/viewmodels/audio/AudioModel;", "Lorg/videolan/medialibrary/Medialibrary$AlbumsAddedCb;", "parent", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "getParent", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "sortKey", "", "getSortKey", "()Ljava/lang/String;", "canSortByDuration", "", "canSortByReleaseDate", "onAlbumsAdded", "", "onCleared", "onMedialibraryReady", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "Factory", "vlc-android_vanillaARMv7Debug"})
public final class AlbumModel extends org.videolan.vlc.viewmodels.audio.AudioModel implements org.videolan.medialibrary.Medialibrary.AlbumsAddedCb {
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
    public boolean canSortByReleaseDate() {
        return false;
    }
    
    @java.lang.Override()
    public void onAlbumsAdded() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @java.lang.Override()
    public void onMedialibraryReady() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaLibraryItem getParent() {
        return null;
    }
    
    public AlbumModel(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem parent) {
        super();
    }
    
    public AlbumModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/AlbumModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "parent", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "getParent", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
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