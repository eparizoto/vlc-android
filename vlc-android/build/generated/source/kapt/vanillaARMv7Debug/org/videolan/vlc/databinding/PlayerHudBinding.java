package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlayerHudBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player_overlay_buttons, 11);
        sViewsWithIds.put(R.id.player_overlay_rewind, 12);
        sViewsWithIds.put(R.id.player_overlay_forward, 13);
    }
    // views
    @NonNull
    public final android.widget.ImageView lockOverlayButton;
    @NonNull
    public final android.widget.ImageView playerOverlayAdvFunction;
    @NonNull
    public final android.widget.LinearLayout playerOverlayButtons;
    @NonNull
    public final android.widget.ImageView playerOverlayForward;
    @NonNull
    public final android.widget.TextView playerOverlayLength;
    @NonNull
    public final android.widget.ImageView playerOverlayPlay;
    @NonNull
    public final android.widget.ImageView playerOverlayRewind;
    @NonNull
    public final android.widget.SeekBar playerOverlaySeekbar;
    @NonNull
    public final android.widget.ImageView playerOverlaySize;
    @NonNull
    public final android.widget.TextView playerOverlayTime;
    @NonNull
    public final android.widget.ImageView playerOverlayTracks;
    @NonNull
    public final android.widget.ImageView playlistNext;
    @NonNull
    public final android.widget.ImageView playlistPrevious;
    @NonNull
    public final android.widget.RelativeLayout progressOverlay;
    // variables
    @Nullable
    private android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress> mProgress;
    @Nullable
    private org.videolan.vlc.gui.video.VideoPlayerActivity mPlayer;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    private OnClickListenerImpl mPlayerOnAudioSubClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mPlayerToggleLoopAndroidViewViewOnLongClickListener;
    // Inverse Binding Event Handlers

    public PlayerHudBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.lockOverlayButton = (android.widget.ImageView) bindings[4];
        this.lockOverlayButton.setTag(null);
        this.playerOverlayAdvFunction = (android.widget.ImageView) bindings[9];
        this.playerOverlayAdvFunction.setTag(null);
        this.playerOverlayButtons = (android.widget.LinearLayout) bindings[11];
        this.playerOverlayForward = (android.widget.ImageView) bindings[13];
        this.playerOverlayLength = (android.widget.TextView) bindings[3];
        this.playerOverlayLength.setTag(null);
        this.playerOverlayPlay = (android.widget.ImageView) bindings[7];
        this.playerOverlayPlay.setTag(null);
        this.playerOverlayRewind = (android.widget.ImageView) bindings[12];
        this.playerOverlaySeekbar = (android.widget.SeekBar) bindings[1];
        this.playerOverlaySeekbar.setTag(null);
        this.playerOverlaySize = (android.widget.ImageView) bindings[10];
        this.playerOverlaySize.setTag(null);
        this.playerOverlayTime = (android.widget.TextView) bindings[2];
        this.playerOverlayTime.setTag(null);
        this.playerOverlayTracks = (android.widget.ImageView) bindings[5];
        this.playerOverlayTracks.setTag(null);
        this.playlistNext = (android.widget.ImageView) bindings[8];
        this.playlistNext.setTag(null);
        this.playlistPrevious = (android.widget.ImageView) bindings[6];
        this.playlistPrevious.setTag(null);
        this.progressOverlay = (android.widget.RelativeLayout) bindings[0];
        this.progressOverlay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 5);
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback11 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback12 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback10 = new android.databinding.generated.callback.OnClickListener(this, 6);
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
        if (BR.progress == variableId) {
            setProgress((android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress>) variable);
        }
        else if (BR.player == variableId) {
            setPlayer((org.videolan.vlc.gui.video.VideoPlayerActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProgress(@Nullable android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress> Progress) {
        updateLiveDataRegistration(0, Progress);
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    @Nullable
    public android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress> getProgress() {
        return mProgress;
    }
    public void setPlayer(@Nullable org.videolan.vlc.gui.video.VideoPlayerActivity Player) {
        this.mPlayer = Player;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.player);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.video.VideoPlayerActivity getPlayer() {
        return mPlayer;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgress((android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgress(android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress> Progress, int fieldId) {
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
        org.videolan.vlc.media.Progress progressGetValue = null;
        long progressLength = 0L;
        int intProgressTime = 0;
        android.arch.lifecycle.LiveData<org.videolan.vlc.media.Progress> progress = mProgress;
        int intProgressLength = 0;
        android.view.View.OnClickListener playerOnAudioSubClickAndroidViewViewOnClickListener = null;
        android.view.View.OnLongClickListener playerToggleLoopAndroidViewViewOnLongClickListener = null;
        java.lang.String toolsMillisToStringProgressTime = null;
        org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;

        if ((dirtyFlags & 0x5L) != 0) {



                if (progress != null) {
                    // read progress.getValue()
                    progressGetValue = progress.getValue();
                }


                if (progressGetValue != null) {
                    // read progress.getValue().time
                    progressTime = progressGetValue.getTime();
                    // read progress.getValue().length
                    progressLength = progressGetValue.getLength();
                }


                // read (int) progress.getValue().time
                intProgressTime = ((int) (progressTime));
                // read Tools.millisToString(progress.getValue().time)
                toolsMillisToStringProgressTime = org.videolan.medialibrary.Tools.millisToString(progressTime);
                // read (int) progress.getValue().length
                intProgressLength = ((int) (progressLength));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (player != null) {
                    // read player::onAudioSubClick
                    playerOnAudioSubClickAndroidViewViewOnClickListener = (((mPlayerOnAudioSubClickAndroidViewViewOnClickListener == null) ? (mPlayerOnAudioSubClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mPlayerOnAudioSubClickAndroidViewViewOnClickListener).setValue(player));
                    // read player::toggleLoop
                    playerToggleLoopAndroidViewViewOnLongClickListener = (((mPlayerToggleLoopAndroidViewViewOnLongClickListener == null) ? (mPlayerToggleLoopAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mPlayerToggleLoopAndroidViewViewOnLongClickListener).setValue(player));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.lockOverlayButton.setOnClickListener(mCallback7);
            this.playerOverlayAdvFunction.setOnClickListener(mCallback11);
            this.playerOverlayLength.setOnClickListener(mCallback6);
            this.playerOverlayPlay.setOnClickListener(mCallback9);
            this.playerOverlaySize.setOnClickListener(mCallback12);
            this.playerOverlayTime.setOnClickListener(mCallback5);
            this.playlistNext.setOnClickListener(mCallback10);
            this.playlistPrevious.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            org.videolan.vlc.gui.video.VideoPlayerActivity.setPlaybackTime(this.playerOverlayLength, progressLength, progressTime);
            android.databinding.adapters.SeekBarBindingAdapter.setProgress(this.playerOverlaySeekbar, intProgressTime);
            org.videolan.vlc.gui.video.VideoPlayerActivity.setProgressMax(this.playerOverlaySeekbar, intProgressLength);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.playerOverlayTime, toolsMillisToStringProgressTime);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.playerOverlayPlay.setOnLongClickListener(playerToggleLoopAndroidViewViewOnLongClickListener);
            this.playerOverlayTracks.setOnClickListener(playerOnAudioSubClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.video.VideoPlayerActivity value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoPlayerActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAudioSubClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.video.VideoPlayerActivity value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.video.VideoPlayerActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.toggleLoop(arg0);
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.doPlayPause();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.previous();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.toggleLock();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.showAdvancedOptions();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.toggleTimeDisplay();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.resizeVideo();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.toggleTimeDisplay();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                org.videolan.vlc.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.next();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static PlayerHudBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlayerHudBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PlayerHudBinding>inflate(inflater, org.videolan.vlc.R.layout.player_hud, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static PlayerHudBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlayerHudBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.player_hud, null, false), bindingComponent);
    }
    @NonNull
    public static PlayerHudBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static PlayerHudBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/player_hud_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PlayerHudBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): progress
        flag 1 (0x2L): player
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}