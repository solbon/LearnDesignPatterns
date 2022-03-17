package pl.malpiszon.compare;

public class Player {
    private String name;
    private int age;
    private int ranking;

    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int compareTo(Player p) {
        if (getRanking() > p.getRanking()) {
            return 1;
        } else if (getRanking() < p.getRanking()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ranking=" + ranking +
                '}';
    }
}
