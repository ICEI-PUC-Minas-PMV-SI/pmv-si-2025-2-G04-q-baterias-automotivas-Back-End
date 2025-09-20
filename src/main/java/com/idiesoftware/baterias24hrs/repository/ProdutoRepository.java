package com.idiesoftware.baterias24hrs.repository;

import com.idiesoftware.baterias24hrs.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
