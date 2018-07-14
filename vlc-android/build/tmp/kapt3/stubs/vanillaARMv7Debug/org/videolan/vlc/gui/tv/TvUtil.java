package org.videolan.vlc.gui.tv;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J\u0016\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0007J\"\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u00012\b\u0010\"\u001a\u0004\u0018\u00010#J+\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020\u001cH\u0002\u00a2\u0006\u0002\u0010)J.\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\'0+j\b\u0012\u0004\u0012\u00020\'`,2\u0006\u0010(\u001a\u00020\u001cJ\u0016\u0010-\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\'J\u0016\u0010/\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u0002002\u0006\u00101\u001a\u00020\'J\u001c\u00102\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u00063"}, d2 = {"Lorg/videolan/vlc/gui/tv/TvUtil;", "", "()V", "TAG", "", "diffCallback", "Landroid/support/v17/leanback/widget/DiffCallback;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getDiffCallback", "()Landroid/support/v17/leanback/widget/DiffCallback;", "setDiffCallback", "(Landroid/support/v17/leanback/widget/DiffCallback;)V", "listDiffCallback", "Landroid/support/v17/leanback/widget/ListRow;", "getListDiffCallback", "applyOverscanMargin", "", "activity", "Landroid/app/Activity;", "browseFolder", "type", "", "uri", "Landroid/net/Uri;", "clearBackground", "bm", "Landroid/support/v17/leanback/app/BackgroundManager;", "getIconRes", "", "mediaLibraryItem", "openAudioCategory", "context", "openMedia", "item", "row", "Landroid/support/v17/leanback/widget/Row;", "playAudioList", "array", "", "Lorg/videolan/medialibrary/media/MediaWrapper;", "position", "(Landroid/app/Activity;[Lorg/videolan/medialibrary/media/MediaWrapper;I)V", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "playMedia", "media", "showMediaDetail", "Landroid/content/Context;", "mediaWrapper", "updateBackground", "vlc-android_vanillaARMv7Debug"})
public final class TvUtil {
    private static final java.lang.String TAG = "VLC/TvUtil";
    @org.jetbrains.annotations.NotNull()
    private static android.support.v17.leanback.widget.DiffCallback<org.videolan.medialibrary.media.MediaLibraryItem> diffCallback;
    @org.jetbrains.annotations.NotNull()
    private static final android.support.v17.leanback.widget.DiffCallback<android.support.v17.leanback.widget.ListRow> listDiffCallback = null;
    public static final org.videolan.vlc.gui.tv.TvUtil INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v17.leanback.widget.DiffCallback<org.videolan.medialibrary.media.MediaLibraryItem> getDiffCallback() {
        return null;
    }
    
    public final void setDiffCallback(@org.jetbrains.annotations.NotNull()
    android.support.v17.leanback.widget.DiffCallback<org.videolan.medialibrary.media.MediaLibraryItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v17.leanback.widget.DiffCallback<android.support.v17.leanback.widget.ListRow> getListDiffCallback() {
        return null;
    }
    
    public final void applyOverscanMargin(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void playMedia(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper media) {
    }
    
    public final void openMedia(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.widget.Row row) {
    }
    
    public final void showMediaDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaWrapper mediaWrapper) {
    }
    
    public final void browseFolder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, long type, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    private final void playAudioList(android.app.Activity activity, org.videolan.medialibrary.media.MediaWrapper[] array, int position) {
    }
    
    public final void playAudioList(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<org.videolan.medialibrary.media.MediaWrapper> list, int position) {
    }
    
    public final void openAudioCategory(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem mediaLibraryItem) {
    }
    
    @android.support.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    public final void updateBackground(@org.jetbrains.annotations.Nullable()
    android.support.v17.leanback.app.BackgroundManager bm, @org.jetbrains.annotations.Nullable()
    java.lang.Object item) {
    }
    
    private final void clearBackground(android.support.v17.leanback.app.BackgroundManager bm) {
    }
    
    public final int getIconRes(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem mediaLibraryItem) {
        return 0;
    }
    
    private TvUtil() {
        super();
    }
}