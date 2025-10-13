public class Main {
    public static void main(String[] args) {
        // Создание объекта студента
        Student student = new Student("Иван Петров", 1001);
        
        // Вывод информации о студенте
        System.out.println("=== Вызов метода printInfo() ===");
        student.printInfo();
        
        // Изменение имени студента
        System.out.println("\n=== Изменение имени ===");
        student.updateName("Иван Иванов");
        
        // Проверка изменения
        System.out.println("После изменения:");
        student.printInfo();
        
        // Еще одно изменение для демонстрации лога
        student.updateName("Иван Сидоров");
        
        System.out.println("\nПроверьте файл update_log.txt для просмотра истории изменений");
    }
}