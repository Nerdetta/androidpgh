package com.example.androiddevelopment.androidpgh.model;

/**
 * Created by androiddevelopment on 20.3.18..
 */
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = komentar.TABLE_NAME_USERS)
public class komentar {
    public static final String TABLE_NAME_USERS = "komentari";
    public static final String FIELD_NAME_ID     = "id";
    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION   = "description";
    public static final String FIELD_NAME_AUTOR   = "autor";
    public static final String FIELD_NAME_DATE  = "date";
    public static final String FIELD_NAME_VEST = "vest";

    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    @DatabaseField(columnName = FIELD_NAME_DESCRIPTION)
    private String description;

    @DatabaseField(columnName = FIELD_NAME_AUTOR)
    private String autor;

    @DatabaseField(columnName = FIELD_NAME_DATE)
    private String date;

    @DatabaseField(columnName = FIELD_NAME_VEST, foreign = true, foreignAutoRefresh = true)
    private vest mVest;

    public komentar() {
    }

    /** Getters & Setters **/

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDate() {  return date;    }

    public void setDate(String date) {
        this.date = date;
    }

    public vest getmVest() {
        return mVest;
    }

    public void setmVest(vest mVest) {
        this.mVest = mVest;
    }

    @Override
    public String toString() {
        return  mName;
    }
}
