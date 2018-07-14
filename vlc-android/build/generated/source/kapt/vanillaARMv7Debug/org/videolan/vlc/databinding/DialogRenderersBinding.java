package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogRenderersBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.renderers_title, 2);
        sViewsWithIds.put(R.id.renderers_list, 3);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.Button renderersDisconnect;
    @NonNull
    public final android.support.v7.widget.RecyclerView renderersList;
    @NonNull
    public final android.widget.TextView renderersTitle;
    // variables
    @Nullable
    private org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler mHolder;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogRenderersBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.renderersDisconnect = (android.widget.Button) bindings[1];
        this.renderersDisconnect.setTag(null);
        this.renderersList = (android.support.v7.widget.RecyclerView) bindings[3];
        this.renderersTitle = (android.widget.TextView) bindings[2];
        setRootTag(root);
        // listeners
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
        if (BR.holder == variableId) {
            setHolder((org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHolder(@Nullable org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler getHolder() {
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
        org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler holder = mHolder;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.renderersDisconnect.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // holder
        org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler holder = mHolder;
        // holder != null
        boolean holderJavaLangObjectNull = false;



        holderJavaLangObjectNull = (holder) != (null);
        if (holderJavaLangObjectNull) {




            holder.connect(((org.videolan.libvlc.RendererItem) (null)));
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static DialogRenderersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogRenderersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DialogRenderersBinding>inflate(inflater, org.videolan.vlc.R.layout.dialog_renderers, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DialogRenderersBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogRenderersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.dialog_renderers, null, false), bindingComponent);
    }
    @NonNull
    public static DialogRenderersBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DialogRenderersBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/dialog_renderers_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DialogRenderersBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): holder
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}