package com.nexp.pavel.sber_unit_tests;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Result.class, version = 1)
public abstract class ResultDatabase extends RoomDatabase {
    public abstract ResultDAO getResultDAO();
}
