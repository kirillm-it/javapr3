import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Student
        Student student1 = new Student();
        student1.name = "Иван Петров";
        student1.studentId = 1001;
        
        Student student2 = new Student();
        student2.name = "Мария Сидорова";
        student2.studentId = 1002;
        
        // Сохранение в файл
        try (FileWriter writer = new FileWriter("students.txt")) {
            writer.write("Студент 1:\n");
            writer.write("Имя: " + student1.name + "\n");
            writer.write("ID: " + student1.studentId + "\n\n");
            
            writer.write("Студент 2:\n");
            writer.write("Имя: " + student2.name + "\n");
            writer.write("ID: " + student2.studentId + "\n");
            
            System.out.println("Данные успешно записаны в students.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}