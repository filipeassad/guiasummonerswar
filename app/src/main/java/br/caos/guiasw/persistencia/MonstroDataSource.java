package br.caos.guiasw.persistencia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import br.caos.guiasw.model.Monstro;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class MonstroDataSource {

    private DatabaseHelper helper;

    public MonstroDataSource(Context context) {
        helper = new DatabaseHelper(context);
    }

    public List<Monstro> getMonstrosByEstrela(int estrela){

        Cursor cursor;
        SQLiteDatabase db = helper.getWritableDatabase();
        cursor = db.rawQuery("SELECT *FROM monstro WHERE estrela = ?", new String[]{estrela+""});

        if(cursor != null){
            cursor.moveToFirst();
            while(cursor.){

            }
        }

        return null;
    }
}
