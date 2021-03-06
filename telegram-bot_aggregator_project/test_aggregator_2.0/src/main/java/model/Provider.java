package model;

import vo.Vacancy;

import java.util.List;

public class Provider {
    Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String jobName, String city) {

        return strategy.getVacancies(jobName, city);
    }
}
