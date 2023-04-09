package controller;

import command.*;

public enum ActionContainer {
    ENCODE(new Encode()),
    DECODE(new Decode()),
    BRUTEFORCE(new Brutforce()),
    ANALYZE(new Analyze()),
    EXIT(new Exit());

    private final Action action;

    ActionContainer(Action action) {
        this.action = action;
    }
}
