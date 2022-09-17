package co.develhope.middleware2.entities;

public class Month {

    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;

    public Month(int monthNumber, String englishName, String italianName, String germanName) {
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this. germanName = germanName;
    }

    public Month() {}

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public String getItalianName() {
        return italianName;
    }
}
