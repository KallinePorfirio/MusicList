import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
    ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
    listaParaIlhaDeserta.add("Midnight Rain");
    listaParaIlhaDeserta.add("Save Your Tears"); //0
    listaParaIlhaDeserta.add("Nervous"); //1
    listaParaIlhaDeserta.add("As It Was");
    listaParaIlhaDeserta.add("Champagne Problems");
    listaParaIlhaDeserta.add("Chamber Of Reflection"); //2
    listaParaIlhaDeserta.add("Fluorescent Adolescent"); //3
    listaParaIlhaDeserta.add("SPIT IN MY FACE!");
    listaParaIlhaDeserta.add("After Dark"); //4
    listaParaIlhaDeserta.add("Counting Stars");
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(0);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(3);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(7);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(2);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(4);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());

    int indiceMusicaA = 1;
    int indiceMusicaB = 4;
    String tempA = listaParaIlhaDeserta.get(indiceMusicaA);
    listaParaIlhaDeserta.set(indiceMusicaA, listaParaIlhaDeserta.get(indiceMusicaB));
    listaParaIlhaDeserta.set(indiceMusicaB, tempA);
    System.out.println("Lista com músicas trocadas:");
    System.out.println(listaParaIlhaDeserta);
    tempA = listaParaIlhaDeserta.get(indiceMusicaA);
    listaParaIlhaDeserta.set(indiceMusicaA, listaParaIlhaDeserta.get(indiceMusicaB));
    listaParaIlhaDeserta.set(indiceMusicaB, tempA);
    System.out.println("Lista final com músicas trocadas de volta:");
    System.out.println(listaParaIlhaDeserta);

    }
}