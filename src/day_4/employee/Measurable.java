package day_4.employee;

public interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable object : objects)
            sum += object.getMeasure();
        return (objects.length == 0)? 0 : sum / objects.length;
    }
}
