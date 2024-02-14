package com.example.webbansach_backend.Dao;

import com.example.webbansach_backend.Entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "gio-hang")
public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
}
