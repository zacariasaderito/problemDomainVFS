package cput.ac.za.problemDomain.Repository;

public interface GeneralRepository <T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id );
    T read(ID id);

}