package org.videolan.vlc.media;

import java.lang.System;

@kotlin.Suppress(names = {"EXPERIMENTAL_FEATURE_WARNING"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\bJ\u0016\u0010;\u001a\u00020\b2\u0006\u0010?\u001a\u00020@2\u0006\u0010>\u001a\u00020\bJ\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\bJ\u0013\u0010C\u001a\u0004\u0018\u00010DH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020\u000fJ\u0006\u0010G\u001a\u00020\u0017J\u0015\u0010H\u001a\f\u0012\u0006\b\u0001\u0012\u00020J\u0018\u00010I\u00a2\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020\u0017J\u0006\u0010M\u001a\u00020\u0017J\u001d\u0010N\u001a\f\u0012\u0006\b\u0001\u0012\u00020O\u0018\u00010I2\u0006\u0010P\u001a\u00020\u0017\u00a2\u0006\u0002\u0010QJ\u0006\u0010R\u001a\u00020\u000fJ\b\u0010S\u001a\u0004\u0018\u00010TJ\u0006\u0010U\u001a\u00020\u000fJ\b\u0010V\u001a\u0004\u0018\u00010WJ\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020\u000fJ\u0006\u0010[\u001a\u00020\u0017J\u0015\u0010\\\u001a\f\u0012\u0006\b\u0001\u0012\u00020J\u0018\u00010I\u00a2\u0006\u0002\u0010KJ\u0006\u0010]\u001a\u00020\u0017J\u0006\u0010^\u001a\u00020\u0017J\u0015\u0010_\u001a\f\u0012\u0006\b\u0001\u0012\u00020`\u0018\u00010I\u00a2\u0006\u0002\u0010aJ\u0006\u0010b\u001a\u00020\u0017J\u0015\u0010c\u001a\f\u0012\u0006\b\u0001\u0012\u00020J\u0018\u00010I\u00a2\u0006\u0002\u0010KJ\u0006\u0010d\u001a\u00020\u0017J\u0006\u0010e\u001a\u00020\u0017J\b\u0010f\u001a\u0004\u0018\u00010gJ\u0006\u0010h\u001a\u00020\bJ\u0006\u0010i\u001a\u00020\bJ\u000e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0017J\b\u0010m\u001a\u00020\u0011H\u0002J\u0012\u0010n\u001a\u00020k2\b\u0010o\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010p\u001a\u00020k2\b\u0010q\u001a\u0004\u0018\u00010gH\u0016J\u0012\u0010r\u001a\u00020k2\b\u0010q\u001a\u0004\u0018\u00010gH\u0016J\u0006\u0010s\u001a\u00020\bJ\u0006\u0010t\u001a\u00020kJ\u0010\u0010u\u001a\u00020k2\b\b\u0002\u0010v\u001a\u00020\u0011J\u000f\u0010w\u001a\u0004\u0018\u00010kH\u0002\u00a2\u0006\u0002\u0010xJ\u0010\u0010y\u001a\u00020k2\u0006\u0010z\u001a\u00020\u000fH\u0002J\b\u0010{\u001a\u00020kH\u0007J\u0018\u0010|\u001a\u00020k2\u0006\u0010}\u001a\u00020\u000f2\b\b\u0002\u0010~\u001a\u00020\u007fJ\u0010\u0010\u0080\u0001\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\u000fJ\u0010\u0010\u0082\u0001\u001a\u00020\b2\u0007\u0010\u0083\u0001\u001a\u00020\bJ\u0010\u0010\u0084\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\u0017J\u0010\u0010\u0086\u0001\u001a\u00020k2\u0007\u0010\u0087\u0001\u001a\u00020\u0017J\u0013\u0010\u0088\u0001\u001a\u00020\b2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020kH\u0002J\u000f\u0010\u008c\u0001\u001a\u00020k2\u0006\u0010}\u001a\u00020YJ\u0007\u0010\u008d\u0001\u001a\u00020kJ\u0019\u0010\u008e\u0001\u001a\u00020k2\u0007\u0010\u008f\u0001\u001a\u00020Y2\u0007\u0010\u0090\u0001\u001a\u00020\bJ\u0013\u0010\u0091\u0001\u001a\u00020k2\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001J\u001b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020W2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\u000fJ\u0010\u0010\u009a\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\u0017J\u0010\u0010\u009b\u0001\u001a\u00020k2\u0007\u0010\u009c\u0001\u001a\u00020\u000fJ\u000f\u0010\u009d\u0001\u001a\u00020k2\u0006\u0010P\u001a\u00020\u0017J\u0012\u0010\u009e\u0001\u001a\u00020k2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010@J\u0012\u0010\u00a0\u0001\u001a\u00020k2\u0007\u0010\u00a1\u0001\u001a\u00020YH\u0007J\u0010\u0010\u00a2\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\u0017J\u0010\u0010\u00a3\u0001\u001a\u00020k2\u0007\u0010\u0083\u0001\u001a\u00020\bJ\u0010\u0010\u00a4\u0001\u001a\u00020\u00172\u0007\u0010\u00a5\u0001\u001a\u00020\u0017J!\u0010\u00a6\u0001\u001a\u00020k2\u0007\u0010\u0096\u0001\u001a\u00020W2\u0007\u0010\u00a7\u0001\u001a\u00020\u0013H\u0000\u00a2\u0006\u0003\b\u00a8\u0001J\u0007\u0010\u00a9\u0001\u001a\u00020kJ$\u0010\u00aa\u0001\u001a\u00020\b2\u0007\u0010\u00ab\u0001\u001a\u00020\u00172\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0000\u00a2\u0006\u0003\b\u00ac\u0001J\u001f\u0010\u00ad\u0001\u001a\u00020k2\t\b\u0002\u0010\u00ae\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u00af\u0001\u001a\u00020\u000fH\u0002J4\u0010\u00b0\u0001\u001a\u00020\b2\u0007\u0010\u00b1\u0001\u001a\u00020Y2\u0007\u0010\u00b2\u0001\u001a\u00020Y2\u0007\u0010\u00b3\u0001\u001a\u00020Y2\u0007\u0010\u00b4\u0001\u001a\u00020Y2\u0007\u0010\u00b5\u0001\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR&\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0007\u001a\u0004\u0018\u00010#@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R!\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR#\u00102\u001a\n 4*\u0004\u0018\u000103038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\r\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u00b6\u0001"}, d2 = {"Lorg/videolan/vlc/media/PlayerController;", "Lorg/videolan/libvlc/IVLCVout$Callback;", "Lorg/videolan/libvlc/MediaPlayer$EventListener;", "()V", "eventActor", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "Lorg/videolan/libvlc/MediaPlayer$Event;", "<set-?>", "", "hasRenderer", "getHasRenderer", "()Z", "setHasRenderer", "(Z)V", "lastTime", "", "mediaplayer", "Lorg/videolan/libvlc/MediaPlayer;", "mediaplayerEventListener", "Lorg/videolan/vlc/media/MediaPLayerEventListener;", "pausable", "getPausable", "setPausable", "", "playbackState", "getPlaybackState", "()I", "setPlaybackState", "(I)V", "playerContext", "Lkotlinx/coroutines/experimental/ThreadPoolDispatcher;", "getPlayerContext", "()Lkotlinx/coroutines/experimental/ThreadPoolDispatcher;", "playerContext$delegate", "Lkotlin/Lazy;", "Lorg/videolan/libvlc/Media$Stats;", "previousMediaStats", "getPreviousMediaStats", "()Lorg/videolan/libvlc/Media$Stats;", "setPreviousMediaStats", "(Lorg/videolan/libvlc/Media$Stats;)V", "progress", "Landroid/arch/lifecycle/MutableLiveData;", "Lorg/videolan/vlc/media/Progress;", "getProgress", "()Landroid/arch/lifecycle/MutableLiveData;", "progress$delegate", "seekable", "getSeekable", "setSeekable", "settings", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSettings", "()Landroid/content/SharedPreferences;", "settings$delegate", "switchToVideo", "getSwitchToVideo", "setSwitchToVideo", "addSubtitleTrack", "uri", "Landroid/net/Uri;", "select", "path", "", "canDoPassthrough", "canSwitchToVideo", "expand", "Lorg/videolan/libvlc/MediaList;", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getAudioDelay", "getAudioTrack", "getAudioTracks", "", "Lorg/videolan/libvlc/MediaPlayer$TrackDescription;", "()[Lorg/videolan/libvlc/MediaPlayer$TrackDescription;", "getAudioTracksCount", "getChapterIdx", "getChapters", "Lorg/videolan/libvlc/MediaPlayer$Chapter;", "title", "(I)[Lorg/videolan/libvlc/MediaPlayer$Chapter;", "getCurrentTime", "getCurrentVideoTrack", "Lorg/videolan/libvlc/Media$VideoTrack;", "getLength", "getMedia", "Lorg/videolan/libvlc/Media;", "getRate", "", "getSpuDelay", "getSpuTrack", "getSpuTracks", "getSpuTracksCount", "getTitleIdx", "getTitles", "Lorg/videolan/libvlc/MediaPlayer$Title;", "()[Lorg/videolan/libvlc/MediaPlayer$Title;", "getVideoTrack", "getVideoTracks", "getVideoTracksCount", "getVolume", "getVout", "Lorg/videolan/libvlc/IVLCVout;", "isPlaying", "isVideoPlaying", "navigate", "", "where", "newMediaPlayer", "onEvent", "event", "onSurfacesCreated", "vlcVout", "onSurfacesDestroyed", "pause", "play", "release", "player", "releaseMedia", "()Lkotlin/Unit;", "resetPlaybackState", "duration", "restart", "seek", "position", "length", "", "setAudioDelay", "delay", "setAudioDigitalOutputEnabled", "enabled", "setAudioTrack", "index", "setChapterIdx", "chapter", "setEqualizer", "equalizer", "Lorg/videolan/libvlc/MediaPlayer$Equalizer;", "setPlaybackStopped", "setPosition", "setPreviousStats", "setRate", "rate", "save", "setRenderer", "renderer", "Lorg/videolan/libvlc/RendererItem;", "setSlaves", "Lkotlinx/coroutines/experimental/Job;", "media", "mw", "Lorg/videolan/medialibrary/media/MediaWrapper;", "setSpuDelay", "setSpuTrack", "setTime", "time", "setTitleIdx", "setVideoAspectRatio", "aspect", "setVideoScale", "scale", "setVideoTrack", "setVideoTrackEnabled", "setVolume", "volume", "startPlayback", "listener", "startPlayback$vlc_android_vanillaARMv7Debug", "stop", "updateCurrentMeta", "id", "updateCurrentMeta$vlc_android_vanillaARMv7Debug", "updateProgress", "newTime", "newLength", "updateViewpoint", "yaw", "pitch", "roll", "fov", "absolute", "vlc-android_vanillaARMv7Debug"})
public final class PlayerController implements org.videolan.libvlc.IVLCVout.Callback, org.videolan.libvlc.MediaPlayer.EventListener {
    private final kotlin.Lazy playerContext$delegate = null;
    private final kotlin.Lazy settings$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy progress$delegate = null;
    private org.videolan.libvlc.MediaPlayer mediaplayer;
    private boolean switchToVideo;
    private boolean seekable;
    private boolean pausable;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.libvlc.Media.Stats previousMediaStats;
    private volatile int playbackState;
    private volatile boolean hasRenderer;
    private org.videolan.vlc.media.MediaPLayerEventListener mediaplayerEventListener;
    private long lastTime;
    private final kotlinx.coroutines.experimental.channels.SendChannel<org.videolan.libvlc.MediaPlayer.Event> eventActor = null;
    
    private final kotlinx.coroutines.experimental.ThreadPoolDispatcher getPlayerContext() {
        return null;
    }
    
    private final android.content.SharedPreferences getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<org.videolan.vlc.media.Progress> getProgress() {
        return null;
    }
    
    public final boolean getSwitchToVideo() {
        return false;
    }
    
    public final void setSwitchToVideo(boolean p0) {
    }
    
    public final boolean getSeekable() {
        return false;
    }
    
    public final void setSeekable(boolean p0) {
    }
    
    public final boolean getPausable() {
        return false;
    }
    
    public final void setPausable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.Media.Stats getPreviousMediaStats() {
        return null;
    }
    
    private final void setPreviousMediaStats(org.videolan.libvlc.Media.Stats p0) {
    }
    
    public final int getPlaybackState() {
        return 0;
    }
    
    private final void setPlaybackState(int p0) {
    }
    
    public final boolean getHasRenderer() {
        return false;
    }
    
    private final void setHasRenderer(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.IVLCVout getVout() {
        return null;
    }
    
    public final boolean canDoPassthrough() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.Media getMedia() {
        return null;
    }
    
    public final void play() {
    }
    
    public final boolean pause() {
        return false;
    }
    
    public final void stop() {
    }
    
    private final kotlin.Unit releaseMedia() {
        return null;
    }
    
    public final void startPlayback$vlc_android_vanillaARMv7Debug(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media media, @org.jetbrains.annotations.NotNull()
    org.videolan.vlc.media.MediaPLayerEventListener listener) {
    }
    
    private final void resetPlaybackState(long duration) {
    }
    
    @android.support.annotation.MainThread()
    public final void restart() {
    }
    
    public final void seek(long position, double length) {
    }
    
    public final void setPosition(float position) {
    }
    
    public final void setTime(long time) {
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final boolean isVideoPlaying() {
        return false;
    }
    
    public final boolean canSwitchToVideo() {
        return false;
    }
    
    public final int getVideoTracksCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.MediaPlayer.TrackDescription[] getVideoTracks() {
        return null;
    }
    
    public final int getVideoTrack() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.Media.VideoTrack getCurrentVideoTrack() {
        return null;
    }
    
    public final int getAudioTracksCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.MediaPlayer.TrackDescription[] getAudioTracks() {
        return null;
    }
    
    public final int getAudioTrack() {
        return 0;
    }
    
    public final boolean setVideoTrack(int index) {
        return false;
    }
    
    public final boolean setAudioTrack(int index) {
        return false;
    }
    
    public final boolean setAudioDigitalOutputEnabled(boolean enabled) {
        return false;
    }
    
    public final long getAudioDelay() {
        return 0L;
    }
    
    public final long getSpuDelay() {
        return 0L;
    }
    
    public final float getRate() {
        return 0.0F;
    }
    
    public final boolean setSpuDelay(long delay) {
        return false;
    }
    
    public final void setVideoTrackEnabled(boolean enabled) {
    }
    
    public final boolean addSubtitleTrack(@org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean select) {
        return false;
    }
    
    public final boolean addSubtitleTrack(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean select) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.MediaPlayer.TrackDescription[] getSpuTracks() {
        return null;
    }
    
    public final int getSpuTrack() {
        return 0;
    }
    
    public final boolean setSpuTrack(int index) {
        return false;
    }
    
    public final int getSpuTracksCount() {
        return 0;
    }
    
    public final boolean setAudioDelay(long delay) {
        return false;
    }
    
    public final boolean setEqualizer(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.MediaPlayer.Equalizer equalizer) {
        return false;
    }
    
    @android.support.annotation.MainThread()
    public final void setVideoScale(float scale) {
    }
    
    public final void setVideoAspectRatio(@org.jetbrains.annotations.Nullable()
    java.lang.String aspect) {
    }
    
    public final void setRenderer(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.RendererItem renderer) {
    }
    
    public final void release(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer player) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.Job setSlaves(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media media, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mw) {
        return null;
    }
    
    private final org.videolan.libvlc.MediaPlayer newMediaPlayer() {
        return null;
    }
    
    @java.lang.Override()
    public void onSurfacesCreated(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.IVLCVout vlcVout) {
    }
    
    @java.lang.Override()
    public void onSurfacesDestroyed(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.IVLCVout vlcVout) {
    }
    
    public final long getCurrentTime() {
        return 0L;
    }
    
    public final long getLength() {
        return 0L;
    }
    
    public final void setRate(float rate, boolean save) {
    }
    
    /**
     * * Update current media meta and return true if player needs to be updated
     *     *
     *     * @param id of the Meta event received, -1 for none
     *     * @return true if UI needs to be updated
     */
    public final boolean updateCurrentMeta$vlc_android_vanillaARMv7Debug(int id, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper mw) {
        return false;
    }
    
    public final void setPreviousStats() {
    }
    
    public final boolean updateViewpoint(float yaw, float pitch, float roll, float fov, boolean absolute) {
        return false;
    }
    
    public final void navigate(int where) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.MediaPlayer.Chapter[] getChapters(int title) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.MediaPlayer.Title[] getTitles() {
        return null;
    }
    
    public final int getChapterIdx() {
        return 0;
    }
    
    public final void setChapterIdx(int chapter) {
    }
    
    public final int getTitleIdx() {
        return 0;
    }
    
    public final void setTitleIdx(int title) {
    }
    
    public final int getVolume() {
        return 0;
    }
    
    public final int setVolume(int volume) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object expand(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super org.videolan.libvlc.MediaList> p0) {
        return null;
    }
    
    private final void updateProgress(long newTime, long newLength) {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    private final void setPlaybackStopped() {
    }
    
    public PlayerController() {
        super();
    }
}