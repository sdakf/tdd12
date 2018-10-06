package pl.sda.tddtraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerStatisticsTest {
    @Test
    void shouldIdIncreasedByOne() {
        CustomerStatistics customerStatistics = new CustomerStatistics();
        List<Customer> people = customerStatistics.getPeople();
        int counter = 1;
        for (Customer person : people) {
            Assertions.assertEquals(counter++, person.getId().intValue());
        }
    }

    @Test
    void shouldReturnProperNames() {
        CustomerStatistics customerStatistics = new CustomerStatistics();
        List<String> peopleNames = customerStatistics.getPeopleNames();
        Assertions.assertEquals("Anna Nowak", peopleNames.get(0));
        Assertions.assertEquals("Monika Kos", peopleNames.get(4));
    }

}