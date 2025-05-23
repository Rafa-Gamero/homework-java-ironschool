import java.util.UUID;

public class Course {
    private String courseId;
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher;

    // constructor crear nuevo curso
    private static int idCounter = 1000;
    public Course(String name, double price) {
       this.courseId = "C" + idCounter++; // Genera un ID único
        this.name = name;
        this.price = price;
        this.money_earned = 0.0; // De primeras no hay dinero ganado
        this.teacher = null; //  no hay profesor asignado al principio
    }

    // Getters - Setters__

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned = money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Incrementar el dinero ganado cuando se inscriben a curso

    public void updateMoneyEarned() {
        this.money_earned += this.price;
    }
    public void enrollStudent() {
        this.money_earned += this.price;
    }
    // representacion en string del curso

    @Override
    public String toString() {
        return "Curso [ID: " + courseId + ", Nombre: " + name +
                ", Precio: " + price + ", Dinero ganado: " + money_earned +
                ", Profesor: " + (teacher != null ? teacher.getName() : "No asignado") + "]";
    }

}

