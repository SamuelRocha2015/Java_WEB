package br.com.agenda.teste;

import br.com.agenda.DAOImpl.ContatoDAOImpl;
import br.com.agenda.beans.Contato;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class TestaDAOImpl {

    public static void main(String[] args) {
                    //testa dao.insere(contato);
                    /*
         ContatoDAOImpl dao = new ContatoDAOImpl();
         Contato contato = new Contato();
			
         Calendar dtNascimento = Calendar.getInstance();
         dtNascimento.set(1990, 3, 22);
			
         contato.setNome("Marina Carla");
         contato.setEmail("marina.carla@gmail.com");
         contato.setEndereco("R. Augusta - Boa Vista, Recife. PE");
         contato.setDataNascimento(dtNascimento);
			
         dao.insere(contato);
         */

                    //testa dao.buscaTodos();
                    /*
         ContatoDAOImpl dao = new ContatoDAOImpl();
         List<Contato> contatos = dao.buscaTodos();
         System.out.println("'=========== Imprimindo Dados ==========='");
         for (Contato contato : contatos) {
         System.out.println("Id: " + contato.getContatoId());
         System.out.println("Nome: " + contato.getNome());
         System.out.println("Email: " + contato.getEmail());
         System.out.println("Endereço: " + contato.getEndereco());
         DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
         System.out.println("Nascimento: " + df.format(contato.getDataNascimento().getTime()));
         System.out.println("-----------------------------------------------");
                        
         }
         */
                    //testa dao.remove(Integer idContato);
                    /*
         ContatoDAOImpl dao = new ContatoDAOImpl();
         dao.remove(4);
         */
        
        
        //testa dao.busca();
        /*
        ContatoDAOImpl dao = new ContatoDAOImpl();
        Contato contato = dao.busca(2);
        System.out.println("Id: " + contato.getContatoId());
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Email: " + contato.getEmail());
        System.out.println("Endereço: " + contato.getEndereco());
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nascimento: " + df.format(contato.getDataNascimento().getTime()));
        */
    }
}
