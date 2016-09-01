package task3_3;

public class Solution {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        String[] name = {"Jenny", "Jonny", "Bob", "Gudrun"};
        String[] teacherNames = {"Marry", "Marry", "Shulz", "Mark"};

        for (String s1 : name) a = s1;
        for (String s2 : name) b = s2;


        Course[] courses = new Course[4];
        for (int i = 0; i < 4; i++) {
            courses[i] = new Course(a, 24, b);
        }
        Course course = new Course("Angelina", 24, "Gena");

        Student student1 = new Student("Billy", "Jones", 1);
        Student student2 = new Student("Jones", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Billy", "Jones", 1);
        CollegeStudent collegeStudent2 = new CollegeStudent("Jones", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Jane", 5, 10450034L);

        SpecialStudent specialStudent1 = new SpecialStudent(30947732L);
        SpecialStudent specialStudent2 = new SpecialStudent("Jonny", "Billyjeans", 1);
        SpecialStudent specialStudent3 = new SpecialStudent("Billibon", courses);


    }
}

