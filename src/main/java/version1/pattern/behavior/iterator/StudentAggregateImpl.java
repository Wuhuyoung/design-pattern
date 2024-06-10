package version1.pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> getIterator() {
        return new IteratorImpl<>(list);
    }
}
