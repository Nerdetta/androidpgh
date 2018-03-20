package com.example.androiddevelopment.androidpgh.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 20.3.18..
 */
@DatabaseTable(tableName = vest.TABLE_NAME_USERS)
public class vest {
    public static final String TABLE_NAME_USERS = "vesti";
    public static final String FIELD_NAME_ID     = "id";
    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION   = "description";
    public static final String FIELD_NAME_AUTOR   = "autor";
    public static final String FIELD_NAME_IMAGE  = "image";
    public static final String FIELD_NAME_DATE  = "date";
    public static final String FIELD_NAME_KOMENTAR = "komentar";

    @ForeignCollectionField(columnName = vest.FIELD_NAME_KOMENTAR, eager = true)
    private ForeignCollection<komentar> komentari;


    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int mId;

    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;

    @DatabaseField(columnName = FIELD_NAME_DESCRIPTION)
    private String description;

    @DatabaseField(columnName = FIELD_NAME_AUTOR)
    private String autor;

    @DatabaseField(columnName = FIELD_NAME_IMAGE)
    private String image;

    @DatabaseField(columnName = FIELD_NAME_DATE)
    private String date;

    public vest() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {        return date;    }

    public void setDate(String date) {
        this.date = date;
    }

    public ForeignCollection<komentar> getKomentari() {
        return komentari;
    }

    public void setKomentari(ForeignCollection<komentar> komentari) {
        this.komentari = komentari;
    }


    @Override
    public String toString() {
        return  mName;
    }
}

