package com.app.smoothie.core.usecase;

import com.app.smoothie.core.port.primary.usecase.DeleteSmoothieService;
import com.app.smoothie.core.entity.Smoothie;
import com.app.smoothie.core.port.secondary.repository.SmoothieRepository;
import com.app.smoothie.core.port.primary.usecase.dto.EntityRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSmoothieServiceImpl implements DeleteSmoothieService {
    private final SmoothieRepository repository;

    @Override
    public void execute(EntityRequest request) {
        final Smoothie smoothie = repository.findById(request.getId());
        repository.delete(smoothie);
    }
}
