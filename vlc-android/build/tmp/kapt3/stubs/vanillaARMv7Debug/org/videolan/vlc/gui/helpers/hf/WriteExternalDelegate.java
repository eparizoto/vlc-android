package org.videolan.vlc.gui.helpers.hf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002\u00a8\u0006\u0010"}, d2 = {"Lorg/videolan/vlc/gui/helpers/hf/WriteExternalDelegate;", "Lorg/videolan/vlc/gui/helpers/hf/BaseHeadlessFragment;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "showHelpDialog", "Companion", "vlc-android_vanillaARMv7Debug"})
public final class WriteExternalDelegate extends org.videolan.vlc.gui.helpers.hf.BaseHeadlessFragment {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/WriteExternal";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STORAGE_PATH = "VLC/storage_path";
    private static final int REQUEST_CODE_STORAGE_ACCES = 42;
    private static java.util.List<android.content.UriPermission> permissions;
    private static java.lang.String storage;
    public static final org.videolan.vlc.gui.helpers.hf.WriteExternalDelegate.Companion Companion = null;
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showDialog() {
    }
    
    private final void showHelpDialog() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public WriteExternalDelegate() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/videolan/vlc/gui/helpers/hf/WriteExternalDelegate$Companion;", "", "()V", "KEY_STORAGE_PATH", "", "REQUEST_CODE_STORAGE_ACCES", "", "TAG", "permissions", "", "Landroid/content/UriPermission;", "kotlin.jvm.PlatformType", "", "storage", "askForExtWrite", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "uri", "Landroid/net/Uri;", "cb", "Ljava/lang/Runnable;", "needsWritePermission", "", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        public final void askForExtWrite(@org.jetbrains.annotations.Nullable()
        android.support.v4.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.Runnable cb) {
        }
        
        public final boolean needsWritePermission(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}