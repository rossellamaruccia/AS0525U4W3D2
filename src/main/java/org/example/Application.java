package org.example;

import DAO.EventiDAO;
import entities.Evento;
import entities.tipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4W3D2_pu");
        EntityManager em = emf.createEntityManager();

        EventiDAO ed = new EventiDAO(em);
        Evento concerto = new Evento("Schubert live", "concerto di musica classica", tipoEvento.PUBBLICO, 500);
        Evento esibizione = new Evento("Echo", "spettacolo del Cirque du Soleil", tipoEvento.PUBBLICO, 600);
        Evento mostra = new Evento("La seduzione della pittura", "Giovanni Boldini alla Cavallerizza di Piazzale verdi di Lucca", tipoEvento.PUBBLICO, 1000);

        ed.save(concerto);
        ed.save(esibizione);
        ed.save(mostra);

        ed.findByIdAndDelete(2);

        System.out.println(concerto.toString());
        System.out.println(esibizione.toString());
        System.out.println(mostra.toString());
        em.close();
        emf.close();
    }
}
