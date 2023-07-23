package org.example.gui;
import org.example.Program;
import java.util.Collections;

public class View {
    public static int step = 0;
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String mid10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    public static void view(){
        if (step++ == 0) {
            System.out.print(AnsiColors.ANSI_RED+"First step!"+AnsiColors.ANSI_RESET);
            System.out.print(AnsiColors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "White Team" + AnsiColors.ANSI_RESET);
            System.out.println(AnsiColors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Black Team" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step: "+step+AnsiColors.ANSI_RESET);
            System.out.print(AnsiColors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "White Team" + AnsiColors.ANSI_RESET);
            System.out.println(AnsiColors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Black Team" + AnsiColors.ANSI_RESET);
        }
        System.out.println(View.top10);
        int npcIndex = 0;
        for (int i = 1; i <= Program.Party_Size - 1; i++) {
            for (int j = 1; j <= Program.Party_Size; j++) {
                System.out.print(getChar(new Coords(j, i)));
            }
            System.out.print("|");
            System.out.println(PrintInfo(npcIndex));
            System.out.println(View.mid10);
            npcIndex++;
        }

        for (int j = 1; j <= Program.Party_Size; j++) {
            System.out.print(getChar(new Coords(j, Program.Party_Size)));
        }
        System.out.print("|");
        System.out.println(PrintInfo(npcIndex));
        System.out.println(View.bottom10);
    }
    private static String getChar(Coords coords){

        String str = "| ";
        boolean alive = false;
        for (int i = 0; i < Program.Party_Size; i++) {
            if (Program.teamWhite.get(i).getCoord().isEquals(coords))
            {
                if(Program.teamWhite.get(i).getHealth() == 0)
                    str ="|"+AnsiColors.ANSI_RED+Program.teamWhite.get(i).getType().toUpperCase().charAt(0)+AnsiColors.ANSI_RESET;
                else {
                    str ="|"+AnsiColors.ANSI_GREEN+Program.teamWhite.get(i).getType().toUpperCase().charAt(0)+AnsiColors.ANSI_RESET;
                    alive = true;
                }
            }
            if (Program.teamBlack.get(i).getCoord().isEquals(coords) && !alive)
            {
                if(Program.teamBlack.get(i).getHealth() == 0)
                    str ="|"+AnsiColors.ANSI_RED+ Program.teamBlack.get(i).getType().toUpperCase().charAt(0)+AnsiColors.ANSI_RESET;
                else str ="|"+AnsiColors.ANSI_BLUE+ Program.teamBlack.get(i).getType().toUpperCase().charAt(0)+AnsiColors.ANSI_RESET;
            }
        }
        return str;
    }
    private static String PrintInfo(int npcIndex)
    {
        String str = "";

        if(Program.teamWhite.get(npcIndex).getHealth() == 0)
            str +="     " + AnsiColors.ANSI_RED+Program.teamWhite.get(npcIndex).toString()+AnsiColors.ANSI_RESET;
        else str +="     " + AnsiColors.ANSI_GREEN+Program.teamWhite.get(npcIndex).toString()+AnsiColors.ANSI_RESET;
        if(Program.teamBlack.get(npcIndex).getHealth() == 0)
            str +="     " + AnsiColors.ANSI_RED+Program.teamBlack.get(npcIndex).toString()+AnsiColors.ANSI_RESET;
        else str +="     " + AnsiColors.ANSI_BLUE+Program.teamBlack.get(npcIndex).toString()+AnsiColors.ANSI_RESET;

        return str;
    }
    private static String formatDiv(String str){
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500')
                .replace("s", "...")
                .replace("o", "___");
    }

    public enum NameHero {
        Ichiban_Kasuga, Yu_Nanba, Koichi_Adachi, Saeko_Mukoda, Joon_gi_Han, Tianyou_Zhao
    }
}