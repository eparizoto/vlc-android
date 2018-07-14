package org.videolan.vlc.gui.tv.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0016\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000eH\u0002J\r\u0010%\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J(\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J0\u00103\u001a\u00020\'2\b\u00104\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00105\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00106\u001a\u00020\'H\u0016J\u001a\u00107\u001a\u00020\'2\u0006\u00108\u001a\u0002092\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010:\u001a\u00020\'H\u0016J$\u0010;\u001a\u00020\'2\u001a\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=\u0018\u00010\rH\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006>"}, d2 = {"Lorg/videolan/vlc/gui/tv/browser/CategoriesFragment;", "T", "Lorg/videolan/vlc/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Landroid/support/v17/leanback/app/BrowseSupportFragment;", "Lorg/videolan/vlc/interfaces/Sortable;", "Landroid/support/v17/leanback/widget/OnItemViewSelectedListener;", "Landroid/support/v17/leanback/widget/OnItemViewClickedListener;", "Lorg/videolan/vlc/gui/tv/browser/interfaces/BrowserFragmentInterface;", "()V", "backgroundManager", "Landroid/support/v17/leanback/app/BackgroundManager;", "categoryRows", "", "", "Landroid/support/v17/leanback/widget/ListRow;", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "restart", "", "rowsAdapter", "Landroid/support/v17/leanback/widget/ArrayObjectAdapter;", "selecteditem", "viewModel", "getViewModel", "()Lorg/videolan/vlc/viewmodels/BaseModel;", "setViewModel", "(Lorg/videolan/vlc/viewmodels/BaseModel;)V", "Lorg/videolan/vlc/viewmodels/BaseModel;", "getCategoryId", "", "getCategoryRow", "key", "getVM", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "viewHolder", "Landroid/support/v17/leanback/widget/Presenter$ViewHolder;", "item", "", "viewHolder1", "Landroid/support/v17/leanback/widget/RowPresenter$ViewHolder;", "row", "Landroid/support/v17/leanback/widget/Row;", "onItemSelected", "itemViewHolder", "rowViewHolder", "onStart", "onViewCreated", "view", "Landroid/view/View;", "refresh", "update", "map", "", "vlc-android_vanillaARMv7Debug"})
public class CategoriesFragment<T extends org.videolan.vlc.viewmodels.BaseModel<? extends org.videolan.medialibrary.media.MediaLibraryItem>> extends android.support.v17.leanback.app.BrowseSupportFragment implements org.videolan.vlc.interfaces.Sortable, android.support.v17.leanback.widget.OnItemViewSelectedListener, android.support.v17.leanback.widget.OnItemViewClickedListener, org.videolan.vlc.gui.tv.browser.interfaces.BrowserFragmentInterface {
    private org.videolan.medialibrary.media.MediaLibraryItem selecteditem;
    private android.support.v17.leanback.app.BackgroundManager backgroundManager;
    private final android.support.v17.leanback.widget.ArrayObjectAdapter rowsAdapter = null;
    private java.util.Map<java.lang.String, ? extends android.support.v17.leanback.widget.ListRow> categoryRows;
    @org.jetbrains.annotations.NotNull()
    public T viewModel;
    private boolean restart;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy preferences$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    T p0) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    android.support.v17.leanback.widget.Presenter.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder viewHolder1, @org.jetbrains.annotations.NotNull()
    android.support.v17.leanback.widget.Row row) {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    protected final void update(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem>> map) {
    }
    
    private final android.support.v17.leanback.widget.ListRow getCategoryRow(java.lang.String key) {
        return null;
    }
    
    private final long getCategoryId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T getVM() {
        return null;
    }
    
    public CategoriesFragment() {
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