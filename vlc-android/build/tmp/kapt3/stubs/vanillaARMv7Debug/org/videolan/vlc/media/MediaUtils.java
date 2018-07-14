package org.videolan.vlc.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002;<B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eJ\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u001c\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000bJ*\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'H\u0007J\u0016\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000bJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'J%\u0010(\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u001a\u0010(\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010)\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020\u001eJ)\u0010+\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010,\u001a\u00020\u001e\u00a2\u0006\u0002\u0010-J2\u0010.\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010,\u001a\u00020\u001e2\b\b\u0002\u00100\u001a\u000201H\u0007J\u001a\u00102\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u001a\u00103\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u000e\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0013J\u000e\u00103\u001a\u0002052\u0006\u0010\u001d\u001a\u000206J\u001a\u00107\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u00104\u001a\u0004\u0018\u00010\u0016J\u001a\u00108\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u00104\u001a\u0004\u0018\u00010\u0013J\u000e\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lorg/videolan/vlc/media/MediaUtils;", "", "()V", "sSubtitlesDownloader", "Lorg/videolan/vlc/util/SubtitlesDownloader;", "appendMedia", "", "context", "Landroid/content/Context;", "array", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "(Landroid/content/Context;[Lorg/videolan/medialibrary/media/MediaWrapper;)V", "media", "", "deletePlaylist", "playlist", "Lorg/videolan/medialibrary/media/Playlist;", "getContentMediaUri", "Landroid/net/Uri;", "data", "getMediaAlbum", "", "ctx", "getMediaAlbumArtist", "getMediaArtist", "getMediaGenre", "getMediaReferenceArtist", "getMediaString", "id", "", "getMediaSubtitle", "getMediaTitle", "mediaWrapper", "getSubs", "activity", "Landroid/app/Activity;", "mediaList", "cb", "Lorg/videolan/vlc/util/SubtitlesDownloader$Callback;", "insertNext", "loadlastPlaylist", "type", "openArray", "position", "(Landroid/content/Context;[Lorg/videolan/medialibrary/media/MediaWrapper;I)V", "openList", "list", "shuffle", "", "openMedia", "openMediaNoUi", "uri", "Lkotlinx/coroutines/experimental/Job;", "", "openStream", "openUri", "retrieveMediaTitle", "mw", "BaseCallBack", "DialogCallback", "vlc-android_vanillaARMv7Debug"})
public final class MediaUtils {
    private static org.videolan.vlc.util.SubtitlesDownloader sSubtitlesDownloader;
    public static final org.videolan.vlc.media.MediaUtils INSTANCE = null;
    
    public final void getSubs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> mediaList, @org.jetbrains.annotations.Nullable()
    org.videolan.vlc.util.SubtitlesDownloader.Callback cb) {
    }
    
    public final void getSubs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> mediaList) {
    }
    
    public final void loadlastPlaylist(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int type) {
    }
    
    public final void getSubs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media, @org.jetbrains.annotations.NotNull()
    org.videolan.vlc.util.SubtitlesDownloader.Callback cb) {
    }
    
    public final void getSubs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void appendMedia(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> media) {
    }
    
    public final void appendMedia(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void appendMedia(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper[] array) {
    }
    
    public final void insertNext(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper[] media) {
    }
    
    public final void insertNext(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void openMedia(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.experimental.Job openMediaNoUi(long id) {
        return null;
    }
    
    public final void openMediaNoUi(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void openMediaNoUi(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void openArray(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper[] array, int position) {
    }
    
    public final void openList(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> list, int position, boolean shuffle) {
    }
    
    public final void openList(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaWrapper> list, int position) {
    }
    
    public final void openUri(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    public final void openStream(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaArtist(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaReferenceArtist(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaAlbumArtist(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaAlbum(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaGenre(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaSubtitle(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaTitle(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mediaWrapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getContentMediaUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri data) {
        return null;
    }
    
    private final java.lang.String getMediaString(android.content.Context ctx, int id) {
        return null;
    }
    
    public final void retrieveMediaTitle(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mw) {
    }
    
    public final void deletePlaylist(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.Playlist playlist) {
    }
    
    private MediaUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0007\b\u0014\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lorg/videolan/vlc/media/MediaUtils$BaseCallBack;", "Lorg/videolan/vlc/PlaybackService$Client$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "()V", "mClient", "Lorg/videolan/vlc/PlaybackService$Client;", "getMClient", "()Lorg/videolan/vlc/PlaybackService$Client;", "setMClient", "(Lorg/videolan/vlc/PlaybackService$Client;)V", "onDisconnected", "", "vlc-android_vanillaARMv7Debug"})
    static abstract class BaseCallBack implements org.videolan.vlc.PlaybackService.Client.Callback {
        @org.jetbrains.annotations.NotNull()
        protected org.videolan.vlc.PlaybackService.Client mClient;
        
        @org.jetbrains.annotations.NotNull()
        protected final org.videolan.vlc.PlaybackService.Client getMClient() {
            return null;
        }
        
        protected final void setMClient(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.PlaybackService.Client p0) {
        }
        
        @java.lang.Override()
        public void onDisconnected() {
        }
        
        public BaseCallBack(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        protected BaseCallBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/videolan/vlc/media/MediaUtils$DialogCallback;", "Lorg/videolan/vlc/media/MediaUtils$BaseCallBack;", "context", "Landroid/content/Context;", "mRunnable", "Lorg/videolan/vlc/media/MediaUtils$DialogCallback$Runnable;", "(Landroid/content/Context;Lorg/videolan/vlc/media/MediaUtils$DialogCallback$Runnable;)V", "dialog", "Landroid/app/ProgressDialog;", "handler", "Landroid/os/Handler;", "onConnected", "", "service", "Lorg/videolan/vlc/PlaybackService;", "onDisconnected", "Runnable", "vlc-android_vanillaARMv7Debug"})
    static final class DialogCallback extends org.videolan.vlc.media.MediaUtils.BaseCallBack {
        private android.app.ProgressDialog dialog;
        private final android.os.Handler handler = null;
        private final org.videolan.vlc.media.MediaUtils.DialogCallback.Runnable mRunnable = null;
        
        @java.lang.Override()
        public void onConnected(@org.jetbrains.annotations.NotNull()
        org.videolan.vlc.PlaybackService service) {
        }
        
        @java.lang.Override()
        public void onDisconnected() {
        }
        
        public DialogCallback(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.videolan.vlc.media.MediaUtils.DialogCallback.Runnable mRunnable) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/videolan/vlc/media/MediaUtils$DialogCallback$Runnable;", "", "run", "", "service", "Lorg/videolan/vlc/PlaybackService;", "vlc-android_vanillaARMv7Debug"})
        public static abstract interface Runnable {
            
            public abstract void run(@org.jetbrains.annotations.NotNull()
            org.videolan.vlc.PlaybackService service);
        }
    }
}