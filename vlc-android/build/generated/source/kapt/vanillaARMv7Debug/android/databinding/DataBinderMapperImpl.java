
package android.databinding;
import org.videolan.vlc.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case org.videolan.vlc.R.layout.video_list_card:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/video_list_card_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VideoListCardBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for video_list_card is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.video_grid:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/video_grid_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VideoGridBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for video_grid is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.directory_browser:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/directory_browser_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.DirectoryBrowserBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for directory_browser is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.audio_player:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/audio_player_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.AudioPlayerBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for audio_player is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.browser_item_separator:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/browser_item_separator_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.BrowserItemSeparatorBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for browser_item_separator is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.vlc_login_dialog:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/vlc_login_dialog_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VlcLoginDialogBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for vlc_login_dialog is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.playlist_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/playlist_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.PlaylistItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for playlist_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.search_activity:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/search_activity_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.SearchActivityBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for search_activity is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.item_renderer:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_renderer_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.ItemRendererBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_renderer is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.audio_browser_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/audio_browser_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.AudioBrowserItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for audio_browser_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.tv_simple_list_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/tv_simple_list_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.TvSimpleListItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for tv_simple_list_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.equalizer:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout-land/equalizer_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.EqualizerBindingLandImpl(bindingComponent, view);
                    }
                    if ("layout/equalizer_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.EqualizerBindingImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for equalizer is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.history_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/history_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.HistoryItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for history_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.ml_wizard_activity:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/ml_wizard_activity_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.MlWizardActivityBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for ml_wizard_activity is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.search_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/search_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.SearchItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for search_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.dialog_renderers:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/dialog_renderers_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.DialogRenderersBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for dialog_renderers is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.extension_item_view:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/extension_item_view_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.ExtensionItemViewBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for extension_item_view is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.player_hud:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/player_hud_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.PlayerHudBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for player_hud is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.simple_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/simple_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.SimpleItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for simple_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.tv_audio_player:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/tv_audio_player_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.TvAudioPlayerBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for tv_audio_player is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.context_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/context_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.ContextItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for context_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.video_grid_card:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/video_grid_card_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VideoGridCardBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for video_grid_card is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.playlist_activity:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/playlist_activity_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.PlaylistActivityBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for playlist_activity is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.vlc_progress_dialog:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/vlc_progress_dialog_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VlcProgressDialogBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for vlc_progress_dialog is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.vlc_question_dialog:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/vlc_question_dialog_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.VlcQuestionDialogBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for vlc_question_dialog is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.info_activity:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/info_activity_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.InfoActivityBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for info_activity is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.browser_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/browser_item_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.BrowserItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for browser_item is invalid. Received: " + tag);
                }
                case org.videolan.vlc.R.layout.audio_browser_separator:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/audio_browser_separator_0".equals(tag)) {
                            return new org.videolan.vlc.databinding.AudioBrowserSeparatorBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for audio_browser_separator is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -867279847: {
                if(tag.equals("layout/video_list_card_0")) {
                    return org.videolan.vlc.R.layout.video_list_card;
                }
                break;
            }
            case 1295188096: {
                if(tag.equals("layout/video_grid_0")) {
                    return org.videolan.vlc.R.layout.video_grid;
                }
                break;
            }
            case 2071125794: {
                if(tag.equals("layout/directory_browser_0")) {
                    return org.videolan.vlc.R.layout.directory_browser;
                }
                break;
            }
            case 604276256: {
                if(tag.equals("layout/audio_player_0")) {
                    return org.videolan.vlc.R.layout.audio_player;
                }
                break;
            }
            case 674149798: {
                if(tag.equals("layout/browser_item_separator_0")) {
                    return org.videolan.vlc.R.layout.browser_item_separator;
                }
                break;
            }
            case 609402918: {
                if(tag.equals("layout/vlc_login_dialog_0")) {
                    return org.videolan.vlc.R.layout.vlc_login_dialog;
                }
                break;
            }
            case -1561895892: {
                if(tag.equals("layout/playlist_item_0")) {
                    return org.videolan.vlc.R.layout.playlist_item;
                }
                break;
            }
            case -1853778350: {
                if(tag.equals("layout/search_activity_0")) {
                    return org.videolan.vlc.R.layout.search_activity;
                }
                break;
            }
            case 403737467: {
                if(tag.equals("layout/item_renderer_0")) {
                    return org.videolan.vlc.R.layout.item_renderer;
                }
                break;
            }
            case -1443691447: {
                if(tag.equals("layout/audio_browser_item_0")) {
                    return org.videolan.vlc.R.layout.audio_browser_item;
                }
                break;
            }
            case -780330640: {
                if(tag.equals("layout/tv_simple_list_item_0")) {
                    return org.videolan.vlc.R.layout.tv_simple_list_item;
                }
                break;
            }
            case 2099103778: {
                if(tag.equals("layout-land/equalizer_0")) {
                    return org.videolan.vlc.R.layout.equalizer;
                }
                break;
            }
            case -2033596770: {
                if(tag.equals("layout/equalizer_0")) {
                    return org.videolan.vlc.R.layout.equalizer;
                }
                break;
            }
            case 31139220: {
                if(tag.equals("layout/history_item_0")) {
                    return org.videolan.vlc.R.layout.history_item;
                }
                break;
            }
            case -2106750599: {
                if(tag.equals("layout/ml_wizard_activity_0")) {
                    return org.videolan.vlc.R.layout.ml_wizard_activity;
                }
                break;
            }
            case 363701846: {
                if(tag.equals("layout/search_item_0")) {
                    return org.videolan.vlc.R.layout.search_item;
                }
                break;
            }
            case -1081601457: {
                if(tag.equals("layout/dialog_renderers_0")) {
                    return org.videolan.vlc.R.layout.dialog_renderers;
                }
                break;
            }
            case 1440931485: {
                if(tag.equals("layout/extension_item_view_0")) {
                    return org.videolan.vlc.R.layout.extension_item_view;
                }
                break;
            }
            case 1716517583: {
                if(tag.equals("layout/player_hud_0")) {
                    return org.videolan.vlc.R.layout.player_hud;
                }
                break;
            }
            case 1163795212: {
                if(tag.equals("layout/simple_item_0")) {
                    return org.videolan.vlc.R.layout.simple_item;
                }
                break;
            }
            case -2014442413: {
                if(tag.equals("layout/tv_audio_player_0")) {
                    return org.videolan.vlc.R.layout.tv_audio_player;
                }
                break;
            }
            case -260673511: {
                if(tag.equals("layout/context_item_0")) {
                    return org.videolan.vlc.R.layout.context_item;
                }
                break;
            }
            case 833401969: {
                if(tag.equals("layout/video_grid_card_0")) {
                    return org.videolan.vlc.R.layout.video_grid_card;
                }
                break;
            }
            case -593465048: {
                if(tag.equals("layout/playlist_activity_0")) {
                    return org.videolan.vlc.R.layout.playlist_activity;
                }
                break;
            }
            case 1784601684: {
                if(tag.equals("layout/vlc_progress_dialog_0")) {
                    return org.videolan.vlc.R.layout.vlc_progress_dialog;
                }
                break;
            }
            case 1448886971: {
                if(tag.equals("layout/vlc_question_dialog_0")) {
                    return org.videolan.vlc.R.layout.vlc_question_dialog;
                }
                break;
            }
            case -39095732: {
                if(tag.equals("layout/info_activity_0")) {
                    return org.videolan.vlc.R.layout.info_activity;
                }
                break;
            }
            case 732893312: {
                if(tag.equals("layout/browser_item_0")) {
                    return org.videolan.vlc.R.layout.browser_item;
                }
                break;
            }
            case 774895153: {
                if(tag.equals("layout/audio_browser_separator_0")) {
                    return org.videolan.vlc.R.layout.audio_browser_separator;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"alignMode"
            ,"bgColor"
            ,"checkEnabled"
            ,"clicHandler"
            ,"cover"
            ,"dialog"
            ,"empty"
            ,"extraTitleText"
            ,"extraValueText"
            ,"fragment"
            ,"handler"
            ,"hasContextMenu"
            ,"holder"
            ,"item"
            ,"length"
            ,"max"
            ,"media"
            ,"option"
            ,"path"
            ,"player"
            ,"playlist"
            ,"progress"
            ,"protocol"
            ,"renderer"
            ,"scaleType"
            ,"searchAggregate"
            ,"seen"
            ,"showCover"
            ,"showFavorites"
            ,"sizeTitleText"
            ,"sizeValueText"
            ,"state"
            ,"subTitle"
            ,"time"
            ,"title"
            ,"titleColor"};
    }
}