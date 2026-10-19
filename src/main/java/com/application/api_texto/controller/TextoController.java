package com.application.api_texto.controller;

import com.application.api_texto.dto.TextoDto;
import com.application.api_texto.service.TextoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/textos")
public class TextoController {

    public final TextoService textoService;

    public TextoController(TextoService textoService) {
        this.textoService = textoService;
    }


    @GetMapping
    public ResponseEntity<List<TextoDto>> buscarTextos(){
        return ResponseEntity.ok().body(textoService.buscarTextos());
    }

    @PostMapping
    public ResponseEntity<String> adicionarTexto(@RequestBody  TextoDto textoDto){
        return ResponseEntity.created(URI.create("/api/v1/textos")).body(textoService.adicionarTexto(textoDto));
    }
}
