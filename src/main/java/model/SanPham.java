/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int masp;
    private String tensp;
    private double dongia;
    private String hinh;
    private int maloai;
    private Date ngaycapnhat;

    public SanPham() {
    }

    public SanPham(int aInt, String string, double aDouble, String string0, int aInt0, Date date) {
        
    }

    public int getMasp() {
        return masp;
    }

    public String getTensp() {
        return tensp;
    }

    public double getDongia() {
        return dongia;
    }

    public String getHinh() {
        return hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", hinh=" + hinh + ", maloai=" + maloai + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
}
