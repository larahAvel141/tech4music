package br.com.tech4music.music.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4music.music.service.MusicaService;
import br.com.tech4music.music.view.model.MusicaResponseDTO;
import br.com.tech4music.shared.MusicaDTO;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private MusicaService service;

    @GetMapping
    public ResponseEntity<List<MusicaResponseDTO>> obterMusicas(){
        List<MusicaDTO> m = service.listarMusicas();
        
        List<MusicaResponseDTO> musicas = m.stream()
        .map(l -> mapper.map(l, MusicaResponseDTO.class))
        .collect(Collectors.toList());

        return new ResponseEntity<>(musicas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicaDTO> obterLivroPorId(@PathVariable String id){
        Optional<MusicaDTO> musica = service.listarMusicaPorId(id);

        if (musica.isPresent()) {
            return new ResponseEntity<>(mapper.map(musica.get(), MusicaDTO.class)
            ,HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<MusicaDTO> cadastrarMusicas(@RequestBody MusicaDTO musica){
        MusicaDTO dto = mapper.map(musica, MusicaDTO.class);
        dto = service.cadastrarMusica(dto);

        return new ResponseEntity<>(mapper.map(dto, MusicaDTO.class),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicaDTO> alterarMusica(@PathVariable String id, @RequestBody MusicaDTO musica){
        return new ResponseEntity<>(service.atualizarMusica(id, musica),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerMusicaPorId(@PathVariable String id){
        service.deletarPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
