package ArySJ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayadd {
    public void arrayaddTest(){
        ArrayList<String>sites=new ArrayList<String>();
        sites.add("Google");//sites.add添加元素
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("weibo");
        sites.add("jingdong");
        System.out.println(sites);
        System.out.println(sites.size());//计算sites大小
        System.out.println(sites.get(0));//sites.get获得指定未知元素
        System.out.println(sites.get(1));
        System.out.println(sites.get(2));
        System.out.println(sites.get(3));
        System.out.println(sites.get(4));
        sites.set(1,"Wiki");//sites.set修改指定位置元素
        System.out.println(sites.get(1));
        sites.remove(4);//删除指定未知元素sites.remove
        System.out.println(sites);
        System.out.println(sites.size());
        for(int i=0;i<sites.size();i++){
            System.out.println(sites.get(i));
        }
        System.out.println("next");
        for(String i:sites){
            System.out.println(i);
        }
        System.out.println("next");
        Collections.sort(sites);
        for(String i: sites){
            System.out.println(i);
        }
    }


}
