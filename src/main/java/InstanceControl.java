
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class InstanceControl { 

    private static Scanner input;
    private static final ArrayList<InstanceMode> valores = new ArrayList<>();

    public ArrayList<InstanceMode> loader(String file) throws IOException {
        try {
            input = new Scanner(Paths.get(file));
            input.nextLine(); // Ignora o cabeçalho

            while (input.hasNext()) {
                String[] data = input.nextLine().split("\\. "); 

                InstanceMode dados = new InstanceMode();
                dados.setDisciplina(data[0]);
                dados.setDocente(data[1]);
                dados.setCh(Integer.parseInt(data[2]));
                dados.setDiv(Integer.parseInt(data[3]));
                dados.setTurma(data[4]);
                dados.setArea(data[5]);

                valores.add(dados);
            }
        } catch (IOException | NumberFormatException e) { 
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }

        return valores;
    }

    // Torna a classe InstanceMode pública
    public static class InstanceMode {
        private String disciplina;
        private String docente;
        private int ch;
        private int div;
        private String turma;
        private String area;

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public void setDocente(String docente) {
            this.docente = docente;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public void setDiv(int div) {
            this.div = div;
        }

        public void setTurma(String turma) {
            this.turma = turma;
        }

        public void setArea(String area) {
            this.area = area;
        }

        // Métodos getters para acessar os atributos
        public String getDisciplina() {
            return disciplina;
        }

        public String getDocente() {
            return docente;
        }

        public int getCh() {
            return ch;
        }

        public int getDiv() {
            return div;
        }

        public String getTurma() {
            return turma;
        }

        public String getArea() {
            return area;
        }
    }
}
