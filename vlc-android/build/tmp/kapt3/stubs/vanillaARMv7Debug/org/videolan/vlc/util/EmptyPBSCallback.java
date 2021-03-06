package org.videolan.vlc.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016\u00a8\u0006\n"}, d2 = {"Lorg/videolan/vlc/util/EmptyPBSCallback;", "Lorg/videolan/vlc/PlaybackService$Callback;", "()V", "onMediaEvent", "", "event", "Lorg/videolan/libvlc/Media$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "update", "vlc-android_vanillaARMv7Debug"})
public final class EmptyPBSCallback implements org.videolan.vlc.PlaybackService.Callback {
    public static final org.videolan.vlc.util.EmptyPBSCallback INSTANCE = null;
    
    @java.lang.Override()
    public void update() {
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Media.Event event) {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    private EmptyPBSCallback() {
        super();
    }
}