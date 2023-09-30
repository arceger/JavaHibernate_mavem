package gear;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerc_hibern.Client;

public class Initial {

	public static void main(String[] args) {
		

		
		Client c1 = new Client(4,"tal fulano","fulano4@gmail.com");
		Client c2 = new Client(5,"tal beltrano","beltrano5@gmail.com");
		Client c3 = new Client(6,"tal siclano","siclano6@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemjpa");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		
//		em.getTransaction().commit();
//		
//		System.out.println("dados gravados com sucesso");
		
		Client src = em.find(Client.class, 2);
		
		
		System.out.println(src);
		
		//em.remove(src);  se quiser remover
		
		em.close();
		emf.close();
		
	}

}
