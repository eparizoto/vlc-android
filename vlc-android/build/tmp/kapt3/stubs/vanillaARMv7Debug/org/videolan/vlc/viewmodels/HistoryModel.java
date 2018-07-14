package org.videolan.vlc.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002J\u0011\u0010\u000b\u001a\u00020\u0007H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\r"}, d2 = {"Lorg/videolan/vlc/viewmodels/HistoryModel;", "Lorg/videolan/vlc/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaWrapper;", "()V", "canSortByName", "", "clear", "", "fetch", "moveUp", "media", "updateList", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "vlc-android_vanillaARMv7Debug"})
public final class HistoryModel extends org.videolan.vlc.viewmodels.BaseModel<org.videolan.medialibrary.media.MediaWrapper> {
    
    @java.lang.Override()
    public boolean canSortByName() {
        return false;
    }
    
    @java.lang.Override()
    protected void fetch() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void moveUp(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void clear() {
    }
    
    public HistoryModel() {
        super();
    }
}