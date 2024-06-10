package version1.pattern.behavior.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregate aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三", 1));
        aggregate.addStudent(new Student("李四", 2));
        aggregate.addStudent(new Student("王五", 3));
        aggregate.addStudent(new Student("找六", 4));

        Iterator<Student> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
