package org.videolan.vlc.gui.audio;

import java.lang.System;

@kotlin.Suppress(names = {"UNUSED_PARAMETER"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0014 \u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002vwB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u00106\u001a\u0002052\u0006\u00107\u001a\u000208H\u0016J(\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u0007J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u00020\u0007H\u0002J\u0010\u0010C\u001a\u0002052\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010D\u001a\u0002052\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J&\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010M\u001a\u000205H\u0016J\u000e\u0010N\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\u000e\u0010P\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\u000e\u0010Q\u001a\u0002052\u0006\u0010O\u001a\u00020HJ \u0010R\u001a\u0002052\u0006\u0010S\u001a\u00020H2\u0006\u0010T\u001a\u00020#2\u0006\u0010U\u001a\u00020VH\u0016J\u000e\u0010W\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\u000e\u0010X\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\u000e\u0010Y\u001a\u0002052\u0006\u0010Z\u001a\u00020HJ\u0010\u0010[\u001a\u0002052\u0006\u0010\\\u001a\u00020FH\u0016J\u000e\u0010]\u001a\u0002052\u0006\u0010Z\u001a\u00020HJ\u0010\u0010^\u001a\u0002052\u0006\u0010T\u001a\u00020#H\u0016J\u000e\u0010_\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\b\u0010`\u001a\u000205H\u0016J\u000e\u0010a\u001a\u0002052\u0006\u0010b\u001a\u00020#J\b\u0010c\u001a\u000205H\u0016J\u000e\u0010d\u001a\u00020\u00072\u0006\u0010O\u001a\u00020HJ(\u0010e\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u000e\u0010f\u001a\u0002052\u0006\u0010O\u001a\u00020HJ\u001a\u0010g\u001a\u0002052\u0006\u0010O\u001a\u00020H2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0018\u0010h\u001a\u0002052\u0006\u0010T\u001a\u00020#2\u0006\u0010i\u001a\u00020VH\u0016J\b\u0010j\u001a\u000205H\u0002J\b\u0010k\u001a\u000205H\u0003J8\u0010l\u001a\u0002052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0002J\u000e\u0010m\u001a\u0002052\u0006\u0010Z\u001a\u00020HJ\b\u0010n\u001a\u000205H\u0002J\b\u0010o\u001a\u000205H\u0003J\b\u0010p\u001a\u000205H\u0002J\u0010\u0010q\u001a\u0002052\u0006\u0010r\u001a\u00020sH\u0002J\b\u0010t\u001a\u000205H\u0002J\b\u0010u\u001a\u000205H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006x"}, d2 = {"Lorg/videolan/vlc/gui/audio/AudioPlayer;", "Landroid/support/v4/app/Fragment;", "Lorg/videolan/vlc/gui/audio/PlaylistAdapter$IPlayer;", "Landroid/text/TextWatcher;", "Lorg/videolan/vlc/PlaybackService$Client$Callback;", "()V", "advFuncVisible", "", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "currentCoverArt", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "headerMediaSwitcherListener", "org/videolan/vlc/gui/audio/AudioPlayer$headerMediaSwitcherListener$1", "Lorg/videolan/vlc/gui/audio/AudioPlayer$headerMediaSwitcherListener$1;", "headerPlayPauseVisible", "headerTimeVisible", "helper", "Lorg/videolan/vlc/gui/PlaybackServiceActivity$Helper;", "hideSearchRunnable", "Ljava/lang/Runnable;", "getHideSearchRunnable", "()Ljava/lang/Runnable;", "hideSearchRunnable$delegate", "mCoverMediaSwitcherListener", "org/videolan/vlc/gui/audio/AudioPlayer$mCoverMediaSwitcherListener$1", "Lorg/videolan/vlc/gui/audio/AudioPlayer$mCoverMediaSwitcherListener$1;", "playerState", "", "playlistAdapter", "Lorg/videolan/vlc/gui/audio/PlaylistAdapter;", "playlistModel", "Lorg/videolan/vlc/viewmodels/PlaylistModel;", "playlistSwitchVisible", "previewingSeek", "progressBarVisible", "searchVisible", "service", "Lorg/videolan/vlc/PlaybackService;", "settings", "Landroid/content/SharedPreferences;", "showRemainingTime", "timelineListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "updateActor", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "", "afterTextChanged", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "start", "before", "count", "clearSearch", "doUpdate", "hideHeaderButtons", "hideSearchField", "onConnected", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDisconnected", "onNextClick", "view", "onPlayPauseClick", "onPlaylistSwitchClick", "onPopupMenu", "anchor", "position", "media", "Lorg/videolan/medialibrary/media/MediaWrapper;", "onPreviousClick", "onRepeatClick", "onResumeToVideoClick", "v", "onSaveInstanceState", "outState", "onSearchClick", "onSelectionSet", "onShuffleClick", "onStart", "onStateChanged", "newState", "onStop", "onStopClick", "onTextChanged", "onTimeLabelClick", "onViewCreated", "playItem", "item", "restoreHeaderButtonVisibilities", "setDefaultBackground", "setHeaderVisibilities", "showAdvancedOptions", "showPlaylistTips", "updateBackground", "updatePlayPause", "updateProgress", "progress", "Lorg/videolan/vlc/viewmodels/PlaybackProgress;", "updateRepeatMode", "updateShuffleMode", "Companion", "LongSeekListener", "vlc-android_vanillaARMv7Debug"})
public final class AudioPlayer extends android.support.v4.app.Fragment implements org.videolan.vlc.gui.audio.PlaylistAdapter.IPlayer, android.text.TextWatcher, org.videolan.vlc.PlaybackService.Client.Callback {
    private error.NonExistentClass binding;
    private org.videolan.vlc.gui.audio.PlaylistAdapter playlistAdapter;
    private android.content.SharedPreferences settings;
    private final kotlin.Lazy handler$delegate = null;
    private final kotlinx.coroutines.experimental.channels.SendChannel<kotlin.Unit> updateActor = null;
    private org.videolan.vlc.gui.PlaybackServiceActivity.Helper helper;
    private org.videolan.vlc.PlaybackService service;
    private org.videolan.vlc.viewmodels.PlaylistModel playlistModel;
    private boolean showRemainingTime;
    private boolean previewingSeek;
    private boolean advFuncVisible;
    private boolean playlistSwitchVisible;
    private boolean searchVisible;
    private boolean headerPlayPauseVisible;
    private boolean progressBarVisible;
    private boolean headerTimeVisible;
    private int playerState;
    private java.lang.String currentCoverArt;
    private android.widget.SeekBar.OnSeekBarChangeListener timelineListener;
    private final org.videolan.vlc.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener headerMediaSwitcherListener = null;
    private final org.videolan.vlc.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener mCoverMediaSwitcherListener = null;
    private final kotlin.Lazy hideSearchRunnable$delegate = null;
    private static int DEFAULT_BACKGROUND_DARKER_ID;
    private static int DEFAULT_BACKGROUND_ID;
    public static final org.videolan.vlc.gui.audio.AudioPlayer.Companion Companion = null;
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onPopupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View anchor, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    private final void doUpdate() {
    }
    
    private final void updatePlayPause() {
    }
    
    private final void updateShuffleMode() {
    }
    
    private final void updateRepeatMode() {
    }
    
    private final void updateProgress(org.videolan.vlc.viewmodels.PlaybackProgress progress) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void updateBackground() {
    }
    
    @android.support.annotation.MainThread()
    private final void setDefaultBackground() {
    }
    
    @java.lang.Override()
    public void onSelectionSet(int position) {
    }
    
    @java.lang.Override()
    public void playItem(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper item) {
    }
    
    public final void onTimeLabelClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onPlayPauseClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final boolean onStopClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    public final void onNextClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onPreviousClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onRepeatClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onPlaylistSwitchClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onShuffleClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onResumeToVideoClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void showAdvancedOptions(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void setHeaderVisibilities(boolean advFuncVisible, boolean playlistSwitchVisible, boolean headerPlayPauseVisible, boolean progressBarVisible, boolean headerTimeVisible, boolean searchVisible) {
    }
    
    private final void restoreHeaderButtonVisibilities() {
    }
    
    private final void hideHeaderButtons() {
    }
    
    public final void onSearchClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int before, int count) {
    }
    
    public final boolean clearSearch() {
        return false;
    }
    
    private final boolean hideSearchField() {
        return false;
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
    }
    
    @java.lang.Override()
    public void onDisconnected() {
    }
    
    private final void showPlaylistTips() {
    }
    
    public final void onStateChanged(int newState) {
    }
    
    private final java.lang.Runnable getHideSearchRunnable() {
        return null;
    }
    
    public AudioPlayer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b\u00a8\u0006)"}, d2 = {"Lorg/videolan/vlc/gui/audio/AudioPlayer$LongSeekListener;", "Landroid/view/View$OnTouchListener;", "forward", "", "normal", "", "pressed", "(Lorg/videolan/vlc/gui/audio/AudioPlayer;ZII)V", "getForward$vlc_android_vanillaARMv7Debug", "()Z", "setForward$vlc_android_vanillaARMv7Debug", "(Z)V", "length", "", "getLength$vlc_android_vanillaARMv7Debug", "()J", "setLength$vlc_android_vanillaARMv7Debug", "(J)V", "getNormal$vlc_android_vanillaARMv7Debug", "()I", "setNormal$vlc_android_vanillaARMv7Debug", "(I)V", "possibleSeek", "getPossibleSeek$vlc_android_vanillaARMv7Debug", "setPossibleSeek$vlc_android_vanillaARMv7Debug", "getPressed$vlc_android_vanillaARMv7Debug", "setPressed$vlc_android_vanillaARMv7Debug", "seekRunnable", "Ljava/lang/Runnable;", "getSeekRunnable$vlc_android_vanillaARMv7Debug", "()Ljava/lang/Runnable;", "setSeekRunnable$vlc_android_vanillaARMv7Debug", "(Ljava/lang/Runnable;)V", "vibrated", "getVibrated$vlc_android_vanillaARMv7Debug", "setVibrated$vlc_android_vanillaARMv7Debug", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "vlc-android_vanillaARMv7Debug"})
    final class LongSeekListener implements android.view.View.OnTouchListener {
        private long length;
        private int possibleSeek;
        private boolean vibrated;
        @org.jetbrains.annotations.NotNull()
        @android.support.annotation.RequiresPermission(value = "android.permission.VIBRATE")
        private java.lang.Runnable seekRunnable;
        private boolean forward;
        private int normal;
        private int pressed;
        
        public final long getLength$vlc_android_vanillaARMv7Debug() {
            return 0L;
        }
        
        public final void setLength$vlc_android_vanillaARMv7Debug(long p0) {
        }
        
        public final int getPossibleSeek$vlc_android_vanillaARMv7Debug() {
            return 0;
        }
        
        public final void setPossibleSeek$vlc_android_vanillaARMv7Debug(int p0) {
        }
        
        public final boolean getVibrated$vlc_android_vanillaARMv7Debug() {
            return false;
        }
        
        public final void setVibrated$vlc_android_vanillaARMv7Debug(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Runnable getSeekRunnable$vlc_android_vanillaARMv7Debug() {
            return null;
        }
        
        public final void setSeekRunnable$vlc_android_vanillaARMv7Debug(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable p0) {
        }
        
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        public final boolean getForward$vlc_android_vanillaARMv7Debug() {
            return false;
        }
        
        public final void setForward$vlc_android_vanillaARMv7Debug(boolean p0) {
        }
        
        public final int getNormal$vlc_android_vanillaARMv7Debug() {
            return 0;
        }
        
        public final void setNormal$vlc_android_vanillaARMv7Debug(int p0) {
        }
        
        public final int getPressed$vlc_android_vanillaARMv7Debug() {
            return 0;
        }
        
        public final void setPressed$vlc_android_vanillaARMv7Debug(int p0) {
        }
        
        public LongSeekListener(boolean forward, int normal, int pressed) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/videolan/vlc/gui/audio/AudioPlayer$Companion;", "", "()V", "DEFAULT_BACKGROUND_DARKER_ID", "", "DEFAULT_BACKGROUND_ID", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}