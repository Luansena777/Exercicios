package ExercicioBiblioteca.test;

import ExercicioBiblioteca.dominio.Autor;
import ExercicioBiblioteca.dominio.Biblioteca;
import ExercicioBiblioteca.dominio.Livro;
import ExercicioBiblioteca.dominio.Usuario;

public class SistemaBiblioteca {
     public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 1899, 20, 20);
        Autor autor1 = new Autor("Machado de Assis", "21/07/1839", "Brasileiro");
        livro1.adiconarAutor(autor1);

        Livro livro2 = new Livro("One Piece", 1999, 15, 15);
        Autor autor2 = new Autor("Eiichiro Oda", "01/01/1975", "Japonês");
        livro2.adiconarAutor(autor2);

        Livro livro3 = new Livro("O Pequeno Principe", 1943, 10, 10);
        Autor autor3 = new Autor("Antoine de Saint-Exupéry", " 29/06/1900", "Francês");
        livro3.adiconarAutor(autor3);

        Usuario usuario1 = new Usuario("Luan", "1");
        Usuario usuario2 = new Usuario("Pedro", "2");

        usuario1.emprestarLivro(livro2);
        usuario1.emprestarLivro(livro1);

        usuario2.emprestarLivro(livro1);
        usuario2.emprestarLivro(livro2);
        usuario2.emprestarLivro(livro3);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);


        biblioteca.exibiroBiblioteca();
        biblioteca.exibirUsuarios();


    }
}
