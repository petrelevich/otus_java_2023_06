package homework;

import java.util.Stack;

@SuppressWarnings({
    "java:S1186",
    "java:S1135",
    "java:S1172"
}) // при выполнении ДЗ эту аннотацию надо удалить
public class CustomerReverseOrder {
    private final Stack<Customer> stack;
    public CustomerReverseOrder()
    {
        this.stack = new Stack<Customer>();
    }
    // todo: 2. надо реализовать методы этого класса
    // надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    public void add(Customer customer) {
        this.stack.add(customer);
    }

    public Customer take() {
        return this.stack.pop();
    }
}
