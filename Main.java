public class Main {
    
    public static void main(String[] args) {
        itinerary graf = new itinerary(9);

        graf.tambahKota("Paris");
        graf.tambahKota("Brussels");
        graf.tambahKota("Zurich");
        graf.tambahKota("Amsterdam");
        graf.tambahKota("Vienna");
        graf.tambahKota("Prague");
        graf.tambahKota("Hamburg");
        graf.tambahKota("Warsaw");
        graf.tambahKota("Budapest");

        graf.tambahJalur("Paris", "Brussels");
        graf.tambahJalur("Paris", "Zurich");

        graf.tambahJalur("Brussels", "Zurich");
        graf.tambahJalur("Brussels", "Amsterdam");
        graf.tambahJalur("Brussels", "Paris");

        graf.tambahJalur("Zurich", "Brussels");
        graf.tambahJalur("Zurich", "Paris");
        graf.tambahJalur("Zurich", "Vienna");

        graf.tambahJalur("Amsterdam", "Brussels");
        graf.tambahJalur("Amsterdam", "Hamburg");
        graf.tambahJalur("Amsterdam", "Prague");

        graf.tambahJalur("Hamburg", "Amsterdam");
        graf.tambahJalur("Hamburg", "Prague");
        graf.tambahJalur("Hamburg", "Warsaw");

        graf.tambahJalur("Prague", "Vienna");
        graf.tambahJalur("Prague", "Zurich");
        graf.tambahJalur("Prague", "Amsterdam");
        graf.tambahJalur("Prague", "Hamburg");
        graf.tambahJalur("Prague", "Warsaw");

        graf.tambahJalur("Vienna", "Zurich");
        graf.tambahJalur("Vienna", "Prague");
        graf.tambahJalur("Vienna", "Budapest");

        graf.tambahJalur("Budapest", "Vienna");
        graf.tambahJalur("Budapest", "Warsaw");

        graf.tambahJalur("Warsaw", "Hamburg");
        graf.tambahJalur("Warsaw", "Prague");
        graf.tambahJalur("Warsaw", "Budapest");

        System.out.println("kunjungan kota di negara terdekat: ");
        graf.bfs("Paris");

        System.out.println();
        
        System.out.println("\nkunjungan kota di negara terjauh: " + "\n" + graf.dfs("Paris"));
    }
}
