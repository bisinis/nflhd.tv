package nba.hd.tv.menu;


import java.util.ArrayList;
import java.util.List;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
import nba.hd.tv.models.LiveChannel;
import nba.hd.tv.models.LiveGame;
import nba.hd.tv.models.Replay;


public interface MenuView extends MvpView {
    @StateStrategyType(AddToEndSingleStrategy.class)
    void showLiveChannels(List<LiveChannel> liveChannels);
    @StateStrategyType(AddToEndSingleStrategy.class)
    void showLiveGames(List<LiveGame> livegames);
    @StateStrategyType(AddToEndSingleStrategy.class)
    void showReplays(List<Replay> replays);
    @StateStrategyType(SkipStrategy.class)
    void showTranslations(ArrayList<String> links);
    @StateStrategyType(SkipStrategy.class)
    void showTranslation(String link);
    @StateStrategyType(SkipStrategy.class)
    void showError(int error);
    @StateStrategyType(SkipStrategy.class)
    void backToLogin();
    @StateStrategyType(SkipStrategy.class)
    void showErrorExpired(String error);
}
