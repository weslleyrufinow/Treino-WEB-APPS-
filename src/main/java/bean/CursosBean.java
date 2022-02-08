package bean;
	
import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
	
import javax.inject.Named;
	
	import modelo.Curso;
	
	
	
@Named("cursosBean")
@SessionScoped
	public class CursosBean implements Serializable{
	private List <Curso> cursos = new ArrayList<Curso>() ;
	private Curso curso = new Curso();
        
        
        
        private boolean alterar=false;
        
	private int posicao;	
	  public List<Curso> getCursos() {
			return cursos;
		}
	
	
	public String nomeBotao(){
            if (alterar)
                return "Salvar";
             else
                return "Adicionar";
        }
                
	
	public void adicionaCurso () {
        if (alterar)
            cursos.set(posicao, curso);
        else
            this.cursos.add(this.curso) ;
         alterar=false;
	 this.curso = new Curso();
	}

        
	
	public void cancelar() {
           alterar=false;
           this.curso = new Curso();
	}
        
        
        public void removeCurso(Curso curso) {
            this.cursos.remove(curso);
            System.out.println("removeu");
	}




        public void carregar(Curso curso) {
            try {
                posicao =cursos.indexOf(curso);
                this.curso = (Curso) curso.clone();
                // this.curso = clonar(curso)
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(CursosBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            alterar=true;
	}

        public Curso clonar(Curso curso){
            Curso c = new Curso();
            c.setNome(curso.getNome());
            c.setCentro(curso.getCentro());
            c.setTurno(curso.getTurno());
            c.setSigla(curso.getSigla());
            return c;
        }


        
	public Curso getCurso(){
		return curso;
	}
	// GETTER E SETTER
}