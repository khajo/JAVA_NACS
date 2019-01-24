package week_10.ex_4;

public class Character {
    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private String gender;
    private String nobility;
    private String got;
    private String cok;
    private String sos;
    private String ffc;
    private String dwd;

    public Character(String name, String allegiances, String deathYear, String bookOfDeath, String deathChapter,
                     String bookIntroChapter, String gender, String nobility, String got, String cok,
                     String sos, String ffc, String dwd) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
        this.got = got;
        this.cok = cok;
        this.sos = sos;
        this.ffc = ffc;
        this.dwd = dwd;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public String getGender() {
        return gender;
    }

    public String getNobility() {
        return nobility;
    }

    public String getGot() {
        return got;
    }

    public String getCok() {
        return cok;
    }

    public String getSos() {
        return sos;
    }

    public String getFfc() {
        return ffc;
    }

    public String getDwd() {
        return dwd;
    }
}
