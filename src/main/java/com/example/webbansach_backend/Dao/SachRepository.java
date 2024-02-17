package com.example.webbansach_backend.Dao;

import com.example.webbansach_backend.Entity.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path = "sach")
public interface SachRepository extends JpaRepository<Sach, Integer> {

    Page<Sach> findByTenSachContainingIgnoreCase(@RequestParam("tenSach") String tenSach, Pageable pageable);
}
