import in.icici.Student;

import java.util.Arrays;
import java.util.Objects;

public class Trainee {
    int traineeId;
    String traineeName="Ajay";

    public Trainee(int traineeId, String traineeName) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
    }

    @Override   // t1.equals(t2)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
            Trainee trainee = (Trainee) o;
        return traineeId == trainee.traineeId && Objects.equals(traineeName, trainee.traineeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traineeId, traineeName);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", traineeName='" + traineeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Object t1=new Trainee(100,"abc");//202020
        Object t2=new Trainee(100,"abc");//303030

        Trainee tt1=(Trainee)new Object();


        boolean result = t1.equals(t2);
        System.out.println(result);

        //Object casting
    }
}








