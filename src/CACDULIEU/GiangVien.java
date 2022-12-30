/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CACDULIEU;
import java.io.Serializable;
/**
 *
 * @author ADMIN
 */
public class GiangVien  implements Serializable {
    private String MaGiangVien;
    private String TenGiangVien;
    private String diaChi;
    private String bacLuong;
    private String queQuan;

    public GiangVien(String MaGiangVien, String TenGiangVien) {
        this.MaGiangVien = MaGiangVien;
        this.TenGiangVien = TenGiangVien;
    }

    public GiangVien(String MaGiangVien, String TenGiangVien, String diaChi, String bacLuong, String queQuan) {
        this.MaGiangVien = MaGiangVien;
        this.TenGiangVien = TenGiangVien;
        this.diaChi = diaChi;
        this.bacLuong = bacLuong;
        this.queQuan = queQuan;
    }


    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public String getTenGiangVien() {
        return TenGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public void setTenGiangVien(String TenGiangVien) {
        this.TenGiangVien = TenGiangVien;
    }

    public GiangVien() {
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(String bacLuong) {
        this.bacLuong = bacLuong;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    
}
