package org.videolan.vlc.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001c\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u00028\u0000H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u001f\u00103\u001a\u0002042\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0015H\u0016J\b\u0010:\u001a\u00020\u0015H\u0016J\b\u0010;\u001a\u00020\u0015H\u0016J\b\u0010<\u001a\u00020\u0015H\u0016J\b\u0010=\u001a\u00020\u0015H\u0016J\b\u0010>\u001a\u00020\u0015H\u0016J\b\u0010?\u001a\u00020\u0015H\u0016J\b\u0010@\u001a\u00020\u0015H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016J\b\u0010B\u001a\u00020\u0015H\u0016J\b\u0010C\u001a\u000204H$J\u0010\u0010\u001a\u001a\u0002042\b\u0010D\u001a\u0004\u0018\u00010\tJ\u0006\u0010E\u001a\u00020\tJ\b\u0010F\u001a\u00020\u0015H\u0016J\u0013\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00028\u0000\u00a2\u0006\u0002\u0010IJ\u0015\u0010J\u001a\u0002042\u0006\u00105\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u000204J\u0010\u0010#\u001a\u0002042\u0006\u0010#\u001a\u00020$H\u0016J\u001f\u0010M\u001a\u0002042\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0011\u0010N\u001a\u000204H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OR3\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\b0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b!\u0010\fR\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0014\u0010)\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\'\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-8DX\u0085\u0084\u0002\u00a2\u0006\u0012\n\u0004\b2\u0010\u000e\u0012\u0004\b/\u0010\u0005\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006P"}, d2 = {"Lorg/videolan/vlc/viewmodels/BaseModel;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Landroid/arch/lifecycle/ViewModel;", "Lorg/videolan/vlc/util/RefreshModel;", "()V", "categories", "Landroid/arch/lifecycle/MediatorLiveData;", "", "", "", "getCategories", "()Landroid/arch/lifecycle/MediatorLiveData;", "categories$delegate", "Lkotlin/Lazy;", "dataset", "Lorg/videolan/vlc/util/LiveDataset;", "getDataset", "()Lorg/videolan/vlc/util/LiveDataset;", "dataset$delegate", "desc", "", "getDesc", "()Z", "setDesc", "(Z)V", "filter", "Lorg/videolan/vlc/util/FilterDelegate;", "getFilter", "()Lorg/videolan/vlc/util/FilterDelegate;", "filter$delegate", "filtering", "sections", "getSections", "sections$delegate", "sort", "", "getSort", "()I", "setSort", "(I)V", "sortKey", "getSortKey", "()Ljava/lang/String;", "updateActor", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "Lorg/videolan/vlc/viewmodels/Update;", "updateActor$annotations", "getUpdateActor", "()Lkotlinx/coroutines/experimental/channels/SendChannel;", "updateActor$delegate", "addMedia", "", "media", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "mediaList", "(Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "canSortByAlbum", "canSortByArtist", "canSortByDuration", "canSortByFileNameName", "canSortByFileSize", "canSortByInsertionDate", "canSortByLastModified", "canSortByName", "canSortByPlayCount", "canSortByReleaseDate", "fetch", "query", "getKey", "refresh", "remove", "mw", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)Z", "removeMedia", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "restore", "updateItems", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "vlc-android_vanillaARMv7Debug"})
public abstract class BaseModel<T extends org.videolan.medialibrary.media.MediaLibraryItem> extends android.arch.lifecycle.ViewModel implements org.videolan.vlc.util.RefreshModel {
    private int sort;
    private boolean desc;
    private boolean filtering;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    private final kotlin.Lazy filter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dataset$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy categories$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sections$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy updateActor$delegate = null;
    
    public final int getSort() {
        return 0;
    }
    
    public final void setSort(int p0) {
    }
    
    public final boolean getDesc() {
        return false;
    }
    
    public final void setDesc(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getSortKey() {
        return null;
    }
    
    public boolean canSortByName() {
        return false;
    }
    
    public boolean canSortByFileNameName() {
        return false;
    }
    
    public boolean canSortByDuration() {
        return false;
    }
    
    public boolean canSortByInsertionDate() {
        return false;
    }
    
    public boolean canSortByLastModified() {
        return false;
    }
    
    public boolean canSortByReleaseDate() {
        return false;
    }
    
    public boolean canSortByFileSize() {
        return false;
    }
    
    public boolean canSortByArtist() {
        return false;
    }
    
    public boolean canSortByAlbum() {
        return false;
    }
    
    public boolean canSortByPlayCount() {
        return false;
    }
    
    private final org.videolan.vlc.util.FilterDelegate<T> getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.util.LiveDataset<T> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MediatorLiveData<java.util.Map<java.lang.String, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MediatorLiveData<java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> getSections() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    protected static void updateActor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.experimental.channels.SendChannel<org.videolan.vlc.viewmodels.Update> getUpdateActor() {
        return null;
    }
    
    @java.lang.Override()
    public boolean refresh() {
        return false;
    }
    
    public void sort(int sort) {
    }
    
    public final boolean remove(@org.jetbrains.annotations.NotNull()
    T mw) {
        return false;
    }
    
    public final void filter(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void restore() {
    }
    
    protected void removeMedia(@org.jetbrains.annotations.NotNull()
    T media) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object addMedia(@org.jetbrains.annotations.NotNull()
    T p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addMedia(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object updateItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    protected abstract void fetch();
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public BaseModel() {
        super();
    }
}