package pl.sda.tddtraining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomerStatisticsTest {
    private CustomerStatistics customerStatistics = new CustomerStatistics();

    @Test
    void shouldIdIncreasedByOne() {
        List<Customer> people = customerStatistics.getPeople();
        int counter = 1;
        for (Customer person : people) {
            Assertions.assertEquals(counter++, person.getId().intValue());
        }
    }

    @Test
    void shouldReturnProperNames() {
        List<String> peopleNames = customerStatistics.getPeopleNames();
        List<String> peopleNamesWithStream = customerStatistics.getPeopleNamesWithStream();

        assertEquals("Anna Nowak", peopleNames.get(0));
        assertEquals("Monika Kos", peopleNames.get(4));
        assertEquals("Marek Nowak", peopleNamesWithStream.get(2));
    }

    @Test
    void shouldPopulateCustomersMap() {
        Map<Integer, Customer> customersMap = customerStatistics.returnListOfCustomersAsMap();
        Map<Integer, Customer> customersAsMapWithStream = customerStatistics.returnListOfCustomersAsMapWithStream();

        assertEquals("Marek Nowak", customersMap.get(3).getCustomerNameWithLastName());
        assertEquals("Monika Kos", customersAsMapWithStream.get(5).getCustomerNameWithLastName());
    }
}