package ArySJ;
import java.io.*;
public class Serialized {
    public void ObjectSerialzed(){
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("tmp\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data in tmp\\employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
