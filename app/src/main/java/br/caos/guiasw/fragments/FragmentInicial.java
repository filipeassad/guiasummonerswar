package br.caos.guiasw.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.caos.guiasw.R;
import br.caos.guiasw.interfaces.FragPrincInterface;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class FragmentInicial extends Fragment {

    private FragPrincInterface fragPrincInterface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inicial, container, false);
        return view;

    }

    public void setFragPrincInterface(FragPrincInterface fragPrincInterface) {
        this.fragPrincInterface = fragPrincInterface;
    }

}
