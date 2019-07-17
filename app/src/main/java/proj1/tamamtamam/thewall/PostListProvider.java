package proj1.tamamtamam.thewall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PostListProvider {
    public static List<Post> getList() {
        List<Post> postList = new ArrayList<>();
        postList.add(new Post(1, "dell laptop", "downtown resort", "$200",
                "https://i.dell.com/sites/csimages/Videos_Images/en/9eb776ec-d2b3-450c-b340-e1b5f6f31eeb.jpg"));
        postList.add(new Post(2, "road book new", "LA beach", "$150",
                "https://cdn.road.cc/sites/default/files/styles/main_width/public/road-book-cycling-almanack-2.jpg?itok=Uqd6YEfq"));
        postList.add(new Post(3, "blue bicycle", "4th avenue", "$100",
                "https://scontent-sjc3-1.cdninstagram.com/vp/a8da8b625b2cf0c209cf397eb687ede1/5DC116F1/t51.2885-15/e35/65267263_150505202766084_5204288911082486324_n.jpg?_nc_ht=scontent-sjc3-1.cdninstagram.com"));
        postList.add(new Post(4, "only 2 times used watch", "hollywood blvd", "$3000",
                "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/imiyUeAuC_zk/v0/1000x-1.jpg"));
        postList.add(new Post(5, "Upholstered Standard Bed", "Mendez St", "$130",
                "https://secure.img1-fg.wfcdn.com/im/93505058/resize-h400-w400%5Ecompr-r85/7817/78172826/Mendez+Cowell+Upholstered+Standard+Bed.jpg"));
        postList.add(new Post(7, "Vintage Vespa", "Tuscany", "$3500",
                "http://www.caftours.com/magazine/wp-content/uploads/2013/03/classic-vespa.jpg"));
        postList.add(new Post(6, "Yamaha Piano", "Abbey Road", "$3000",
                "https://d26aybd97pahbz.cloudfront.net/shard0/wblob/1961FC19B74D1A/1B5/1C89/KEqTHIjFegHEa1CTrmwV57g6REmRRhMPypCgwObF1Ec/choosing-a-piano-featured.jpg"));
        postList.add(new Post(8, "Console Table", "Fereshteh St.", "$120",
                "https://www.mocka.com.au/media/product/0f/daisy-console-table-5d.jpg?06-06-2018-18-16-22"));
        postList.add(new Post(9, "5*7 Persian Rug", "Giv Shop.", "$1200",
                "https://www.yashar-bish.com/user/products/large/4950%20Oriental%20Qashqai%20Jahrom%20Persian%20Rug%20119x150cm-1.jpg"));
        postList.add(new Post(10, "Cat Tent", "Petsaar Pet Shop.", "$30",
                "https://www.mocka.com.au/media/product/13/benny-pet-teepee-f4.jpg?07-11-2018-22-17-45"));
        postList.add(new Post(11, "Astrid Mirror", "Pasdaran, 12th St", "$50",
                "https://www.mocka.com.au/media/product/70/astrid-mirror-da.jpg?01-02-2018-01-27-46"));
        postList.add(new Post(12, "Poster Hanger", "Narmak, 32th St", "$10",
                "https://www.mocka.com.au/media/product/1c/small-wall-art-hanger-princess-fb.jpg?26-11-2018-01-55-57"));
        postList.add(new Post(13, "Rocking Horse", "Namakabroud", "$60",
                "https://www.mocka.com.au/media/product/e2/rocking-horse-eb.jpg?29-12-2017-03-54-19"));
        Collections.shuffle(postList);
        return postList;
    }
}
