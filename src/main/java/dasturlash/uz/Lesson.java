package dasturlash.uz;

public class Lesson {
    private String name;
    private Professor professor;
    private Assistant assistant;

    public Lesson(String name, Professor professor, Assistant assistant) {
        this.name = name;
        this.professor = professor;
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", professor=" + professor +
                ", assistant=" + assistant +
                '}';
    }
}
