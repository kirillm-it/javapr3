import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int studentId;
    private List<String> courses;
    
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
    
    public Student() {
        this.name = "Неизвестно";
        this.studentId = 0;
        this.courses = new ArrayList<>();
    }
    
    public void printInfo() {
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + this.name);
        System.out.println("ID: " + this.studentId);
    }
    
    public void updateName(String newName) {
        String oldName = this.name;
        this.name = newName;
        logNameUpdate(oldName, newName);
    }
    
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
    
    // Метод для добавления курса
    public void addCourse(String course) {
        this.courses.add(course);
        System.out.println("Курс '" + course + "' добавлен для студента " + this.name);
    }
    
    // Метод для вывода списка курсов с параметрами переменной длины
    public void listCourses(String... newCourses) {
        // Добавляем новые курсы в список
        for (String course : newCourses) {
            this.courses.add(course);
        }
        
        // Сохраняем список курсов в файл
        saveCoursesToFile();
    }
    
    private void saveCoursesToFile() {
        try (FileWriter writer = new FileWriter("courses.txt")) {
            writer.write("Список курсов студента: " + this.name + " (ID: " + this.studentId + ")\n");
            writer.write("=====================================\n");
            
            for (int i = 0; i < courses.size(); i++) {
                writer.write((i + 1) + ". " + courses.get(i) + "\n");
            }
            
            writer.write("\nВсего курсов: " + courses.size() + "\n");
            
            System.out.println("Список курсов сохранен в courses.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи курсов в файл: " + e.getMessage());
        }
    }
}