package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Book;

import java.util.ArrayList;

public class BookData {
    private static String [] foodName = {
            "Si Kancil",
            "Semut Ramping",
            "Gagak Berbulu Hitam",
            "Kura-Kura Retak",
            "Si Kabayan",
            "Cerita 34 Provinsi"
    };

    private static String [] foodPrice = {
            "29.000",
            "32.000",
            "30.000",
            "35.000",
            "25.000",
            "120.000"
    };

//    private static String [] foodPrice = {
//            "Dongeng Kancil dan Sahabat Rimba karya Gayatri dan Djengmanardo berisi dongeng tentang kancil, hewan cerdik yang sangat terkenal. Kali ini kancil tidak sendirian. Ia hadir bersama dengan sahabat-sahabatnya dari hutan rimba. Di dalam buku ini kamu akan mendapatkan beberapa cerita kancil yang populer, misalnya seperti kisah kancil yang mengelabui buaya.",
//            "Buku Fabel Semut Berpinggang Ramping ini bisa menjadi pilihan untuk anak belajar membaca. Sebab, selain ada gambar hewan semut yang lucu dan menggemaskan, buku cerita ini memiliki bahasa yang mudah dipahami oleh anak usia balita. Selain itu, buku Semut Berpinggang Ramping ini juga bisa mendidik karakter anak agar berhemat dan tolong-menolong.",
//            "Rekomendasi ketiga masih cerita fabel dari The Amazing Canary Series yakni buku Gagak Berbulu Hitam. Buku terbitan dari Mizan ini menggunakan dua bahasa yaitu Inggris dan Indonesia. Sehingga bisa digunakan anak yang diajari bilingual sejak dini. Selain itu, buku fabel dengan cerita Nusantara ini memiliki pesan moral yang berguna untuk pendidikan karkater anak.",
//            "Apa kamu pernah mendengar kisah tentang asal-usul tempurung kura-kura yang retak? Bila belum, sebaiknya kamu membelikan buku ini untuk anak atau adik. Sebab, di dalam buku terbitan Mizan ini ada kisah fabel yang terkenal itu. Selain itu, buku Tempurung Kura-Kura Retak akan memberikan nila moral yang baik untuk anak mengenai rasa bersyukur dan menaati peraturan.",
//            "Rekomendasi buku kali ini adalah cerita rakyat jenaka dari Jawa Barat yakni Si Kabayan Super Kocak. Di dalam buku ini terdapat kumpulan cerita tentang Kabayan yang sering dikatakan pemalas, tetapi sebenarnya cerdik dan kreatif. Dikemas dengan cerita lucu, buku ini akan membuat anak-anak tertawa",
//            "Kumpulan Cerita Rakyat Nusantara Terpopuler karya Lisdy Rahayu berisi berbagai macam cerita mulai dari legenda suatu tempat, fabel, hingga cerita daerah yang berisi nilai kepahlawanan. Bacaan ini sangat cocok sebagai media edukasi untuk anak-anak agar mereka bisa mengembangkan karakternya."
//    };

    private static int [] foodImage = {
            R.drawable.kancil,
            R.drawable.semut,
            R.drawable.gagak,
            R.drawable.kura2,
            R.drawable.kabayan,
            R.drawable.cerpo,
    };

    public static ArrayList<Book> getDataFood() {
        ArrayList<Book> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Book food = new Book(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
