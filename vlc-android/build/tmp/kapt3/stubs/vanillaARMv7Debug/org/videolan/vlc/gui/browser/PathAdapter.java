package org.videolan.vlc.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/videolan/vlc/gui/browser/PathAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lorg/videolan/vlc/gui/browser/PathAdapter$ViewHolder;", "browser", "Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;", "path", "", "(Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;Ljava/lang/String;)V", "getBrowser", "()Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;", "memoryTitle", "segments", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "vlc-android_vanillaARMv7Debug"})
public final class PathAdapter extends android.support.v7.widget.RecyclerView.Adapter<org.videolan.vlc.gui.browser.PathAdapter.ViewHolder> {
    private final java.lang.String memoryTitle = null;
    private final java.util.List<java.lang.String> segments = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.gui.browser.BaseBrowserFragment browser = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.vlc.gui.browser.PathAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.browser.PathAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.gui.browser.BaseBrowserFragment getBrowser() {
        return null;
    }
    
    public PathAdapter(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.browser.BaseBrowserFragment browser, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/videolan/vlc/gui/browser/PathAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "root", "Landroid/widget/TextView;", "(Lorg/videolan/vlc/gui/browser/PathAdapter;Landroid/widget/TextView;)V", "getRoot", "()Landroid/widget/TextView;", "vlc-android_vanillaARMv7Debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView root = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRoot() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.TextView root) {
            super(null);
        }
    }
}