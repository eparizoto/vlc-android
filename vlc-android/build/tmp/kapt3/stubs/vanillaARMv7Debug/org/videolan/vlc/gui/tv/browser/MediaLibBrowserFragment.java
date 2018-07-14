package org.videolan.vlc.gui.tv.browser;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\'\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J0\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J0\u0010,\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0016J\u0016\u0010/\u001a\u00020 2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00062"}, d2 = {"Lorg/videolan/vlc/gui/tv/browser/MediaLibBrowserFragment;", "T", "Lorg/videolan/vlc/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lorg/videolan/vlc/gui/tv/browser/GridFragment;", "Landroid/support/v17/leanback/widget/OnItemViewSelectedListener;", "Landroid/support/v17/leanback/widget/OnItemViewClickedListener;", "Lorg/videolan/vlc/interfaces/Sortable;", "()V", "currentItem", "getCurrentItem", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "setCurrentItem", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "mBackgroundManager", "Landroid/support/v17/leanback/app/BackgroundManager;", "mSelectedItem", "", "model", "getModel", "()Lorg/videolan/vlc/viewmodels/BaseModel;", "setModel", "(Lorg/videolan/vlc/viewmodels/BaseModel;)V", "Lorg/videolan/vlc/viewmodels/BaseModel;", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "getVM", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onItemClicked", "itemViewHolder", "Landroid/support/v17/leanback/widget/Presenter$ViewHolder;", "item", "rowViewHolder", "Landroid/support/v17/leanback/widget/RowPresenter$ViewHolder;", "row", "Landroid/support/v17/leanback/widget/Row;", "onItemSelected", "onStart", "refresh", "update", "list", "", "vlc-android_vanillaARMv7Debug"})
public abstract class MediaLibBrowserFragment<T extends org.videolan.vlc.viewmodels.BaseModel<? extends org.videolan.medialibrary.media.MediaLibraryItem>> extends org.videolan.vlc.gui.tv.browser.GridFragment implements android.support.v17.leanback.widget.OnItemViewSelectedListener, android.support.v17.leanback.widget.OnItemViewClickedListener, org.videolan.vlc.interfaces.Sortable {
    private android.support.v17.leanback.app.BackgroundManager mBackgroundManager;
    private java.lang.Object mSelectedItem;
    @org.jetbrains.annotations.NotNull()
    public T model;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.media.MediaLibraryItem currentItem;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy preferences$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final T getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.videolan.medialibrary.media.MediaLibraryItem getCurrentItem() {
        return null;
    }
    
    protected final void setCurrentItem(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    protected final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> list) {
    }
    
    @android.support.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.vlc.viewmodels.BaseModel<? extends org.videolan.medialibrary.media.MediaLibraryItem> getVM() {
        return null;
    }
    
    public MediaLibBrowserFragment() {
        super();
    }
    
    public void sort(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}