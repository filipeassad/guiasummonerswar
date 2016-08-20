package br.caos.guiasw.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import br.caos.guiasw.R;
import br.caos.guiasw.interfaces.FragPrincInterface;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class FragmentListaMonstros extends Fragment {

    private FragPrincInterface fragPrincInterface;

    private LinearLayout llEstrela;
    private LinearLayout llEstrela2;
    private LinearLayout llEstrela3;
    private LinearLayout llEstrela4;
    private LinearLayout llEstrela5;

    private ListView lvMonstros;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_monstros, container,false);

        llEstrela   = (LinearLayout) view.findViewById(R.id.llEstrela);
        llEstrela2  = (LinearLayout) view.findViewById(R.id.llEstrela2);
        llEstrela3  = (LinearLayout) view.findViewById(R.id.llEstrela3);
        llEstrela4  = (LinearLayout) view.findViewById(R.id.llEstrela4);
        llEstrela5  = (LinearLayout) view.findViewById(R.id.llEstrela5);

        lvMonstros  = (ListView) view.findViewById(R.id.lvMonstros);


        return view;
    }

    public void setFragPrincInterface(FragPrincInterface fragPrincInterface) {
        this.fragPrincInterface = fragPrincInterface;
    }
}
