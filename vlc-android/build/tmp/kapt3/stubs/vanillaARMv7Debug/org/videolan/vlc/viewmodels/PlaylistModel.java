package org.videolan.vlc.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0002\'(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0096\u0001J\u0011\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020$H\u0096\u0001J\u0006\u0010%\u001a\u00020\u001fJ\b\u0010&\u001a\u00020\u001fH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lorg/videolan/vlc/viewmodels/PlaylistModel;", "Landroid/arch/lifecycle/ViewModel;", "Lorg/videolan/vlc/PlaybackService$Callback;", "service", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaWrapper;", "getDataset", "()Lorg/videolan/vlc/util/LiveDataset;", "filter", "Lorg/videolan/vlc/util/PlaylistFilterDelegate;", "getFilter", "()Lorg/videolan/vlc/util/PlaylistFilterDelegate;", "filter$delegate", "Lkotlin/Lazy;", "progress", "Landroid/arch/lifecycle/MediatorLiveData;", "Lorg/videolan/vlc/viewmodels/PlaybackProgress;", "getProgress", "()Landroid/arch/lifecycle/MediatorLiveData;", "progress$delegate", "Lkotlinx/coroutines/experimental/Job;", "query", "", "getItemPosition", "", "position", "media", "onCleared", "", "onMediaEvent", "event", "Lorg/videolan/libvlc/Media$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "setup", "update", "Companion", "Factory", "vlc-android_vanillaARMv7Debug"})
public final class PlaylistModel extends android.arch.lifecycle.ViewModel implements org.videolan.vlc.PlaybackService.Callback {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaWrapper> dataset = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy progress$delegate = null;
    private final kotlin.Lazy filter$delegate = null;
    private final org.videolan.vlc.PlaybackService service = null;
    public static final org.videolan.vlc.viewmodels.PlaylistModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaWrapper> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MediatorLiveData<org.videolan.vlc.viewmodels.PlaybackProgress> getProgress() {
        return null;
    }
    
    private final org.videolan.vlc.util.PlaylistFilterDelegate getFilter() {
        return null;
    }
    
    public final void setup() {
    }
    
    @java.lang.Override()
    public void update() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.Job filter(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence query) {
        return null;
    }
    
    @java.lang.Override()
    public void onCleared() {
    }
    
    public final int getItemPosition(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return 0;
    }
    
    public PlaylistModel(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
        super();
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media.Event event) {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/videolan/vlc/viewmodels/PlaylistModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "service", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "getService", "()Lorg/videolan/vlc/PlaybackService;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.NotNull()
        private final org.videolan.vlc.PlaybackService service = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.vlc.PlaybackService getService() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.PlaybackService service) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/videolan/vlc/viewmodels/PlaylistModel$Companion;", "", "()V", "get", "Lorg/videolan/vlc/viewmodels/PlaylistModel;", "fragment", "Landroid/support/v4/app/Fragment;", "service", "Lorg/videolan/vlc/PlaybackService;", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.vlc.viewmodels.PlaylistModel get(@org.jetbrains.annotations.NotNull()
        android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        org.videolan.vlc.PlaybackService service) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}