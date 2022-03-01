import java.io.IOException;

/**
 * @author Эрбаев Ильдус P3112
 * Главный класс, через который программа начинает работу
 */

public class Main {
    public static void main(String[] args) throws IOException{
        CollectionManager collectionManager = new CollectionManager("src/file.xml");
        Commander commander = new Commander(collectionManager);
        commander.run();
    }
}
