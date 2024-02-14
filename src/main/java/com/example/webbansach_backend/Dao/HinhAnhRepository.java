package com.example.webbansach_backend.Dao;

import com.example.webbansach_backend.Entity.GioHang;
import com.example.webbansach_backend.Entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hinh-anh")
public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {
}
