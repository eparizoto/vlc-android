package org.videolan.vlc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/videolan/vlc/MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "playbackService", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "onCustomAction", "", "action", "", "extras", "Landroid/os/Bundle;", "onFastForward", "onMediaButtonEvent", "", "mediaButtonEvent", "Landroid/content/Intent;", "onPause", "onPlay", "onPlayFromMediaId", "mediaId", "onPlayFromSearch", "query", "onPlayFromUri", "uri", "Landroid/net/Uri;", "onRewind", "onSeekTo", "pos", "", "onSkipToNext", "onSkipToPrevious", "onSkipToQueueItem", "id", "onStop", "vlc-android_vanillaARMv7Debug"})
public final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
    private final org.videolan.vlc.PlaybackService playbackService = null;
    
    @java.lang.Override()
    public void onPlay() {
    }
    
    @java.lang.Override()
    public boolean onMediaButtonEvent(@org.jetbrains.annotations.NotNull()
    android.content.Intent mediaButtonEvent) {
        return false;
    }
    
    @java.lang.Override()
    public void onCustomAction(@org.jetbrains.annotations.Nullable()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlayFromMediaId(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlayFromUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlayFromSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSkipToNext() {
    }
    
    @java.lang.Override()
    public void onSkipToPrevious() {
    }
    
    @java.lang.Override()
    public void onSeekTo(long pos) {
    }
    
    @java.lang.Override()
    public void onFastForward() {
    }
    
    @java.lang.Override()
    public void onRewind() {
    }
    
    @java.lang.Override()
    public void onSkipToQueueItem(long id) {
    }
    
    public MediaSessionCallback(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService playbackService) {
        super();
    }
}