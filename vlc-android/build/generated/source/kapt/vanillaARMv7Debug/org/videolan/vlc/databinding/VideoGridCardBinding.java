package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VideoGridCardBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.ImageView itemMore;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.ProgressBar mlItemProgress;
    @NonNull
    public final android.widget.ImageView mlItemSeen;
    @NonNull
    public final android.widget.ImageView mlItemThumbnail;
    @NonNull
    public final android.widget.TextView mlItemTime;
    @NonNull
    public final android.widget.TextView mlItemTitle;
    // variables
    @Nullable
    private android.graphics.drawable.BitmapDrawable mCover;
    @Nullable
    private long mSeen;
    @Nullable
    private android.widget.ImageView.ScaleType mScaleType;
    @Nullable
    private java.lang.String mTime;
    @Nullable
    private int mBgColor;
    @Nullable
    private org.videolan.medialibrary.media.MediaWrapper mMedia;
    @Nullable
    private int mMax;
    @Nullable
    private int mProgress;
    @Nullable
    private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public VideoGridCardBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.itemMore = (android.widget.ImageView) bindings[5];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mlItemProgress = (android.widget.ProgressBar) bindings[6];
        this.mlItemProgress.setTag(null);
        this.mlItemSeen = (android.widget.ImageView) bindings[2];
        this.mlItemSeen.setTag(null);
        this.mlItemThumbnail = (android.widget.ImageView) bindings[1];
        this.mlItemThumbnail.setTag(null);
        this.mlItemTime = (android.widget.TextView) bindings[4];
        this.mlItemTime.setTag(null);
        this.mlItemTitle = (android.widget.TextView) bindings[3];
        this.mlItemTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        else if (BR.seen == variableId) {
            setSeen((long) variable);
        }
        else if (BR.scaleType == variableId) {
            setScaleType((android.widget.ImageView.ScaleType) variable);
        }
        else if (BR.time == variableId) {
            setTime((java.lang.String) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.media == variableId) {
            setMedia((org.videolan.medialibrary.media.MediaWrapper) variable);
        }
        else if (BR.max == variableId) {
            setMax((int) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((int) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder) variable);
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
    public void setSeen(long Seen) {
        this.mSeen = Seen;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.seen);
        super.requestRebind();
    }
    public long getSeen() {
        return mSeen;
    }
    public void setScaleType(@Nullable android.widget.ImageView.ScaleType ScaleType) {
        this.mScaleType = ScaleType;
    }
    @Nullable
    public android.widget.ImageView.ScaleType getScaleType() {
        return mScaleType;
    }
    public void setTime(@Nullable java.lang.String Time) {
        this.mTime = Time;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.time);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getTime() {
        return mTime;
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.medialibrary.media.MediaWrapper getMedia() {
        return mMedia;
    }
    public void setMax(int Max) {
        this.mMax = Max;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.max);
        super.requestRebind();
    }
    public int getMax() {
        return mMax;
    }
    public void setProgress(int Progress) {
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public int getProgress() {
        return mProgress;
    }
    public void setHolder(@Nullable org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder getHolder() {
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
        int seenInt0LViewGONEViewVISIBLE = 0;
        java.lang.String mediaTitle = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean progressInt0 = false;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        long seen = mSeen;
        java.lang.String time = mTime;
        boolean seenInt0L = false;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int bgColor = mBgColor;
        org.videolan.medialibrary.media.MediaWrapper media = mMedia;
        int max = mMax;
        int progress = mProgress;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        int progressInt0ViewINVISIBLEViewVISIBLE = 0;
        org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder holder = mHolder;

        if ((dirtyFlags & 0x201L) != 0) {
        }
        if ((dirtyFlags & 0x202L) != 0) {



                // read seen == 0L
                seenInt0L = (seen) == (0L);
            if((dirtyFlags & 0x202L) != 0) {
                if(seenInt0L) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read seen == 0L ? View.GONE : View.VISIBLE
                seenInt0LViewGONEViewVISIBLE = ((seenInt0L) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x208L) != 0) {
        }
        if ((dirtyFlags & 0x210L) != 0) {
        }
        if ((dirtyFlags & 0x220L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {



                // read progress == 0
                progressInt0 = (progress) == (0);
            if((dirtyFlags & 0x280L) != 0) {
                if(progressInt0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read progress == 0 ? View.INVISIBLE : View.VISIBLE
                progressInt0ViewINVISIBLEViewVISIBLE = ((progressInt0) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x300L) != 0) {



                if (holder != null) {
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.mlItemProgress.setMax(max);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mlItemProgress.setProgress(progress);
            this.mlItemProgress.setVisibility(progressInt0ViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            this.mlItemSeen.setVisibility(seenInt0LViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mlItemThumbnail, cover);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            org.videolan.vlc.gui.helpers.ImageLoaderKt.loadImage(this.mlItemThumbnail, media);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTitle, mediaTitle);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTime, time);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoListAdapter.ViewHolder value) {
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
    public static VideoGridCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VideoGridCardBinding>inflate(inflater, org.videolan.vlc.R.layout.video_grid_card, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VideoGridCardBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridCardBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.video_grid_card, null, false), bindingComponent);
    }
    @NonNull
    public static VideoGridCardBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridCardBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/video_grid_card_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VideoGridCardBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): cover
        flag 1 (0x2L): seen
        flag 2 (0x3L): scaleType
        flag 3 (0x4L): time
        flag 4 (0x5L): bgColor
        flag 5 (0x6L): media
        flag 6 (0x7L): max
        flag 7 (0x8L): progress
        flag 8 (0x9L): holder
        flag 9 (0xaL): null
        flag 10 (0xbL): seen == 0L ? View.GONE : View.VISIBLE
        flag 11 (0xcL): seen == 0L ? View.GONE : View.VISIBLE
        flag 12 (0xdL): progress == 0 ? View.INVISIBLE : View.VISIBLE
        flag 13 (0xeL): progress == 0 ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}