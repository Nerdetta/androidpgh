package com.example.androiddevelopment.androidpgh.db;

/**
 * Created by androiddevelopment on 20.3.18..
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androiddevelopment.androidpgh.model.vest;
import com.example.androiddevelopment.androidpgh.model.komentar;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;


public class DataBaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME    = "ormlite.db";

    private static final int    DATABASE_VERSION = 1;

    private Dao<vest, Integer> mVestDao = null;
    private Dao<komentar, Integer> mKomentarDao = null;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, vest.class);
            TableUtils.createTable(connectionSource, komentar.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, vest.class, true);
            TableUtils.dropTable(connectionSource, komentar.class, true);
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Dao<vest, Integer> getmVestDao() throws SQLException {
        if (mVestDao == null) {
            mVestDao = getDao(vest.class);
        }

        return mVestDao;
    }
    public Dao<komentar, Integer> getmKomentarDao() throws SQLException {
        if (mKomentarDao == null) {
            mKomentarDao = getDao(komentar.class);
        }

        return mKomentarDao;
    }

    @Override
    public void close() {
        mVestDao = null;
        mKomentarDao = null;

        super.close();
    }
}
