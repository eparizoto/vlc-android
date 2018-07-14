package org.videolan.vlc.gui.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010%\u001a\u00020&2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020&H\u0016J0\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u001e2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J0\u00107\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u001e2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00108\u001a\u00020&H\u0016J\b\u00109\u001a\u00020&H\u0016J\u001a\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010<\u001a\u00020&H\u0002J\u0006\u0010=\u001a\u00020\u0012J\u0012\u0010>\u001a\u00020&2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@J\u0006\u0010A\u001a\u00020&J\u0018\u0010B\u001a\u00020&2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010DH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lorg/videolan/vlc/gui/tv/MainTvFragment;", "Landroid/support/v17/leanback/app/BrowseSupportFragment;", "Landroid/support/v17/leanback/widget/OnItemViewSelectedListener;", "Landroid/support/v17/leanback/widget/OnItemViewClickedListener;", "Landroid/view/View$OnClickListener;", "Landroid/arch/lifecycle/Observer;", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "()V", "audioRow", "Landroid/support/v17/leanback/widget/ListRow;", "backgroundManager", "Landroid/support/v17/leanback/app/BackgroundManager;", "browserAdapter", "Landroid/support/v17/leanback/widget/ArrayObjectAdapter;", "browsersRow", "categoriesAdapter", "displayHistory", "", "historyAdapter", "historyModel", "Lorg/videolan/vlc/viewmodels/HistoryModel;", "historyRow", "miscRow", "nowPlayingDelegate", "Lorg/videolan/vlc/gui/tv/NowPlayingDelegate;", "otherAdapter", "restart", "rowsAdapter", "selectedItem", "", "settings", "Landroid/content/SharedPreferences;", "videoAdapter", "videoModel", "Lorg/videolan/vlc/viewmodels/VideosModel;", "videoRow", "onChanged", "", "list", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClicked", "itemViewHolder", "Landroid/support/v17/leanback/widget/Presenter$ViewHolder;", "item", "rowViewHolder", "Landroid/support/v17/leanback/widget/RowPresenter$ViewHolder;", "row", "Landroid/support/v17/leanback/widget/Row;", "onItemSelected", "onStart", "onStop", "onViewCreated", "view", "setHistoryModel", "showDetails", "updateAudioCategories", "current", "Lorg/videolan/medialibrary/media/DummyItem;", "updateBrowsers", "updateVideos", "videos", "", "vlc-android_vanillaARMv7Debug"})
public final class MainTvFragment extends android.support.v17.leanback.app.BrowseSupportFragment implements android.support.v17.leanback.widget.OnItemViewSelectedListener, android.support.v17.leanback.widget.OnItemViewClickedListener, android.view.View.OnClickListener, android.arch.lifecycle.Observer<java.util.List<org.videolan.medialibrary.media.MediaWrapper>> {
    private android.support.v17.leanback.app.BackgroundManager backgroundManager;
    private org.videolan.vlc.viewmodels.VideosModel videoModel;
    private org.videolan.vlc.viewmodels.HistoryModel historyModel;
    private android.support.v17.leanback.widget.ArrayObjectAdapter rowsAdapter;
    private android.support.v17.leanback.widget.ArrayObjectAdapter videoAdapter;
    private android.support.v17.leanback.widget.ArrayObjectAdapter categoriesAdapter;
    private android.support.v17.leanback.widget.ArrayObjectAdapter historyAdapter;
    private android.support.v17.leanback.widget.ArrayObjectAdapter browserAdapter;
    private android.support.v17.leanback.widget.ArrayObjectAdapter otherAdapter;
    private android.support.v17.leanback.widget.ListRow videoRow;
    private android.support.v17.leanback.widget.ListRow audioRow;
    private android.support.v17.leanback.widget.ListRow historyRow;
    private android.support.v17.leanback.widget.ListRow browsersRow;
    private android.support.v17.leanback.widget.ListRow miscRow;
    private android.content.SharedPreferences settings;
    private org.videolan.vlc.gui.tv.NowPlayingDelegate nowPlayingDelegate;
    private boolean displayHistory;
    private java.lang.Object selectedItem;
    private boolean restart;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateAudioCategories(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.DummyItem current) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final boolean showDetails() {
        return false;
    }
    
    public final void updateBrowsers() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    private final void setHistoryModel() {
    }
    
    @java.lang.Override()
    public void onChanged(@org.jetbrains.annotations.Nullable()
    java.util.List<org.videolan.medialibrary.media.MediaWrapper> list) {
    }
    
    private final void updateVideos(java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> videos) {
    }
    
    public MainTvFragment() {
        super();
    }
}