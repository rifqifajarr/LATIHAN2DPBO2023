public class Civitas extends Human {
    // attribute
    private String asalUniversitas, emailEdu;

    // constructor
    public Civitas() {
        this.asalUniversitas = "";
        this.emailEdu = "";
    } 

    public Civitas(String asalUniversitas, String emailEdu) {
        this.asalUniversitas = asalUniversitas;
        this.emailEdu = emailEdu;
    }

    // getter and setter
    public String getAsalUniversitas() {
        return this.asalUniversitas;
    }

    public String getEmailEdu() {
        return this.emailEdu;
    }

    public void setAsalUniversitas(String asalUniversitas) {
        this.asalUniversitas = asalUniversitas;
    }

    public void setEmailEdu(String emailEdu) {
        this.emailEdu = emailEdu;
    }

    // method
    public void absen() {
        System.out.println("bang sebut nama");
    }
}
