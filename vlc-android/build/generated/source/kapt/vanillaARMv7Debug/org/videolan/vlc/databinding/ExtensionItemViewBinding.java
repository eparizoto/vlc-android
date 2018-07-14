package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExtensionItemViewBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.TextView author;
    @NonNull
    public final android.widget.ImageView extensionImage;
    @NonNull
    public final android.widget.ImageView itemMore;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView title;
    // variables
    @Nullable
    private org.videolan.vlc.extensions.api.VLCExtensionItem mItem;
    @Nullable
    private android.graphics.drawable.BitmapDrawable mCover;
    @Nullable
    private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder mHolder;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public ExtensionItemViewBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.author = (android.widget.TextView) bindings[3];
        this.author.setTag(null);
        this.extensionImage = (android.widget.ImageView) bindings[1];
        this.extensionImage.setTag(null);
        this.itemMore = (android.widget.ImageView) bindings[4];
        this.itemMore.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.item == variableId) {
            setItem((org.videolan.vlc.extensions.api.VLCExtensionItem) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable org.videolan.vlc.extensions.api.VLCExtensionItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.extensions.api.VLCExtensionItem getItem() {
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
    public void setHolder(@Nullable org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder getHolder() {
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
        org.videolan.vlc.extensions.api.VLCExtensionItem item = mItem;
        int textUtilsIsEmptyItemSubTitleViewGONEViewVISIBLE = 0;
        java.lang.String itemTitle = null;
        boolean itemImageUriJavaLangObjectNull = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean textUtilsIsEmptyItemSubTitle = false;
        boolean textUtilsIsEmptyItemImageUriToString = false;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        int itemTypeInt0ViewVISIBLEViewGONE = 0;
        int itemType = 0;
        boolean itemTypeInt0 = false;
        int itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToStringViewGONEViewVISIBLE = 0;
        java.lang.String itemSubTitle = null;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        boolean itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToString = false;
        android.net.Uri itemImageUri = null;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        java.lang.String itemImageUriToString = null;
        org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder holder = mHolder;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.type
                    itemType = item.getType();
                    // read item.subTitle
                    itemSubTitle = item.getSubTitle();
                    // read item.imageUri
                    itemImageUri = item.getImageUri();
                }


                // read item.type != 0
                itemTypeInt0 = (itemType) != (0);
                // read TextUtils.isEmpty(item.subTitle)
                textUtilsIsEmptyItemSubTitle = android.text.TextUtils.isEmpty(itemSubTitle);
                // read item.imageUri == null
                itemImageUriJavaLangObjectNull = (itemImageUri) == (null);
            if((dirtyFlags & 0x9L) != 0) {
                if(itemTypeInt0) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(textUtilsIsEmptyItemSubTitle) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(itemImageUriJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read item.type != 0 ? View.VISIBLE : View.GONE
                itemTypeInt0ViewVISIBLEViewGONE = ((itemTypeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read TextUtils.isEmpty(item.subTitle) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemSubTitleViewGONEViewVISIBLE = ((textUtilsIsEmptyItemSubTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



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

        if ((dirtyFlags & 0x400L) != 0) {

                if (itemImageUri != null) {
                    // read item.imageUri.toString()
                    itemImageUriToString = itemImageUri.toString();
                }


                // read TextUtils.isEmpty(item.imageUri.toString())
                textUtilsIsEmptyItemImageUriToString = android.text.TextUtils.isEmpty(itemImageUriToString);
        }

        if ((dirtyFlags & 0x9L) != 0) {

                // read item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString())
                itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToString = ((itemImageUriJavaLangObjectNull) ? (true) : (textUtilsIsEmptyItemImageUriToString));
            if((dirtyFlags & 0x9L) != 0) {
                if(itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToString) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString()) ? View.GONE : View.VISIBLE
                itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToStringViewGONEViewVISIBLE = ((itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToString) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.author, itemSubTitle);
            this.author.setVisibility(textUtilsIsEmptyItemSubTitleViewGONEViewVISIBLE);
            org.videolan.vlc.gui.helpers.ImageLoaderKt.downloadIcon(this.extensionImage, itemImageUri);
            this.extensionImage.setVisibility(itemImageUriJavaLangObjectNullBooleanTrueTextUtilsIsEmptyItemImageUriToStringViewGONEViewVISIBLE);
            this.itemMore.setVisibility(itemTypeInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.extensionImage, cover);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.browser.ExtensionAdapter.ViewHolder value) {
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
    public static ExtensionItemViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ExtensionItemViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExtensionItemViewBinding>inflate(inflater, org.videolan.vlc.R.layout.extension_item_view, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ExtensionItemViewBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ExtensionItemViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.extension_item_view, null, false), bindingComponent);
    }
    @NonNull
    public static ExtensionItemViewBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ExtensionItemViewBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/extension_item_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExtensionItemViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): cover
        flag 2 (0x3L): holder
        flag 3 (0x4L): null
        flag 4 (0x5L): TextUtils.isEmpty(item.subTitle) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): TextUtils.isEmpty(item.subTitle) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): item.type != 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): item.type != 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString())
        flag 11 (0xcL): item.imageUri == null ? true : TextUtils.isEmpty(item.imageUri.toString())
    flag mapping end*/
    //end
}