package org.videolan.vlc.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class EqualizerBinding extends ViewDataBinding {
    @NonNull
    public final android.widget.LinearLayout equalizerBands;
    @NonNull
    public final android.support.v7.widget.SwitchCompat equalizerButton;
    @NonNull
    public final android.widget.ImageView equalizerDelete;
    @NonNull
    public final android.widget.SeekBar equalizerPreamp;
    @NonNull
    public final android.support.v7.widget.AppCompatSpinner equalizerPresets;
    @NonNull
    public final android.widget.ImageView equalizerRevert;
    @NonNull
    public final android.widget.ImageView equalizerSave;
    @NonNull
    public final android.widget.HorizontalScrollView equalizerScroll;
    @Nullable
    public final android.support.constraint.Guideline guideine;
    // variables
    protected org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState mState;
    protected EqualizerBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.widget.LinearLayout equalizerBands1
        , android.support.v7.widget.SwitchCompat equalizerButton1
        , android.widget.ImageView equalizerDelete1
        , android.widget.SeekBar equalizerPreamp1
        , android.support.v7.widget.AppCompatSpinner equalizerPresets1
        , android.widget.ImageView equalizerRevert1
        , android.widget.ImageView equalizerSave1
        , android.widget.HorizontalScrollView equalizerScroll1
        , android.support.constraint.Guideline guideine1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.equalizerBands = equalizerBands1;
        this.equalizerButton = equalizerButton1;
        this.equalizerDelete = equalizerDelete1;
        this.equalizerPreamp = equalizerPreamp1;
        this.equalizerPresets = equalizerPresets1;
        this.equalizerRevert = equalizerRevert1;
        this.equalizerSave = equalizerSave1;
        this.equalizerScroll = equalizerScroll1;
        this.guideine = guideine1;
    }
    //getters and abstract setters
    public abstract void setState(@Nullable org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState State);
    @Nullable
    public org.videolan.vlc.gui.audio.EqualizerFragment.EqualizerState getState() {
        return mState;
    }
    @NonNull
    public static EqualizerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EqualizerBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EqualizerBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static EqualizerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<EqualizerBinding>inflate(inflater, org.videolan.vlc.R.layout.equalizer, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static EqualizerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<EqualizerBinding>inflate(inflater, org.videolan.vlc.R.layout.equalizer, null, false, bindingComponent);
    }
    @NonNull
    public static EqualizerBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return (EqualizerBinding)bind(bindingComponent, view, org.videolan.vlc.R.layout.equalizer);
    }
}