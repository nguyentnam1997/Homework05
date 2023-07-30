import java.time.LocalDate;
import java.util.Date;

public class Patient extends Person {
    private int medicalNumber;
    private LocalDate hospitalizedDay;

    public Patient(long id, String name, int age, int medicalNumber, LocalDate hospitalizedDay) {
        super(id, name, age);
        this.medicalNumber = medicalNumber;
        this.hospitalizedDay = hospitalizedDay;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
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

    public int getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(int medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public LocalDate getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(LocalDate hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    @Override
    public String toString() {
        return "Thông tin bệnh nhân: " + super.toString() +
                "số bệnh án: " + medicalNumber + ", " +
                "ngày nhập viện: " + hospitalizedDay +
                '}';
    }
}
