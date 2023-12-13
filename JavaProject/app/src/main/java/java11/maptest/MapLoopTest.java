package java11.maptest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLoopTest {
    public static void main(String[] args) {
        // [1] Map.Entry<K,V> entrySet()
        System.out.println("[1] SmartA");
        System.out.println("[1] Map.Entry<K,V> entrySet()");
        Map<String, String> classA = new HashMap<>();
        classA.put("S1", "Java");
        classA.put("S2", "Spring");
        classA.put("S3", "Python");
        classA.put("S4", "Java");
        classA.put("S5", "Java");
        classA.put("S6", "Database");
        for (Map.Entry<String, String> rv : classA.entrySet()) { // for each문은 출력 결과를 조작할 수 없다. (Immutable)
            System.out.println("이름: " + rv.getKey() + "\tSkill: " + rv.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [2] Iterator<String> Pattern
        System.out.println("[2] SmartB");
        System.out.println("[2] Iterator<String> Pattern");
        Map<String, String> classB = new HashMap<>();
        classB.put("B1", "Java");
        classB.put("B2", "Python");
        classB.put("B3", "Java");
        classB.put("B4", "Android");
        classB.put("B5", "IOS");
        classB.put("B6", "Android");
        
        for (Iterator<String> it = classB.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            System.out.println("이름: " + key + "\tSkill: " + classB.get(key));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [3] SmartA와 SmartB 통합
        System.out.println("[3] SmartA와 SmartB 통합");
        Map<String, String> student = new HashMap<>();
        student.putAll(classA);
        student.putAll(classB);
        for (Map.Entry<String, String> stu : student.entrySet()) {
            System.out.println("이름: " + stu.getKey() + "\tSkill: " + stu.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [4] Android 수강한 학생은 Mobile Class로 보내고 SmartA+SmartB 수강하는 학생 목록
        System.out.println("[4] Android 수강한 학생은 Mobile Class로 보냄");
        Set<String> skill = Collections.singleton("Android"); // skill이 Android인 학생 저장 (Immutable Set이 return됨)
        student.values().remove(skill); // skill이 Android인 학생 목록에서 제거
        System.out.println(student.keySet());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [5] Python을 수강하는 학생을 확인 (S3, B2)
        Map<String, String> py = new HashMap<>();
        py.put("S3", "Python");
        py.put("B3", "DataBase");
        System.out.println(student.entrySet().containsAll(py.entrySet()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [6] SmartA와 SmartB 반이 학생이 같은지 확인
        System.out.println(classA.keySet().equals(classB.keySet()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [7] Java, JavaScript Skill을 보유한 학생 확인 여부
        System.out.println(student.containsValue("Java"));
        System.out.println(student.containsValue("JavaScript"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
