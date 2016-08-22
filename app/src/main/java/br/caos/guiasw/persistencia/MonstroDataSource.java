package br.caos.guiasw.persistencia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.List;

import br.caos.guiasw.model.Monstro;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class MonstroDataSource {

   private Context mContext;

    public MonstroDataSource(Context context) {
       mContext = context;
    }

    public List<Monstro> getMonstrosByEstrela(int estrela){

        DatabaseHelper helper = new DatabaseHelper(mContext);
        Cursor cursor;
        SQLiteDatabase db = helper.getWritableDatabase();
        cursor = db.rawQuery("SELECT *FROM monstro WHERE estrela = ?", new String[]{estrela+""});
        List<Monstro> listMonstro = new ArrayList<>();

        if(cursor != null){

            for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){

                Monstro monstro = new Monstro();

                monstro.setId(cursor.getInt(0));
                monstro.setNome(cursor.getString(1));
                monstro.setVida(cursor.getInt(2));
                monstro.setAtaque(cursor.getInt(3));
                monstro.setDefesa(cursor.getInt(4));
                monstro.setVelocidade(cursor.getInt(5));
                monstro.setChanceCritico(cursor.getInt(6));
                monstro.setDanoCritico(cursor.getInt(7));
                monstro.setResistencia(cursor.getInt(8));
                monstro.setPrecisao(cursor.getInt(9));

                monstro.setImgPequena(BitmapFactory.decodeByteArray(cursor.getBlob(10), 0,
                        cursor.getBlob(10).length));
                monstro.setImgGrande(BitmapFactory.decodeByteArray(cursor.getBlob(11), 0,
                        cursor.getBlob(11).length));

                monstro.setEstrela(cursor.getInt(12));
                monstro.setElemento(cursor.getString(13));

                listMonstro.add(monstro);
            }

        }
        helper.close();
        return listMonstro;
    }
}
