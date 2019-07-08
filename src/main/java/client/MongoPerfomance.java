package client;

import org.bson.BsonDocument;
import org.bson.Document;
import util.MongoDb;

import java.util.List;

public class MongoPerfomance {


    public static void main(String args[]) {

        MongoDb.connect("test", "staff", "192.168.56.100", 27017);
        MongoDb.bsonConnect("test", "staff", "192.168.56.100", 27017);
    /*
        long startTime = System.currentTimeMillis();
        for(int j=0;j<5;j++) {

            for (int i = 0; i < 10000; i++) {
                String name = "zfc" + i;
                String json = "{'name':'" + name + "','gender':'male','avatar':'/444.jpg'}";
                BsonDocument document = BsonDocument.parse(json);
                MongoDb.insertBsonDocument(document);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime-startTime) + "ms");
*/



            double avg=0;
//            for(int i=0;i<1000;i++) {
                long startTime = System.currentTimeMillis();
                Document filter = new Document();
                filter.append("name", "zfc"+1000);
                List<Document> results = MongoDb.findBy(filter);
                long endTime = System.currentTimeMillis();
//                avg+=(endTime - startTime);
//                for (Document doc : results) {
//                    System.out.println(doc.toJson());
//                }
//            }

        System.out.println("运行时间:" + (endTime-startTime) + "ms");

        MongoDb.closeClient();


    }













}
