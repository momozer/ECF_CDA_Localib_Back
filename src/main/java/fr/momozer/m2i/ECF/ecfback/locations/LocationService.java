package fr.momozer.m2i.ECF.ecfback.locations;

import java.util.List;

public interface LocationService  {
    List<Location> findAll();
    Location save(Location entity);
    Location findById(Integer id);
    void deleteById(Integer id);

}
