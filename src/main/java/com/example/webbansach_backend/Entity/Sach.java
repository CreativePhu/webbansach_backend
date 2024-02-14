package com.example.webbansach_backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach")
    private int maSach;
    @Column(name = "ten_sach")
    private String tenSach;
    @Column(name = "ten_tac_gia")
    private String tacGia;
    @Column(name = "isbn")
    private String ISBN;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "gia_niem_yet")
    private double giaNiemYet;
    @Column(name = "gia_ban")
    private double giaBan;
    @Column(name = "so_luong")
    private int soLuong;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name = "ma_sach"),
            inverseJoinColumns = @JoinColumn(name = "ma_the_loai")
    )
    private List<TheLoai> danhSachTheLoai;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "sach")
    private List<HinhAnh> danhSachHinhAnh;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sach")
    private List<ChiTietGioHang> danhSachChiTietGioHang;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "sach")
    private List<SachYeuThich> danhSachYeuThich;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "sach")
    private List<SuDanhGia> danhSachSuDanhGia;

    @Column(name = "trung_binh_xep_hang")
    private double trungBinhXepHang;
}
