package java104;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> subjects;

    public Student(String name) {
        this.name = name;
        subjects = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

}
