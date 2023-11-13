package org.mon.db;

import java.util.Arrays;
import java.util.stream.Collectors;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
//Does not work with Dev Services
/*@NamedNativeQueries({
        //@NamedNativeQuery(name = "Pokemon.findByTypeNative", query = "SELECT * FROM Pokemon where :type = ANY(types)", resultClass = Pokemon.class)
})
 */
public class Pokemon extends PanacheEntity  {
    public String number;
    public String name;
    public String[] types;
    public String description;
    public String[] weaknesses;

    public static Pokemon findByNumber(String number) {
        return find("number", number).firstResult();
    }

    public static Pokemon findByName(String name) {
        return find("name", name).firstResult();
    }

    @Override
    public String toString() {
        return number + " " + name +
                "\n" + "Description: " + description +
                "\n" + "Type: " + Arrays.asList(types).stream().collect(Collectors.joining(", ")) +
                "\n" + "Weakness: " + Arrays.asList(weaknesses).stream().collect(Collectors.joining(", "));
    }
}
