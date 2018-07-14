package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TvSimpleListItemBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.TextView artist;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView title;
    // variables
    @Nullable
    private int mBgColor;
    @Nullable
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TvSimpleListItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.artist = (android.widget.TextView) bindings[2];
        this.artist.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title = (android.widget.TextView) bindings[1];
        this.title.setTag(null);
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
        if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.media == variableId) {
            setMedia((org.videolan.medialibrary.media.MediaWrapper) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public int getBgColor() {
        return mBgColor;
    }
    public void setMedia(@Nullable org.videolan.medialibrary.media.MediaWrapper Media) {
        this.mMedia = Media;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.medialibrary.media.MediaWrapper getMedia() {
        return mMedia;
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
        java.lang.String mediaUtilsINSTANCEGetMediaArtistContextMedia = null;
        int bgColor = mBgColor;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        java.lang.String mediaUtilsINSTANCEGetMediaTitleMedia = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read MediaUtils.INSTANCE.getMediaArtist(context, media)
                mediaUtilsINSTANCEGetMediaArtistContextMedia = org.videolan.vlc.media.MediaUtils.INSTANCE.getMediaArtist(getRoot().getContext(), media);
                // read MediaUtils.INSTANCE.getMediaTitle(media)
                mediaUtilsINSTANCEGetMediaTitleMedia = org.videolan.vlc.media.MediaUtils.INSTANCE.getMediaTitle(media);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.artist, mediaUtilsINSTANCEGetMediaArtistContextMedia);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, mediaUtilsINSTANCEGetMediaTitleMedia);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static TvSimpleListItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvSimpleListItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TvSimpleListItemBinding>inflate(inflater, org.videolan.vlc.R.layout.tv_simple_list_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TvSimpleListItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvSimpleListItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.tv_simple_list_item, null, false), bindingComponent);
    }
    @NonNull
    public static TvSimpleListItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvSimpleListItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/tv_simple_list_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TvSimpleListItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bgColor
        flag 1 (0x2L): media
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}