package Com.fag.service;
import Com.fag.domain.dto.PixDTO;
import Com.fag.domain.usecases.CreatePix;
import Com.fag.infra.CelCoin.repository.CCPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {
    
    @Inject
    CCPixRepository CCPixRepository;

    public PixDTO genPix(PixDTO dto) {

        CreatePix createPix = new CreatePix(CCPixRepository);

        return createPix.execute(dto);
    }

}