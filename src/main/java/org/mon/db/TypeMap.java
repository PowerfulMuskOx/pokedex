package org.mon.db;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
@Entity
public class TypeMap extends PanacheEntity {
    public String pokemonNumber;
    public String type;
}
