package br.caos.guiasw.persistencia;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;

import br.caos.guiasw.model.RunaBoard;

/**
 * Created by 0118431 on 23/08/2016.
 */
public class RunaBoardDataSource {

    private Context mContext;

    public RunaBoardDataSource(Context mContext) {
        this.mContext = mContext;
    }

    public RunaBoard getRuBoByNomeNum(String nome, int numero) {

        DatabaseHelper helper = new DatabaseHelper(mContext);
        Cursor cursor;
        SQLiteDatabase db = helper.getWritableDatabase();
        cursor = db.rawQuery("SELECT *FROM runa_board WHERE nome = ? AND numero = ? ",
                new String[]{nome, numero + ""});

        RunaBoard runaBoard = null;

        if (cursor != null && cursor.moveToFirst()) {

            runaBoard = new RunaBoard();
            runaBoard.setId(cursor.getInt(0));
            runaBoard.setNome(cursor.getString(1));
            runaBoard.setNumero(cursor.getInt(2));
            runaBoard.setImagem(BitmapFactory.decodeByteArray(cursor.getBlob(3), 0,
                    cursor.getBlob(3).length));

        }

        db.close();
        cursor.close();
        helper.close();
        return runaBoard;
    }
}
