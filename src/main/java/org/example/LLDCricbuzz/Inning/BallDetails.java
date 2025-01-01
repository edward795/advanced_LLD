package org.example.LLDCricbuzz.Inning;

import org.example.LLDCricbuzz.ScoreUpdator.ScoreUpdaterObserver;
import org.example.LLDCricbuzz.Team.Player.PlayerDetails;
import org.example.LLDCricbuzz.Team.Wicket;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails playedBy;
    public PlayerDetails bowledBy;
    public Wicket wicket;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList=new ArrayList<>();
}
