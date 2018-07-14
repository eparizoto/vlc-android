package org.videolan.vlc.gui.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0011\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u000eH\u0096\u0001J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/videolan/vlc/gui/tv/NowPlayingDelegate;", "Lorg/videolan/vlc/PlaybackService$Client$Callback;", "Lorg/videolan/vlc/PlaybackService$Callback;", "fragment", "Lorg/videolan/vlc/gui/tv/MainTvFragment;", "(Lorg/videolan/vlc/gui/tv/MainTvFragment;)V", "helper", "Lorg/videolan/vlc/gui/PlaybackServiceActivity$Helper;", "observer", "Landroid/arch/lifecycle/Observer;", "", "service", "Lorg/videolan/vlc/PlaybackService;", "onClear", "", "onConnected", "onDisconnected", "onMediaEvent", "event", "Lorg/videolan/libvlc/Media$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "update", "updateCurrent", "vlc-android_vanillaARMv7Debug"})
public final class NowPlayingDelegate implements org.videolan.vlc.PlaybackService.Client.Callback, org.videolan.vlc.PlaybackService.Callback {
    private org.videolan.vlc.PlaybackService service;
    private final org.videolan.vlc.gui.PlaybackServiceActivity.Helper helper = null;
    private final android.arch.lifecycle.Observer<java.lang.Boolean> observer = null;
    private final org.videolan.vlc.gui.tv.MainTvFragment fragment = null;
    
    public final void onClear() {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    private final void updateCurrent() {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
    }
    
    @java.lang.Override()
    public void onDisconnected() {
    }
    
    public NowPlayingDelegate(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.tv.MainTvFragment fragment) {
        super();
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media.Event event) {
    }
    
    @java.lang.Override()
    public void update() {
    }
}