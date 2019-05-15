package cput.ac.za.problemDomain.services.interfaces;

public interface GeneralService <T, ID>{

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);


}
