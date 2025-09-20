package com.idiesoftware.baterias24hrs.service;

import com.idiesoftware.baterias24hrs.model.Produto;
import com.idiesoftware.baterias24hrs.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto atualizar(Long id, Produto novo) {
        Produto existente = buscarPorId(id);
        existente.setNome(novo.getNome());
        existente.setMarca(novo.getMarca());
        existente.setDescricao(novo.getDescricao());
        existente.setPreco(novo.getPreco());
        existente.setEstoque(novo.getEstoque());
        return repository.save(existente);
    }

    public void inativar(Long id) {
        Produto existente = buscarPorId(id);
        existente.setAtivo(false);
        repository.save(existente);
    }
}

