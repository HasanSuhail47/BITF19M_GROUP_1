package com.example.namaz_daily_log;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "NAMAZ_LOG.db";
    private static final String TABLE_NAME = "Daily_log";

    private static final String COLUMN_Fajarcheck = "FAJARCHECK";
    private static final String COLUMN_Fajarjamat = "FAJARJAMAT";
    private static final String COLUMN_FajarRakat = "FAJARRAKAT";

    private static final String COLUMN_Dhurcheck = "DHURCHECK";
    private static final String COLUMN_Dhurjamat = "DHURJAMAT";
    private static final String COLUMN_DhurRakat = "DHURRAKAT";

    private static final String COLUMN_Asarcheck = "ASARCHECK";
    private static final String COLUMN_Asarjamat = "ASARJAMAT";
    private static final String COLUMN_AsarRakat = "ASARRAKAT";

    private static final String COLUMN_Maghribcheck = "MAGHRIBCHECK";
    private static final String COLUMN_Maghribjamat = "MAGHRIBJAMAT";
    private static final String COLUMN_MaghribRakat = "MAGHRIBRAKAT";

    private static final String COLUMN_Eshacheck = "ESHACHECK";
    private static final String COLUMN_Eshajamat = "ESHAJAMAT";
    private static final String COLUMN_EshaRakat = "ESHARAKAT";

    private static final String COLUMN_Tahajjudcheck = "TAHAJJUDCHECK";
    private static final String COLUMN_TahajjudRakat = "TAHAJJUDRAKAT";

    private static final String COLUMN_Date="DATE";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
                + COLUMN_Fajarcheck + " TEXT,"
                + COLUMN_Fajarjamat + " TEXT,"
                + COLUMN_FajarRakat + " TEXT,"
                + COLUMN_Dhurcheck + " TEXT,"
                + COLUMN_Dhurjamat + " TEXT,"
                + COLUMN_DhurRakat + " TEXT,"
                + COLUMN_Asarcheck + " TEXT,"
                + COLUMN_Asarjamat + " TEXT,"
                + COLUMN_AsarRakat + " TEXT,"
                + COLUMN_Maghribcheck + " TEXT,"
                + COLUMN_Maghribjamat + " TEXT,"
                + COLUMN_MaghribRakat + " TEXT,"
                + COLUMN_Eshacheck + " TEXT,"
                + COLUMN_Eshajamat + " TEXT,"
                + COLUMN_EshaRakat + " TEXT,"
                + COLUMN_Tahajjudcheck+" TEXT,"
                + COLUMN_TahajjudRakat + " TEXT,"
                + COLUMN_Date+" TEXT"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insertdata(Namaz namaz) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_Fajarcheck, namaz.getFajrcheck());
        values.put(COLUMN_Fajarjamat, namaz.getFajrcheck2());
        values.put(COLUMN_FajarRakat, namaz.getFajrrakat());

        values.put(COLUMN_Dhurcheck, namaz.getDhurcheck());
        values.put(COLUMN_Dhurjamat, namaz.getDhurcheck2());
        values.put(COLUMN_DhurRakat, namaz.getDhurrakat());

        values.put(COLUMN_Asarcheck, namaz.getAsarcheck());
        values.put(COLUMN_Asarjamat, namaz.getAsarcheck2());
        values.put(COLUMN_AsarRakat, namaz.getAsarrakat());

        values.put(COLUMN_Maghribcheck, namaz.getMaghribcheck());
        values.put(COLUMN_Maghribjamat, namaz.getMaghribcheck2());
        values.put(COLUMN_MaghribRakat, namaz.getMaghribrakat());

        values.put(COLUMN_Eshacheck, namaz.getEshacheck());
        values.put(COLUMN_Eshajamat, namaz.getEshacheck2());
        values.put(COLUMN_EshaRakat, namaz.getEsharakat());

        values.put(COLUMN_Tahajjudcheck, namaz.getTahajjudcheck());
        values.put(COLUMN_TahajjudRakat, namaz.getTahajjudrakat());

        values.put(COLUMN_Date,namaz.getDate());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }



    public List<Namaz> getallnamaz() {
        List<Namaz> namaz = new ArrayList<Namaz>();

        String sql = "SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                String fajarcheck = cursor.getString(cursor.getColumnIndex(COLUMN_Fajarcheck));
                String fajarcheck2 = cursor.getString(cursor.getColumnIndex(COLUMN_Fajarjamat));
                String fajarrakat = cursor.getString(cursor.getColumnIndex(COLUMN_FajarRakat));

                String Dhurcheck = cursor.getString(cursor.getColumnIndex(COLUMN_Dhurcheck));
                String Dhurcheck2 = cursor.getString(cursor.getColumnIndex(COLUMN_Dhurjamat));
                String Dhurrakat = cursor.getString(cursor.getColumnIndex(COLUMN_DhurRakat));

                String asar_check = cursor.getString(cursor.getColumnIndex(COLUMN_Asarcheck));
                String asar_check2 = cursor.getString(cursor.getColumnIndex(COLUMN_Asarjamat));
                String asar_rakat = cursor.getString(cursor.getColumnIndex(COLUMN_AsarRakat));

                String Maghribcheck = cursor.getString(cursor.getColumnIndex(COLUMN_Maghribcheck));
                String Maghribcheck2 = cursor.getString(cursor.getColumnIndex(COLUMN_Maghribjamat));
                String Maghribrakat = cursor.getString(cursor.getColumnIndex(COLUMN_MaghribRakat));

                String eshacheck = cursor.getString(cursor.getColumnIndex(COLUMN_Eshacheck));
                String eshacheck2 = cursor.getString(cursor.getColumnIndex(COLUMN_Eshajamat));
                String esharakat = cursor.getString(cursor.getColumnIndex(COLUMN_EshaRakat));

                String tahajjudcheck = cursor.getString(cursor.getColumnIndex(COLUMN_Tahajjudcheck));
                String tahajjudrakat = cursor.getString(cursor.getColumnIndex(COLUMN_TahajjudRakat));

                String date = cursor.getString(cursor.getColumnIndex(COLUMN_Date));
                namaz.add(new Namaz(fajarcheck,fajarcheck2,fajarrakat,Dhurcheck,Dhurcheck2,Dhurrakat,asar_check,asar_check2,asar_rakat,Maghribcheck,Maghribcheck2,Maghribrakat,eshacheck,eshacheck2,esharakat,tahajjudcheck,tahajjudrakat,date));
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return namaz;
    }
}
