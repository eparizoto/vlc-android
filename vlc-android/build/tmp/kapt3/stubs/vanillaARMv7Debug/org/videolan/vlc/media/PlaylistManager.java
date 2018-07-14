package org.videolan.vlc.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\"\u0018\u0000 \u0099\u00012\u00020\u00012\u00020\u0002:\u0002\u0099\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0007J\u0006\u0010M\u001a\u00020\u0014J\u001b\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020IH\u0002J\u0019\u0010O\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020\u0014H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ\b\u0010S\u001a\u0004\u0018\u00010LJ\u0010\u0010T\u001a\u0004\u0018\u00010L2\u0006\u0010U\u001a\u00020\u000eJ\f\u0010V\u001a\b\u0012\u0004\u0012\u00020L0WJ\u0006\u0010X\u001a\u00020\u000eJ\b\u0010Y\u001a\u0004\u0018\u00010LJ\b\u0010Z\u001a\u0004\u0018\u00010LJ\u0019\u0010[\u001a\u0002052\u0006\u0010\\\u001a\u00020LH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u0006\u0010^\u001a\u00020\u0014J\u0006\u0010_\u001a\u00020\u0014J\u0006\u0010`\u001a\u00020\u0014J\u0006\u0010a\u001a\u00020\u0014J\u0018\u0010b\u001a\u00020I2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020LH\u0007J\u0016\u0010c\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0007J\b\u0010d\u001a\u00020\u0014H\u0002J\u000e\u0010e\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u000eJ\u001e\u0010f\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010U\u001a\u00020\u000eH\u0007J\u0010\u0010g\u001a\u00020\u00142\b\b\u0002\u0010h\u001a\u00020\u000eJ\u001e\u0010i\u001a\u00020I2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020k0K2\u0006\u0010U\u001a\u00020\u000eH\u0007J\u0010\u0010l\u001a\u00020I2\u0006\u0010m\u001a\u00020LH\u0002J\u0018\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000eH\u0007J\b\u0010q\u001a\u00020IH\u0007J\u0010\u0010r\u001a\u00020I2\u0006\u0010s\u001a\u00020tH\u0016J\u001a\u0010u\u001a\u00020I2\u0006\u0010v\u001a\u00020\u000e2\b\u0010w\u001a\u0004\u0018\u00010kH\u0017J\"\u0010x\u001a\u00020I2\u0006\u0010y\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u000e2\b\u0010w\u001a\u0004\u0018\u00010kH\u0016J\u001a\u0010{\u001a\u00020I2\u0006\u0010v\u001a\u00020\u000e2\b\u0010w\u001a\u0004\u0018\u00010kH\u0017J\u0011\u0010|\u001a\u00020IH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0006\u0010~\u001a\u00020IJ\u0006\u0010\u007f\u001a\u00020IJ\u0007\u0010\u0080\u0001\u001a\u00020IJ&\u0010\u0081\u0001\u001a\u00020I2\u0006\u0010v\u001a\u00020\u000e2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J\u0011\u0010-\u001a\u00020I2\u0007\u0010\u0084\u0001\u001a\u00020\u0014H\u0007J\u0011\u0010\u0085\u0001\u001a\u00020I2\u0006\u0010U\u001a\u00020\u000eH\u0007J\u0012\u0010\u0086\u0001\u001a\u00020I2\u0007\u0010\u0087\u0001\u001a\u00020kH\u0007J\t\u0010\u0088\u0001\u001a\u00020IH\u0002J\t\u0010\u0089\u0001\u001a\u00020IH\u0002J\u0007\u0010\u008a\u0001\u001a\u00020IJ\u0014\u0010\u008b\u0001\u001a\u00020I2\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u0014H\u0002J\u0013\u0010\u008d\u0001\u001a\u00020I2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020I2\u0007\u0010\u0091\u0001\u001a\u00020\u000eH\u0007J\u0010\u0010\u0092\u0001\u001a\u00020I2\u0007\u0010\u0093\u0001\u001a\u00020\u0014J\t\u0010\u0094\u0001\u001a\u00020IH\u0007J\t\u0010\u0095\u0001\u001a\u00020IH\u0002J\u0012\u0010\u0096\u0001\u001a\u00020I2\t\b\u0002\u0010\u0097\u0001\u001a\u00020\u0014J\t\u0010\u0098\u0001\u001a\u00020\u0014H\u0007R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010#R\u000e\u0010$\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R#\u0010<\u001a\n \b*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0016\"\u0004\bC\u0010\u0018R$\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u0014@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010\u0018\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u009a\u0001"}, d2 = {"Lorg/videolan/vlc/media/PlaylistManager;", "Lorg/videolan/vlc/media/MediaWrapperList$EventListener;", "Lorg/videolan/libvlc/Media$EventListener;", "service", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "ctx", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getCtx", "()Landroid/content/Context;", "ctx$delegate", "Lkotlin/Lazy;", "currentIndex", "", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "expanding", "", "isBenchmark", "()Z", "setBenchmark", "(Z)V", "isHardware", "setHardware", "loadingLastPlaylist", "medialibrary", "Lorg/videolan/medialibrary/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/Medialibrary;", "medialibrary$delegate", "mediaplayerEventListener", "org/videolan/vlc/media/PlaylistManager$mediaplayerEventListener$1", "Lorg/videolan/vlc/media/PlaylistManager$mediaplayerEventListener$1;", "newMedia", "nextIndex", "parsed", "player", "Lorg/videolan/vlc/media/PlayerController;", "getPlayer", "()Lorg/videolan/vlc/media/PlayerController;", "player$delegate", "prevIndex", "previous", "Ljava/util/Stack;", "random", "Ljava/util/Random;", "repeating", "getRepeating", "setRepeating", "savedTime", "", "getSavedTime", "()J", "setSavedTime", "(J)V", "getService", "()Lorg/videolan/vlc/PlaybackService;", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "settings$delegate", "shuffling", "getShuffling", "setShuffling", "<set-?>", "videoBackground", "getVideoBackground", "setVideoBackground", "append", "", "list", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "canShuffle", "determinePrevAndNextIndices", "expand", "(ZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "executeUpdate", "updateHistory", "getCurrentMedia", "getMedia", "position", "getMediaList", "", "getMediaListSize", "getNextMedia", "getPrevMedia", "getStartTime", "mw", "(Lorg/videolan/medialibrary/media/MediaWrapper;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "hasCurrentMedia", "hasNext", "hasPlaylist", "hasPrevious", "insertItem", "insertNext", "isAudioList", "isValidPosition", "load", "loadLastPlaylist", "type", "loadLocations", "mediaPathList", "", "loadMediaMeta", "media", "moveItem", "positionStart", "positionEnd", "next", "onEvent", "event", "Lorg/videolan/libvlc/Media$Event;", "onItemAdded", "index", "mrl", "onItemMoved", "indexBefore", "indexAfter", "onItemRemoved", "onPlaylistLoaded", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "onServiceDestroyed", "pause", "play", "playIndex", "flags", "(IILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "force", "remove", "removeLocation", "location", "saveCurrentMedia", "saveMediaList", "saveMediaMeta", "savePosition", "reset", "setRenderer", "item", "Lorg/videolan/libvlc/RendererItem;", "setRepeatType", "repeatType", "setVideoTrackEnabled", "enabled", "shuffle", "skipMedia", "stop", "systemExit", "switchToVideo", "Companion", "vlc-android_vanillaARMv7Debug"})
public final class PlaylistManager implements org.videolan.vlc.media.MediaWrapperList.EventListener, org.videolan.libvlc.Media.EventListener {
    private final kotlin.Lazy medialibrary$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy player$delegate = null;
    private final kotlin.Lazy settings$delegate = null;
    private final kotlin.Lazy ctx$delegate = null;
    private int currentIndex;
    private int nextIndex;
    private int prevIndex;
    private java.util.Stack<java.lang.Integer> previous;
    private int repeating;
    private boolean shuffling;
    private boolean videoBackground;
    private boolean isBenchmark;
    private boolean isHardware;
    private boolean parsed;
    private long savedTime;
    private java.util.Random random;
    private boolean newMedia;
    private volatile boolean expanding;
    private volatile boolean loadingLastPlaylist;
    private final org.videolan.vlc.media.MediaPLayerEventListener mediaplayerEventListener = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.PlaybackService service = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showAudioPlayer = null;
    private static final org.videolan.vlc.media.MediaWrapperList mediaList = null;
    public static final org.videolan.vlc.media.PlaylistManager.Companion Companion = null;
    
    private final org.videolan.medialibrary.Medialibrary getMedialibrary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.media.PlayerController getPlayer() {
        return null;
    }
    
    private final android.content.SharedPreferences getSettings() {
        return null;
    }
    
    private final android.content.Context getCtx() {
        return null;
    }
    
    public final int getCurrentIndex() {
        return 0;
    }
    
    public final void setCurrentIndex(int p0) {
    }
    
    public final int getRepeating() {
        return 0;
    }
    
    public final void setRepeating(int p0) {
    }
    
    public final boolean getShuffling() {
        return false;
    }
    
    public final void setShuffling(boolean p0) {
    }
    
    public final boolean getVideoBackground() {
        return false;
    }
    
    private final void setVideoBackground(boolean p0) {
    }
    
    public final boolean isBenchmark() {
        return false;
    }
    
    public final void setBenchmark(boolean p0) {
    }
    
    public final boolean isHardware() {
        return false;
    }
    
    public final void setHardware(boolean p0) {
    }
    
    public final long getSavedTime() {
        return 0L;
    }
    
    public final void setSavedTime(long p0) {
    }
    
    public final boolean hasCurrentMedia() {
        return false;
    }
    
    public final boolean hasPlaylist() {
        return false;
    }
    
    public final boolean canShuffle() {
        return false;
    }
    
    public final boolean isValidPosition(int position) {
        return false;
    }
    
    /**
     * * Loads a selection of files (a non-user-supplied collection of media)
     *     * into the primary or "currently playing" playlist.
     *     *
     *     * @param mediaPathList A list of locations to load
     *     * @param position The position to start playing at
     */
    @android.support.annotation.MainThread()
    public final void loadLocations(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mediaPathList, int position) {
    }
    
    @android.support.annotation.MainThread()
    public final void load(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> list, int position) {
    }
    
    public final boolean loadLastPlaylist(int type) {
        return false;
    }
    
    public final void play() {
    }
    
    public final void pause() {
    }
    
    @android.support.annotation.MainThread()
    public final void next() {
    }
    
    public final void stop(boolean systemExit) {
    }
    
    @android.support.annotation.MainThread()
    public final void previous(boolean force) {
    }
    
    @android.support.annotation.MainThread()
    public final void shuffle() {
    }
    
    @android.support.annotation.MainThread()
    public final void setRepeatType(int repeatType) {
    }
    
    public final void setRenderer(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.RendererItem item) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object playIndex(int index, int flags, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    private final void skipMedia() {
    }
    
    public final void onServiceDestroyed() {
    }
    
    @android.support.annotation.MainThread()
    public final boolean switchToVideo() {
        return false;
    }
    
    public final void setVideoTrackEnabled(boolean enabled) {
    }
    
    public final boolean hasPrevious() {
        return false;
    }
    
    public final boolean hasNext() {
        return false;
    }
    
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void onItemAdded(int index, @org.jetbrains.annotations.Nullable()
    java.lang.String mrl) {
    }
    
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void onItemRemoved(int index, @org.jetbrains.annotations.Nullable()
    java.lang.String mrl) {
    }
    
    private final void executeUpdate() {
    }
    
    public final void saveMediaMeta() {
    }
    
    private final void loadMediaMeta(org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    private final synchronized void saveCurrentMedia() {
    }
    
    private final synchronized void saveMediaList() {
    }
    
    @java.lang.Override()
    public void onItemMoved(int indexBefore, int indexAfter, @org.jetbrains.annotations.Nullable()
    java.lang.String mrl) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaWrapper getCurrentMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaWrapper getPrevMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaWrapper getNextMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaWrapper getMedia(int position) {
        return null;
    }
    
    private final synchronized void savePosition(boolean reset) {
    }
    
    /**
     * * Append to the current existing playlist
     */
    @android.support.annotation.MainThread()
    public final void append(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> list) {
    }
    
    /**
     * * Insert into the current existing playlist
     */
    @android.support.annotation.MainThread()
    public final void insertNext(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> list) {
    }
    
    /**
     * * Move an item inside the playlist.
     */
    @android.support.annotation.MainThread()
    public final void moveItem(int positionStart, int positionEnd) {
    }
    
    @android.support.annotation.MainThread()
    public final void insertItem(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mw) {
    }
    
    @android.support.annotation.MainThread()
    public final void remove(int position) {
    }
    
    @android.support.annotation.MainThread()
    public final void removeLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String location) {
    }
    
    public final int getMediaListSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.videolan.medialibrary.media.MediaWrapper> getMediaList() {
        return null;
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media.Event event) {
    }
    
    private final boolean isAudioList() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.PlaybackService getService() {
        return null;
    }
    
    public PlaylistManager(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lorg/videolan/vlc/media/PlaylistManager$Companion;", "", "()V", "mediaList", "Lorg/videolan/vlc/media/MediaWrapperList;", "showAudioPlayer", "Landroid/arch/lifecycle/MutableLiveData;", "", "getShowAudioPlayer", "()Landroid/arch/lifecycle/MutableLiveData;", "hasMedia", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getShowAudioPlayer() {
            return null;
        }
        
        public final boolean hasMedia() {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}