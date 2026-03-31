import java.io.*;

public class DataStreamExample {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Aryan");
            dos.writeDouble(8.5);
        }
        catch (IOException e) {
            System.out.println("Write error.");
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
        catch (IOException e) {
            System.out.println("Read error.");
        }
    }
}