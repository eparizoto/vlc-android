package org.videolan.vlc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018*\u0001\u001b\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002_`B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0002J\u0018\u00108\u001a\u0002062\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020$H\u0002J\u0010\u0010<\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0002J\u0010\u0010=\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0002J\b\u0010>\u001a\u000206H\u0002J\b\u0010?\u001a\u000206H\u0002J\u0011\u0010@\u001a\u000206H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ(\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020$2\u0006\u00109\u001a\u00020:2\u0006\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020$H\u0002J\u0012\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u000206H\u0016J\b\u0010K\u001a\u000206H\u0016J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010N\u001a\u0002062\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010O\u001a\u0002062\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010P\u001a\u0002062\u0006\u0010Q\u001a\u00020\u0012H\u0016J\u0010\u0010R\u001a\u0002062\u0006\u0010M\u001a\u00020\tH\u0016J\u0010\u0010S\u001a\u0002062\u0006\u0010M\u001a\u00020\tH\u0016J\"\u0010T\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0012H\u0016J\u0012\u0010\u001d\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010W\u001a\u0002062\u0006\u0010E\u001a\u00020$2\u0006\u0010C\u001a\u00020$H\u0002J\u0011\u0010X\u001a\u000206H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ\u0018\u0010Y\u001a\u0002062\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\tH\u0002J\u0010\u0010[\u001a\u0002062\u0006\u0010\\\u001a\u00020\tH\u0002J\u0018\u0010]\u001a\u0002062\u0006\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020$H\u0002J\b\u0010^\u001a\u00020\u0018H\u0002R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00060\u001fj\u0002` X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020$X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020$8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R#\u0010+\u001a\n -*\u0004\u0018\u00010,0,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b.\u0010/R\u0012\u00101\u001a\u000602R\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006a"}, d2 = {"Lorg/videolan/vlc/MediaParsingService;", "Landroid/app/Service;", "Lorg/videolan/medialibrary/interfaces/DevicesDiscoveryCb;", "()V", "binder", "Lorg/videolan/vlc/MediaParsingService$LocalBinder;", "callsCtx", "Lkotlinx/coroutines/experimental/ThreadPoolDispatcher;", "currentDiscovery", "", "lastNotificationTime", "", "localBroadcastManager", "Landroid/support/v4/content/LocalBroadcastManager;", "medialibrary", "Lorg/videolan/medialibrary/Medialibrary;", "notificationActor", "Lkotlinx/coroutines/experimental/channels/SendChannel;", "", "getNotificationActor", "()Lkotlinx/coroutines/experimental/channels/SendChannel;", "notificationActor$delegate", "Lkotlin/Lazy;", "notificationJob", "Lkotlinx/coroutines/experimental/Job;", "parsing", "receiver", "org/videolan/vlc/MediaParsingService$receiver$1", "Lorg/videolan/vlc/MediaParsingService$receiver$1;", "reload", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getSb$vlc_android_vanillaARMv7Debug", "()Ljava/lang/StringBuilder;", "scanActivated", "", "scanPaused", "getScanPaused$vlc_android_vanillaARMv7Debug", "()Z", "setScanPaused$vlc_android_vanillaARMv7Debug", "(Z)V", "serviceLock", "settings", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSettings", "()Landroid/content/SharedPreferences;", "settings$delegate", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wasWorking", "addDeviceIfNeeded", "", "path", "addDevices", "context", "Landroid/content/Context;", "addExternal", "discover", "discoverStorage", "exitCommand", "forceForeground", "hideNotification", "(Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "initMedialib", "parse", "shouldInit", "upgrade", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onDiscoveryCompleted", "entryPoint", "onDiscoveryProgress", "onDiscoveryStarted", "onParsingStatsUpdated", "percent", "onReloadCompleted", "onReloadStarted", "onStartCommand", "flags", "startId", "setupMedialibrary", "showNotification", "showProgress", "discovery", "showStorageNotification", "device", "startScan", "updateStorages", "Companion", "LocalBinder", "vlc-android_vanillaARMv7Debug"})
public final class MediaParsingService extends android.app.Service implements org.videolan.medialibrary.interfaces.DevicesDiscoveryCb {
    private android.os.PowerManager.WakeLock wakeLock;
    private android.support.v4.content.LocalBroadcastManager localBroadcastManager;
    private final org.videolan.vlc.MediaParsingService.LocalBinder binder = null;
    private org.videolan.medialibrary.Medialibrary medialibrary;
    private int parsing;
    private int reload;
    private java.lang.String currentDiscovery;
    private long lastNotificationTime;
    private kotlinx.coroutines.experimental.Job notificationJob;
    private boolean scanActivated;
    private final kotlinx.coroutines.experimental.ThreadPoolDispatcher callsCtx = null;
    private final kotlin.Lazy settings$delegate = null;
    private boolean scanPaused;
    private final android.content.BroadcastReceiver receiver = null;
    private volatile boolean serviceLock;
    private boolean wasWorking;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.StringBuilder sb = null;
    private final kotlin.Lazy notificationActor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.lifecycle.MutableLiveData<org.videolan.vlc.ScanProgress> progress = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> started = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.arch.lifecycle.MutableLiveData<java.util.List<java.lang.String>> newStorages = null;
    private static boolean wizardShowing;
    public static final org.videolan.vlc.MediaParsingService.Companion Companion = null;
    
    private final android.content.SharedPreferences getSettings() {
        return null;
    }
    
    public final boolean getScanPaused$vlc_android_vanillaARMv7Debug() {
        return false;
    }
    
    public final void setScanPaused$vlc_android_vanillaARMv7Debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder getSb$vlc_android_vanillaARMv7Debug() {
        return null;
    }
    
    private final kotlinx.coroutines.experimental.channels.SendChannel<java.lang.Integer> getNotificationActor() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void forceForeground() {
    }
    
    private final void discoverStorage(java.lang.String path) {
    }
    
    private final void discover(java.lang.String path) {
    }
    
    private final void addDeviceIfNeeded(java.lang.String path) {
    }
    
    private final void reload(java.lang.String path) {
    }
    
    private final void setupMedialibrary(boolean upgrade, boolean parse) {
    }
    
    private final void initMedialib(boolean parse, android.content.Context context, boolean shouldInit, boolean upgrade) {
    }
    
    private final void addDevices(android.content.Context context, boolean addExternal) {
    }
    
    private final void startScan(boolean shouldInit, boolean upgrade) {
    }
    
    private final void showStorageNotification(java.lang.String device) {
    }
    
    private final kotlinx.coroutines.experimental.Job updateStorages() {
        return null;
    }
    
    @java.lang.Override()
    public void onDiscoveryStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    @java.lang.Override()
    public void onDiscoveryProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    @java.lang.Override()
    public void onDiscoveryCompleted(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    @java.lang.Override()
    public void onParsingStatsUpdated(int percent) {
    }
    
    @java.lang.Override()
    public void onReloadStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    @java.lang.Override()
    public void onReloadCompleted(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    private final void exitCommand() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showProgress(int parsing, java.lang.String discovery) {
    }
    
    public MediaParsingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/videolan/vlc/MediaParsingService$LocalBinder;", "Landroid/os/Binder;", "(Lorg/videolan/vlc/MediaParsingService;)V", "vlc-android_vanillaARMv7Debug"})
    final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lorg/videolan/vlc/MediaParsingService$Companion;", "", "()V", "newStorages", "Landroid/arch/lifecycle/MutableLiveData;", "", "", "getNewStorages", "()Landroid/arch/lifecycle/MutableLiveData;", "progress", "Lorg/videolan/vlc/ScanProgress;", "getProgress", "started", "", "getStarted", "wizardShowing", "getWizardShowing", "()Z", "setWizardShowing", "(Z)V", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.lifecycle.MutableLiveData<org.videolan.vlc.ScanProgress> getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getStarted() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.arch.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getNewStorages() {
            return null;
        }
        
        public final boolean getWizardShowing() {
            return false;
        }
        
        public final void setWizardShowing(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}