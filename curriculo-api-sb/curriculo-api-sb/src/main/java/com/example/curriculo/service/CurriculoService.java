package com.example.curriculo.service;

import com.example.curriculo.model.Curriculo;
import com.example.curriculo.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    @Autowired
    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    public Curriculo getCurriculo(Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    public Curriculo saveCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }
}
