package com.example.viladevinhouse.security.repository;

import com.example.viladevinhouse.security.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    @Query("select u from Usuario u where u.emailUsuario like :email")
    Usuario findByEmailUsuario(@Param("emailUsuario") String email);
}
