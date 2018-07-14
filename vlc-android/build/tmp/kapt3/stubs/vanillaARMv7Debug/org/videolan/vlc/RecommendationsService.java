package org.videolan.vlc;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/videolan/vlc/RecommendationsService;", "Landroid/app/IntentService;", "()V", "mNotificationManager", "Landroid/app/NotificationManager;", "buildPendingIntent", "Landroid/app/PendingIntent;", "mw", "Lorg/videolan/medialibrary/media/MediaWrapper;", "id", "", "buildRecommendation", "", "priority", "doRecommendations", "Lkotlinx/coroutines/experimental/Job;", "onCreate", "onHandleIntent", "intent", "Landroid/content/Intent;", "vlc-android_vanillaARMv7Debug"})
public final class RecommendationsService extends android.app.IntentService {
    private android.app.NotificationManager mNotificationManager;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void onHandleIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void buildRecommendation(org.videolan.medialibrary.media.MediaWrapper mw, int id, int priority) {
    }
    
    private final android.app.PendingIntent buildPendingIntent(org.videolan.medialibrary.media.MediaWrapper mw, int id) {
        return null;
    }
    
    private final kotlinx.coroutines.experimental.Job doRecommendations() {
        return null;
    }
    
    public RecommendationsService() {
        super(null);
    }
}