package com.example.ekky.bestfoodintheworld;

import com.example.ekky.bestfoodintheworld.Food;

import java.util.ArrayList;

public class FoodData {
    public static String[][] data = new String[][]{
            {"Rendang", "Nomer 1 Indonesia", "https://kepyurpyur.files.wordpress.com/2017/11/add62-dendeng-lambok-merah.jpg?w=577&h=296","Sumatra Barat, Indonesia","Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa.","Daging Sapi","Rp 50.000,-"},
            {"Nasi Goreng", "Nomer 2 Indonesia", "https://cdn0-production-images-kly.akamaized.net/dnGlSowKdwt0ugtuOmduf8D4dm0=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1359428/original/084420000_1475132767-Black-pepper-petai-fried-rice.jpg","Beberapa Wilayah, Indonesia","Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk.","Nasi","Rp 10.000,-"},
            {"Sushi", "Nomer 3 Jepang", "https://c-lj.gnst.jp/public/article/detail/a/00/00/a0000370/img/basic/a0000370_main.jpg?20180116120327","Jepang", "ushi (鮨, 鮓, atau biasanya すし, 寿司) adalah makanan Jepang yang terdiri dari nasi yang dibentuk bersama lauk (neta) berupa makanan laut, daging, sayuran mentah atau sudah dimasak.[1] Nasi sushi mempunyai rasa masam yang lembut karena dibumbui campuran cuka beras, garam, dan gula.", "Nasi dan Ikan", "Mulai Rp 10.000,-" },
            {"Toom Yam Goong", "Nomer 4 Thailand", "http://gilajajan.com/wp-content/uploads/2017/04/tom-yam-goong.png","Thailand","Tom yam (bahasa Thai: ต้มยำ, IPA: [tôm jām], juga kadang-kadang disebut tom yam atau dom yam) adalah sup yang berasal dari Thailand. ... Di Thailand, tom yum biasanya dibuat dengan udang (tom yum goong), ayam (tom yum gai), ikan (tom yum pla), atau makanan laut yang dicampur (tom yum talay atau tom yum po taek) dan jamur.", "Udang", "Mulai Rp 25.000,- " },
            {"Pad Thai", "Nomer 5 Thailand", "https://www.feastingathome.com/wp-content/uploads/2016/04/easy-authentic-pad-thai-recipe-100.jpg"},
            {"Som Tam", "Nomer 6 Thailand", "https://i0.wp.com/inquiringchef.com/wp-content/uploads/2011/02/Som-Tum-Thai-Inquiring-Chef.jpg?fit=600%2C400&ssl=1","Laos","Som tam atau selada pepaya mentah adalah selada berbumbu agak pedas yang terbuat dari irisan tipis pepaya mentah. Hidangan ini dipercaya berasal dari Laos, akan tetapi dipopulerkan oleh kuliner Thailand, dan lazim disajikan di daratan Asia Tenggara.","Selada", "Mulai Rp 10.000,-"},
            {"Dim Sum",  "Nomer 7 Hong Kong" ,"https://i.kinja-img.com/gawker-media/image/upload/s--5nVw4IQ9--/c_fill,f_auto,fl_progressive,g_center,h_675,q_80,w_1200/axvyospzf9kaso7542mi.jpg","Hong Kong","Dim sum (tradisional: 點心, sederhana: 点心 hanyu pinyin: dianxin) adalah istilah dari bahasa Kantonis dan artinya adalah \"makanan kecil\". Biasanya dim sum dimakan sebagai sarapan atau brunch.","Kulit pangsit", "Mulai 4.500,-"}
    };

    public static ArrayList<Food> getListData(){
        Food food = null;
        ArrayList<Food> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            food = new Food();
            food.setName(data[i][0]);
            food.setRemarks(data[i][1]);
            food.setPhoto(data[i][2]);
            food.setAsal(data[i][3]);
            food.setDekripsi(data[i][4]);
            food.setBahan(data[i][5]);
            food.setHarga(data[i][6]);

            list.add(food);
        }

        return list;
    }
}
