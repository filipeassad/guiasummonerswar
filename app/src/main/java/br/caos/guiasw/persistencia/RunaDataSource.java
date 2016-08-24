package br.caos.guiasw.persistencia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.List;
import br.caos.guiasw.model.Runa;

/**
 * Created by 0118431 on 23/08/2016.
 */
public class RunaDataSource {

    private Context mContext;

    public RunaDataSource(Context mContext) {
        this.mContext = mContext;
    }

    public List<Runa> getAllRunas(){

        DatabaseHelper helper = new DatabaseHelper(mContext);
        Cursor cursor;
        SQLiteDatabase db = helper.getWritableDatabase();
        cursor = db.rawQuery("SELECT *FROM runa ", new String[]{});

        List<Runa> listRuna = new ArrayList<>();

        if(cursor != null) {

            for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {

                Runa runa = new Runa();

                runa.setId(cursor.getInt(0));
                runa.setNome(cursor.getString(1));
                runa.setDescricao(cursor.getString(2));
                runa.setImagem(BitmapFactory.decodeByteArray(cursor.getBlob(3), 0,
                        cursor.getBlob(3).length));
                listRuna.add(runa);
            }
        }

        db.close();
        cursor.close();
        helper.close();
        return listRuna;
    }
}
