package org.videolan.vlc.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001tB\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0017J\u0016\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020!J\b\u0010=\u001a\u000208H$J\b\u0010>\u001a\u000208H\u0016J\b\u0010?\u001a\u00020@H$J\b\u0010A\u001a\u00020!H\u0014J\b\u0010B\u001a\u00020!H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010D\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010 \u001a\u00020!J\b\u0010E\u001a\u000208H\u0014J\u0018\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u0002082\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020PH\u0016J \u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u0002032\u0006\u0010I\u001a\u00020RH\u0016J\u0012\u0010S\u001a\u0002082\b\u0010T\u001a\u0004\u0018\u00010MH\u0016J\u0018\u0010U\u001a\u00020!2\u0006\u0010G\u001a\u00020H2\u0006\u0010V\u001a\u00020WH\u0016J&\u0010X\u001a\u0004\u0018\u00010P2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0018\u0010]\u001a\u0002082\u0006\u0010Q\u001a\u0002032\u0006\u0010^\u001a\u000203H\u0016J \u0010_\u001a\u0002082\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u0002032\u0006\u0010I\u001a\u00020RH\u0016J\u0012\u0010`\u001a\u0002082\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J \u0010a\u001a\u00020!2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u0002032\u0006\u0010I\u001a\u00020RH\u0016J\u0018\u0010b\u001a\u00020!2\u0006\u0010G\u001a\u00020H2\u0006\u0010V\u001a\u00020WH\u0016J\u0012\u0010c\u001a\u0002082\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010d\u001a\u000208H\u0016J\b\u0010e\u001a\u000208H\u0016J\u0010\u0010f\u001a\u0002082\u0006\u0010g\u001a\u00020MH\u0016J\b\u0010h\u001a\u000208H\u0016J\b\u0010i\u001a\u000208H\u0016J\u0014\u0010j\u001a\u0002082\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030kH\u0016J\u0012\u0010l\u001a\u0002082\b\u0010m\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010n\u001a\u000208H\u0016J\u0010\u0010o\u001a\u0002082\u0006\u0010m\u001a\u00020\u001bH\u0002J\b\u0010p\u001a\u000208H\u0014J\u0010\u0010q\u001a\u0002082\u0006\u0010m\u001a\u00020\u001bH\u0002J\b\u0010r\u001a\u000208H\u0014J\b\u0010s\u001a\u000208H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u0010X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\'X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010%\u00a8\u0006u"}, d2 = {"Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;", "Lorg/videolan/vlc/gui/browser/MediaBrowserFragment;", "Lorg/videolan/vlc/viewmodels/browser/BrowserModel;", "Lorg/videolan/vlc/interfaces/IRefreshable;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "Landroid/view/View$OnClickListener;", "Lorg/videolan/vlc/interfaces/IEventsHandler;", "Lorg/videolan/vlc/gui/dialogs/CtxActionReceiver;", "()V", "adapter", "Lorg/videolan/vlc/gui/browser/BaseBrowserAdapter;", "getAdapter", "()Lorg/videolan/vlc/gui/browser/BaseBrowserAdapter;", "setAdapter", "(Lorg/videolan/vlc/gui/browser/BaseBrowserAdapter;)V", "binding", "error/NonExistentClass", "getBinding", "()Lerror/NonExistentClass;", "setBinding", "(Lerror/NonExistentClass;)V", "Lerror/NonExistentClass;", "categoryTitle", "", "getCategoryTitle", "()Ljava/lang/String;", "currentMedia", "Lorg/videolan/medialibrary/media/MediaWrapper;", "getCurrentMedia", "()Lorg/videolan/medialibrary/media/MediaWrapper;", "setCurrentMedia", "(Lorg/videolan/medialibrary/media/MediaWrapper;)V", "goBack", "", "getGoBack", "()Z", "setGoBack", "(Z)V", "handler", "Lorg/videolan/vlc/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "getHandler", "()Lorg/videolan/vlc/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "isRootDirectory", "setRootDirectory", "layoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mrl", "getMrl", "setMrl", "(Ljava/lang/String;)V", "savedPosition", "", "showHiddenFiles", "getShowHiddenFiles", "setShowHiddenFiles", "backTo", "", "tag", "browse", "media", "save", "browseRoot", "clear", "createFragment", "Landroid/support/v4/app/Fragment;", "defineIsRoot", "enableSearchOption", "getSubTitle", "getTitle", "initFavorites", "onActionItemClicked", "mode", "Landroid/support/v7/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "v", "Landroid/view/View;", "position", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onCreate", "bundle", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "option", "onCtxClick", "onDestroyActionMode", "onLongClick", "onPrepareActionMode", "onPrepareOptionsMenu", "onRefresh", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onUpdateFinished", "Landroid/support/v7/widget/RecyclerView$Adapter;", "playAll", "mw", "refresh", "removeMedia", "setBreadcrumb", "showMediaInfo", "updateEmptyView", "updateFab", "BrowserFragmentHandler", "vlc-android_vanillaARMv7Debug"})
public abstract class BaseBrowserFragment extends org.videolan.vlc.gui.browser.MediaBrowserFragment<org.videolan.vlc.viewmodels.browser.BrowserModel> implements org.videolan.vlc.interfaces.IRefreshable, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnClickListener, org.videolan.vlc.interfaces.IEventsHandler, org.videolan.vlc.gui.dialogs.CtxActionReceiver {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.gui.browser.BaseBrowserFragment.BrowserFragmentHandler handler = null;
    private android.support.v7.widget.LinearLayoutManager layoutManager;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mrl;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.media.MediaWrapper currentMedia;
    private int savedPosition;
    private boolean isRootDirectory;
    private boolean goBack;
    private boolean showHiddenFiles;
    @org.jetbrains.annotations.NotNull()
    protected org.videolan.vlc.gui.browser.BaseBrowserAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    protected error.NonExistentClass binding;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.videolan.vlc.gui.browser.BaseBrowserFragment.BrowserFragmentHandler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMrl() {
        return null;
    }
    
    public final void setMrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.videolan.medialibrary.media.MediaWrapper getCurrentMedia() {
        return null;
    }
    
    protected final void setCurrentMedia(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper p0) {
    }
    
    public final boolean isRootDirectory() {
        return false;
    }
    
    public final void setRootDirectory(boolean p0) {
    }
    
    protected final boolean getGoBack() {
        return false;
    }
    
    protected final void setGoBack(boolean p0) {
    }
    
    protected final boolean getShowHiddenFiles() {
        return false;
    }
    
    protected final void setShowHiddenFiles(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.videolan.vlc.gui.browser.BaseBrowserAdapter getAdapter() {
        return null;
    }
    
    protected final void setAdapter(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.browser.BaseBrowserAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getCategoryTitle();
    
    @org.jetbrains.annotations.NotNull()
    protected final error.NonExistentClass getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.support.v4.app.Fragment createFragment();
    
    protected abstract void browseRoot();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
    }
    
    protected boolean defineIsRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setBreadcrumb() {
    }
    
    public final void backTo(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    protected void initFavorites() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getSubTitle() {
        return null;
    }
    
    public final boolean goBack() {
        return false;
    }
    
    public final void browse(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media, boolean save) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    /**
     * * Update views visibility and emptiness info
     */
    protected void updateEmptyView() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void removeMedia(org.videolan.medialibrary.media.MediaWrapper mw) {
    }
    
    private final void showMediaInfo(org.videolan.medialibrary.media.MediaWrapper mw) {
    }
    
    private final void playAll(org.videolan.medialibrary.media.MediaWrapper mw) {
    }
    
    @java.lang.Override()
    public boolean enableSearchOption() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    android.support.v7.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    android.support.v7.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    android.support.v7.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.support.v7.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCtxClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, int option) {
    }
    
    @java.lang.Override()
    public void onUpdateFinished(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    private final void updateFab() {
    }
    
    public BaseBrowserFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/videolan/vlc/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "Lorg/videolan/vlc/util/WeakHandler;", "Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;", "owner", "(Lorg/videolan/vlc/gui/browser/BaseBrowserFragment;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "vlc-android_vanillaARMv7Debug"})
    public static final class BrowserFragmentHandler extends org.videolan.vlc.util.WeakHandler<org.videolan.vlc.gui.browser.BaseBrowserFragment> {
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
        
        public BrowserFragmentHandler(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.gui.browser.BaseBrowserFragment owner) {
            super(null);
        }
    }
}