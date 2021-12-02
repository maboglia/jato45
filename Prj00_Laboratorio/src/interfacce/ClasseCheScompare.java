package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClasseCheScompare {

	public static void main(String[] args) {
		
		List<Libro> libri = Arrays.asList(
				new Libro(" Perché no? Il libro delle domande... che con le risposte sono tutti bravi "),
				new Libro(" Sembra strano anche a me. Ed speciale "),
				new Libro(" Per niente al mondo "),
				new Libro(" Niente di nuovo sul fronte di Rebibbia "),
				new Libro(" Il grande libro dei gialli di Natale "),
				new Libro(" La nostra cucina. Fatto in casa da Benedetta. Ricette e storie. Ediz. illustrata. Copia autografata "),
				new Libro(" Una vita nuova "),
				new Libro(" Fabbricante di lacrime "),
				new Libro(" Le braci "),
				new Libro(" La casa senza ricordi "),
				new Libro(" Cambiare l'acqua ai fiori "),
				new Libro(" Il maialino di Natale "),
				new Libro(" Solo leveling. 2. "),
				new Libro(" L'inverno dei Leoni. La saga dei Florio "),
				new Libro(" Un polpo alla gola "),
				new Libro(" La canzone di Achille "),
				new Libro(" La profezia dell'armadillo. Artist edition "),
				new Libro(" Cucina Botanica. Vegetale, facile, veloce "),
				new Libro(" Circe "),
				new Libro(" Dio di illusioni "),
				new Libro(" Cecità "),
				new Libro(" Il FantaNatale di Luì e Sofì "),
				new Libro(" Il nuovo regno "),
				new Libro(" Le transizioni "),
				new Libro(" Harry Potter e la pietra filosofale. Nuova ediz.. 1. "),
				new Libro(" La lista del giudice "),
				new Libro(" A babbo morto. Una storia di Natale "),
				new Libro(" Harry Potter e l'Ordine della Fenice. Nuova ediz.. 5. "),
				new Libro(" I leoni di Sicilia. La saga dei Florio "),
				new Libro(" Berserk collection. Serie nera. 2. "),
				new Libro(" Kobane calling. Oggi "),
				new Libro(" Billy Summers. Ediz. italiana "),
				new Libro(" La nostra cucina. Fatto in casa da Benedetta. Ricette e storie. Ediz. illustrata "),
				new Libro(" Calendario Frate Indovino 2022. Il cammino dell'umanità "),
				new Libro(" Doremì. L'uccellino che non sapeva volare. Ediz. illustrata "),
				new Libro(" Harry Potter e il calice di fuoco. Nuova ediz.. 4. "),
				new Libro(" Harry Potter e i doni della morte. Nuova ediz.. 7. "),
				new Libro(" Hiro Cartoon Food. Le ricette del cuore di Chef Hiro "),
				new Libro(" Harry Potter e il prigioniero di Azkaban. Nuova ediz.. 3. "),
				new Libro(" Dimentica il mio nome "),
				new Libro(" Una vita come tante "),
				new Libro(" Tokyo revengers. 9. "),
				new Libro(" La felicità del lupo "),
				new Libro(" Harry Potter e il Principe Mezzosangue. Nuova ediz.. 6. "),
				new Libro(" Cucina botanica. Vegetale, buona e consapevole "),
				new Libro(" Gli scomparsi di Chiardiluna. L'Attraversaspecchi. 2. "),
				new Libro(" Io mi fido di te. Storia dei miei figli nati dal cuore "),
				new Libro(" Una corte di spine e rose. Trilogia. La saga di Feyre ")
				
				);
		
//		Collections.sort(libri, (l1, l2) -> l1.getAutore().compareTo(l2.getAutore()));
//		Collections.sort(libri, (l1, l2) -> l1.getPagine()-l2.getPagine());
		
		libri.stream()//trasforma in stream (flusso)
				.filter(l -> l.getPrezzo()< 50 )//operazioni intermedie: non c'è limite!
				.filter(l -> l.getPrezzo()> 20 )//operazioni intermedie: non c'è limite!				
				.sorted((l1, l2) -> l2.getPagine()-l1.getPagine())
				.forEach(l -> System.out.println(l));//terminale Consumare l'informazione
		
		
	}
	
	
}




