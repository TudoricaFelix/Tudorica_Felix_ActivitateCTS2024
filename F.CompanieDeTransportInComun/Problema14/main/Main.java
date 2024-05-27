package Problema14.main;

import Problema14.Template.AOpririTramvai;
import Problema14.Template.StatiiTramvai;

public class Main {
    public static void main(String[] args) {
        AOpririTramvai statiiTramvai = new StatiiTramvai();
        System.out.println("Tramvaiul parcurge urmatorul traseu cand merge in fata:");
        statiiTramvai.proceduraOprireTramvaiInFata();

        System.out.println("\nTramvaiul parcurge urmatorul traseu cand merge in sens invers:");
        statiiTramvai.proceduraOprireTramvaiSensInvers();
    }
}
