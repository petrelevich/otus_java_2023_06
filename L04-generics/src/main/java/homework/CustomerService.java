package homework;

import java.util.*;

@SuppressWarnings({
    "java:S1186",
    "java:S1135",
    "java:S1172"
}) // при выполнении ДЗ эту аннотацию надо удалить
public class CustomerService {

    // todo: 3. надо реализовать методы этого класса
    // важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    private final NavigableMap<Customer, String> CustomerServiseMap;
    public CustomerService()
    {
        this.CustomerServiseMap = new TreeMap<>();
    }

    public Map.Entry<Customer, String> getSmallest() {
        // Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk
        var entry = CustomerServiseMap.firstEntry();
        return new AbstractMap.SimpleEntry<Customer, String>( new Customer(entry.getKey().getId(), entry.getKey().getName(), entry.getKey().getScores()), entry.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var entry = CustomerServiseMap.higherEntry(customer);
        if (Objects.isNull(entry))
        {
            return null;
        }
        return new AbstractMap.SimpleEntry<Customer, String>( new Customer(entry.getKey().getId(), entry.getKey().getName(), entry.getKey().getScores()) , entry.getValue());
    }

    public void add(Customer customer, String data) {
        CustomerServiseMap.put(customer, data);
    }

}
