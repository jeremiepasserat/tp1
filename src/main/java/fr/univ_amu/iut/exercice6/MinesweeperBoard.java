package fr.univ_amu.iut.exercice6;

import java.util.List;

public class MinesweeperBoard {

    private List<String> resultBoard;

    public MinesweeperBoard(List<String> inputBoard) {
        this.resultBoard=inputBoard;
    }

    public List<String> getAnnotatedRepresentation() {

       return resultBoard;
    }
}
