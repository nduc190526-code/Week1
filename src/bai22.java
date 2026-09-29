public class bai22 {
    private String id;
    private String name;
    private String email;
    private double gpa;
    public bai22(){
        this.id="";
        this.name="";
        this.email="";
        this.gpa=0.0;
    }
    public bai22(String  id,String name){
        this.id=id;
        this.name=name;
        this.email="";
        this.gpa=0.0;
    }
    public bai22(bai22 other){
        this.id = other.id;
        this.name = other.name;
        this.email = other.email;
        this.gpa = other.gpa;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getGpa() { return gpa; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.err.println("GPA phải nằm trong khoảng 0.0 đến 4.0.");
        }
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public static void main(String[] args) {
        bai22 s1 = new bai22();

        bai22 s2 = new bai22("SV002", "Tran Thi B");
        s2.setEmail("b@example.com");
        s2.setGpa(3.5);

        bai22 s3 = new bai22(s2);
        s3.setId("SV003");

        s1.setGpa(-1.0);
        s2.setGpa(5.0);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}

