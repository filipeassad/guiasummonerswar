package br.caos.guiasw.fragments;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.adapters.BasicoAdapter;
import br.caos.guiasw.model.ItemList;

/**
 * Created by 0118431 on 22/08/2016.
 */
public class FragmentTimesBatalhas extends Fragment {

    private ListView lvBatalha;
    private List<ItemList> lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_time_batalhas, container, false);
        lvBatalha = (ListView) view.findViewById(R.id.lvBatalha);

        carregaLista();
        carregaListView();

        return view;
    }

    private void carregaLista(){

        lista = new ArrayList<>();
        lista.add(new ItemList("Times de Ataque Arena", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Times de Ataque GVG", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Times de Defesa Arena", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Times de Defesa GVG", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

    }

    private void carregaListView(){
        BasicoAdapter basicoAdapter = new BasicoAdapter(getContext(), R.layout.adapter_basicos, lista);
        lvBatalha.setAdapter(basicoAdapter);
    }


}
