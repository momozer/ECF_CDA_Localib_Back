package fr.momozer.m2i.ECF.ecfback.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class LocataireServiceImpl implements LocataireService {
    private static final Logger logger = LoggerFactory.getLogger(LocataireService.class);
    private final LocataireRepository locataireRepository;

    public LocataireServiceImpl(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    @Override
    public List<Locataire> findAll() {
        return locataireRepository.findAll();
    }

    @Override
    public Locataire save(Locataire entity) {
        return locataireRepository.save(entity);
    }

    @Override
    public Locataire findById(Integer id) {
        return locataireRepository.findById(String.valueOf(id)).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(Integer id) {
        locataireRepository.deleteById(String.valueOf(id));
    }
}
