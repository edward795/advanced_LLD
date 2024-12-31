package org.example.LLDCricbuzz.Inning;

import org.example.LLDCricbuzz.ScoreUpdator.ScoreUpdaterObserver;
import org.example.LLDCricbuzz.Team.Player.PlayerDetails;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails playedBy;
    public PlayerDetails bowledBy;
    List<ScoreUpdaterObserver> scoreUpdaterObserverList=new ArrayList<>();
}
