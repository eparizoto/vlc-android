package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BrowserItemBinding extends android.databinding.ViewDataBinding  {

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
    public final org.videolan.vlc.gui.helpers.ThreeStatesCheckbox browserCheckbox;
    @NonNull
    public final android.widget.TextView dviIcon;
    @NonNull
    public final android.widget.ImageView itemIcon;
    @NonNull
    public final android.widget.ImageView itemMore;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView text;
    @NonNull
    public final android.widget.TextView title;
    // variables
    @Nullable
    private org.videolan.medialibrary.media.MediaLibraryItem mItem;
    @Nullable
    private android.graphics.drawable.BitmapDrawable mCover;
    @Nullable
    private boolean mHasContextMenu;
    @Nullable
    private int mBgColor;
    @Nullable
    private boolean mCheckEnabled;
    @Nullable
    private java.lang.String mProtocol;
    @Nullable
    private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnCheckBoxClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public BrowserItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.browserCheckbox = (org.videolan.vlc.gui.helpers.ThreeStatesCheckbox) bindings[1];
        this.browserCheckbox.setTag(null);
        this.dviIcon = (android.widget.TextView) bindings[3];
        this.dviIcon.setTag(null);
        this.itemIcon = (android.widget.ImageView) bindings[2];
        this.itemIcon.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[6];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.text = (android.widget.TextView) bindings[5];
        this.text.setTag(null);
        this.title = (android.widget.TextView) bindings[4];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        else if (BR.hasContextMenu == variableId) {
            setHasContextMenu((boolean) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.checkEnabled == variableId) {
            setCheckEnabled((boolean) variable);
        }
        else if (BR.protocol == variableId) {
            setProtocol((java.lang.String) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder) variable);
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
    public void setHasContextMenu(boolean HasContextMenu) {
        this.mHasContextMenu = HasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.hasContextMenu);
        super.requestRebind();
    }
    public boolean getHasContextMenu() {
        return mHasContextMenu;
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public int getBgColor() {
        return mBgColor;
    }
    public void setCheckEnabled(boolean CheckEnabled) {
        this.mCheckEnabled = CheckEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.checkEnabled);
        super.requestRebind();
    }
    public boolean getCheckEnabled() {
        return mCheckEnabled;
    }
    public void setProtocol(@Nullable java.lang.String Protocol) {
        this.mProtocol = Protocol;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.protocol);
        super.requestRebind();
    }
    @Nullable
    public java.lang.String getProtocol() {
        return mProtocol;
    }
    public void setHolder(@Nullable org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder getHolder() {
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
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        boolean textUtilsIsEmptyProtocol = false;
        android.view.View.OnClickListener holderOnCheckBoxClickAndroidViewViewOnClickListener = null;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = 0;
        java.lang.String itemTitle = null;
        boolean textUtilsIsEmptyItemDescription = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean hasContextMenu = mHasContextMenu;
        int itemGetItemType = 0;
        int hasContextMenuViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        boolean holderJavaLangObjectNull = false;
        int bgColor = mBgColor;
        int textUtilsIsEmptyProtocolViewGONEViewVISIBLE = 0;
        boolean hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        java.lang.String itemDescription = null;
        boolean checkEnabled = mCheckEnabled;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        java.lang.String protocol = mProtocol;
        org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder holder = mHolder;
        boolean itemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        int textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = 0;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x81L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.getItemType()
                    itemGetItemType = item.getItemType();
                    // read item.description
                    itemDescription = item.getDescription();
                }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                // read TextUtils.isEmpty(item.description)
                textUtilsIsEmptyItemDescription = android.text.TextUtils.isEmpty(itemDescription);
            if((dirtyFlags & 0x81L) != 0) {
                if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0x81L) != 0) {
                if(textUtilsIsEmptyItemDescription) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
                itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
                itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyItemDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x82L) != 0) {
        }
        if ((dirtyFlags & 0xc5L) != 0) {

            if((dirtyFlags & 0x84L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xc5L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }

            if ((dirtyFlags & 0x84L) != 0) {

                    // read hasContextMenu ? View.VISIBLE : View.GONE
                    hasContextMenuViewVISIBLEViewGONE = ((hasContextMenu) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (holder != null) {
                        // read holder::onCheckBoxClick
                        holderOnCheckBoxClickAndroidViewViewOnClickListener = (((mHolderOnCheckBoxClickAndroidViewViewOnClickListener == null) ? (mHolderOnCheckBoxClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnCheckBoxClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onClick
                        holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    }
                    // read holder != null
                    holderJavaLangObjectNull = (holder) != (null);
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (holder != null) {
                        // read holder::onMoreClick
                        holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                    }
            }

                if (holder != null) {
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {



                // read TextUtils.isEmpty(protocol)
                textUtilsIsEmptyProtocol = android.text.TextUtils.isEmpty(protocol);
            if((dirtyFlags & 0xa0L) != 0) {
                if(textUtilsIsEmptyProtocol) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyProtocolViewGONEViewVISIBLE = ((textUtilsIsEmptyProtocol) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {



                if (item != null) {
                    // read item.getItemType()
                    itemGetItemType = item.getItemType();
                }


                // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
            if((dirtyFlags & 0x81L) != 0) {
                if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                }
            }
        }

        if ((dirtyFlags & 0xc5L) != 0) {

                // read hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = ((hasContextMenu) ? (true) : (itemGetItemTypeMediaLibraryItemTYPESTORAGE));
        }
        // batch finished
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.browserCheckbox.setEnabled(checkEnabled);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.browserCheckbox.setOnClickListener(holderOnCheckBoxClickAndroidViewViewOnClickListener);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.mboundView0, (android.view.View.OnClickListener)holderOnClickAndroidViewViewOnClickListener, holderJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            this.browserCheckbox.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE);
            org.videolan.vlc.gui.helpers.ImageLoaderKt.loadImage(this.itemIcon, item);
            this.itemIcon.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, itemDescription);
            this.text.setVisibility(textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.dviIcon, protocol);
            this.dviIcon.setVisibility(textUtilsIsEmptyProtocolViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemIcon, cover);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            this.itemMore.setVisibility(hasContextMenuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)holderOnMoreClickAndroidViewViewOnClickListener, hasContextMenu);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, android.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setOnLongClick(this.mboundView0, (android.view.View.OnLongClickListener)holderOnLongClickAndroidViewViewOnLongClickListener, hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCheckBoxClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.browser.BaseBrowserAdapter.ViewHolder value) {
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
    public static BrowserItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static BrowserItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<BrowserItemBinding>inflate(inflater, org.videolan.vlc.R.layout.browser_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static BrowserItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static BrowserItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.browser_item, null, false), bindingComponent);
    }
    @NonNull
    public static BrowserItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static BrowserItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/browser_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new BrowserItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): cover
        flag 2 (0x3L): hasContextMenu
        flag 3 (0x4L): bgColor
        flag 4 (0x5L): checkEnabled
        flag 5 (0x6L): protocol
        flag 6 (0x7L): holder
        flag 7 (0x8L): null
        flag 8 (0x9L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 9 (0xaL): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 10 (0xbL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 11 (0xcL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 12 (0xdL): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 15 (0x10L): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 16 (0x11L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
        flag 19 (0x14L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}