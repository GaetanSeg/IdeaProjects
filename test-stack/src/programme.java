import java.util.Stack;

public class programme {
    private static Stack pile = new Stack();
    private static int inc = 1;
    public static void main(String[] args) {
        ajout(new Video("Voyage au bout de l'enfer", "Michael Cimino", 1978));
        ajout(new Video("Le jour le plus long", "Ken Annakin", 1962));
        ajout(new Video("Un pont trop loin", "Richard Attenborough", 1977));
        ajout(new Video("Platoon", "Oliver Stone", 1986));
        ajout(new Video("Full metal jacket", "Stanley Kubrik", 1987));
        ajout(new Video("La ligne rouge", "Terrence Malick", 1998));
        ajout(new Video("The patriot", "Roland Emmerich", 2000));
        ajout(new Video("Outrages", "Brian De Palma", 1990));
        ajout(new Video("Paris brûle-t-il ?", "René Clément", 1966));
        ajout(new Video("Tora ! Tora ! Tora !", "Richard Fleischer", 1970));
        ajout(new Video("Guerre et Paix", "King Vidor", 1956));
        ajout(new Video("Apocalypse now", "Francis Ford Coppola", 1979));
        ajout(new Video("les java pour la vie ","Mr le briche ",1980));
        System.out.println("Taille après ajouts = " + pile.size());
        inc = 1;

        while(!pile.empty()){
            System.out.println("Extraction n°" + inc++ + "\t: " + pile.pop());
        System.out.println("Taille après extraction = " + pile.size());
        }
    }
    public static void ajout(Video v){
        pile.push(v);
        System.out.println("Ajout n°" + inc++ + "\t: " + pile.peek());
    }
}
