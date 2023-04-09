package command;

import entity.Result;

public interface Action {

    Result execute(String[] parameters);

}
