import dominio.Curso;
import dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Primeiro Emprego");
        curso1.setDescricao("Em busca do primeiro emprego como desenvolvedor");
        curso1.setCargaHoraria(81);
        Curso curso2 = new Curso();
        curso2.setTitulo("Gabriel Domingues");
        curso2.setDescricao("Futuro engenheiro de software");
        curso2.setCargaHoraria(365*4);

        Mentoria mentoria1 =new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        mentoria1.setTitulo("POO na prática");
        mentoria1.setDescricao("Aprenda o paradigma da progamação orientada a objetos");
        mentoria1.setData(LocalDate.now());
        mentoria2.setTitulo("Js");
        mentoria2.setDescricao("Aprenda Js");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria1);
        System.out.println(mentoria2);

    }
}
