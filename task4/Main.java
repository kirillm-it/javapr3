public class Main {
    public static void main(String[] args) {
        // Создание объекта студента
        Student student = new Student("Анна Ковалева", 1005);
        
        // Добавление курсов через метод addCourse
        System.out.println("=== Добавление курсов через addCourse() ===");
        student.addCourse("Java Programming");
        student.addCourse("Database Systems");
        student.addCourse("Web Development");
        
        // Добавление и вывод курсов через метод listCourses с параметрами переменной длины
        System.out.println("\n=== Добавление курсов через listCourses() ===");
        student.listCourses("Algorithms", "Data Structures", "Software Engineering");
        
        // Демонстрация работы с разным количеством параметров
        System.out.println("\n=== Добавление дополнительных курсов ===");
        Student student2 = new Student("Петр Васильев", 1006);
        student2.listCourses("Mathematics"); // один параметр
        student2.listCourses("Physics", "Chemistry"); // два параметра
        student2.listCourses(); // без параметров (просто создаст пустой список)
    }
}