public class Apartamento {
    private int nro_id;
    private String nome_prop;
    private int nro_criancas;
    private int nro_adultos;

    public int getNro_id() {
        return nro_id;
    }

    public void setNro_id(int nro_id) {
        this.nro_id = nro_id;
    }

    public String getNome_prop() {
        return nome_prop;
    }

    public void setNome_prop(String nome_prop) {
        this.nome_prop = nome_prop;
    }

    public int getNro_criancas() {
        return nro_criancas;
    }

    public void setNro_criancas(int nro_criancas) {
        this.nro_criancas = nro_criancas;
    }

    public int getNro_adultos() {
        return nro_adultos;
    }

    public void setNro_adultos(int nro_adultos) {
        this.nro_adultos = nro_adultos;
    }

    public int aptosDesocupado() {
        int aptosDesocupados = 0;
        if (this.getNro_adultos() == 0 && this.getNro_criancas() == 0){
            aptosDesocupados = aptosDesocupados + 1;
        }
        return aptosDesocupados;
    }

    public String toString() {
        return "ID: " + nro_id + ", Nome Prop: " + nome_prop + ", Criancas: " + nro_criancas + ", Adultos: " + nro_adultos;
    }
}
