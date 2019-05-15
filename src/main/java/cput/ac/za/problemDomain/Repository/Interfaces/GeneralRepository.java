package cput.ac.za.problemDomain.Repository.Interfaces;

public interface GeneralRepository <T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id );
    T read(ID id);

}
