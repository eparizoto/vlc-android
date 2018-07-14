package org.videolan.vlc.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007\u001a)\u0010\u0017\u001a\n \u0002*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u001a$\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0007\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006 "}, d2 = {"sBitmapCache", "Lorg/videolan/vlc/gui/helpers/BitmapCache;", "kotlin.jvm.PlatformType", "sMedialibrary", "Lorg/videolan/medialibrary/Medialibrary;", "downloadIcon", "", "v", "Landroid/view/View;", "imageUri", "Landroid/net/Uri;", "findInLibrary", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "item", "isMedia", "", "isGroup", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;ZZLkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "getImage", "binding", "Landroid/databinding/ViewDataBinding;", "(Landroid/view/View;Lorg/videolan/medialibrary/media/MediaLibraryItem;Landroid/databinding/ViewDataBinding;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "loadImage", "obtainBitmap", "Landroid/graphics/Bitmap;", "width", "", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;ILkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "updateImageView", "bitmap", "target", "vdb", "vlc-android_vanillaARMv7Debug"})
public final class ImageLoaderKt {
    private static final org.videolan.vlc.gui.helpers.BitmapCache sBitmapCache = null;
    private static final org.videolan.medialibrary.Medialibrary sMedialibrary = null;
    
    @android.support.annotation.MainThread()
    @android.databinding.BindingAdapter(value = {"media"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @android.databinding.BindingAdapter(value = {"imageUri"})
    public static final void downloadIcon(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
    }
    
    @android.support.annotation.MainThread()
    public static final void updateImageView(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.Nullable()
    android.databinding.ViewDataBinding vdb) {
    }
}