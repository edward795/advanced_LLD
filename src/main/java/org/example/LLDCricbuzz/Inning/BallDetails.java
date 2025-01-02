package org.example.LLDCricbuzz.Inning;

import org.example.LLDCricbuzz.ScoreUpdator.BattingScoreUpdater;
import org.example.LLDCricbuzz.ScoreUpdator.ScoreUpdaterObserver;
import org.example.LLDCricbuzz.Team.Player.PlayerDetails;
import org.example.LLDCricbuzz.Team.Team;
import org.example.LLDCricbuzz.Team.Wicket;
import org.example.LLDCricbuzz.Team.WicketType;

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

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
    }

    public void startBallDelivery(Team battingTeam,Team bowwlingTeam,OverDetails over){
        playedBy=battingTeam.getStriker();
        this.bowledBy=over.bowledBy;
        ballType=BallType.NORMAL;

        if(isWicketTaken()){
            runType=RunType.ZERO;
            wicket=new Wicket(WicketType.BOLD,bowwlingTeam.getCurrentBowler(),over,this);
            battingTeam.setStriker(null);
        }else{
            runType=getRunType();

            if(runType==RunType.ONE || runType==RunType.THREE){
                PlayerDetails temp=battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }

        notifyUpdaters(this);
    }

    private void notifyUpdaters(BallDetails ballDetails){
        for(ScoreUpdaterObserver observer:scoreUpdaterObserverList){
            observer.update(ballDetails);
        }
    }

    private RunType getRunType(){
        double val=Math.random();
        if(val<=0.2){
            return RunType.ONE;
        }else if(val>=0.3 && val<=0.5){
            return RunType.TWO;
        }else if(val>=0.6 && val<=0.8){
            return RunType.FOUR;
        }else{
            return RunType.SIX;
        }
    }

    private boolean isWicketTaken() {
        if(Math.random()<0.2){
            return true;
        }else{
            return false;
        }
    }
}
