import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Создание объектов с использованием конструктора с параметрами
        Student student1 = new Student("Иван Петров", 1001);
        Student student2 = new Student("Мария Сидорова", 1002);
        Student student3 = new Student("Алексей Козлов", 1003);
        
        // Создание объекта с использованием конструктора по умолчанию
        Student student4 = new Student();
        
        // Сохранение в файл constructors.txt
        try (FileWriter writer = new FileWriter("constructors.txt")) {
            writer.write("=== Студенты, созданные через конструктор с параметрами ===\n");
            writeStudentInfo(writer, student1, 1);
            writeStudentInfo(writer, student2, 2);
            writeStudentInfo(writer, student3, 3);
            
            writer.write("\n=== Студент, созданный через конструктор по умолчанию ===\n");
            writeStudentInfo(writer, student4, 4);
            
            System.out.println("Данные успешно записаны в constructors.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    
    private static void writeStudentInfo(FileWriter writer, Student student, int number) throws IOException {
        writer.write("Студент " + number + ":\n");
        writer.write("Имя: " + student.name + "\n");
        writer.write("ID: " + student.studentId + "\n\n");
    }
}