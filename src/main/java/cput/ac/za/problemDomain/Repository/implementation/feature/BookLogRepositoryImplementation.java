//package cput.ac.za.problemDomain.Repository.implementation.feature;
//
//import cput.ac.za.problemDomain.Repository.Interfaces.feature.BookLogRepository;
//import cput.ac.za.problemDomain.domain.feature.BookLog;
//
//import java.util.*;
//
//public class BookLogRepositoryImplementation implements BookLogRepository {
//
//    private static BookLogRepositoryImplementation repository =  null;
//    private Map<String, BookLog> bookLogs;
//
//    private BookLogRepositoryImplementation() {
//        this.bookLogs = new HashMap<>();
//    }
//
//    public static BookLogRepositoryImplementation getRepository() {
//        if (repository == null)
//            repository = new BookLogRepositoryImplementation();
//
//        return repository;
//    }
//
//    @Override
//    public BookLog create(BookLog bookLog) {
//        this.bookLogs.put(bookLog.getLogNumber(), bookLog);
//        return bookLog;
//    }
//
//    @Override
//    public BookLog update(BookLog bookLog) {
//        this.bookLogs.replace(bookLog.getLogNumber(), bookLog);
//        return this.bookLogs.get(bookLog.getLogNumber());
//    }
//
//    @Override
//    public void delete(String s) {
//        this.bookLogs.remove(s);
//    }
//
//    @Override
//    public BookLog read(String s) {
//        return this.bookLogs.get(s);
//    }
//
//    @Override
//    public Set<BookLog> getAll() {
//        Collection<BookLog> bookLogs = this.bookLogs.values();
//        HashSet<BookLog> set = new HashSet<>();
//        set.addAll(bookLogs);
//        return set;
//    }
//}
//
