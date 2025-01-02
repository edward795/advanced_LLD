package org.example.LLDCricbuzz.Team;

import org.example.LLDCricbuzz.Team.Player.PlayerBattingController;
import org.example.LLDCricbuzz.Team.Player.PlayerBowlingController;
import org.example.LLDCricbuzz.Team.Player.PlayerDetails;

import java.util.List;
import java.util.Queue;

public class Team {
    public String teamName;
    public Queue<PlayerDetails> playing11;

    public List<PlayerDetails> bench;
    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;

    public Team(String teamName, Queue<PlayerDetails> playing11, List<PlayerDetails> bench, PlayerBattingController battingController, PlayerBowlingController bowlingController) {
        this.teamName = teamName;
        this.playing11 = playing11;
        this.bench = bench;
        this.battingController = battingController;
        this.bowlingController = bowlingController;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Queue<PlayerDetails> getPlaying11() {
        return playing11;
    }

    public void setPlaying11(Queue<PlayerDetails> playing11) {
        this.playing11 = playing11;
    }

    public List<PlayerDetails> getBench() {
        return bench;
    }

    public void setBench(List<PlayerDetails> bench) {
        this.bench = bench;
    }

    public PlayerBattingController getBattingController() {
        return battingController;
    }

    public void setBattingController(PlayerBattingController battingController) {
        this.battingController = battingController;
    }

    public PlayerBowlingController getBowlingController() {
        return bowlingController;
    }

    public void setBowlingController(PlayerBowlingController bowlingController) {
        this.bowlingController = bowlingController;
    }

    public void chooseNextBatsMan() throws Exception {
        battingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler) {
        bowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public PlayerDetails getStriker() {
        return battingController.getStriker();
    }

    public PlayerDetails getNonStriker() {
        return battingController.getNonStriker();
    }

    public void setStriker(PlayerDetails player) {
        battingController.setStriker(player);
    }

    public void setNonStriker(PlayerDetails player) {
        battingController.setNonStriker(player);
    }

    public PlayerDetails getCurrentBowler() {
        return bowlingController.getCurrentBowler();
    }

    public void printBattingScoreCard() {

        for (PlayerDetails playerDetails : playing11) {
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard() {

        for (PlayerDetails playerDetails : playing11) {
            if (playerDetails.bowlingScoreCard.totalOversCount > 0) {
                playerDetails.printBowlingScoreCard();
            }
        }
    }

    public int getTotalRuns() {
        int totalRun = 0;
        for (PlayerDetails player : playing11) {

            totalRun += player.battingScoreCard.totalRuns;
        }
        return totalRun;


    }
}
