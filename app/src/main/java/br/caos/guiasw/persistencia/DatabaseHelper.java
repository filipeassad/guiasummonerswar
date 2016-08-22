package br.caos.guiasw.persistencia;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by 0118431 on 19/08/2016.
 */
public class DatabaseHelper extends SQLiteAssetHelper{

    //private static String DBPATH = "/data/data/"+ BuildConfig.APPLICATION_ID +"/databases/";
    private static final String DBNAME = "guiaswdb.db";
    private static final int DBVERSION = 1;
    private Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
        setForcedUpgrade();
        mContext = context;
    }

}
