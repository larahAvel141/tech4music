package br.com.tech4music.music.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4music.music.model.Musica;
import br.com.tech4music.music.repository.MusicaRepository;
import br.com.tech4music.shared.MusicaDTO;

@Service
public class MusicaServiceImpl implements MusicaService{

    @Autowired
    private MusicaRepository repository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public MusicaDTO atualizarMusica(String id, MusicaDTO musica) {

        Musica musicaAtualizar = mapper.map(musica, Musica.class);
        musicaAtualizar.setId(id);
        musicaAtualizar = repository.save(musicaAtualizar);
        
        return mapper.map(musicaAtualizar, MusicaDTO.class);
    }

    @Override
    public MusicaDTO cadastrarMusica(MusicaDTO musica) {

        Musica musicaCadastrar = mapper.map(musica, Musica.class);
        musicaCadastrar = repository.save(musicaCadastrar);

        return mapper.map(musicaCadastrar, MusicaDTO.class);
    }

    @Override
    public void deletarPorId(String id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<MusicaDTO> listarMusicaPorId(String id) {
        Optional<Musica> musicas = repository.findById(id);

        if (musicas.isPresent()) {
            return Optional.of(mapper.map(musicas.get(), MusicaDTO.class));
        }
        return Optional.empty();
    }

    @Override
    public List<MusicaDTO> listarMusicas() {
        List<Musica> musicas = repository.findAll();
        
        return musicas.stream()
        .map(m -> mapper.map(m, MusicaDTO.class))
        .collect(Collectors.toList());
    }
    
}
