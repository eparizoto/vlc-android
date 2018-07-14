package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DirectoryBrowserBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.network_list, 5);
        sViewsWithIds.put(R.id.empty, 6);
    }
    // views
    @NonNull
    public final android.widget.TextView empty;
    @NonNull
    public final android.support.v7.widget.RecyclerView favoritesList;
    @NonNull
    public final android.widget.TextView favoritesTitle;
    @NonNull
    public final android.widget.TextView foldersTitle;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView1;
    @NonNull
    public final android.support.v7.widget.RecyclerView networkList;
    @NonNull
    public final org.videolan.vlc.gui.view.SwipeRefreshLayout swipeLayout;
    // variables
    @Nullable
    private boolean mShowFavorites;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DirectoryBrowserBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.empty = (android.widget.TextView) bindings[6];
        this.favoritesList = (android.support.v7.widget.RecyclerView) bindings[3];
        this.favoritesList.setTag(null);
        this.favoritesTitle = (android.widget.TextView) bindings[2];
        this.favoritesTitle.setTag(null);
        this.foldersTitle = (android.widget.TextView) bindings[4];
        this.foldersTitle.setTag(null);
        this.mboundView1 = (android.support.constraint.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.networkList = (android.support.v7.widget.RecyclerView) bindings[5];
        this.swipeLayout = (org.videolan.vlc.gui.view.SwipeRefreshLayout) bindings[0];
        this.swipeLayout.setTag(null);
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
        if (BR.showFavorites == variableId) {
            setShowFavorites((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowFavorites(boolean ShowFavorites) {
        this.mShowFavorites = ShowFavorites;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showFavorites);
        super.requestRebind();
    }
    public boolean getShowFavorites() {
        return mShowFavorites;
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
        int showFavoritesViewVISIBLEViewGONE = 0;
        boolean showFavorites = mShowFavorites;

        if ((dirtyFlags & 0x3L) != 0) {

            if((dirtyFlags & 0x3L) != 0) {
                if(showFavorites) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read showFavorites ? View.VISIBLE : View.GONE
                showFavoritesViewVISIBLEViewGONE = ((showFavorites) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.favoritesList.setVisibility(showFavoritesViewVISIBLEViewGONE);
            this.favoritesTitle.setVisibility(showFavoritesViewVISIBLEViewGONE);
            this.foldersTitle.setVisibility(showFavoritesViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static DirectoryBrowserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DirectoryBrowserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DirectoryBrowserBinding>inflate(inflater, org.videolan.vlc.R.layout.directory_browser, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static DirectoryBrowserBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DirectoryBrowserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.directory_browser, null, false), bindingComponent);
    }
    @NonNull
    public static DirectoryBrowserBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static DirectoryBrowserBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/directory_browser_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DirectoryBrowserBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): showFavorites
        flag 1 (0x2L): null
        flag 2 (0x3L): showFavorites ? View.VISIBLE : View.GONE
        flag 3 (0x4L): showFavorites ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}