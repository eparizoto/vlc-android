package org.videolan.vlc.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/videolan/vlc/util/PBSMedialibraryReceiver;", "Landroid/content/BroadcastReceiver;", "service", "Lorg/videolan/vlc/PlaybackService;", "(Lorg/videolan/vlc/PlaybackService;)V", "pendingActions", "Ljava/util/LinkedList;", "Ljava/lang/Runnable;", "getPendingActions", "()Ljava/util/LinkedList;", "pendingActions$delegate", "Lkotlin/Lazy;", "addAction", "", "r", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "vlc-android_vanillaARMv7Debug"})
public final class PBSMedialibraryReceiver extends android.content.BroadcastReceiver {
    private final kotlin.Lazy pendingActions$delegate = null;
    private final org.videolan.vlc.PlaybackService service = null;
    
    private final java.util.LinkedList<java.lang.Runnable> getPendingActions() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public final boolean addAction(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable r) {
        return false;
    }
    
    public PBSMedialibraryReceiver(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
        super();
    }
}