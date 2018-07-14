package org.videolan.vlc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000 F2\u00020\u0001:\u0001FB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004H\u0014J\u0014\u0010,\u001a\u00020*2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0004J\b\u0010-\u001a\u00020*H&J\b\u0010.\u001a\u00020*H\u0016J\u0019\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0018\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0016J\b\u00106\u001a\u00020*H\u0014J\u000e\u00107\u001a\u00020\b2\u0006\u00108\u001a\u000200J\b\u00109\u001a\u00020*H\u0016J\u0018\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\fH\u0016J\u0018\u0010<\u001a\u00020*2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\fH\u0016J\u0011\u0010=\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\bH\u0016J\u0006\u0010@\u001a\u00020\u0019J\u0012\u0010A\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0015\u0010B\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u000200\u00a2\u0006\u0002\u0010CJ\r\u0010D\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010ER\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00060%j\u0002`&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006G"}, d2 = {"Lorg/videolan/vlc/providers/BrowserProvider;", "Lorg/videolan/libvlc/util/MediaBrowser$EventListener;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "showHiddenFiles", "", "(Lorg/videolan/vlc/util/LiveDataset;Ljava/lang/String;Z)V", "browserChannel", "Lkotlinx/coroutines/experimental/channels/Channel;", "Lorg/videolan/libvlc/Media;", "getDataset", "()Lorg/videolan/vlc/util/LiveDataset;", "descriptionUpdate", "Landroid/arch/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "getDescriptionUpdate", "()Landroid/arch/lifecycle/MutableLiveData;", "foldersContentMap", "Landroid/support/v4/util/SimpleArrayMap;", "", "job", "Lkotlinx/coroutines/experimental/Job;", "mediabrowser", "Lorg/videolan/libvlc/util/MediaBrowser;", "getMediabrowser", "()Lorg/videolan/libvlc/util/MediaBrowser;", "setMediabrowser", "(Lorg/videolan/libvlc/util/MediaBrowser;)V", "medialibrary", "Lorg/videolan/medialibrary/Medialibrary;", "getMedialibrary$vlc_android_vanillaARMv7Debug", "()Lorg/videolan/medialibrary/Medialibrary;", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getUrl", "()Ljava/lang/String;", "addMedia", "", "media", "browse", "browseRoot", "fetch", "findMedia", "Lorg/videolan/medialibrary/media/MediaWrapper;", "(Lorg/videolan/libvlc/Media;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getDescription", "folderCount", "mediaFileCount", "getFlags", "initBrowser", "isFolderEmpty", "mw", "onBrowseEnd", "onMediaAdded", "index", "onMediaRemoved", "parseSubDirectories", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "refresh", "release", "requestBrowsing", "saveList", "(Lorg/videolan/medialibrary/media/MediaWrapper;)Lkotlin/Unit;", "stop", "()Ljava/lang/Boolean;", "Companion", "vlc-android_vanillaARMv7Debug"})
public abstract class BrowserProvider implements org.videolan.libvlc.util.MediaBrowser.EventListener {
    @org.jetbrains.annotations.NotNull()
    protected org.videolan.libvlc.util.MediaBrowser mediabrowser;
    private final android.support.v4.util.SimpleArrayMap<org.videolan.medialibrary.media.MediaLibraryItem, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> foldersContentMap = null;
    private kotlinx.coroutines.experimental.channels.Channel<org.videolan.libvlc.Media> browserChannel;
    private kotlinx.coroutines.experimental.Job job;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> descriptionUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.Medialibrary medialibrary = null;
    private final java.lang.StringBuilder sb = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    private final boolean showHiddenFiles = false;
    private static final kotlin.Lazy browserHandler$delegate = null;
    private static final java.util.Map<java.lang.String, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> prefetchLists = null;
    private static final kotlin.Lazy browserContext$delegate = null;
    public static final org.videolan.vlc.providers.BrowserProvider.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.videolan.libvlc.util.MediaBrowser getMediabrowser() {
        return null;
    }
    
    protected final void setMediabrowser(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.util.MediaBrowser p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> getDescriptionUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.Medialibrary getMedialibrary$vlc_android_vanillaARMv7Debug() {
        return null;
    }
    
    protected void initBrowser() {
    }
    
    public void fetch() {
    }
    
    protected final void browse(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    protected void addMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem media) {
    }
    
    public boolean refresh() {
        return false;
    }
    
    @java.lang.Override()
    public void onMediaAdded(int index, @org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media media) {
    }
    
    @java.lang.Override()
    public void onBrowseEnd() {
    }
    
    @java.lang.Override()
    public void onMediaRemoved(int index, @org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media media) {
    }
    
    private final java.lang.String getDescription(int folderCount, int mediaFileCount) {
        return null;
    }
    
    public abstract void browseRoot();
    
    public int getFlags() {
        return 0;
    }
    
    private final kotlinx.coroutines.experimental.Job requestBrowsing(java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean stop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.Job release() {
        return null;
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
    public final org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public BrowserProvider(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean showHiddenFiles) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/videolan/vlc/providers/BrowserProvider$Companion;", "", "()V", "browserContext", "Lkotlinx/coroutines/experimental/android/HandlerContext;", "getBrowserContext", "()Lkotlinx/coroutines/experimental/android/HandlerContext;", "browserContext$delegate", "Lkotlin/Lazy;", "browserHandler", "Landroid/os/Handler;", "getBrowserHandler", "()Landroid/os/Handler;", "browserHandler$delegate", "prefetchLists", "", "", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        private final android.os.Handler getBrowserHandler() {
            return null;
        }
        
        private final kotlinx.coroutines.experimental.android.HandlerContext getBrowserContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}