package org.example.LLDCricbuzz.ScoreUpdator;

import org.example.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
