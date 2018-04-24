package xo;

import xo.model.Field;
import xo.model.Figure;
import xo.model.Game;
import xo.model.Player;
import xo.view.ConsoleView;

public class XOCLI {

    public static void main(String[] args) {
        final String name1 = "Sergei";
        final String name2 = "Olga";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[0] = new Player(name2, Figure.O);

        final Game game = new Game(players, new Field(3), "Game");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(game);
        while (consoleView.move(game)) {
            consoleView.show(game);
        }

    }

}
