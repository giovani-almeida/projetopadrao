package com.senac.projetopadrao.repositorys;

import com.senac.projetopadrao.model.Produto;
import com.senac.projetopadrao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}