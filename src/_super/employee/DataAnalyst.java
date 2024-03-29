package _super.employee;

import java.util.Arrays;

public class DataAnalyst extends Employee {

    protected boolean phd;

    protected String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return this.methods.clone();
    }

    @Override
    public String toString() {
        return "DataAnalyst{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                ", phd=" + phd +
                ", methods=" + Arrays.toString(methods) +
                '}';
    }
}

