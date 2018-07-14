package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRendererBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView rendererName;
    // variables
    @Nullable
    private org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler mClicHandler;
    @Nullable
    private org.videolan.libvlc.RendererItem mRenderer;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRendererBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rendererName = (android.widget.TextView) bindings[1];
        this.rendererName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 1);
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
        if (BR.clicHandler == variableId) {
            setClicHandler((org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler) variable);
        }
        else if (BR.renderer == variableId) {
            setRenderer((org.videolan.libvlc.RendererItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClicHandler(@Nullable org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler ClicHandler) {
        this.mClicHandler = ClicHandler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clicHandler);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler getClicHandler() {
        return mClicHandler;
    }
    public void setRenderer(@Nullable org.videolan.libvlc.RendererItem Renderer) {
        this.mRenderer = Renderer;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.renderer);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.libvlc.RendererItem getRenderer() {
        return mRenderer;
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
        org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler clicHandler = mClicHandler;
        org.videolan.libvlc.RendererItem renderer = mRenderer;
        java.lang.String rendererDisplayName = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (renderer != null) {
                    // read renderer.displayName
                    rendererDisplayName = renderer.displayName;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.rendererName, rendererDisplayName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rendererName.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // renderer
        org.videolan.libvlc.RendererItem renderer = mRenderer;
        // clicHandler != null
        boolean clicHandlerJavaLangObjectNull = false;
        // clicHandler
        org.videolan.vlc.gui.dialogs.RenderersDialog.RendererClickhandler clicHandler = mClicHandler;



        clicHandlerJavaLangObjectNull = (clicHandler) != (null);
        if (clicHandlerJavaLangObjectNull) {



            clicHandler.connect(renderer);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemRendererBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemRendererBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemRendererBinding>inflate(inflater, org.videolan.vlc.R.layout.item_renderer, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemRendererBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemRendererBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.item_renderer, null, false), bindingComponent);
    }
    @NonNull
    public static ItemRendererBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemRendererBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_renderer_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemRendererBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): clicHandler
        flag 1 (0x2L): renderer
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}