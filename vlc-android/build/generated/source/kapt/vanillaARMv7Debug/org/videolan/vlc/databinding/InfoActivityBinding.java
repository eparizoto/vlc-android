package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InfoActivityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 12);
        sViewsWithIds.put(R.id.main_toolbar, 13);
        sViewsWithIds.put(R.id.container, 14);
        sViewsWithIds.put(R.id.barrier, 15);
        sViewsWithIds.put(R.id.info_subtitles, 16);
        sViewsWithIds.put(R.id.fab, 17);
    }
    // views
    @NonNull
    public final android.support.design.widget.AppBarLayout appbar;
    @NonNull
    public final android.support.constraint.Barrier barrier;
    @NonNull
    public final android.support.design.widget.CollapsingToolbarLayout collapsingToolbar;
    @NonNull
    public final android.support.constraint.ConstraintLayout container;
    @NonNull
    public final android.support.design.widget.CoordinatorLayout coordinator;
    @NonNull
    public final android.widget.TextView extraTitle;
    @NonNull
    public final android.widget.TextView extraValue;
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    public final android.widget.ProgressBar imageProgress;
    @NonNull
    public final android.widget.TextView infoPath;
    @NonNull
    public final android.widget.ImageView infoSubtitles;
    @NonNull
    public final android.widget.TextView lengthTitle;
    @NonNull
    public final android.widget.TextView lengthValue;
    @NonNull
    public final android.support.v7.widget.RecyclerView list;
    @NonNull
    public final android.support.v7.widget.Toolbar mainToolbar;
    @NonNull
    public final android.widget.ImageView playlistCover;
    @NonNull
    public final android.widget.TextView sizeTitle;
    @NonNull
    public final android.widget.TextView sizeValue;
    // variables
    @Nullable
    private org.videolan.medialibrary.media.MediaLibraryItem mItem;
    @Nullable
    private android.graphics.drawable.BitmapDrawable mCover;
    @Nullable
    private java.lang.String mExtraValueText;
    @Nullable
    private java.lang.String mExtraTitleText;
    @Nullable
    private java.lang.String mSizeTitleText;
    @Nullable
    private java.lang.String mLength;
    @Nullable
    private int mProgress;
    @Nullable
    private java.lang.String mPath;
    @Nullable
    private java.lang.String mSizeValueText;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InfoActivityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds);
        this.appbar = (android.support.design.widget.AppBarLayout) bindings[12];
        this.barrier = (android.support.constraint.Barrier) bindings[15];
        this.collapsingToolbar = (android.support.design.widget.CollapsingToolbarLayout) bindings[1];
        this.collapsingToolbar.setTag(null);
        this.container = (android.support.constraint.ConstraintLayout) bindings[14];
        this.coordinator = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.coordinator.setTag(null);
        this.extraTitle = (android.widget.TextView) bindings[9];
        this.extraTitle.setTag(null);
        this.extraValue = (android.widget.TextView) bindings[10];
        this.extraValue.setTag(null);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[17];
        this.imageProgress = (android.widget.ProgressBar) bindings[3];
        this.imageProgress.setTag(null);
        this.infoPath = (android.widget.TextView) bindings[4];
        this.infoPath.setTag(null);
        this.infoSubtitles = (android.widget.ImageView) bindings[16];
        this.lengthTitle = (android.widget.TextView) bindings[5];
        this.lengthTitle.setTag(null);
        this.lengthValue = (android.widget.TextView) bindings[6];
        this.lengthValue.setTag(null);
        this.list = (android.support.v7.widget.RecyclerView) bindings[11];
        this.list.setTag(null);
        this.mainToolbar = (android.support.v7.widget.Toolbar) bindings[13];
        this.playlistCover = (android.widget.ImageView) bindings[2];
        this.playlistCover.setTag(null);
        this.sizeTitle = (android.widget.TextView) bindings[7];
        this.sizeTitle.setTag(null);
        this.sizeValue = (android.widget.TextView) bindings[8];
        this.sizeValue.setTag(null);
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
        if (BR.item == variableId) {
            setItem((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.extraValueText == variableId) {
            setExtraValueText((java.lang.String) variable);
        }
        else if (BR.extraTitleText == variableId) {
            setExtraTitleText((java.lang.String) variable);
        }
        else if (BR.sizeTitleText == variableId) {
            setSizeTitleText((java.lang.String) variable);
        }
        else if (BR.length == variableId) {
            setLength((java.lang.String) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((int) variable);
        }
        else if (BR.path == variableId) {
            setPath((java.lang.String) variable);
        }
        else if (BR.sizeValueText == variableId) {
            setSizeValueText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.medialibrary.media.MediaLibraryItem getItem() {
        return mItem;
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    @Nullable
    public android.graphics.drawable.BitmapDrawable getCover() {
        return mCover;
    }
    public void setExtraValueText(@Nullable java.lang.String ExtraValueText) {
        this.mExtraValueText = ExtraValueText;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.extraValueText);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getExtraValueText() {
        return mExtraValueText;
    }
    public void setExtraTitleText(@Nullable java.lang.String ExtraTitleText) {
        this.mExtraTitleText = ExtraTitleText;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.extraTitleText);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getExtraTitleText() {
        return mExtraTitleText;
    }
    public void setSizeTitleText(@Nullable java.lang.String SizeTitleText) {
        this.mSizeTitleText = SizeTitleText;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.sizeTitleText);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getSizeTitleText() {
        return mSizeTitleText;
    }
    public void setLength(@Nullable java.lang.String Length) {
        this.mLength = Length;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.length);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getLength() {
        return mLength;
    }
    public void setProgress(int Progress) {
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public int getProgress() {
        return mProgress;
    }
    public void setPath(@Nullable java.lang.String Path) {
        this.mPath = Path;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.path);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getPath() {
        return mPath;
    }
    public void setSizeValueText(@Nullable java.lang.String SizeValueText) {
        this.mSizeValueText = SizeValueText;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.sizeValueText);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getSizeValueText() {
        return mSizeValueText;
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
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        int lengthJavaLangObjectNullViewVISIBLEViewINVISIBLE = 0;
        java.lang.String itemTitle = null;
        boolean itemItemTypeMediaLibraryItemTYPEMEDIA = false;
        int itemItemType = 0;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        int pathJavaLangObjectNullViewVISIBLEViewINVISIBLE = 0;
        java.lang.String extraValueText = mExtraValueText;
        java.lang.String extraTitleText = mExtraTitleText;
        int progressInt0ViewVISIBLEViewGONE = 0;
        java.lang.String sizeTitleText = mSizeTitleText;
        java.lang.String length = mLength;
        int progress = mProgress;
        boolean lengthJavaLangObjectNull = false;
        java.lang.String path = mPath;
        java.lang.String sizeValueText = mSizeValueText;
        boolean pathJavaLangObjectNull = false;
        boolean progressInt0 = false;
        int itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE = 0;

        if ((dirtyFlags & 0x201L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.itemType
                    itemItemType = item.getItemType();
                }


                // read item.itemType == MediaLibraryItem.TYPE_MEDIA
                itemItemTypeMediaLibraryItemTYPEMEDIA = (itemItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_MEDIA);
            if((dirtyFlags & 0x201L) != 0) {
                if(itemItemTypeMediaLibraryItemTYPEMEDIA) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
                itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE = ((itemItemTypeMediaLibraryItemTYPEMEDIA) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x200L) != 0) {

            if((dirtyFlags & 0x200L) != 0) {
                if((extraValue) != (null)) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x200L) != 0) {
                if((sizeValue) != (null)) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
        }
        if ((dirtyFlags & 0x202L) != 0) {
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x208L) != 0) {
        }
        if ((dirtyFlags & 0x210L) != 0) {
        }
        if ((dirtyFlags & 0x220L) != 0) {



                // read length != null
                lengthJavaLangObjectNull = (length) != (null);
            if((dirtyFlags & 0x220L) != 0) {
                if(lengthJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read length != null ? View.VISIBLE : View.INVISIBLE
                lengthJavaLangObjectNullViewVISIBLEViewINVISIBLE = ((lengthJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x240L) != 0) {



                // read progress > 0
                progressInt0 = (progress) > (0);
            if((dirtyFlags & 0x240L) != 0) {
                if(progressInt0) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read progress > 0 ? View.VISIBLE : View.GONE
                progressInt0ViewVISIBLEViewGONE = ((progressInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x280L) != 0) {



                // read path != null
                pathJavaLangObjectNull = (path) != (null);
            if((dirtyFlags & 0x280L) != 0) {
                if(pathJavaLangObjectNull) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read path != null ? View.VISIBLE : View.INVISIBLE
                pathJavaLangObjectNullViewVISIBLEViewINVISIBLE = ((pathJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x300L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.collapsingToolbar.setTitle(itemTitle);
            this.list.setVisibility(itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.extraTitle, extraTitleText);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.extraTitle.setVisibility((((extraValue) != (null)) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE)));
            this.extraValue.setVisibility((((extraValue) != (null)) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE)));
            this.sizeTitle.setVisibility((((sizeValue) != (null)) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE)));
            this.sizeValue.setVisibility((((sizeValue) != (null)) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE)));
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.extraValue, extraValueText);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.imageProgress.setProgress(progress);
            this.imageProgress.setVisibility(progressInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.infoPath.setVisibility(pathJavaLangObjectNullViewVISIBLEViewINVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.infoPath, path);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            this.lengthTitle.setVisibility(lengthJavaLangObjectNullViewVISIBLEViewINVISIBLE);
            this.lengthValue.setVisibility(lengthJavaLangObjectNullViewVISIBLEViewINVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.lengthValue, length);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playlistCover, cover);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.sizeTitle, sizeTitleText);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.sizeValue, sizeValueText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static InfoActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InfoActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<InfoActivityBinding>inflate(inflater, org.videolan.vlc.R.layout.info_activity, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static InfoActivityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InfoActivityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.info_activity, null, false), bindingComponent);
    }
    @NonNull
    public static InfoActivityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static InfoActivityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/info_activity_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new InfoActivityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): cover
        flag 2 (0x3L): extraValueText
        flag 3 (0x4L): extraTitleText
        flag 4 (0x5L): sizeTitleText
        flag 5 (0x6L): length
        flag 6 (0x7L): progress
        flag 7 (0x8L): path
        flag 8 (0x9L): sizeValueText
        flag 9 (0xaL): null
        flag 10 (0xbL): sizeValue != null ? View.VISIBLE : View.INVISIBLE
        flag 11 (0xcL): sizeValue != null ? View.VISIBLE : View.INVISIBLE
        flag 12 (0xdL): length != null ? View.VISIBLE : View.INVISIBLE
        flag 13 (0xeL): length != null ? View.VISIBLE : View.INVISIBLE
        flag 14 (0xfL): extraValue != null ? View.VISIBLE : View.INVISIBLE
        flag 15 (0x10L): extraValue != null ? View.VISIBLE : View.INVISIBLE
        flag 16 (0x11L): path != null ? View.VISIBLE : View.INVISIBLE
        flag 17 (0x12L): path != null ? View.VISIBLE : View.INVISIBLE
        flag 18 (0x13L): progress > 0 ? View.VISIBLE : View.GONE
        flag 19 (0x14L): progress > 0 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
        flag 21 (0x16L): item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}