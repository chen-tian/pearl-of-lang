
package dataiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataIOStream {
    public static void main(String[] args) {
        int integer  = 1000;
        String str = "I like Java";
        float flt = 88.88f;
 
        try {
          DataOutputStream dos = new DataOutputStream(new FileOutputStream("./target/DataIOStream.data"));
 
          dos.writeInt(integer);
          dos.writeUTF(str);
          dos.writeFloat(flt);
          dos.flush();
          dos.close();
 
          DataInputStream dis = new DataInputStream(new FileInputStream("./target/DataIOStream.data"));

          int a = dis.readInt();
          String s = dis.readUTF();
          float f = dis.readFloat();
          System.out.printf("Read data: %d, %s, %f%n", a, s, f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
