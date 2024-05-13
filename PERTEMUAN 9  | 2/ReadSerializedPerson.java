import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null; 
        
        try {
            FileInputStream f = new FileInputStream("person.ser"); 
            ObjectInputStream s = new ObjectInputStream(f); 

            person = (Person) s.readObject(); 
            s.close(); 
            f.close(); 

            System.out.println("serialized person name = " + person.getName()); 
        } catch (Exception ioe) {
            ioe.printStackTrace(); 
        }
    }
}
