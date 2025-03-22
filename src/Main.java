import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>: ");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Ошибка: указанный путь не существует или является папкой. Попробуйте снова.");
                continue;
            }

            fileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + fileCount);
        }
    }
}
