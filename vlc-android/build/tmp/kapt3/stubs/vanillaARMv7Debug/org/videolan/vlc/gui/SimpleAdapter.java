package org.videolan.vlc.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lorg/videolan/vlc/gui/SimpleAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lorg/videolan/vlc/gui/SimpleAdapter$ViewHolder;", "handler", "Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;", "(Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;)V", "getHandler", "()Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoritesHandler", "ViewHolder", "vlc-android_vanillaARMv7Debug"})
public final class SimpleAdapter extends android.support.v7.recyclerview.extensions.ListAdapter<org.videolan.medialibrary.media.MediaLibraryItem, org.videolan.vlc.gui.SimpleAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.vlc.gui.SimpleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.SimpleAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler getHandler() {
        return null;
    }
    
    public SimpleAdapter(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler handler) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;", "", "onClick", "", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "vlc-android_vanillaARMv7Debug"})
    public static abstract interface FavoritesHandler {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem item);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/videolan/vlc/gui/SimpleAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "handler", "Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;", "binding", "error/NonExistentClass", "(Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "getHandler", "()Lorg/videolan/vlc/gui/SimpleAdapter$FavoritesHandler;", "vlc-android_vanillaARMv7Debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler handler = null;
        @org.jetbrains.annotations.NotNull()
        private final error.NonExistentClass binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler getHandler() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final error.NonExistentClass getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.gui.SimpleAdapter.FavoritesHandler handler, @org.jetbrains.annotations.NotNull()
        error.NonExistentClass binding) {
            super(null);
        }
    }
}