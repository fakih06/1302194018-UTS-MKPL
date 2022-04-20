package lib;

public class Child {
    private String childName;
    private String childIdNumbers;

    public Child(String childName, String childIdNumbers) {
        this.childName = childName;
        this.childIdNumbers = childIdNumbers;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(String childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
}