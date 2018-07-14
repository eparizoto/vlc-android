package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaylistActivityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.main_toolbar, 4);
        sViewsWithIds.put(R.id.container_list, 5);
        sViewsWithIds.put(R.id.songs, 6);
        sViewsWithIds.put(R.id.fab, 7);
    }
    // views
    @NonNull
    public final android.support.design.widget.AppBarLayout appbar;
    @NonNull
    public final android.support.design.widget.CollapsingToolbarLayout collapsingToolbar;
    @NonNull
    public final android.widget.FrameLayout containerList;
    @NonNull
    public final android.support.design.widget.CoordinatorLayout coordinator;
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    public final android.support.v7.widget.Toolbar mainToolbar;
    @NonNull
    public final android.widget.ImageView playlistCover;
    @NonNull
    public final android.support.v7.widget.RecyclerView songs;
    // variables
    @Nullable
    private android.graphics.drawable.BitmapDrawable mCover;
    @Nullable
    private org.videolan.medialibrary.media.MediaLibraryItem mPlaylist;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlaylistActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.appbar = (android.support.design.widget.AppBarLayout) bindings[3];
        this.collapsingToolbar = (android.support.design.widget.CollapsingToolbarLayout) bindings[1];
        this.collapsingToolbar.setTag(null);
        this.containerList = (android.widget.FrameLayout) bindings[5];
        this.coordinator = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.coordinator.setTag(null);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[7];
        this.mainToolbar = (android.support.v7.widget.Toolbar) bindings[4];
        this.playlistCover = (android.widget.ImageView) bindings[2];
        this.playlistCover.setTag(null);
        this.songs = (android.support.v7.widget.RecyclerView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.playlist == variableId) {
            setPlaylist((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    @Nullable
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
    }
    public void setPlaylist(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Playlist) {
        this.mPlaylist = Playlist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.playlist);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.medialibrary.media.MediaLibraryItem getPlaylist() {
        return mPlaylist;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String playlistTitle = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        org.videolan.medialibrary.media.MediaLibraryItem playlist = mPlaylist;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (playlist != null) {
                    // read playlist.title
                    playlistTitle = playlist.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.collapsingToolbar.setTitle(playlistTitle);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playlistCover, cover);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static PlaylistActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlaylistActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PlaylistActivityBinding>inflate(inflater, org.videolan.vlc.R.layout.playlist_activity, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static PlaylistActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlaylistActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.playlist_activity, null, false), bindingComponent);
    }
    @NonNull
    public static PlaylistActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlaylistActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/playlist_activity_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PlaylistActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): cover
        flag 1 (0x2L): playlist
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}