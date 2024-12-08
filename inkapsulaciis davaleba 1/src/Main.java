public class Main {
    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast("Tbilisi", 15.0, 40, false, true, true);
        forecast.displayForecast();
        System.out.println("Suggest going out: " + (forecast.suggestForOuting() ? "Yes" : "No"));

        Student[] students = new Student[5];
        students[0] = new Student("John", "Doe", 20, 3, 85.5);
        students[1] = new Student("Jane", "Smith", 19, 2, 92.3);
        students[2] = new Student("Mike", "Johnson", 22, 4, 88.0);
        students[3] = new Student("Emily", "Davis", 21, 3, 95.4);
        students[4] = new Student("Chris", "Brown", 20, 1, 89.9);
        
        Student topStudent = findTopStudent(students);
        System.out.println("Top Student: " + topStudent.getFirstName() + " " + topStudent.getLastName());
    }

    public static Student findTopStudent(Student[] students) {
        Student topStudent = students[0];
        for (Student student : students) {
            if (student.getAverageScore() > topStudent.getAverageScore()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}
