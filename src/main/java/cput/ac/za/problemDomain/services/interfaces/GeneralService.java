package cput.ac.za.problemDomain.services.interfaces;

import java.util.Set;

public interface GeneralService <T, ID>{

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
    Set<T> getAll();

}
