package version1.pattern.behavior.iterator;

public class Student {
    private String name;
    private Integer number;

    public Student() {
    }

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
