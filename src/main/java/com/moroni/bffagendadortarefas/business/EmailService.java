package com.moroni.bffagendadortarefas.business;


import com.moroni.bffagendadortarefas.business.dto.in.TarefasDTORequest;
import com.moroni.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.moroni.bffagendadortarefas.business.enums.StatusNotificacaoEnum;
import com.moroni.bffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
         emailClient.enaviaEmail(dto);
    }
}