package model;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa22-bse-082
 */
public class Model {
    // HashMap to store student data: ID as the key, and name and grade as the value
    private HashMap<String, String[]> students;

    public Model() {
        students = new HashMap<>();
    }

    // Add a new student
    public void addStudent(String id, String name, String grade) {
        students.put(id, new String[]{name, grade});
    }

    // Remove a student by ID
    public void removeStudent(String id) {
        students.remove(id);
    }

    // Get details of a specific student by ID
    public String getStudent(String id) {
        if (students.containsKey(id)) {
            String[] details = students.get(id);
            return "ID: " + id + ", Name: " + details[0] + ", Grade: " + details[1];
        }
        return "Student not found!";
    }

    // Get a list of all students
    public List<String> getAllStudents() {
        List<String> studentList = new ArrayList<>();
        for (String id : students.keySet()) {
            String[] details = students.get(id);
            studentList.add("ID: " + id + ", Name: " + details[0] + ", Grade: " + details[1]);
        }
        return studentList;
    }

    // Set or update a student's details
    public void setStudent(String id, String name, String grade) {
        if (students.containsKey(id)) {
            students.put(id, new String[]{name, grade});
        } else {
            addStudent(id, name, grade);
        }
    }
}
