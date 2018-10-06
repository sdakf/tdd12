package pl.sda.tddtraining;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerStatistics {
    private Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public List<Customer> getPeople() {

        return Arrays.asList(people);
    }

    //2. Napisz metodę, która przyjmie tablicę people i zwróci
    // listę Stringów <imię nazwisko> (elementem listy będzie np "Anna Nowak")
    public List<String> getPeopleNames() {
        List<String> result = new ArrayList<String>();
        for (Customer person : people) {
            result.add(person.getName().trim() + " " + person.getLastName().trim());
        }
        return result;
    }
    public List<String> getPeopleNamesWithStream() {
        return getPeople().stream()
                .map(customer -> customer.getName().trim() + " " + customer.getLastName().trim())
                .collect(Collectors.toList());
    }

}
