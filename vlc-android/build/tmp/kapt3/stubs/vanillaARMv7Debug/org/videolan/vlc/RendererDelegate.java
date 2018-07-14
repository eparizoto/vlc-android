package org.videolan.vlc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0012J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u0011\u0010\u001b\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u001e"}, d2 = {"Lorg/videolan/vlc/RendererDelegate;", "Lorg/videolan/libvlc/RendererDiscoverer$EventListener;", "()V", "TAG", "", "discoverers", "Ljava/util/ArrayList;", "Lorg/videolan/libvlc/RendererDiscoverer;", "renderers", "Lorg/videolan/vlc/util/LiveDataset;", "Lorg/videolan/libvlc/RendererItem;", "getRenderers", "()Lorg/videolan/vlc/util/LiveDataset;", "selectedRenderer", "Landroid/arch/lifecycle/LiveData;", "getSelectedRenderer", "()Landroid/arch/lifecycle/LiveData;", "started", "", "clear", "", "hasRenderer", "onEvent", "event", "Lorg/videolan/libvlc/RendererDiscoverer$Event;", "selectRenderer", "item", "start", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "stop", "vlc-android_vanillaARMv7Debug"})
public final class RendererDelegate implements org.videolan.libvlc.RendererDiscoverer.EventListener {
    private static final java.lang.String TAG = "VLC/RendererDelegate";
    private static final java.util.ArrayList<org.videolan.libvlc.RendererDiscoverer> discoverers = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.videolan.vlc.util.LiveDataset<org.videolan.libvlc.RendererItem> renderers = null;
    private static volatile boolean started;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.lifecycle.LiveData<org.videolan.libvlc.RendererItem> selectedRenderer = null;
    public static final org.videolan.vlc.RendererDelegate INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.util.LiveDataset<org.videolan.libvlc.RendererItem> getRenderers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<org.videolan.libvlc.RendererItem> getSelectedRenderer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object start(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void stop() {
    }
    
    private final void clear() {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.RendererDiscoverer.Event event) {
    }
    
    public final void selectRenderer(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.RendererItem item) {
    }
    
    public final boolean hasRenderer() {
        return false;
    }
    
    private RendererDelegate() {
        super();
    }
}