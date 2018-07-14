package org.videolan.vlc.databinding;
import org.videolan.vlc.R;
import org.videolan.vlc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AudioPlayerBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backgroundView, 15);
        sViewsWithIds.put(R.id.progressBar, 16);
        sViewsWithIds.put(R.id.header, 17);
        sViewsWithIds.put(R.id.audio_media_switcher, 18);
        sViewsWithIds.put(R.id.playlist_search_text, 19);
        sViewsWithIds.put(R.id.timeline, 20);
        sViewsWithIds.put(R.id.length, 21);
    }
    // views
    @NonNull
    public final android.widget.ImageView advFunction;
    @NonNull
    public final org.videolan.vlc.gui.view.HeaderMediaSwitcher audioMediaSwitcher;
    @NonNull
    public final android.widget.ImageView backgroundView;
    @NonNull
    public final android.support.constraint.ConstraintLayout contentLayout;
    @NonNull
    public final org.videolan.vlc.gui.view.CoverMediaSwitcher coverMediaSwitcher;
    @NonNull
    public final android.widget.LinearLayout header;
    @NonNull
    public final android.widget.ImageView headerPlayPause;
    @NonNull
    public final android.widget.TextView headerTime;
    @NonNull
    public final android.widget.TextView length;
    @NonNull
    public final android.widget.ImageView next;
    @NonNull
    public final android.widget.ImageView playPause;
    @NonNull
    public final android.widget.ImageView playlistPlayasaudioOff;
    @NonNull
    public final android.widget.ImageView playlistSearch;
    @NonNull
    public final android.support.design.widget.TextInputLayout playlistSearchText;
    @NonNull
    public final android.widget.ImageView playlistSwitch;
    @NonNull
    public final android.widget.ImageView previous;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    @NonNull
    public final android.widget.ImageView repeat;
    @NonNull
    public final android.widget.ImageView shuffle;
    @NonNull
    public final android.support.v7.widget.RecyclerView songsList;
    @NonNull
    public final android.widget.TextView time;
    @NonNull
    public final android.widget.SeekBar timeline;
    // variables
    @Nullable
    private org.videolan.vlc.gui.audio.AudioPlayer mFragment;
    @Nullable
    private boolean mShowCover;
    // values
    // listeners
    private OnClickListenerImpl mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mFragmentOnRepeatClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mFragmentOnSearchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mFragmentOnPlayPauseClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl6 mFragmentOnTimeLabelClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mFragmentOnShuffleClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mFragmentOnStopClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl8 mFragmentOnPreviousClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl9 mFragmentOnNextClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AudioPlayerBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds);
        this.advFunction = (android.widget.ImageView) bindings[4];
        this.advFunction.setTag(null);
        this.audioMediaSwitcher = (org.videolan.vlc.gui.view.HeaderMediaSwitcher) bindings[18];
        this.backgroundView = (android.widget.ImageView) bindings[15];
        this.contentLayout = (android.support.constraint.ConstraintLayout) bindings[0];
        this.contentLayout.setTag(null);
        this.coverMediaSwitcher = (org.videolan.vlc.gui.view.CoverMediaSwitcher) bindings[8];
        this.coverMediaSwitcher.setTag(null);
        this.header = (android.widget.LinearLayout) bindings[17];
        this.headerPlayPause = (android.widget.ImageView) bindings[6];
        this.headerPlayPause.setTag(null);
        this.headerTime = (android.widget.TextView) bindings[5];
        this.headerTime.setTag(null);
        this.length = (android.widget.TextView) bindings[21];
        this.next = (android.widget.ImageView) bindings[13];
        this.next.setTag(null);
        this.playPause = (android.widget.ImageView) bindings[12];
        this.playPause.setTag(null);
        this.playlistPlayasaudioOff = (android.widget.ImageView) bindings[1];
        this.playlistPlayasaudioOff.setTag(null);
        this.playlistSearch = (android.widget.ImageView) bindings[2];
        this.playlistSearch.setTag(null);
        this.playlistSearchText = (android.support.design.widget.TextInputLayout) bindings[19];
        this.playlistSwitch = (android.widget.ImageView) bindings[3];
        this.playlistSwitch.setTag(null);
        this.previous = (android.widget.ImageView) bindings[14];
        this.previous.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[16];
        this.repeat = (android.widget.ImageView) bindings[11];
        this.repeat.setTag(null);
        this.shuffle = (android.widget.ImageView) bindings[10];
        this.shuffle.setTag(null);
        this.songsList = (android.support.v7.widget.RecyclerView) bindings[7];
        this.songsList.setTag(null);
        this.time = (android.widget.TextView) bindings[9];
        this.time.setTag(null);
        this.timeline = (android.widget.SeekBar) bindings[20];
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
        if (BR.fragment == variableId) {
            setFragment((org.videolan.vlc.gui.audio.AudioPlayer) variable);
        }
        else if (BR.showCover == variableId) {
            setShowCover((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable org.videolan.vlc.gui.audio.AudioPlayer Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    @Nullable
    public org.videolan.vlc.gui.audio.AudioPlayer getFragment() {
        return mFragment;
    }
    public void setShowCover(boolean ShowCover) {
        this.mShowCover = ShowCover;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.showCover);
        super.requestRebind();
    }
    public boolean getShowCover() {
        return mShowCover;
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
        android.view.View.OnClickListener fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnResumeToVideoClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnRepeatClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnSearchClickAndroidViewViewOnClickListener = null;
        int showCoverViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnPlayPauseClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnTimeLabelClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnShuffleClickAndroidViewViewOnClickListener = null;
        org.videolan.vlc.gui.audio.AudioPlayer fragment = mFragment;
        android.view.View.OnLongClickListener fragmentOnStopClickAndroidViewViewOnLongClickListener = null;
        android.view.View.OnClickListener fragmentOnPreviousClickAndroidViewViewOnClickListener = null;
        int showCoverViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener fragmentOnNextClickAndroidViewViewOnClickListener = null;
        boolean showCover = mShowCover;

        if ((dirtyFlags & 0x5L) != 0) {



                if (fragment != null) {
                    // read fragment::onPlaylistSwitchClick
                    fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = (((mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onResumeToVideoClick
                    fragmentOnResumeToVideoClickAndroidViewViewOnClickListener = (((mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener == null) ? (mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mFragmentOnResumeToVideoClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onRepeatClick
                    fragmentOnRepeatClickAndroidViewViewOnClickListener = (((mFragmentOnRepeatClickAndroidViewViewOnClickListener == null) ? (mFragmentOnRepeatClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mFragmentOnRepeatClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onSearchClick
                    fragmentOnSearchClickAndroidViewViewOnClickListener = (((mFragmentOnSearchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnSearchClickAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mFragmentOnSearchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::showAdvancedOptions
                    fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = (((mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener == null) ? (mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onPlayPauseClick
                    fragmentOnPlayPauseClickAndroidViewViewOnClickListener = (((mFragmentOnPlayPauseClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlayPauseClickAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mFragmentOnPlayPauseClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onTimeLabelClick
                    fragmentOnTimeLabelClickAndroidViewViewOnClickListener = (((mFragmentOnTimeLabelClickAndroidViewViewOnClickListener == null) ? (mFragmentOnTimeLabelClickAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mFragmentOnTimeLabelClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onShuffleClick
                    fragmentOnShuffleClickAndroidViewViewOnClickListener = (((mFragmentOnShuffleClickAndroidViewViewOnClickListener == null) ? (mFragmentOnShuffleClickAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mFragmentOnShuffleClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onStopClick
                    fragmentOnStopClickAndroidViewViewOnLongClickListener = (((mFragmentOnStopClickAndroidViewViewOnLongClickListener == null) ? (mFragmentOnStopClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mFragmentOnStopClickAndroidViewViewOnLongClickListener).setValue(fragment));
                    // read fragment::onPreviousClick
                    fragmentOnPreviousClickAndroidViewViewOnClickListener = (((mFragmentOnPreviousClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPreviousClickAndroidViewViewOnClickListener = new OnClickListenerImpl8()) : mFragmentOnPreviousClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onNextClick
                    fragmentOnNextClickAndroidViewViewOnClickListener = (((mFragmentOnNextClickAndroidViewViewOnClickListener == null) ? (mFragmentOnNextClickAndroidViewViewOnClickListener = new OnClickListenerImpl9()) : mFragmentOnNextClickAndroidViewViewOnClickListener).setValue(fragment));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {

            if((dirtyFlags & 0x6L) != 0) {
                if(showCover) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read showCover ? View.VISIBLE : View.GONE
                showCoverViewVISIBLEViewGONE = ((showCover) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read showCover ? View.GONE : View.VISIBLE
                showCoverViewGONEViewVISIBLE = ((showCover) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.advFunction.setOnClickListener(fragmentShowAdvancedOptionsAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.headerTime.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
            this.next.setOnClickListener(fragmentOnNextClickAndroidViewViewOnClickListener);
            this.playPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.playPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.playlistPlayasaudioOff.setOnClickListener(fragmentOnResumeToVideoClickAndroidViewViewOnClickListener);
            this.playlistSearch.setOnClickListener(fragmentOnSearchClickAndroidViewViewOnClickListener);
            this.playlistSwitch.setOnClickListener(fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener);
            this.previous.setOnClickListener(fragmentOnPreviousClickAndroidViewViewOnClickListener);
            this.repeat.setOnClickListener(fragmentOnRepeatClickAndroidViewViewOnClickListener);
            this.shuffle.setOnClickListener(fragmentOnShuffleClickAndroidViewViewOnClickListener);
            this.time.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.coverMediaSwitcher.setVisibility(showCoverViewVISIBLEViewGONE);
            this.songsList.setVisibility(showCoverViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlaylistSwitchClick(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl1 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onResumeToVideoClick(arg0);
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl2 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRepeatClick(arg0);
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl3 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSearchClick(arg0);
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl4 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.showAdvancedOptions(arg0);
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl5 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlayPauseClick(arg0);
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl6 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onTimeLabelClick(arg0);
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl7 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onShuffleClick(arg0);
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnLongClickListenerImpl setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onStopClick(arg0);
        }
    }
    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl8 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPreviousClick(arg0);
        }
    }
    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener{
        private org.videolan.vlc.gui.audio.AudioPlayer value;
        public OnClickListenerImpl9 setValue(org.videolan.vlc.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onNextClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static AudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AudioPlayerBinding>inflate(inflater, org.videolan.vlc.R.layout.audio_player, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AudioPlayerBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(org.videolan.vlc.R.layout.audio_player, null, false), bindingComponent);
    }
    @NonNull
    public static AudioPlayerBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AudioPlayerBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/audio_player_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AudioPlayerBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): showCover
        flag 2 (0x3L): null
        flag 3 (0x4L): showCover ? View.VISIBLE : View.GONE
        flag 4 (0x5L): showCover ? View.VISIBLE : View.GONE
        flag 5 (0x6L): showCover ? View.GONE : View.VISIBLE
        flag 6 (0x7L): showCover ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}