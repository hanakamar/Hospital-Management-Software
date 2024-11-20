public class Doctor extends User {
    private int age;

    public Doctor(String userID, String name, String password, String gender, String contactEmail, String contactNumber, int age) {
        super(userID, name, password, UserRole.DOCTOR, gender, contactEmail, contactNumber);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + userID +
                ", Name: " + name +
                ", Role: " + role +
                ", Gender: " + gender +
                ", Age: " + age +
                ", Email: " + contactEmail +
                ", Contact: " + contactNumber;
    }

}
