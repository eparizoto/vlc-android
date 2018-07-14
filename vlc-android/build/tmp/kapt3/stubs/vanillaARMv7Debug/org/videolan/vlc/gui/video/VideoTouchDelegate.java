package org.videolan.vlc.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0002\u0012\u001f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0015H\u0002J \u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\tH\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u0015H\u0002J\u0010\u00105\u001a\u00020)2\u0006\u00104\u001a\u00020\u0015H\u0002J\b\u00106\u001a\u00020)H\u0002J\u0006\u00107\u001a\u00020\tJ\u000e\u00108\u001a\u00020\t2\u0006\u0010+\u001a\u00020,R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00069"}, d2 = {"Lorg/videolan/vlc/gui/video/VideoTouchDelegate;", "", "player", "Lorg/videolan/vlc/gui/video/VideoPlayerActivity;", "mTouchControls", "", "screenConfig", "Lorg/videolan/vlc/gui/video/ScreenConfig;", "rtl", "", "(Lorg/videolan/vlc/gui/video/VideoPlayerActivity;ILorg/videolan/vlc/gui/video/ScreenConfig;Z)V", "mDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "getMDetector", "()Landroid/support/v4/view/GestureDetectorCompat;", "mDetector$delegate", "Lkotlin/Lazy;", "mGestureListener", "org/videolan/vlc/gui/video/VideoTouchDelegate$mGestureListener$1", "Lorg/videolan/vlc/gui/video/VideoTouchDelegate$mGestureListener$1;", "mInitTouchY", "", "mIsFirstBrightnessGesture", "mLastMove", "", "mScaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "getMScaleGestureDetector", "()Landroid/view/ScaleGestureDetector;", "mScaleGestureDetector$delegate", "mScaleListener", "org/videolan/vlc/gui/video/VideoTouchDelegate$mScaleListener$1", "Lorg/videolan/vlc/gui/video/VideoTouchDelegate$mScaleListener$1;", "mTouchAction", "mTouchX", "mTouchY", "getScreenConfig", "()Lorg/videolan/vlc/gui/video/ScreenConfig;", "setScreenConfig", "(Lorg/videolan/vlc/gui/video/ScreenConfig;)V", "clearTouchAction", "", "dispatchGenericMotionEvent", "event", "Landroid/view/MotionEvent;", "doBrightnessTouch", "ychanged", "doSeekTouch", "coef", "gesturesize", "seek", "doVerticalTouchAction", "y_changed", "doVolumeTouch", "initBrightnessTouch", "isSeeking", "onTouchEvent", "vlc-android_vanillaARMv7Debug"})
public final class VideoTouchDelegate {
    private int mTouchAction;
    private float mInitTouchY;
    private float mTouchY;
    private float mTouchX;
    private long mLastMove;
    private final kotlin.Lazy mScaleGestureDetector$delegate = null;
    private final kotlin.Lazy mDetector$delegate = null;
    private boolean mIsFirstBrightnessGesture;
    private final android.view.ScaleGestureDetector.SimpleOnScaleGestureListener mScaleListener = null;
    private final android.view.GestureDetector.SimpleOnGestureListener mGestureListener = null;
    private final org.videolan.vlc.gui.video.VideoPlayerActivity player = null;
    private final int mTouchControls = 0;
    @org.jetbrains.annotations.NotNull()
    private org.videolan.vlc.gui.video.ScreenConfig screenConfig;
    private final boolean rtl = false;
    
    private final android.view.ScaleGestureDetector getMScaleGestureDetector() {
        return null;
    }
    
    private final android.support.v4.view.GestureDetectorCompat getMDetector() {
        return null;
    }
    
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final boolean dispatchGenericMotionEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final boolean isSeeking() {
        return false;
    }
    
    public final void clearTouchAction() {
    }
    
    private final void doVerticalTouchAction(float y_changed) {
    }
    
    private final void doSeekTouch(int coef, float gesturesize, boolean seek) {
    }
    
    private final void doVolumeTouch(float y_changed) {
    }
    
    private final void initBrightnessTouch() {
    }
    
    private final void doBrightnessTouch(float ychanged) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.vlc.gui.video.ScreenConfig getScreenConfig() {
        return null;
    }
    
    public final void setScreenConfig(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.video.ScreenConfig p0) {
    }
    
    public VideoTouchDelegate(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.video.VideoPlayerActivity player, int mTouchControls, @org.jetbrains.annotations.NotNull()
    org.videolan.vlc.gui.video.ScreenConfig screenConfig, boolean rtl) {
        super();
    }
}