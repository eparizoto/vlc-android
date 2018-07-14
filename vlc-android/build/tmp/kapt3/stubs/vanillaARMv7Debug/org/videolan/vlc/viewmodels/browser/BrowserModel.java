package org.videolan.vlc.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00150\u0014J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0006H\u0017J\r\u0010\u001f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010 R\u0014\u0010\n\u001a\u00020\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lorg/videolan/vlc/viewmodels/browser/BrowserModel;", "Lorg/videolan/vlc/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "type", "", "showHiddenFiles", "", "(Ljava/lang/String;IZ)V", "provider", "Lorg/videolan/vlc/providers/BrowserProvider;", "getProvider", "()Lorg/videolan/vlc/providers/BrowserProvider;", "getUrl", "()Ljava/lang/String;", "browserRoot", "", "fetch", "getDescriptionUpdate", "Landroid/arch/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "isFolderEmpty", "mw", "Lorg/videolan/medialibrary/media/MediaWrapper;", "onCleared", "refresh", "saveList", "media", "(Lorg/videolan/medialibrary/media/MediaWrapper;)Lkotlin/Unit;", "sort", "stop", "()Ljava/lang/Boolean;", "Factory", "vlc-android_vanillaARMv7Debug"})
public class BrowserModel extends org.videolan.vlc.viewmodels.BaseModel<org.videolan.medialibrary.media.MediaLibraryItem> {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.providers.BrowserProvider provider = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.videolan.vlc.providers.BrowserProvider getProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void fetch() {
    }
    
    @java.lang.Override()
    public boolean refresh() {
        return false;
    }
    
    public final void browserRoot() {
    }
    
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void sort(int sort) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit saveList(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    public final boolean isFolderEmpty(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mw) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> getDescriptionUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean stop() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public BrowserModel(@org.jetbrains.annotations.Nullable()
    java.lang.String url, int type, boolean showHiddenFiles) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lorg/videolan/vlc/viewmodels/browser/BrowserModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "url", "", "type", "", "showHiddenFiles", "", "(Ljava/lang/String;IZ)V", "getUrl", "()Ljava/lang/String;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        private final int type = 0;
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
        java.lang.String url, int type, boolean showHiddenFiles) {
            super();
        }
    }
}