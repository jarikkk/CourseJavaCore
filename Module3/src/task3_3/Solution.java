package task3_3;

public class Solution {
    public static void main(String[] args) {

        String[] name = {"Jenny", "Jonny", "Bob", "Gudrun", "Gena"};
        String[] teacherNames = {"Marry", "Mari", "Shulz", "Mark", "Angelina"};

        Course[] courses = new Course[5];
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course(name[i], 24, teacherNames[i]);
        }


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

