package org.videolan.vlc.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003%&\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/videolan/vlc/gui/dialogs/RenderersDialog;", "Landroid/support/v4/app/DialogFragment;", "Lorg/videolan/vlc/PlaybackService$Client$Callback;", "()V", "mAdapter", "Lorg/videolan/vlc/gui/dialogs/RenderersDialog$RendererAdapter;", "mBinding", "error/NonExistentClass", "Lerror/NonExistentClass;", "mClickHandler", "Lorg/videolan/vlc/gui/dialogs/RenderersDialog$RendererClickhandler;", "mHelper", "Lorg/videolan/vlc/gui/PlaybackServiceActivity$Helper;", "mService", "Lorg/videolan/vlc/PlaybackService;", "renderers", "", "Lorg/videolan/libvlc/RendererItem;", "onConnected", "", "service", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDisconnected", "onStart", "onStop", "onViewCreated", "view", "Companion", "RendererAdapter", "RendererClickhandler", "vlc-android_vanillaARMv7Debug"})
public final class RenderersDialog extends android.support.v4.app.DialogFragment implements org.videolan.vlc.PlaybackService.Client.Callback {
    private java.util.List<org.videolan.libvlc.RendererItem> renderers;
    private error.NonExistentClass mBinding;
    private final org.videolan.vlc.gui.dialogs.RenderersDialog.RendererAdapter mAdapter = null;
    private final org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler mClickHandler = null;
    private org.videolan.vlc.gui.PlaybackServiceActivity.Helper mHelper;
    private org.videolan.vlc.PlaybackService mService;
    private static final java.lang.String TAG = "VLC/RenderersDialog";
    public static final org.videolan.vlc.gui.dialogs.RenderersDialog.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
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
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.PlaybackService service) {
    }
    
    @java.lang.Override()
    public void onDisconnected() {
    }
    
    public RenderersDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\tH\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/RenderersDialog$RendererAdapter;", "Lorg/videolan/vlc/gui/DiffUtilAdapter;", "Lorg/videolan/libvlc/RendererItem;", "Lorg/videolan/vlc/gui/helpers/SelectorViewHolder;", "error/NonExistentClass", "(Lorg/videolan/vlc/gui/dialogs/RenderersDialog;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUpdateFinished", "vlc-android_vanillaARMv7Debug"})
    final class RendererAdapter extends org.videolan.vlc.gui.DiffUtilAdapter<org.videolan.libvlc.RendererItem, org.videolan.vlc.gui.helpers.SelectorViewHolder<error.NonExistentClass>> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.videolan.vlc.gui.helpers.SelectorViewHolder<error.NonExistentClass> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.gui.helpers.SelectorViewHolder<error.NonExistentClass> holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        protected void onUpdateFinished() {
        }
        
        public RendererAdapter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/RenderersDialog$RendererClickhandler;", "", "(Lorg/videolan/vlc/gui/dialogs/RenderersDialog;)V", "connect", "", "item", "Lorg/videolan/libvlc/RendererItem;", "vlc-android_vanillaARMv7Debug"})
    public final class RendererClickhandler {
        
        public final void connect(@org.jetbrains.annotations.Nullable()
        org.videolan.libvlc.RendererItem item) {
        }
        
        public RendererClickhandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/videolan/vlc/gui/dialogs/RenderersDialog$Companion;", "", "()V", "TAG", "", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}