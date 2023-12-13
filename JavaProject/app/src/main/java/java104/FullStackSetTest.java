package java104;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FullStackSetTest {
    public static void main(String[] args) {
        String[] arrSubject = {"Java", "Python", "Java", "Algorithm", "Spring", "Data Structure", "JavaScript", "Database", "Spring", "Lambda", "Spring Boot"};

        System.out.println(Arrays.toString(arrSubject));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student s1 = new Student("SmartA");
        s1.addSubject("Java");
        s1.addSubject("Algorithm");
        s1.addSubject("Python");
        s1.addSubject("Spring");
        
        Student s2 = new Student("SmartB");
        s2.addSubject("Java");
        s2.addSubject("DataBase");
        s2.addSubject("Spring");

        Student s3 = new Student("SmartC");
        s3.addSubject("Java");
        s3.addSubject("Spring");
        s3.addSubject("Javascript");

        Course course = new Course();
        course.setStudents(s1, s2, s3);

        System.out.println("[1] 모든 교과목을 출력");
        course.setSubjects(arrSubject);
        Set<String> subjects = course.getSubjects();
        Course.print(subjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[2] 정렬된 교과목을 출력");
        List<String> oSubjects = course.getOrderSubjects();
        Course.print(oSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[3] 모든 학생이 수강 중인 모든 교과목을 출력 (UNION)");
        Set<String> uSubjects = course.getRegisteredSubjects();
        Course.print(uSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[4] 모든 학생이 공통으로 수강 중인 과목을 출력 (INTERSECTION)");
        Set<String> iSubjects = course.getBasicSubjects();
        Course.print(iSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("[5] 아무도 수강하지 않는 과목을 출력 (COMPLETE)");
        Set<String> cSubjects = course.getCancelSubjects();
        Course.print(cSubjects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
