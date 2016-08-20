package br.caos.guiasw.utilitarios;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class UtilFragments {

    public static void preparaFragment(Fragment fragment, String name, FragmentManager fm, int resource){

        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(resource, fragment, name);
        if(fm.findFragmentByTag(name) != null){
            fm.popBackStack(name,1);
        }
        ft.addToBackStack(name);
        ft.commit();

    }
}
