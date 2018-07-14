package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TvAudioPlayerBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 4);
        sViewsWithIds.put(R.id.album_cover, 5);
        sViewsWithIds.put(R.id.media_title, 6);
        sViewsWithIds.put(R.id.media_artist, 7);
        sViewsWithIds.put(R.id.button_repeat, 8);
        sViewsWithIds.put(R.id.button_previous, 9);
        sViewsWithIds.put(R.id.button_play, 10);
        sViewsWithIds.put(R.id.button_next, 11);
        sViewsWithIds.put(R.id.button_shuffle, 12);
        sViewsWithIds.put(R.id.playlist, 13);
    }
    // views
    @NonNull
    public final android.widget.ImageView albumCover;
    @NonNull
    public final android.widget.ImageView background;
    @NonNull
    public final android.widget.ImageView buttonNext;
    @NonNull
    public final android.widget.ImageView buttonPlay;
    @NonNull
    public final android.widget.ImageView buttonPrevious;
    @NonNull
    public final android.widget.ImageView buttonRepeat;
    @NonNull
    public final android.widget.ImageView buttonShuffle;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.widget.TextView mediaArtist;
    @NonNull
    public final android.widget.TextView mediaLength;
    @NonNull
    public final android.widget.ProgressBar mediaProgress;
    @NonNull
    public final android.widget.TextView mediaTime;
    @NonNull
    public final android.widget.TextView mediaTitle;
    @NonNull
    public final android.support.v7.widget.RecyclerView playlist;
    // variables
    @Nullable
    private android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress> mProgress;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TvAudioPlayerBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.albumCover = (android.widget.ImageView) bindings[5];
        this.background = (android.widget.ImageView) bindings[4];
        this.buttonNext = (android.widget.ImageView) bindings[11];
        this.buttonPlay = (android.widget.ImageView) bindings[10];
        this.buttonPrevious = (android.widget.ImageView) bindings[9];
        this.buttonRepeat = (android.widget.ImageView) bindings[8];
        this.buttonShuffle = (android.widget.ImageView) bindings[12];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mediaArtist = (android.widget.TextView) bindings[7];
        this.mediaLength = (android.widget.TextView) bindings[3];
        this.mediaLength.setTag(null);
        this.mediaProgress = (android.widget.ProgressBar) bindings[2];
        this.mediaProgress.setTag(null);
        this.mediaTime = (android.widget.TextView) bindings[1];
        this.mediaTime.setTag(null);
        this.mediaTitle = (android.widget.TextView) bindings[6];
        this.playlist = (android.support.v7.widget.RecyclerView) bindings[13];
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
        if (BR.progress == variableId) {
            setProgress((android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProgress(@Nullable android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress> Progress) {
        updateLiveDataRegistration(0, Progress);
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    @Nullable
    public android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress> getProgress() {
        return mProgress;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgress((android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgress(android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress> Progress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        long progressTime = 0L;
        org.videolan.vlc.viewmodels.PlaybackProgress progressGetValue = null;
        long progressLength = 0L;
        java.lang.String progressLengthText = null;
        int intProgressTime = 0;
        android.arch.lifecycle.LiveData<org.videolan.vlc.viewmodels.PlaybackProgress> progress = mProgress;
        int intProgressLength = 0;
        java.lang.String progressTimeText = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (progress != null) {
                    // read progress.getValue()
                    progressGetValue = progress.getValue();
                }


                if (progressGetValue != null) {
                    // read progress.getValue().time
                    progressTime = progressGetValue.getTime();
                    // read progress.getValue().length
                    progressLength = progressGetValue.getLength();
                    // read progress.getValue().lengthText
                    progressLengthText = progressGetValue.getLengthText();
                    // read progress.getValue().timeText
                    progressTimeText = progressGetValue.getTimeText();
                }


                // read (int) progress.getValue().time
                intProgressTime = ((int) (progressTime));
                // read (int) progress.getValue().length
                intProgressLength = ((int) (progressLength));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mediaLength, progressLengthText);
            this.mediaProgress.setProgress(intProgressTime);
            this.mediaProgress.setMax(intProgressLength);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mediaTime, progressTimeText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static TvAudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvAudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TvAudioPlayerBinding>inflate(inflater, org.videolan.vlc.R.layout.tv_audio_player, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static TvAudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvAudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.tv_audio_player, null, false), bindingComponent);
    }
    @NonNull
    public static TvAudioPlayerBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static TvAudioPlayerBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/tv_audio_player_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TvAudioPlayerBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): progress
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}