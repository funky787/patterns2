package proxy;

interface Image {
    void show();
}

class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Загрузка файла " + fileName);
    }

    public void show() {
        System.out.println("Показ " + fileName);
    }
}

class ProxyImage implements Image {

    private String fileName;
    private RealImage image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void show() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.show();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Image image =
                new ProxyImage("photo.jpg");

        image.show();
        image.show();
    }
}