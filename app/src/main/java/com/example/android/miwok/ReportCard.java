public class ReportCard {

    private int english, maths, science, history, geography, german;
    private String rollNo, name;
    private float percentage;

    public ReportCard(String rollNo, String name, int english, int maths, int science, int history, int geography, int german) {
        this.rollNo = rollNo;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.history = history;
        this.geography = geography;
        this.german = german;
        calculatePercentage();
    }

    public void calculatePercentage() {
        percentage = (english + maths + science + history + geography + german) / 6;
    }

    @Override
    public String toString() {

        String message =  "Report Card :-";
        message += "\n\nName: " + name;
        message += "\nRoll no: " + rollNo;
        message += "\n\nEnglish: " + english + "/100";
        message += "\nMaths: " + maths + "/100";
        message += "\nScience: " + science + "/100";
        message += "\nHistory: " + history + "/100";
        message += "\nGeography: " + geography + "/100";
        message += "\nGerman: " + german + "/100";
        message += "\n\nPercentage: " + percentage + "%";

        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getGerman() {
        return german;
    }

    public void setGerman(int german) {
        this.german = german;
    }

}
