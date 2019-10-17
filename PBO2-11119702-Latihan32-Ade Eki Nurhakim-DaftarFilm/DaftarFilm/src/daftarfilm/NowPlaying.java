/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
 *
 * @author Ekiw
 */
public class NowPlaying {
    public static void main(String[] args) {
        DaftarFilm film = new DaftarFilm();
        film.setjudul1("Venom");
        film.setgenre1("Action, Horror, Scifi");
        film.setrating1(8.5);
        film.setduration1(120);
        
        film.setjudul2("Small Foot");
        film.setgenre2("Animation");
        film.setrating2(9.0);
        film.setduration2(96);
        
        film.setjudul3("Crazy Rich Asian");
        film.setgenre3("Comedy");
        film.setrating3(7.8);
        film.setduration3(100);
        
        film.setjudul4("Asih");
        film.setgenre4("Horror");
        film.setrating4(6.0);
        film.setduration4(100);
        
        System.out.println("Judul Film : "+film.judul1);
        System.out.println("Genre Film : "+film.genre1);
        System.out.println("Rating Film : "+film.rating1);
        System.out.println("Duration Film : "+film.duration1 +"Menit");
        System.out.println("");
        System.out.println("Judul Film : "+film.judul2);
        System.out.println("Genre Film : "+film.genre2);
        System.out.println("Rating Film : "+film.rating2);
        System.out.println("Duration Film : "+film.duration2 +"Menit");
        System.out.println("");
        System.out.println("Judul Film : "+film.judul3);
        System.out.println("Genre Film : "+film.genre3);
        System.out.println("Rating Film : "+film.rating3);
        System.out.println("Duration Film : "+film.duration3 +"Menit");
        System.out.println("");
        System.out.println("Judul Film : "+film.judul4);
        System.out.println("Genre Film : "+film.genre4);
        System.out.println("Rating Film : "+film.rating4);
        System.out.println("Duration Film : "+film.duration4 +"Menit");
    }
}