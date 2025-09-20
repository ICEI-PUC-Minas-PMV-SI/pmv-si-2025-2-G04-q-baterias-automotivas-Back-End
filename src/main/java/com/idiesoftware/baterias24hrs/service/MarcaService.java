package com.idiesoftware.baterias24hrs.service;

import com.idiesoftware.baterias24hrs.model.Marca;
import com.idiesoftware.baterias24hrs.repository.MarcaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository repository;

    public MarcaService(MarcaRepository repository) {
        this.repository = repository;
    }

    public Marca salvar(Marca marca) {
        return repository.save(marca);
    }

    public List<Marca> listar() {
        return repository.findAll();
    }

    public Marca buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Marca não encontrada"));
    }

    public Marca atualizar(Long id, Marca nova) {
        Marca existente = buscarPorId(id);
        existente.setNome(nova.getNome());
        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

