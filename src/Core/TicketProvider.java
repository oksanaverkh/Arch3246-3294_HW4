package Core;

import Interfaces.ITicketRepo;
import Models.Ticket;
import Services.TicketRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider {

    private ITicketRepo ticketRepo; /* Added by OV */

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не
        // создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    /**
     * Метод получения билетов из базы данных
     * 
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */

    /* Added by OV */
    public List<Ticket> getTickets(int routeNumber) throws RuntimeException {
        List<Ticket> tickets = new ArrayList<Ticket>();
        if (ticketRepo != null) {

            return tickets;
        } else {
            throw new RuntimeException();
        }
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */

    /* Added by OV */
    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }

}
