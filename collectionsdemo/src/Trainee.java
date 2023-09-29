public class Trainee implements Comparable<Trainee>  {
    private int traineeId;
    private String name;

    public Trainee(int traineeId, String name) {
        this.traineeId = traineeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Trainee o) {
        if(this.traineeId > o.traineeId){
            return 1;
        }
        if(this.traineeId < o.traineeId){
            return -1;
        }
        return 0;
    }
}
