package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EqualizerBindingImpl extends EqualizerBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.equalizer_button, 4);
        sViewsWithIds.put(R.id.equalizer_presets, 5);
        sViewsWithIds.put(R.id.equalizer_preamp, 6);
        sViewsWithIds.put(R.id.equalizer_scroll, 7);
        sViewsWithIds.put(R.id.equalizer_bands, 8);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EqualizerBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private EqualizerBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[8]
            , (android.support.v7.widget.SwitchCompat) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.SeekBar) bindings[6]
            , (android.support.v7.widget.AppCompatSpinner) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.HorizontalScrollView) bindings[7]
            , null
            );
        this.equalizerDelete.setTag(null);
        this.equalizerRevert.setTag(null);
        this.equalizerSave.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.state == variableId) {
            setState((org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStateDeleteButtonVisibility((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeStateRevertButtonVisibility((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeStateSaveButtonVisibility((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStateDeleteButtonVisibility(android.databinding.ObservableInt StateDeleteButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStateRevertButtonVisibility(android.databinding.ObservableInt StateRevertButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStateSaveButtonVisibility(android.databinding.ObservableInt StateSaveButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        android.databinding.ObservableInt stateDeleteButtonVisibility = null;
        android.databinding.ObservableInt stateRevertButtonVisibility = null;
        int stateDeleteButtonVisibilityGet = 0;
        android.databinding.ObservableInt stateSaveButtonVisibility = null;
        int stateRevertButtonVisibilityGet = 0;
        int stateSaveButtonVisibilityGet = 0;
        org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState state = mState;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (state != null) {
                        // read state.deleteButtonVisibility
                        stateDeleteButtonVisibility = state.deleteButtonVisibility;
                    }
                    updateRegistration(0, stateDeleteButtonVisibility);


                    if (stateDeleteButtonVisibility != null) {
                        // read state.deleteButtonVisibility.get()
                        stateDeleteButtonVisibilityGet = stateDeleteButtonVisibility.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (state != null) {
                        // read state.revertButtonVisibility
                        stateRevertButtonVisibility = state.revertButtonVisibility;
                    }
                    updateRegistration(1, stateRevertButtonVisibility);


                    if (stateRevertButtonVisibility != null) {
                        // read state.revertButtonVisibility.get()
                        stateRevertButtonVisibilityGet = stateRevertButtonVisibility.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (state != null) {
                        // read state.saveButtonVisibility
                        stateSaveButtonVisibility = state.saveButtonVisibility;
                    }
                    updateRegistration(2, stateSaveButtonVisibility);


                    if (stateSaveButtonVisibility != null) {
                        // read state.saveButtonVisibility.get()
                        stateSaveButtonVisibilityGet = stateSaveButtonVisibility.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.equalizerDelete.setVisibility(stateDeleteButtonVisibilityGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.equalizerRevert.setVisibility(stateRevertButtonVisibilityGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.equalizerSave.setVisibility(stateSaveButtonVisibilityGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): state.deleteButtonVisibility
        flag 1 (0x2L): state.revertButtonVisibility
        flag 2 (0x3L): state.saveButtonVisibility
        flag 3 (0x4L): state
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}