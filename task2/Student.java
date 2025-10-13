public class Student {
    String name;
    int studentId;
    
    // Конструктор с параметрами
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    // Конструктор по умолчанию
    public Student() {
        this.name = "Неизвестно";
        this.studentId = 0;
    }
}