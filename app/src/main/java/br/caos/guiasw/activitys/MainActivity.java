package br.caos.guiasw.activitys;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.caos.guiasw.R;
import br.caos.guiasw.adapters.MenuAdapter;
import br.caos.guiasw.fragments.FragmentDetalheMonstro;
import br.caos.guiasw.fragments.FragmentInicial;
import br.caos.guiasw.fragments.FragmentListaMonstros;
import br.caos.guiasw.interfaces.FragPrincInterface;
import br.caos.guiasw.utilitarios.Animacoes;
import br.caos.guiasw.utilitarios.UtilFragments;

public class MainActivity extends FragmentActivity implements FragPrincInterface{

    private FragmentManager fm = getSupportFragmentManager();

    private LinearLayout llFragments;
    private LinearLayout llMenu;
    private LinearLayout llMenuBar;
    private LinearLayout llOpacidade;
    private FrameLayout flInicial;
    private ListView lvMenu;
    private ImageView btnNavMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llFragments = (LinearLayout) findViewById(R.id.llFragments);
        llMenu      = (LinearLayout) findViewById(R.id.llMenu);
        llMenuBar   = (LinearLayout) findViewById(R.id.llMenuBar);
        llOpacidade = (LinearLayout) findViewById(R.id.llOpacidade);
        btnNavMenu  = (ImageView) findViewById(R.id.btnNavMenu);


        if(savedInstanceState == null){
            FragmentInicial fragmentInicial = new FragmentInicial();
            FragmentTransaction ft = fm.beginTransaction();
            fragmentInicial.setFragPrincInterface(this);
            ft.add(R.id.llFragments, fragmentInicial, "Inicial");
            ft.commit();
        }

        carregaMenu();
        acoesBotoes();

    }

    private void acoesBotoes(){

        btnNavMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(llMenu.getVisibility() == View.VISIBLE){
                    Animacoes.animaSaidaMenu(llMenu, llOpacidade);
                }else{
                    llMenu.setVisibility(View.VISIBLE);
                    Animacoes.animaEntradaMenu(llMenu, llOpacidade);
                }
            }
        });

        llFragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animacoes.animaSaidaMenu(llMenu, llOpacidade);
            }
        });

        llMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animacoes.animaSaidaMenu(llMenu, llOpacidade);
            }
        });

        flInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeScreen(1);
            }
        });

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(lvMenu.getItemAtPosition(position).equals("Monstros")){
                    changeScreen(2);
                }else if(lvMenu.getItemAtPosition(position).equals("Farms")){
                    changeScreen(3);
                }else if(lvMenu.getItemAtPosition(position).equals("Time DG")){
                    changeScreen(3);
                }else if(lvMenu.getItemAtPosition(position).equals("Time Batalha")){
                    changeScreen(3);
                }else if(lvMenu.getItemAtPosition(position).equals("Montagem de Runas")){
                    changeScreen(3);
                }else{
                    changeScreen(1);
                }
            }

        });

    }

    @Override
    public void changeScreen(int numero) {

        switch (numero){
            case 1:
                FragmentInicial fragmentInicial = new FragmentInicial();
                UtilFragments.preparaFragment(fragmentInicial, "Inicial", fm, R.id.llFragments);
                break;

            case 2:
                FragmentListaMonstros fragmentListaMonstros = new FragmentListaMonstros();
                fragmentListaMonstros.setFragPrincInterface(this);
                UtilFragments.preparaFragment(fragmentListaMonstros, "ListaMonstros", fm, R.id.llFragments);
                break;
            case 6:
                FragmentDetalheMonstro fragmentDetalheMonstro = new FragmentDetalheMonstro();
                UtilFragments.preparaFragment(fragmentDetalheMonstro, "DetalheMonstro", fm, R.id.llFragments);
                break;
        }

        Animacoes.animaSaidaMenu(llMenu, llOpacidade);

    }

    private void carregaMenu(){

        final ViewGroup viewGroup = (ViewGroup)
                ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);

        View menuLayout = getLayoutInflater().inflate(R.layout.menu_layout, viewGroup , false);
        List<String> listMenu = new ArrayList<>();

        listMenu.add("Monstros");
        listMenu.add("Farms");
        listMenu.add("Time DG");
        listMenu.add("Time Batalha");
        listMenu.add("Montagem de Runas");

        MenuAdapter menuAdapter = new MenuAdapter(this, R.layout.adapter_menu_nav, listMenu);

        lvMenu      = (ListView) menuLayout.findViewById(R.id.lvMenu);
        flInicial   = (FrameLayout) menuLayout.findViewById(R.id.flInicial);
        lvMenu.setAdapter(menuAdapter);
        llMenuBar.addView(menuLayout);

    }
}
