package org.videolan.vlc.gui.tv;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010\u001e\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/videolan/vlc/gui/tv/SearchFragment;", "Landroid/support/v17/leanback/app/SearchSupportFragment;", "Landroid/support/v17/leanback/app/SearchSupportFragment$SearchResultProvider;", "()V", "defaultItemClickedListener", "Landroid/support/v17/leanback/widget/OnItemViewClickedListener;", "getDefaultItemClickedListener", "()Landroid/support/v17/leanback/widget/OnItemViewClickedListener;", "rowsAdapter", "Landroid/support/v17/leanback/widget/ArrayObjectAdapter;", "getResultsAdapter", "loadRows", "", "query", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onQueryTextChange", "", "newQuery", "onQueryTextSubmit", "queryByWords", "words", "setupMediaLibraryReceiver", "action", "Lkotlin/Function0;", "vlc-android_vanillaARMv7Debug"})
public final class SearchFragment extends android.support.v17.leanback.app.SearchSupportFragment implements android.support.v17.leanback.app.SearchSupportFragment.SearchResultProvider {
    private final android.support.v17.leanback.widget.ArrayObjectAdapter rowsAdapter = null;
    
    private final android.support.v17.leanback.widget.OnItemViewClickedListener getDefaultItemClickedListener() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v17.leanback.widget.ArrayObjectAdapter getResultsAdapter() {
        return null;
    }
    
    private final void queryByWords(java.lang.String words) {
    }
    
    private final void setupMediaLibraryReceiver(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String newQuery) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return false;
    }
    
    private final void loadRows(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    public SearchFragment() {
        super();
    }
}