package java104;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
    private Set<String> subjects;
    private List<Student> students;

    public void setStudents(Student... arrStudent) { // ... : variable argument
        students = new ArrayList<>();
        Collections.addAll(students, arrStudent);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setSubjects(String[] arrSubjects) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arrSubjects);
        subjects = new HashSet<>(list);
    }

    // [1] 모든 교과목을 return
    public Set<String> getSubjects() {
        return subjects;
    }

    // [2] 정렬된 교과목을 return
    public List<String> getOrderSubjects() {
        List<String> oSubjects = new ArrayList<>(subjects);
        Collections.sort(oSubjects);
        return oSubjects;
    }

    // [3] 모든 학생들이 수강 중인 모든 교과목을 return (UNION)
    public Set<String> getRegisteredSubjects() {
        Set<String> uSubjects = new HashSet<>();

        for (Student student : students) {
            uSubjects.addAll(student.getSubjects());
        }
        return uSubjects;
    }

    // [4] 모든 학생들이 수강 중인 과목을 return (INTERSECTION)
    public Set<String> getBasicSubjects() {
        Set<String> subjects = null;

        for (Student student : students) {
            if (subjects == null)
                subjects = new HashSet<>(student.getSubjects());
            subjects.retainAll(student.getSubjects());
        }
        return subjects;
    }

    // [5] 모든 학생들이 수강하지 않는 과목을 return (COMPLETE)
    public Set<String> getCancelSubjects() {
        Set<String> allSubjects = new HashSet<>(subjects);
        Set<String> cSubject = getRegisteredSubjects();
        allSubjects.removeAll(cSubject);

        return allSubjects;
    }

    public static void print(Collection<String> subjects) {
        for (String i : subjects) {
            System.out.println(i + ", ");
        }
        System.out.println();
    }
}
