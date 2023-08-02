public class Doctor extends Person{
    private String specialist;
    private float workingHours;

    public Doctor(String name, int age, String specialist, float workingHours) {
        super(name, age);
        this.specialist = specialist;
        this.workingHours = workingHours;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Thông tin bác sĩ: " + super.toString() +
                "chuyên khoa: " + specialist + ", " +
                "số giờ làm việc: " + workingHours +
                '}';
    }
}
