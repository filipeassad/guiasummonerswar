package br.caos.guiasw.estaticos;

import br.caos.guiasw.model.Monstro;

/**
 * Created by Filipe on 21/08/2016.
 */
public class VariaveisEstaticas {

    private static Monstro monstroEstatico;
    private static int proximaTela;

    public static Monstro getMonstroEstatico() {
        return monstroEstatico;
    }

    public static void setMonstroEstatico(Monstro monstroEstatico) {
        VariaveisEstaticas.monstroEstatico = monstroEstatico;
    }

    public static int getProximaTela() {
        return proximaTela;
    }

    public static void setProximaTela(int proximaTela) {
        VariaveisEstaticas.proximaTela = proximaTela;
    }
}
