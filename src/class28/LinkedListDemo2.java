package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String>subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");
        LinkedList<String>futurSubject=new LinkedList<>();
        futurSubject.add("Selenium");
        futurSubject.add("Testing");
        futurSubject.add("Cucumber");
        futurSubject.add("SQL");
        futurSubject.add("APIs");
        futurSubject.add("Jenkis");
        LinkedList<String>allSubject=new LinkedList<>();
       allSubject.addAll(subjects);
       allSubject.addAll(futurSubject);
        System.out.println(allSubject);
        }
    }

