package org.videolan.vlc.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013R\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/videolan/vlc/viewmodels/browser/NetworkModel;", "Lorg/videolan/vlc/viewmodels/browser/BrowserModel;", "url", "", "showHiddenFiles", "", "(Ljava/lang/String;Z)V", "favorites", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getFavorites", "()Landroid/arch/lifecycle/MutableLiveData;", "favorites$delegate", "Lkotlin/Lazy;", "networkProvider", "Lorg/videolan/vlc/providers/NetworkProvider;", "refresh", "updateFavs", "Lkotlinx/coroutines/experimental/Job;", "Factory", "vlc-android_vanillaARMv7Debug"})
public final class NetworkModel extends org.videolan.vlc.viewmodels.browser.BrowserModel {
    private final org.videolan.vlc.providers.NetworkProvider networkProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy favorites$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.Job updateFavs() {
        return null;
    }
    
    @java.lang.Override()
    public boolean refresh() {
        return false;
    }
    
    public NetworkModel(@org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean showHiddenFiles) {
        super(null, 0, false);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lorg/videolan/vlc/viewmodels/browser/NetworkModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "url", "", "showHiddenFiles", "", "(Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        private final boolean showHiddenFiles = false;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        java.lang.String url, boolean showHiddenFiles) {
            super();
        }
    }
}