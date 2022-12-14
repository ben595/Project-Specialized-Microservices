package com.hoang.ScoreService.controllers;

import com.hoang.ScoreService.models.Score;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
    // Fake data
    private Score[] scores = {
        new Score("S1", 7),
        new Score("S2", 9),
        new Score("S3", 8)
    };

    @RequestMapping(value = "/scores", method = RequestMethod.GET)
    public Score[] getAllScores() {
        return scores;
    }

    @RequestMapping(value = "/scores/student/{idStudent}", method = RequestMethod.GET)
    public int getStudentScore(@PathVariable("idStudent") String id) {
        for(var i = 0; i < scores.length; i++) {
            Score score = scores[i];
            if(score.getIdStudent().equals(id)) {
                return score.getScore();
            }
        }

        return 0;
    }
}
