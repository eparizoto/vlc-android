package org.videolan.vlc.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/ContextSheet;", "Landroid/support/design/widget/BottomSheetDialogFragment;", "()V", "itemPosition", "", "options", "", "Lorg/videolan/vlc/gui/dialogs/CtxOption;", "receiver", "Lorg/videolan/vlc/gui/dialogs/CtxActionReceiver;", "getReceiver", "()Lorg/videolan/vlc/gui/dialogs/CtxActionReceiver;", "setReceiver", "(Lorg/videolan/vlc/gui/dialogs/CtxActionReceiver;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "populateOptions", "", "flags", "restoreReceiver", "ContextAdapter", "vlc-android_vanillaARMv7Debug"})
public final class ContextSheet extends android.support.design.widget.BottomSheetDialogFragment {
    private java.util.List<? extends org.videolan.vlc.gui.dialogs.CtxOption> options;
    @org.jetbrains.annotations.NotNull()
    public org.videolan.vlc.gui.dialogs.CtxActionReceiver receiver;
    private int itemPosition;
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.gui.dialogs.CtxActionReceiver getReceiver() {
        return null;
    }
    
    public final void setReceiver(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.dialogs.CtxActionReceiver p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void restoreReceiver(android.os.Bundle savedInstanceState) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.List<org.videolan.vlc.gui.dialogs.CtxOption> populateOptions(int flags) {
        return null;
    }
    
    public ContextSheet() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/ContextSheet$ContextAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lorg/videolan/vlc/gui/dialogs/ContextSheet$ContextAdapter$ViewHolder;", "Lorg/videolan/vlc/gui/dialogs/ContextSheet;", "(Lorg/videolan/vlc/gui/dialogs/ContextSheet;)V", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "vlc-android_vanillaARMv7Debug"})
    public final class ContextAdapter extends android.support.v7.widget.RecyclerView.Adapter<org.videolan.vlc.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder> {
        private final kotlin.Lazy inflater$delegate = null;
        
        private final android.view.LayoutInflater getInflater() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.videolan.vlc.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder holder, int position) {
        }
        
        public ContextAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/ContextSheet$ContextAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "error/NonExistentClass", "(Lorg/videolan/vlc/gui/dialogs/ContextSheet$ContextAdapter;Lerror/NonExistentClass;)V", "getBinding", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "vlc-android_vanillaARMv7Debug"})
        public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final error.NonExistentClass binding = null;
            
            @org.jetbrains.annotations.NotNull()
            public final error.NonExistentClass getBinding() {
                return null;
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            error.NonExistentClass binding) {
                super(null);
            }
        }
    }
}