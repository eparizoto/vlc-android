package org.videolan.vlc.gui.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/videolan/vlc/gui/tv/TimeUpdater;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/app/Activity;", "tv", "Landroid/widget/TextView;", "(Landroid/app/Activity;Landroid/widget/TextView;)V", "clockReceiver", "org/videolan/vlc/gui/tv/TimeUpdater$clockReceiver$1", "Lorg/videolan/vlc/gui/tv/TimeUpdater$clockReceiver$1;", "register", "", "unregister", "updateTime", "vlc-android_vanillaARMv7Debug"})
public final class TimeUpdater implements android.arch.lifecycle.LifecycleObserver {
    private final android.content.BroadcastReceiver clockReceiver = null;
    private final android.app.Activity activity = null;
    private final android.widget.TextView tv = null;
    
    private final void updateTime() {
    }
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_START)
    public final void register() {
    }
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_STOP)
    public final void unregister() {
    }
    
    public TimeUpdater(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.widget.TextView tv) {
        super();
    }
}