package org.videolan.vlc.viewmodels.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004J\u0011\u0010\u000b\u001a\u00020\u0007H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u000e"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/ArtistModel;", "Lorg/videolan/vlc/viewmodels/audio/AudioModel;", "Lorg/videolan/medialibrary/Medialibrary$ArtistsAddedCb;", "showAll", "", "(Z)V", "onArtistsAdded", "", "onCleared", "onMedialibraryReady", "show", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "Factory", "vlc-android_vanillaARMv7Debug"})
public final class ArtistModel extends org.videolan.vlc.viewmodels.audio.AudioModel implements org.videolan.medialibrary.Medialibrary.ArtistsAddedCb {
    private boolean showAll;
    
    @java.lang.Override()
    public void onArtistsAdded() {
    }
    
    public final void showAll(boolean show) {
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
    
    public ArtistModel(boolean showAll) {
        super();
    }
    
    public ArtistModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/videolan/vlc/viewmodels/audio/ArtistModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "showAll", "", "(Z)V", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final boolean showAll = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(boolean showAll) {
            super();
        }
    }
}