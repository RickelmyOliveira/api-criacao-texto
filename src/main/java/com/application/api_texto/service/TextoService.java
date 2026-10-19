package com.application.api_texto.service;

import com.application.api_texto.dto.TextoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TextoService.class);

    List<TextoDto> textos = new ArrayList<>();

    public List<TextoDto> buscarTextos(){
        LOGGER.info("Buscando texto(s) ...");
        return textos;
    }

    public String adicionarTexto(TextoDto textoDto){
        LOGGER.info("Adicionando novo texto {}", textoDto);
        textos.add(textoDto);
        return "Texto -> " + textoDto + " adicionado com sucesso!";
    }
}
