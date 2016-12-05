package Uebung8;

public class Aufgabe4 {
    public static void main(String[] args) {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\""
                + "</div>"
                + "</body>";
        int start = seite.indexOf("<img src=");
        start = start + 10;
        int ende = seite.indexOf(".png");
        ende = ende + 4;
        String downloadUrl = seite.substring(start, ende);
        System.out.println(downloadUrl);
    }
}
