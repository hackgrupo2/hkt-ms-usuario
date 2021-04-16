package com.aprendepe.repository;

import com.aprendepe.model.dao.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  //  @Query(value = "select * from equipo2.usuario where email = ?1",nativeQuery = true)
  //  Usuario findByEmail(String email) ;
}
