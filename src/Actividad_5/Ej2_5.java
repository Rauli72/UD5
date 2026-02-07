package Actividad_5;

public class Ej2_5 {
}

abstract class Employee {
    private String nombre;
    private String cargo;

    // Constructor
    public Employee(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Métod0 abstracto
    public abstract double calculateWeeklyPay();
}

class SalaryEmployee extends Employee {
    private double weeklySalary;

    public SalaryEmployee(String nombre, String cargo, double weeklySalary) {
        super(nombre, cargo);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateWeeklyPay() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String nombre, String cargo, double hourlyRate, double hoursWorked) {
        super(nombre, cargo);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateWeeklyPay() {
        return hourlyRate * hoursWorked;
    }
}