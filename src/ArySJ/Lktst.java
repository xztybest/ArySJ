package ArySJ;
import java.util.LinkedList;
public class Lktst {
    public void simLinkcreate(){
        LinkedList <String> sites2=new LinkedList<String>();
        sites2.add("Google");
        sites2.add("xiongze");
        sites2.add("TaoBao");
        sites2.add("weibo");
        sites2.addFirst("Wiki");
        sites2.addLast("last");
        System.out.println(sites2);
        sites2.removeFirst();
        System.out.println(sites2);
        sites2.removeLast();
        System.out.println(sites2);
        System.out.println(sites2.getFirst());
        System.out.println(sites2.getLast());
        for(int i=0;i<sites2.size();i++){
            System.out.println(sites2.get(i));
        }
        for(String i:sites2){
            System.out.println(i);
        }
    }

}
