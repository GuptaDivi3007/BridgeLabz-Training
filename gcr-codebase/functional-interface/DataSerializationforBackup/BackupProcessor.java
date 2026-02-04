package DataSerializationforBackup;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BackupProcessor {
	public static void backup(Object obj) {

       
        if (obj instanceof Backupable) {
            try {
                ObjectOutputStream oos =
                        new ObjectOutputStream(
                                new FileOutputStream("backup.dat"));

                oos.writeObject(obj);
                oos.close();

                System.out.println("Backup successful: " + obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Backup NOT allowed for this object");
        }
    }
}
