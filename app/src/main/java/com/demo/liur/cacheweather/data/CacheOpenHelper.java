package com.demo.liur.cacheweather.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 数据库建表类
 * Created by Liur on 2016/6/15.
 */
public class CacheOpenHelper extends SQLiteOpenHelper {

    private static final String CREATE_PROVINCE =
            "create table province (id integer primary key autoincrement,province_name text,province_code text)";
    private static final String CREATE_CITY =
            "create table city (" + "id integer primary key autoincrement," + "city_name text,city_code text)";
    private static final String CREATE_COUNTY =
            "create table county (id integer primary key autoincrement,county_name text,county_code text)";

    public CacheOpenHelper(Context context,
                           String name,
                           SQLiteDatabase.CursorFactory factory,
                           int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
