package org.videolan.vlc.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0017H\u0007J\b\u0010!\u001a\u00020\u001dH$J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0014J\u0016\u0010#\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007R0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007@BX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006%"}, d2 = {"Lorg/videolan/vlc/gui/DiffUtilAdapter;", "D", "VH", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "()V", "<set-?>", "", "dataset", "getDataset", "()Ljava/util/List;", "setDataset", "(Ljava/util/List;)V", "diffCallback", "Lorg/videolan/vlc/gui/DiffUtilAdapter$DiffCallback;", "getDiffCallback", "()Lorg/videolan/vlc/gui/DiffUtilAdapter$DiffCallback;", "diffCallback$delegate", "Lkotlin/Lazy;", "updateActor", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "createCB", "detectMoves", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "internalUpdate", "", "list", "(Ljava/util/List;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "isEmpty", "onUpdateFinished", "prepareList", "update", "DiffCallback", "vlc-android_vanillaARMv7Debug"})
public abstract class DiffUtilAdapter<D extends java.lang.Object, VH extends android.support.v7.widget.RecyclerView.ViewHolder> extends android.support.v7.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends D> dataset;
    private final kotlin.Lazy diffCallback$delegate = null;
    private final kotlinx.coroutines.experimental.channels.SendChannel<java.util.List<? extends D>> updateActor = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<D> getDataset() {
        return null;
    }
    
    private final void setDataset(java.util.List<? extends D> p0) {
    }
    
    private final org.videolan.vlc.gui.DiffUtilAdapter.DiffCallback<D> getDiffCallback() {
        return null;
    }
    
    protected abstract void onUpdateFinished();
    
    @android.support.annotation.MainThread()
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends D> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.util.List<D> prepareList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends D> list) {
        return null;
    }
    
    @android.support.annotation.MainThread()
    public final boolean isEmpty() {
        return false;
    }
    
    public D getItem(int position) {
        return null;
    }
    
    protected boolean detectMoves() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected org.videolan.vlc.gui.DiffUtilAdapter.DiffCallback<D> createCB() {
        return null;
    }
    
    public DiffUtilAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\"\u0010\u0015\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lorg/videolan/vlc/gui/DiffUtilAdapter$DiffCallback;", "D", "Landroid/support/v7/util/DiffUtil$Callback;", "()V", "newList", "", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "oldList", "getOldList", "setOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "update", "", "vlc-android_vanillaARMv7Debug"})
    public static class DiffCallback<D extends java.lang.Object> extends android.support.v7.util.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull()
        public java.util.List<? extends D> oldList;
        @org.jetbrains.annotations.NotNull()
        public java.util.List<? extends D> newList;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<D> getOldList() {
            return null;
        }
        
        public final void setOldList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<D> getNewList() {
            return null;
        }
        
        public final void setNewList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> p0) {
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> newList) {
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
}