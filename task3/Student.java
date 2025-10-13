import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    String name;
    int studentId;
    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public Student() {
        this.name = "Неизвестно";
        this.studentId = 0;
    }
    
    // Метод для вывода информации о студенте
    public void printInfo() {
        System.out.println("Информация o студенте:");
        System.out.println("Имя: " + this.name);
        System.out.println("ID: " + this.studentId);
    }
    
    // Метод для изменения имени
    public void updateName(String newName) {
        String oldName = this.name;
        this.name = newName;
        logNameUpdate(oldName, newName);
    }
    
    // Приватный метод для логирования изменений
    private void logNameUpdate(String oldName, String newName) {
        try (FileWriter writer = new FileWriter("update_log.txt", true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write("[" + timestamp + "] ");
            writer.write("ID: " + this.studentId + " | ");
            writer.write("Старое имя: " + oldName + " | ");
            writer.write("Новое имя: " + newName + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог: " + e.getMessage());
        }
    }
}