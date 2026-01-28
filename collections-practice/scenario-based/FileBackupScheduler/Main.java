public class Main {

	public static void main(String[] args) {

		BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.scheduleBackup("C:/Users/Documents", 2, true);
            scheduler.scheduleBackup("C:/Users/Pictures", 5, false);
            scheduler.scheduleBackup("C:/System/Config", 1, true);
           
            scheduler.scheduleBackup("C:/Invalid/Folder", 3, false);
        }
        catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scheduler.showPendingBackups();
        scheduler.executeBackups();
	}
}
