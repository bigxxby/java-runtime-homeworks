import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String ID;

    public Student(String name, String group, String ID) {
        this.name = name;
        this.group = group;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(ID, student.ID);
    }

    @Override
    public String toString() {
        return "Студент \'" +  name + "\', состоит в группе - \'" + group  +  "\', его ID - \'" + ID+ "\'";
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID); // переопределили хеш код чтобы он выдавал код только на основе ИД
    }
}
