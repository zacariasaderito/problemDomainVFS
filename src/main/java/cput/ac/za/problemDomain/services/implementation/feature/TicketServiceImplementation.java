package cput.ac.za.problemDomain.services.implementation.feature;

import cput.ac.za.problemDomain.Repository.Interfaces.feature.TicketRepository;
import cput.ac.za.problemDomain.Repository.implementation.feature.TicketRepositoryImplementation;
import cput.ac.za.problemDomain.domain.feature.Ticket;
import cput.ac.za.problemDomain.services.interfaces.feature.TicketService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TicketServiceImplementation implements TicketService {

    //    @Autowired
//    @Qualifier("InMemory")
    private TicketRepository repository;
    private static TicketServiceImplementation service = null;

    private TicketServiceImplementation() {
        this.repository = TicketRepositoryImplementation.getRepository();
    }

    public static TicketServiceImplementation getService() {
        if (service == null)
            service = new TicketServiceImplementation();

        return service;
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repository.create(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return repository.update(ticket);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Ticket read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Ticket> getAll() {
        return this.repository.getAll();
    }

}
