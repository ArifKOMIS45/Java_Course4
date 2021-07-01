package Methods;

public class methods_4 {
    public static void main(String[] args) {

        filmArsivi("Prestij", 2006, 8.5);
        filmArsivi("Yeşil Yol", 1999, 8.6);
        filmArsivi("Gukuk Kuşu", 1975, 8.7);
        filmArsivi("2001: Space Odyssey", 1968, 8.3);
    }

    public static void filmArsivi(String title, int year, double imdbScore) {

        System.out.println(title + ", " + year + ", " + imdbScore);

    }

}
