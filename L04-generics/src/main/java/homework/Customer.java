package homework;

@SuppressWarnings({"java:S1135"}) // при выполнении ДЗ эту аннотацию надо удалить
public class Customer implements Comparable<Customer>{
    private final long id;
    private String name;
    private long scores;

    // todo: 1. в этом классе надо исправить ошибки

    public Customer(long id, String name, long scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScores() {
        return this.scores;
    }

    public void setScores(long scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + this.id + ", name='" + this.name + '\'' + ", scores=" + this.scores + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return this.id == customer.id;
        //if (id != customer.id) return false;
        //if (scores != customer.scores) return false;
        //return name != null ? name.equals(customer.name) : customer.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        //result = 31 * result + (name != null ? name.hashCode() : 0);
        //result = 31 * result + (int) (scores ^ (scores >>> 32));
        return result;
    }

    public int compareTo(Customer anotherCustomer){
        return Long.compare(this.scores, anotherCustomer.scores);
    }

}


