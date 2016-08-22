package br.caos.guiasw.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.adapters.MonstroAdapter;
import br.caos.guiasw.estaticos.VariaveisEstaticas;
import br.caos.guiasw.interfaces.FragPrincInterface;
import br.caos.guiasw.model.Monstro;
import br.caos.guiasw.persistencia.MonstroDataSource;

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

    private MonstroDataSource monstroDataSource;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_monstros, container,false);

        llEstrela   = (LinearLayout) view.findViewById(R.id.llEstrela);
        llEstrela2  = (LinearLayout) view.findViewById(R.id.llEstrela2);
        llEstrela3  = (LinearLayout) view.findViewById(R.id.llEstrela3);
        llEstrela4  = (LinearLayout) view.findViewById(R.id.llEstrela4);
        llEstrela5  = (LinearLayout) view.findViewById(R.id.llEstrela5);

        lvMonstros  = (ListView) view.findViewById(R.id.lvMonstros);

        monstroDataSource = new MonstroDataSource(getContext());

        List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(1);

        MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
        lvMonstros.setAdapter(monstroAdapter);

        acoes();

        return view;
    }

    private void acoes(){

        llEstrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(1);
                MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
                lvMonstros.setAdapter(monstroAdapter);
            }
        });

        llEstrela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(2);
                MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
                lvMonstros.setAdapter(monstroAdapter);
            }
        });

        llEstrela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(3);
                MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
                lvMonstros.setAdapter(monstroAdapter);
            }
        });

        llEstrela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(4);
                MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
                lvMonstros.setAdapter(monstroAdapter);
            }
        });

        llEstrela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Monstro> listMonstros = monstroDataSource.getMonstrosByEstrela(5);
                MonstroAdapter monstroAdapter = new MonstroAdapter(getContext(), R.layout.adapter_list_monstros,listMonstros);
                lvMonstros.setAdapter(monstroAdapter);
            }
        });

        lvMonstros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                VariaveisEstaticas.setMonstroEstatico((Monstro) lvMonstros.getItemAtPosition(position));
                fragPrincInterface.changeScreen(6);
            }
        });
    }

    public void setFragPrincInterface(FragPrincInterface fragPrincInterface) {
        this.fragPrincInterface = fragPrincInterface;
    }
}
