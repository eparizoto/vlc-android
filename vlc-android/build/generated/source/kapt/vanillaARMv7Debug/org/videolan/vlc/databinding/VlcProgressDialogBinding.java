package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VlcProgressDialogBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.Button cancel;
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    public final android.support.v4.widget.ContentLoadingProgressBar progress;
    @NonNull
    public final android.widget.TextView text;
    // variables
    @Nullable
    private org.videolan.vlc.gui.dialogs.VlcProgressDialog mHandler;
    @Nullable
    private org.videolan.libvlc.Dialog.ProgressDialog mDialog;
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnCancelAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcProgressDialogBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.cancel = (android.widget.Button) bindings[3];
        this.cancel.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress = (android.support.v4.widget.ContentLoadingProgressBar) bindings[2];
        this.progress.setTag(null);
        this.text = (android.widget.TextView) bindings[1];
        this.text.setTag(null);
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
            setHandler((org.videolan.vlc.gui.dialogs.VlcProgressDialog) variable);
        }
        else if (BR.dialog == variableId) {
            setDialog((org.videolan.libvlc.Dialog.ProgressDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable org.videolan.vlc.gui.dialogs.VlcProgressDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.dialogs.VlcProgressDialog getHandler() {
        return mHandler;
    }
    public void setDialog(@Nullable org.videolan.libvlc.Dialog.ProgressDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.libvlc.Dialog.ProgressDialog getDialog() {
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
        boolean textUtilsIsEmptyDialogCancelText = false;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        org.videolan.vlc.gui.dialogs.VlcProgressDialog handler = mHandler;
        org.videolan.libvlc.Dialog.ProgressDialog dialog = mDialog;
        java.lang.String dialogCancelText = null;
        boolean dialogIsIndeterminate = false;
        int textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.text
                    dialogText = dialog.getText();
                    // read dialog.cancelText
                    dialogCancelText = dialog.getCancelText();
                    // read dialog.isIndeterminate()
                    dialogIsIndeterminate = dialog.isIndeterminate();
                }


                // read TextUtils.isEmpty(dialog.cancelText)
                textUtilsIsEmptyDialogCancelText = android.text.TextUtils.isEmpty(dialogCancelText);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogCancelText) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogCancelText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cancel.setVisibility(textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE);
            this.progress.setIndeterminate(dialogIsIndeterminate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.dialogs.VlcProgressDialog value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.dialogs.VlcProgressDialog value) {
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
    public static VlcProgressDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcProgressDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<VlcProgressDialogBinding>inflate(inflater, org.videolan.vlc.R.layout.vlc_progress_dialog, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static VlcProgressDialogBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcProgressDialogBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.vlc_progress_dialog, null, false), bindingComponent);
    }
    @NonNull
    public static VlcProgressDialogBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static VlcProgressDialogBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/vlc_progress_dialog_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new VlcProgressDialogBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}