package dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso [\ntitulo: " + getTitulo() + "\ndescricao: " + getDescricao() + "\ncargaHoraria: " + cargaHoraria + "]";
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoraria; 
    }

    
}
