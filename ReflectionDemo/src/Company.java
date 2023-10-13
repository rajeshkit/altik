
public class Company {
    private int companyId;
    private String companyName;

    public Company(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
    public static void display(){
        System.out.println("Display method called");
    }
    @MyAnnotation
    public int getCompanyId() {
        return companyId;
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
