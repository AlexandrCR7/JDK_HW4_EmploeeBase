package Hw4_ContactList;

public class Employee {

    private String name;
    private Integer tabelNumber;
    private Integer phoneNumber;
    private Integer experience;

    public Employee(String name, Integer tabelNumber, Integer phoneNumber, Integer experience) {
        this.name = name;
        this.tabelNumber = tabelNumber;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(Integer tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", tabelNumber=" + tabelNumber +
                ", phoneNumber=" + phoneNumber +
                ", experience=" + experience +
                '}';
    }
}
