package br.caos.guiasw.fragments;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.adapters.BasicoAdapter;
import br.caos.guiasw.model.ItemList;

/**
 * Created by 0118431 on 22/08/2016.
 */
public class FragmentTimesDG extends Fragment {

    private ListView lvTimes;
    private List<ItemList> lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_times_dg, container, false);

        lvTimes = (ListView) view.findViewById(R.id.lvTimes);

        carregaLista();
        carregaListView();

        return view;

    }

    private void carregaLista(){

        lista = new ArrayList<>();

        lista.add(new ItemList("Time Giant B7", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Giant B8", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Giant B9", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Giant B10", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

        lista.add(new ItemList("Time Dragon B7", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Dragon B8", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Dragon B9", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Dragon B10", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

        lista.add(new ItemList("Time Necro B7", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Necro B8", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Necro B9", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Necro B10", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

        lista.add(new ItemList("Time Hall of Light", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Hall of Dark", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Hall of Fire", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Hall of Water", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));
        lista.add(new ItemList("Time Hall of Wind", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

        lista.add(new ItemList("Time Hall of Magic", BitmapFactory.decodeResource(this.getResources(), R.drawable.legendaryl)));

    }

    private void carregaListView(){
        BasicoAdapter basicoAdapter = new BasicoAdapter(getContext(), R.layout.adapter_basicos, lista);
        lvTimes.setAdapter(basicoAdapter);
    }
}
