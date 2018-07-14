package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContextItemBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.ImageView contextOptionIcon;
    @NonNull
    public final android.widget.TextView contextOptionTitle;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private org.videolan.vlc.gui.dialogs.CtxOption mOption;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContextItemBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.contextOptionIcon = (android.widget.ImageView) bindings[1];
        this.contextOptionIcon.setTag(null);
        this.contextOptionTitle = (android.widget.TextView) bindings[2];
        this.contextOptionTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.option == variableId) {
            setOption((org.videolan.vlc.gui.dialogs.CtxOption) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOption(@Nullable org.videolan.vlc.gui.dialogs.CtxOption Option) {
        this.mOption = Option;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.option);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.dialogs.CtxOption getOption() {
        return mOption;
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
        int optionIconInt0ViewVISIBLEViewGONE = 0;
        java.lang.String optionTitle = null;
        boolean optionIconInt0 = false;
        int optionIcon = 0;
        org.videolan.vlc.gui.dialogs.CtxOption option = mOption;

        if ((dirtyFlags & 0x3L) != 0) {



                if (option != null) {
                    // read option.title
                    optionTitle = option.getTitle();
                    // read option.icon
                    optionIcon = option.getIcon();
                }


                // read option.icon != 0
                optionIconInt0 = (optionIcon) != (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(optionIconInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read option.icon != 0 ? View.VISIBLE : View.GONE
                optionIconInt0ViewVISIBLEViewGONE = ((optionIconInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.contextOptionIcon.setVisibility(optionIconInt0ViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.contextOptionTitle, optionTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ContextItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContextItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ContextItemBinding>inflate(inflater, org.videolan.vlc.R.layout.context_item, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ContextItemBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContextItemBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.context_item, null, false), bindingComponent);
    }
    @NonNull
    public static ContextItemBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContextItemBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/context_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ContextItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): option
        flag 1 (0x2L): null
        flag 2 (0x3L): option.icon != 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): option.icon != 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}