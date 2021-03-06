package br.edu.infnet.appArtesanato.model.service;

import br.edu.infnet.appArtesanato.model.domain.Acessorio;
import br.edu.infnet.appArtesanato.model.domain.Usuario;
import br.edu.infnet.appArtesanato.model.repository.AcessorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessorioService {

    @Autowired
    private AcessorioRepository acessorioRepository;

    public List<Acessorio> obterLista(Usuario usuario) {
        return (List<Acessorio>) acessorioRepository.obterLista(usuario);
    }

    public void incluir(Acessorio acessorio) {
        acessorioRepository.save(acessorio);
    }

    public void excluir(Long id) {
        acessorioRepository.deleteById(id);
    }

    public void editar(Acessorio acessorio) {
        acessorioRepository.save(acessorio);
    }
}
