import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task32 {
    static BufferedReader br;
    static ProductLists[] productLists;

    public static void WriteinFile(String Outputfile){
       FileWriter fw=null;
       BufferedWriter bw=null;
 try{
    fw = new FileWriter(Outputfile); 
    bw = new BufferedWriter(fw);

    bw.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating");
    bw.write("\n");
    int N = productLists.length;
    for(int i = 0; i < N && productLists[i] != null; i += 1){
        bw.write(productLists[i].toString());
        bw.write("\n");
    }
    fw.close();
    System.out.println("File was Successfully Written " + Outputfile);
 }catch(Exception e){
     e.printStackTrace();
 }
    }
    public static void main(String[] args) throws IOException {
        
       try{ FileReader Re = new FileReader("./data/flipkart_product_sample.csv");
        br = new BufferedReader(Re);

        productLists=new ProductLists[25000];
        int i=0;
        String text=br.readLine();  
        System.out.println("File reading---"); 
        if(text!=null){
            productLists[i]=new ProductLists();
            String[] List = text.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            try{
                productLists[i].pid = List[0];
                productLists[i].product_name = List[1];
                productLists[i].brand = List[2];
                productLists[i].product_url = List[3];
                productLists[i].retail_price = Integer.parseInt(List[4]);
                productLists[i].discounted_price = Integer.parseInt(List[5]);
                if(!List[6].equals("No rating available") && List[6].length() != 0){
                    productLists[i].product_rating = Double.parseDouble(List[6]);
                }
            }catch(Exception e){
             e.printStackTrace();
            }

            text = br.readLine();
            i++;
        }
        System.out.println("We have Successfully read the file.\n");
    //  System.out.println("desired text"+"\t"+text);
    } catch(Exception e){
        e.printStackTrace();
    }
    finally{
        br.close();
    } 

    ProductLists.sortingBasedonPrice(productLists);
    System.out.println("Writing in File");
    WriteinFile("./data/flipkart_product_SortedPriceList.csv");

    ProductLists.sortingBasedonRating(productLists);
    System.out.println("Writing in File");
    WriteinFile("./data/flipkart_product_SortedRatingList.csv");
    }
    
}

