package version1.pattern.behavior.iterator;

public interface StudentAggregate {
    void addStudent(Student student);
    void remove(Student student);
    Iterator<Student> getIterator();
}
