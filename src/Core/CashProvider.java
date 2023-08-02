package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

    /*
     * Added by OV
     */
    private long cardNumber;
    private boolean isAuthorized;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не
        // создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка Carrier carrier = carrierRepository.read(1);
    // подсказка return cashRepository.transaction(ticket.getPrice(), cardNumber,
    // carrier.getCardNumber());

    /*
     * Added by OV
     */
    public boolean buy(Ticket ticket) {
        Carrier carrier = carrierRepository.read(1);
        if (cashRepository != null) {
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        } else {
            throw new RuntimeException();
        }

    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку
     * для подтверждения личности клиента.
     *
     * @param client
     */

    /*
     * Added by OV
     */
    public void authorization(User user) {
        System.out.println(isAuthorized);
    }

}
