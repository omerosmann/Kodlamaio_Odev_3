package entities;

public class Edicator {

    private int edicatorId;
    private String edicatorFirstName;
    private String edicatorLastName;

    public Edicator() {
        
    }

    public Edicator(int edicatorId, String edicatorFirstName, String edicatorLastName) {
        this.edicatorId = edicatorId;
        this.edicatorFirstName = edicatorFirstName;
        this.edicatorLastName = edicatorLastName;
    }

    public int getEdicatorId() {
        return edicatorId;
    }

    public void setEdicatorId(int edicatorId) {
        this.edicatorId = edicatorId;
    }

    public String getEdicatorFirstName() {
        return edicatorFirstName;
    }

    public void setEdicatorFirstName(String edicatorFirstName) {
        this.edicatorFirstName = edicatorFirstName;
    }

    public String getEdicatorLastName() {
        return edicatorLastName;
    }

    public void setEdicatorLastName(String edicatorLastName) {
        this.edicatorLastName = edicatorLastName;
    }
    
    
    
    
}
