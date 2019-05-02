package lorganisation.projectrpg;

import com.limelion.anscapes.Anscapes;
import lorganisation.projectrpg.player.AbstractPlayer;
import lorganisation.projectrpg.player.Character;
import lorganisation.projectrpg.player.Player;
import lorganisation.projectrpg.utils.Utils;
import org.jline.terminal.Terminal;

public class TerminalGameRenderer {

    private Terminal terminal;

    public TerminalGameRenderer(Terminal terminal) {

        super();
        this.terminal = terminal;
    }

    public void render(Game g) {

        Utils.clearTerm();

        write(0, 0, g.getMap().visual());

        for (AbstractPlayer player : g.getPlayers().asList())
            for (Character character : player.getCharacters().asList())
                write(character.getX(), character.getY(), player.getColor().fg() + character.getIcon());
    }

    private void write(int x, int y, String s) {

        // La première case sur un terminal est (1,1)
        // On décale pour pouvoir mettre (0,0)
        // On inverse x et y, car la convention est ligne, colonne
        System.out.print(Anscapes.cursorPos(y + 1, x + 1));
        System.out.print(s + Anscapes.RESET);
        System.out.print(Anscapes.cursorPos(y + 1, x + 1)); // On refout le curseur là où on a écrit pour avoir le blinking sur cette case et pas celle d'après
    }
}
