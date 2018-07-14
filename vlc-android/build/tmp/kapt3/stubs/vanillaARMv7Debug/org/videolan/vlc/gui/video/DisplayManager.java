package org.videolan.vlc.gui.video;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u0003012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\n\u0010(\u001a\u0004\u0018\u00010\u001aH\u0003J\b\u0010)\u001a\u00020\tH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005H\u0007J\u0006\u0010-\u001a\u00020+J\b\u0010.\u001a\u00020+H\u0003J\b\u0010/\u001a\u00020+H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u0016\u001a\u0004\b%\u0010&\u00a8\u00063"}, d2 = {"Lorg/videolan/vlc/gui/video/DisplayManager;", "", "activity", "Landroid/app/Activity;", "cloneMode", "", "benchmark", "(Landroid/app/Activity;ZZ)V", "displayType", "Lorg/videolan/vlc/gui/video/DisplayManager$DisplayType;", "getDisplayType", "()Lorg/videolan/vlc/gui/video/DisplayManager$DisplayType;", "isOnRenderer", "()Z", "isPrimary", "mOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "mediaRouter", "Landroid/media/MediaRouter;", "getMediaRouter", "()Landroid/media/MediaRouter;", "mediaRouter$delegate", "Lkotlin/Lazy;", "mediaRouterCallback", "Landroid/media/MediaRouter$SimpleCallback;", "presentation", "Lorg/videolan/vlc/gui/video/DisplayManager$SecondaryDisplay;", "getPresentation", "()Lorg/videolan/vlc/gui/video/DisplayManager$SecondaryDisplay;", "setPresentation", "(Lorg/videolan/vlc/gui/video/DisplayManager$SecondaryDisplay;)V", "presentationDisplayId", "", "rendererItem", "Lorg/videolan/libvlc/RendererItem;", "rendererObs", "Landroid/arch/lifecycle/Observer;", "getRendererObs", "()Landroid/arch/lifecycle/Observer;", "rendererObs$delegate", "createPresentation", "getCurrentType", "mediaRouterAddCallback", "", "add", "release", "removePresentation", "updateDisplayType", "Companion", "DisplayType", "SecondaryDisplay", "vlc-android_vanillaARMv7Debug"})
public final class DisplayManager {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.vlc.gui.video.DisplayManager.DisplayType displayType = null;
    private final kotlin.Lazy mediaRouter$delegate = null;
    private android.media.MediaRouter.SimpleCallback mediaRouterCallback;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.vlc.gui.video.DisplayManager.SecondaryDisplay presentation;
    private int presentationDisplayId;
    private org.videolan.libvlc.RendererItem rendererItem;
    
    /**
     * * Listens for when presentations are dismissed.
     */
    private final android.content.DialogInterface.OnDismissListener mOnDismissListener = null;
    private final kotlin.Lazy rendererObs$delegate = null;
    private final android.app.Activity activity = null;
    private static final java.lang.String TAG = "VLC/DisplayManager";
    public static final org.videolan.vlc.gui.video.DisplayManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.gui.video.DisplayManager.DisplayType getDisplayType() {
        return null;
    }
    
    private final android.media.MediaRouter getMediaRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.vlc.gui.video.DisplayManager.SecondaryDisplay getPresentation() {
        return null;
    }
    
    public final void setPresentation(@org.jetbrains.annotations.Nullable()
    org.videolan.vlc.gui.video.DisplayManager.SecondaryDisplay p0) {
    }
    
    public final boolean isPrimary() {
        return false;
    }
    
    public final boolean isOnRenderer() {
        return false;
    }
    
    private final android.arch.lifecycle.Observer<org.videolan.libvlc.RendererItem> getRendererObs() {
        return null;
    }
    
    public final void release() {
    }
    
    private final void updateDisplayType() {
    }
    
    private final org.videolan.vlc.gui.video.DisplayManager.DisplayType getCurrentType() {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final org.videolan.vlc.gui.video.DisplayManager.SecondaryDisplay createPresentation() {
        return null;
    }
    
    /**
     * * Add or remove MediaRouter callbacks. This is provided for version targeting.
     *     *
     *     * @param add true to add, false to remove
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    public final void mediaRouterAddCallback(boolean add) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void removePresentation() {
    }
    
    public DisplayManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean cloneMode, boolean benchmark) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/videolan/vlc/gui/video/DisplayManager$DisplayType;", "", "(Ljava/lang/String;I)V", "PRIMARY", "PRESENTATION", "RENDERER", "vlc-android_vanillaARMv7Debug"})
    public static enum DisplayType {
        /*public static final*/ PRIMARY /* = new PRIMARY() */,
        /*public static final*/ PRESENTATION /* = new PRESENTATION() */,
        /*public static final*/ RENDERER /* = new RENDERER() */;
        
        DisplayType() {
        }
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lorg/videolan/vlc/gui/video/DisplayManager$SecondaryDisplay;", "Landroid/app/Presentation;", "context", "Landroid/content/Context;", "display", "Landroid/view/Display;", "(Landroid/content/Context;Landroid/view/Display;)V", "subtitlesSurfaceView", "Landroid/view/SurfaceView;", "getSubtitlesSurfaceView", "()Landroid/view/SurfaceView;", "setSubtitlesSurfaceView", "(Landroid/view/SurfaceView;)V", "surfaceFrame", "Landroid/widget/FrameLayout;", "getSurfaceFrame", "()Landroid/widget/FrameLayout;", "setSurfaceFrame", "(Landroid/widget/FrameLayout;)V", "surfaceView", "getSurfaceView", "setSurfaceView", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "vlc-android_vanillaARMv7Debug"})
    public static final class SecondaryDisplay extends android.app.Presentation {
        @org.jetbrains.annotations.NotNull()
        public android.view.SurfaceView surfaceView;
        @org.jetbrains.annotations.NotNull()
        public android.view.SurfaceView subtitlesSurfaceView;
        @org.jetbrains.annotations.NotNull()
        public android.widget.FrameLayout surfaceFrame;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String TAG = "VLC/SecondaryDisplay";
        public static final org.videolan.vlc.gui.video.DisplayManager.SecondaryDisplay.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.SurfaceView getSurfaceView() {
            return null;
        }
        
        public final void setSurfaceView(@org.jetbrains.annotations.NotNull()
        android.view.SurfaceView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.SurfaceView getSubtitlesSurfaceView() {
            return null;
        }
        
        public final void setSubtitlesSurfaceView(@org.jetbrains.annotations.NotNull()
        android.view.SurfaceView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getSurfaceFrame() {
            return null;
        }
        
        public final void setSurfaceFrame(@org.jetbrains.annotations.NotNull()
        android.widget.FrameLayout p0) {
        }
        
        @java.lang.Override()
        protected void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        public SecondaryDisplay(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.Display display) {
            super(null, null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/videolan/vlc/gui/video/DisplayManager$SecondaryDisplay$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "vlc-android_vanillaARMv7Debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTAG() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/videolan/vlc/gui/video/DisplayManager$Companion;", "", "()V", "TAG", "", "vlc-android_vanillaARMv7Debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}