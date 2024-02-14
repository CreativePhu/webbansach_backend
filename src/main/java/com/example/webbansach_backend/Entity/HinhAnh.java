package com.example.webbansach_backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh;
    @Column(name = "ten_hinh_anh")
    private String tenHinhAnh;
    @Column(name = "icon")
    private boolean icon;
    @Column(name = "duong_dan")
    private String duongDan;
    @Column(name = "du_lieu_anh", columnDefinition = "LONGTEXT")
    @Lob
    private String duLieuAnh;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ma_sach")
    private Sach sach;
}
