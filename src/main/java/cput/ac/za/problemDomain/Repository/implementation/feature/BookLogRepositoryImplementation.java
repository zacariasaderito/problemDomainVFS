package cput.ac.za.problemDomain.Repository.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.BookLogRepository;
import cput.ac.za.problemDomain.domain.feature.BookLog;

import java.util.HashSet;
import java.util.Set;

public class BookLogRepositoryImplementation implements BookLogRepository {

    private static BookLogRepositoryImplementation repository =  null;
    private Set<BookLog> bookLogs;

    private BookLogRepositoryImplementation() {

        this.bookLogs = new HashSet<>();
    }

    public static BookLogRepositoryImplementation getRepository() {
        if (repository == null)
            repository = new BookLogRepositoryImplementation();

        return repository;
    }

    @Override
    public BookLog create(BookLog bookLog) {
        return null;
    }

    @Override
    public BookLog update(BookLog bookLog) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public BookLog read(String s) {
        return null;
    }
}

