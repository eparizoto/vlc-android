package org.videolan.vlc.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/videolan/vlc/util/VLCAudioFocusHelper;", "", "service", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioManager", "Landroid/media/AudioManager;", "hasAudioFocus", "", "lossTransient", "getLossTransient$vlc_android_vanillaARMv7Debug", "()Z", "setLossTransient$vlc_android_vanillaARMv7Debug", "(Z)V", "changeAudioFocus", "", "acquire", "changeAudioFocus$vlc_android_vanillaARMv7Debug", "createOnAudioFocusChangeListener", "vlc-android_vanillaARMv7Debug"})
public final class VLCAudioFocusHelper {
    private android.media.AudioManager audioManager;
    private boolean hasAudioFocus;
    private volatile boolean lossTransient;
    private final android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener = null;
    private final org.videolan.vlc.PlaybackService service = null;
    
    public final boolean getLossTransient$vlc_android_vanillaARMv7Debug() {
        return false;
    }
    
    public final void setLossTransient$vlc_android_vanillaARMv7Debug(boolean p0) {
    }
    
    public final void changeAudioFocus$vlc_android_vanillaARMv7Debug(boolean acquire) {
    }
    
    private final android.media.AudioManager.OnAudioFocusChangeListener createOnAudioFocusChangeListener() {
        return null;
    }
    
    public VLCAudioFocusHelper(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
        super();
    }
}