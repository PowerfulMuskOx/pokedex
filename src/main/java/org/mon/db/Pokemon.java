package org.mon.db;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class Pokemon extends PanacheEntity  {
    public String number;
    public String name;

    public List<String> type;
    public String description;
    public List<String> weakness;

    public static Pokemon findByNumber(String number) {
        return find("number", number).firstResult();
    }

    public static Pokemon findByName(String name) {
        return find("name", name).firstResult();
    }

    //TODO find by type. Custom query?
}
