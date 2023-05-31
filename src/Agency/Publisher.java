package Agency;

import Seekers.Observer;
import Vacancies.Vacancy;

public interface Publisher {
    void registerObserver(Observer observer);
    void sendOffer(String nameCompany, Vacancy vacancy, double salary);
}