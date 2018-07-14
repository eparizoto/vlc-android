package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VlcLoginDialogBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_container, 7);
        sViewsWithIds.put(R.id.password_container, 8);
        sViewsWithIds.put(R.id.password, 9);
    }
    // views
    @NonNull
    public final android.widget.Button action;
    @NonNull
    public final android.widget.Button cancel;
    @NonNull
    public final android.widget.EditText login;
    @NonNull
    public final android.support.design.widget.TextInputLayout loginContainer;
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    public final android.widget.EditText password;
    @NonNull
    public final android.support.design.widget.TextInputLayout passwordContainer;
    @NonNull
    public final android.widget.CheckBox store;
    @NonNull
    public final android.widget.TextView text;
    @NonNull
    public final android.widget.TextView warning;
    // variables
    @Nullable
    private org.videolan.vlc.gui.dialogs.VlcLoginDialog mHandler;
    @Nullable
    private org.videolan.libvlc.Dialog.LoginDialog mDialog;
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnLoginAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerOnCancelAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcLoginDialogBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.action = (android.widget.Button) bindings[6];
        this.action.setTag(null);
        this.cancel = (android.widget.Button) bindings[5];
        this.cancel.setTag(null);
        this.login = (android.widget.EditText) bindings[2];
        this.login.setTag(null);
        this.loginContainer = (android.support.design.widget.TextInputLayout) bindings[7];
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.password = (android.widget.EditText) bindings[9];
        this.passwordContainer = (android.support.design.widget.TextInputLayout) bindings[8];
        this.store = (android.widget.CheckBox) bindings[3];
        this.store.setTag(null);
        this.text = (android.widget.TextView) bindings[1];
        this.text.setTag(null);
        this.warning = (android.widget.TextView) bindings[4];
        this.warning.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.handler == variableId) {
            setHandler((org.videolan.vlc.gui.dialogs.VlcLoginDialog) variable);
        }
        else if (BR.dialog == variableId) {
            setDialog((org.videolan.libvlc.Dialog.LoginDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable org.videolan.vlc.gui.dialogs.VlcLoginDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.dialogs.VlcLoginDialog getHandler() {
        return mHandler;
    }
    public void setDialog(@Nullable org.videolan.libvlc.Dialog.LoginDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.libvlc.Dialog.LoginDialog getDialog() {
        return mDialog;
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
        java.lang.String dialogText = null;
        android.view.View.OnClickListener handlerOnLoginAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        boolean dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse = false;
        int dialogAsksStoreViewVISIBLEViewGONE = 0;
        boolean handlerStore = false;
        org.videolan.vlc.gui.dialogs.VlcLoginDialog handler = mHandler;
        org.videolan.libvlc.Dialog.LoginDialog dialog = mDialog;
        int dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE = 0;
        boolean dialogAsksStore = false;
        java.lang.String dialogGetDefaultUsername = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onLogin
                    handlerOnLoginAndroidViewViewOnClickListener = (((mHandlerOnLoginAndroidViewViewOnClickListener == null) ? (mHandlerOnLoginAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnLoginAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                    // read handler.store()
                    handlerStore = handler.store();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.text
                    dialogText = dialog.getText();
                    // read dialog.asksStore()
                    dialogAsksStore = dialog.asksStore();
                    // read dialog.getDefaultUsername()
                    dialogGetDefaultUsername = dialog.getDefaultUsername();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(dialogAsksStore) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
                dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse = ((dialogAsksStore) ? (!org.videolan.libvlc.util.AndroidUtil.isMarshMallowOrLater) : (false));
                // read dialog.asksStore() ? View.VISIBLE : View.GONE
                dialogAsksStoreViewVISIBLEViewGONE = ((dialogAsksStore) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if((dirtyFlags & 0x6L) != 0) {
                if(dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
                dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE = ((dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action.setOnClickListener(handlerOnLoginAndroidViewViewOnClickListener);
            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.store, handlerStore);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.login, dialogGetDefaultUsername);
            this.store.setVisibility(dialogAsksStoreViewVISIBLEViewGONE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
            this.warning.setVisibility(dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.dialogs.VlcLoginDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLogin(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.dialogs.VlcLoginDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static VlcLoginDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcLoginDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VlcLoginDialogBinding>inflate(inflater, org.videolan.vlc.R.layout.vlc_login_dialog, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VlcLoginDialogBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcLoginDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.vlc_login_dialog, null, false), bindingComponent);
    }
    @NonNull
    public static VlcLoginDialogBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcLoginDialogBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/vlc_login_dialog_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VlcLoginDialogBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
        flag 4 (0x5L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
        flag 5 (0x6L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}