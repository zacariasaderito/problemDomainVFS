package cput.ac.za.problemDomain.Repository.Interfaces;

import java.util.Set;

public interface GeneralRepository <T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id );
    T read(ID id);
    Set<T> getAll();

}
