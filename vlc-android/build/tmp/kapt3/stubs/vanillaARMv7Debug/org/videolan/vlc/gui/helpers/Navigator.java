package org.videolan.vlc.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0002J\u0006\u0010#\u001a\u00020$J4\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$J\u0010\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0014H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0014H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0014H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020 H\u0007J\u0006\u00105\u001a\u00020 J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0002J.\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00142\b\b\u0002\u0010;\u001a\u00020\u001d2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001dH\u0002J\u000e\u00109\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0014J\u001a\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020\u001d2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0019\u001a\u00020\u00148\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/videolan/vlc/gui/helpers/Navigator;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Lorg/videolan/vlc/gui/MainActivity;", "settings", "Landroid/content/SharedPreferences;", "extensionsService", "Lorg/videolan/vlc/extensions/ExtensionManagerService;", "state", "Landroid/os/Bundle;", "(Lorg/videolan/vlc/gui/MainActivity;Landroid/content/SharedPreferences;Lorg/videolan/vlc/extensions/ExtensionManagerService;Landroid/os/Bundle;)V", "<set-?>", "Landroid/support/v4/app/Fragment;", "currentFragment", "getCurrentFragment", "()Landroid/support/v4/app/Fragment;", "setCurrentFragment", "(Landroid/support/v4/app/Fragment;)V", "currentFragmentId", "", "getCurrentFragmentId", "()I", "setCurrentFragmentId", "(I)V", "defaultFragmentId", "getDefaultFragmentId", "fragmentsStack", "Landroid/support/v4/util/SimpleArrayMap;", "", "Ljava/lang/ref/WeakReference;", "clearBackstackFromClass", "", "clazz", "Ljava/lang/Class;", "currentIdIsExtension", "", "displayExtensionItems", "extensionId", "title", "items", "", "Lorg/videolan/vlc/extensions/api/VLCExtensionItem;", "showParams", "refresh", "getNewFragment", "id", "getTag", "idIsExtension", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "reloadPreferences", "restoreFragmentsStack", "fm", "Landroid/support/v4/app/FragmentManager;", "showFragment", "fragment", "tag", "backTag", "showSecondaryFragment", "fragmentTag", "param", "vlc-android_vanillaARMv7Debug"})
public final class Navigator implements android.support.design.widget.NavigationView.OnNavigationItemSelectedListener, android.arch.lifecycle.LifecycleObserver {
    private final android.support.v4.util.SimpleArrayMap<java.lang.String, java.lang.ref.WeakReference<android.support.v4.app.Fragment>> fragmentsStack = null;
    private int currentFragmentId;
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.app.Fragment currentFragment;
    private final org.videolan.vlc.gui.MainActivity activity = null;
    private final android.content.SharedPreferences settings = null;
    private final org.videolan.vlc.extensions.ExtensionManagerService extensionsService = null;
    
    private final int getDefaultFragmentId() {
        return 0;
    }
    
    public final int getCurrentFragmentId() {
        return 0;
    }
    
    public final void setCurrentFragmentId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v4.app.Fragment getCurrentFragment() {
        return null;
    }
    
    private final void setCurrentFragment(android.support.v4.app.Fragment p0) {
    }
    
    private final android.support.v4.app.Fragment getNewFragment(int id) {
        return null;
    }
    
    public final void showFragment(int id) {
    }
    
    private final void showFragment(android.support.v4.app.Fragment fragment, int id, java.lang.String tag, java.lang.String backTag) {
    }
    
    private final void restoreFragmentsStack(android.support.v4.app.FragmentManager fm) {
    }
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_START)
    public final void onStart() {
    }
    
    /**
     * * Show a secondary fragment.
     */
    public final void showSecondaryFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fragmentTag, @org.jetbrains.annotations.Nullable()
    java.lang.String param) {
    }
    
    public final boolean currentIdIsExtension() {
        return false;
    }
    
    private final boolean idIsExtension(int id) {
        return false;
    }
    
    private final void clearBackstackFromClass(java.lang.Class<?> clazz) {
    }
    
    public final void reloadPreferences() {
    }
    
    private final java.lang.String getTag(int id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void displayExtensionItems(int extensionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.vlc.extensions.api.VLCExtensionItem> items, boolean showParams, boolean refresh) {
    }
    
    public Navigator(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.MainActivity activity, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences settings, @org.jetbrains.annotations.Nullable()
    org.videolan.vlc.extensions.ExtensionManagerService extensionsService, @org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
        super();
    }
}