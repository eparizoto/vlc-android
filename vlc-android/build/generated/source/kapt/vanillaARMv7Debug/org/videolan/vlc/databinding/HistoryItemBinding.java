package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryItemBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.ImageView icon;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView subtitle;
    @NonNull
    public final android.widget.TextView title;
    // variables
    @Nullable
    private int mBgColor;
    @Nullable
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    @Nullable
    private org.videolan.vlc.gui.HistoryAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public HistoryItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.icon = (android.widget.ImageView) bindings[1];
        this.icon.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subtitle = (android.widget.TextView) bindings[3];
        this.subtitle.setTag(null);
        this.title = (android.widget.TextView) bindings[2];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        else if (BR.holder == variableId) {
            setHolder((org.videolan.vlc.gui.HistoryAdapter.ViewHolder) variable);
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
    public void setHolder(@Nullable org.videolan.vlc.gui.HistoryAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.HistoryAdapter.ViewHolder getHolder() {
        return mHolder;
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
        java.lang.String mediaTitle = null;
        android.graphics.drawable.Drawable mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal = null;
        int mediaType = 0;
        int textUtilsIsEmptyMediaArtistViewGONEViewVISIBLE = 0;
        java.lang.String mediaArtist = null;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int bgColor = mBgColor;
        boolean textUtilsIsEmptyMediaArtist = false;
        boolean mediaTypeMediaWrapperTYPEVIDEO = false;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        org.videolan.vlc.gui.HistoryAdapter.ViewHolder holder = mHolder;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                    // read media.type
                    mediaType = media.getType();
                    // read media.artist
                    mediaArtist = media.getArtist();
                }


                // read media.type == MediaWrapper.TYPE_VIDEO
                mediaTypeMediaWrapperTYPEVIDEO = (mediaType) == (org.videolan.medialibrary.media.MediaWrapper.TYPE_VIDEO);
                // read TextUtils.isEmpty(media.artist)
                textUtilsIsEmptyMediaArtist = android.text.TextUtils.isEmpty(mediaArtist);
            if((dirtyFlags & 0xaL) != 0) {
                if(mediaTypeMediaWrapperTYPEVIDEO) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(textUtilsIsEmptyMediaArtist) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
                mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal = ((mediaTypeMediaWrapperTYPEVIDEO) ? (getDrawableFromResource(icon, R.drawable.ic_browser_video_normal)) : (getDrawableFromResource(icon, R.drawable.ic_browser_audio_normal)));
                // read TextUtils.isEmpty(media.artist) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyMediaArtistViewGONEViewVISIBLE = ((textUtilsIsEmptyMediaArtist) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icon, mediaTypeMediaWrapperTYPEVIDEOIconAndroidDrawableIcBrowserVideoNormalIconAndroidDrawableIcBrowserAudioNormal);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, mediaArtist);
            this.subtitle.setVisibility(textUtilsIsEmptyMediaArtistViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, mediaTitle);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.HistoryAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.HistoryAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static HistoryItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HistoryItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HistoryItemBinding>inflate(inflater, org.videolan.vlc.R.layout.history_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static HistoryItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HistoryItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.history_item, null, false), bindingComponent);
    }
    @NonNull
    public static HistoryItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HistoryItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/history_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HistoryItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bgColor
        flag 1 (0x2L): media
        flag 2 (0x3L): holder
        flag 3 (0x4L): null
        flag 4 (0x5L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 5 (0x6L): media.type == MediaWrapper.TYPE_VIDEO ? @android:drawable/ic_browser_video_normal : @android:drawable/ic_browser_audio_normal
        flag 6 (0x7L): TextUtils.isEmpty(media.artist) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): TextUtils.isEmpty(media.artist) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}