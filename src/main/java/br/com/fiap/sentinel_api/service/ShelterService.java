package br.com.fiap.sentinel_api.service;

import br.com.fiap.sentinel_api.repository.ShelterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShelterService {

    private ShelterRepository shelterRepository;
}
