package TreeSet;

public class Participant implements Comparable<Participant> {



    private String name;
    private Integer age;


    public Participant(String name, Integer age) {

        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Participant o) {
        return this.age > o.age ? 1 : this.age == o.age ? 0 : -1;
    }
}
