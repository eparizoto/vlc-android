package org.videolan.vlc.gui.helpers.hf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0004J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lorg/videolan/vlc/gui/helpers/hf/BaseHeadlessFragment;", "Landroid/support/v4/app/Fragment;", "()V", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "getMActivity", "()Landroid/support/v4/app/FragmentActivity;", "setMActivity", "(Landroid/support/v4/app/FragmentActivity;)V", "exit", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "Companion", "vlc-android_vanillaARMv7Debug"})
public class BaseHeadlessFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.app.FragmentActivity mActivity;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.Runnable callback;
    public static final org.videolan.vlc.gui.helpers.hf.BaseHeadlessFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    protected final android.support.v4.app.FragmentActivity getMActivity() {
        return null;
    }
    
    protected final void setMActivity(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentActivity p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    protected final void exit() {
    }
    
    public BaseHeadlessFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/videolan/vlc/gui/helpers/hf/BaseHeadlessFragment$Companion;", "", "()V", "callback", "Ljava/lang/Runnable;", "getCallback$vlc_android_vanillaARMv7Debug", "()Ljava/lang/Runnable;", "setCallback$vlc_android_vanillaARMv7Debug", "(Ljava/lang/Runnable;)V", "executeCallback", "", "executeCallback$vlc_android_vanillaARMv7Debug", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Runnable getCallback$vlc_android_vanillaARMv7Debug() {
            return null;
        }
        
        public final void setCallback$vlc_android_vanillaARMv7Debug(@org.jetbrains.annotations.Nullable()
        java.lang.Runnable p0) {
        }
        
        public final void executeCallback$vlc_android_vanillaARMv7Debug() {
        }
        
        private Companion() {
            super();
        }
    }
}