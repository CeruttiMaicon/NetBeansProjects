
package projetoyoutube;


public class ProjetoYoutube {

    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 11 HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Maicon", 19, "M", "cerutti.maicon");
        g[1] = new Gafanhoto("Creuza", 12, "M", "creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
    }
    
}
