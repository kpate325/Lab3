public class Main {
    public static void main(String[] args) {
        System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        String text = WebScraper.urlToString("https://www.bls.gov/tus/charts/chart9.txt");
        String[] parts = text.split(" ");
        int counter = 0;
        for (int i =0; i < text.length(); i++) {
            if (parts[i] != " ") {
                counter++;
            }
        }
        System.out.print(counter);
    }
}
