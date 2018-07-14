package org.videolan.vlc.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0016\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002$%B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u001f\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010!\u001a\u00020\u001bH\u0016J\u0011\u0010\"\u001a\u00020\u001bH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0005X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006&"}, d2 = {"Lorg/videolan/vlc/viewmodels/VideosModel;", "Lorg/videolan/vlc/viewmodels/MedialibraryModel;", "Lorg/videolan/medialibrary/media/MediaWrapper;", "Lorg/videolan/medialibrary/interfaces/MediaAddedCb;", "group", "", "minGroupLen", "", "customSort", "(Ljava/lang/String;II)V", "res", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getRes", "()Landroid/content/res/Resources;", "res$delegate", "Lkotlin/Lazy;", "sortKey", "getSortKey", "()Ljava/lang/String;", "thumbObs", "Landroid/arch/lifecycle/Observer;", "canSortByDuration", "", "canSortByFileNameName", "canSortByLastModified", "onCleared", "", "onMediaAdded", "mediaList", "", "([Lorg/videolan/medialibrary/media/MediaWrapper;)V", "onMediaUpdated", "onMedialibraryReady", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "Companion", "Factory", "vlc-android_vanillaARMv7Debug"})
public class VideosModel extends org.videolan.vlc.viewmodels.MedialibraryModel<org.videolan.medialibrary.media.MediaWrapper> implements org.videolan.medialibrary.interfaces.MediaAddedCb {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    private final kotlin.Lazy res$delegate = null;
    private final android.arch.lifecycle.Observer<org.videolan.medialibrary.media.MediaWrapper> thumbObs = null;
    private final java.lang.String group = null;
    private final int minGroupLen = 0;
    public static final org.videolan.vlc.viewmodels.VideosModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getSortKey() {
        return null;
    }
    
    @java.lang.Override()
    public boolean canSortByFileNameName() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByDuration() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByLastModified() {
        return false;
    }
    
    private final android.content.res.Resources getRes() {
        return null;
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
    
    public VideosModel(@org.jetbrains.annotations.Nullable()
    java.lang.String group, int minGroupLen, int customSort) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/videolan/vlc/viewmodels/VideosModel$Factory;", "Landroid/arch/lifecycle/ViewModelProvider$NewInstanceFactory;", "group", "", "minGroupLen", "", "sort", "(Ljava/lang/String;II)V", "getGroup", "()Ljava/lang/String;", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "vlc-android_vanillaARMv7Debug"})
    public static final class Factory extends android.arch.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String group = null;
        private final int minGroupLen = 0;
        private final int sort = 0;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGroup() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        java.lang.String group, int minGroupLen, int sort) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2 = {"Lorg/videolan/vlc/viewmodels/VideosModel$Companion;", "", "()V", "get", "Lorg/videolan/vlc/viewmodels/VideosModel;", "fragment", "Landroid/support/v4/app/Fragment;", "group", "", "minGroupLen", "", "sort", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.vlc.viewmodels.VideosModel get(@org.jetbrains.annotations.NotNull()
        android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
        java.lang.String group, int minGroupLen, int sort) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}