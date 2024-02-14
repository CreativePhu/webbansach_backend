package com.example.webbansach_backend.Dao;

import com.example.webbansach_backend.Entity.ChiTietGioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "chi-tiet-gio-hang")
public interface ChiTietGioHangRepository extends JpaRepository<ChiTietGioHang, Integer> {
}
