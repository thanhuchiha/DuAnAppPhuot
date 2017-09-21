package com.uchiha.thanh.duanappphuot.model;

/**
 * Created by Administrator on 21/09/2017.
 */

public class CmtRating {


    private  int id;
    private String noidung;
    private float diem;

    public CmtRating(String noidung, float diem) {

        this.noidung = noidung;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public float getDiem() {
        return diem;
    }
    public void setDiem(float diem) {
        this.diem = diem;
    }

    public CmtRating() {
        super();

    }

    @Override
    public String toString() {
        return  "diem= "+ diem +  "\n" + noidung;

    }

}
