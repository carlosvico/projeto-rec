package com.example.viladevinhouse.security.repository;

import com.example.viladevinhouse.security.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioRepository extends JpaRepository <Relatorio, Long> {
}
