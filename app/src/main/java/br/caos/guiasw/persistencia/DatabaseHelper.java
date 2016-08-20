package br.caos.guiasw.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    private static String DBPATH = "/data/data/br.caos.guiasw/databases/";
    private static String DBNAME ="guiaswdb.db";
    private Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, 1);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        getDatabase();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private boolean checkDataBase(){

        SQLiteDatabase db = null;

        try {
            String path = DBPATH + DBNAME;
            db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
            db.close();
        } catch (SQLiteException e) {
            // O banco não existe
        }

        // Retorna verdadeiro se o banco existir, pois o ponteiro irá existir,
        // se não houver referencia é porque o banco não existe
        return db != null;

    }

    private void createDataBase()
            throws Exception {



        // Primeiro temos que verificar se o banco da aplicação
        // já foi criado
        boolean exists = checkDataBase();

        if(!exists) {
            // Chamaremos esse método para que o android
            // crie um banco vazio e o diretório onde iremos copiar
            // no banco que está no assets.
            this.getReadableDatabase();

            // Se o banco de dados não existir iremos copiar o nosso
            // arquivo em /assets para o local onde o android os salva
            try {
                copyDatabase();
            } catch (IOException e) {
                throw new Error("Não foi possível copiar o arquivo");
            }

        }

    }

    private void copyDatabase()
            throws IOException {



        String dbPath = DBPATH + DBNAME;

        // Abre o arquivo o destino para copiar o banco de dados
        OutputStream dbStream = new FileOutputStream(dbPath);

        // Abre Stream do nosso arquivo que esta no assets
        InputStream dbInputStream =
                mContext.getAssets().open("guiaswdb.db");

        byte[] buffer = new byte[1024];
        int length;
        while((length = dbInputStream.read(buffer)) > 0) {
            dbStream.write(buffer, 0, length);
        }

        dbInputStream.close();

        dbStream.flush();
        dbStream.close();


    }

    public SQLiteDatabase getDatabase() {

        try{
            // Verificando se o banco já foi criado e se não foi o
            // mesmo é criado.
            createDataBase();

            // Abrindo database
            String path = DBPATH + DBNAME;

            return SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READWRITE);
        }catch (Exception e) {
            // Se não conseguir copiar o banco um novo será retornado
            return getWritableDatabase();
        }

    }

}
