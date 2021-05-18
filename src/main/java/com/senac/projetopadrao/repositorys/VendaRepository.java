package com.senac.projetopadrao.repositorys;

import com.senac.projetopadrao.model.Usuario;
import com.senac.projetopadrao.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}