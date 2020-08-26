package com.example.demo2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Deneme {

    //Resimlerin cekilecegi web sayfasi
    private final String url = "https://www.picuki.com/profile/gturover";
    private List<InstagramPhoto> instagramPhotos;
    private int numberOfImages;

    Deneme(int numberOfImages){
        instagramPhotos = new ArrayList<>();
        this.numberOfImages = numberOfImages;
        getAllImages();
    }

    public void getAllImages() {
        try {
            //Sayfaya baglanma ve HTML icerigin alinmasi
            Document doc = Jsoup.connect(url).get();

            //sayfadaki img etiketine sahip tum html elementlerini al
            Elements img = doc.getElementsByTag("img");

            //Her bir elementin url bilgisini al ve resimi dosyaya yazdir
            for(int i=1;i<img.size();++i){
                if(i <= numberOfImages){
                    instagramPhotos.add(new InstagramPhoto(img.get(i).absUrl("src")));
                    if(i == numberOfImages)
                        break;
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<InstagramPhoto> getInstagramPhotos() {
        return instagramPhotos;
    }
}