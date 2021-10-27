# Bowling
This description is based on Adventures in C#: The Bowling Game

## Problem Description
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

* We will not check for valid rolls.
* We will not check for correct number of rolls and frames.
* We will not provide scores for intermediate frames.

#### We can briefly summarize the scoring for this form of bowling:

Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
* In each frame, the bowler gets up to two tries to knock down all the pins.
    * Open frame
        * If in two tries, they fail to knock them all down, this is called an "open frame"
        * the score for that frame is the sum of pins knocked down.
    * Spare
        * If in two rolls they knocks them all down, this is called a "spare"
        * the score for the frame is ten plus the next roll.
    * Strike
        * If on the first roll in a frame all ten pins are knocked down, this is called a "strike"
        * the score for the frame is ten plus the total of the next two rolls.
* The game score is the sum of all frame scores.