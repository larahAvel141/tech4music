package br.com.tech4music.music.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4music.shared.MusicaDTO;

public interface MusicaService {

    List<MusicaDTO> listarMusicas();
    Optional<MusicaDTO> listarMusicaPorId(String id);
    MusicaDTO cadastrarMusica(MusicaDTO musica);
    void deletarPorId(String id);
    MusicaDTO atualizarMusica(String id, MusicaDTO musica);
    
}
