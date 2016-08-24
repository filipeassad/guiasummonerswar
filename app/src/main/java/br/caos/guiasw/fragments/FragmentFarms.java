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
public class FragmentFarms extends Fragment {

    private ListView lvFarms;
    private List<ItemList> lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_farms, container, false);

        lvFarms = (ListView) view.findViewById(R.id.lvFarms);

        carregalista();
        carregaListView();

        return view;
    }

    private void carregalista(){
        lista = new ArrayList<>();

        lista.add(new ItemList("Farms de Mana", BitmapFactory.decodeResource(this.getResources(), R.drawable.icomana)));
        lista.add(new ItemList("Farms de Runas", BitmapFactory.decodeResource(this.getResources(), R.drawable.despiarico)));
        lista.add(new ItemList("Farms de Essências", BitmapFactory.decodeResource(this.getResources(), R.drawable.high_water_essence)));
        lista.add(new ItemList("Farms de EXP", BitmapFactory.decodeResource(this.getResources(), R.drawable.expbooster)));
    }

    private void carregaListView(){
        BasicoAdapter basicoAdapter = new BasicoAdapter(getContext(), R.layout.adapter_basicos, lista);
        lvFarms.setAdapter(basicoAdapter);
    }



}
