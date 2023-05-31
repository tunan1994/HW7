package Seekers;

import java.util.List;

public interface Observer {
    void receiveOffer(String nameCompany, double salary);
    List<String> getVacancies();

}