package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VideoGridBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.video_grid, 3);
        sViewsWithIds.put(R.id.loading_title, 4);
        sViewsWithIds.put(R.id.loading_flipper, 5);
    }
    // views
    @NonNull
    public final android.widget.ViewFlipper loadingFlipper;
    @NonNull
    public final android.widget.TextView loadingTitle;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final org.videolan.vlc.gui.view.SwipeRefreshLayout swipeLayout;
    @NonNull
    public final android.widget.TextView textviewNomedia;
    @NonNull
    public final org.videolan.vlc.gui.view.AutoFitRecyclerView videoGrid;
    // variables
    @Nullable
    private boolean mEmpty;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VideoGridBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.loadingFlipper = (android.widget.ViewFlipper) bindings[5];
        this.loadingTitle = (android.widget.TextView) bindings[4];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.swipeLayout = (org.videolan.vlc.gui.view.SwipeRefreshLayout) bindings[1];
        this.swipeLayout.setTag(null);
        this.textviewNomedia = (android.widget.TextView) bindings[2];
        this.textviewNomedia.setTag(null);
        this.videoGrid = (org.videolan.vlc.gui.view.AutoFitRecyclerView) bindings[3];
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
        if (BR.empty == variableId) {
            setEmpty((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEmpty(boolean Empty) {
        this.mEmpty = Empty;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.empty);
        super.requestRebind();
    }
    public boolean getEmpty() {
        return mEmpty;
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
        int emptyViewGONEViewVISIBLE = 0;
        int emptyViewVISIBLEViewGONE = 0;
        boolean empty = mEmpty;

        if ((dirtyFlags & 0x3L) != 0) {

            if((dirtyFlags & 0x3L) != 0) {
                if(empty) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read empty ? View.GONE : View.VISIBLE
                emptyViewGONEViewVISIBLE = ((empty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read empty ? View.VISIBLE : View.GONE
                emptyViewVISIBLEViewGONE = ((empty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.swipeLayout.setVisibility(emptyViewGONEViewVISIBLE);
            this.textviewNomedia.setVisibility(emptyViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static VideoGridBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VideoGridBinding>inflate(inflater, org.videolan.vlc.R.layout.video_grid, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VideoGridBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.video_grid, null, false), bindingComponent);
    }
    @NonNull
    public static VideoGridBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VideoGridBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/video_grid_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VideoGridBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): empty
        flag 1 (0x2L): null
        flag 2 (0x3L): empty ? View.GONE : View.VISIBLE
        flag 3 (0x4L): empty ? View.GONE : View.VISIBLE
        flag 4 (0x5L): empty ? View.VISIBLE : View.GONE
        flag 5 (0x6L): empty ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}