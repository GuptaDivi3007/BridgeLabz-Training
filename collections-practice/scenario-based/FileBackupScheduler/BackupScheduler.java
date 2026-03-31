import java.io.File;
import java.util.PriorityQueue;

public class BackupScheduler {

	private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void scheduleBackup(String path, int priority, boolean isCritical) throws InvalidBackupPathException {
        File file = new File(path);
       
        if (!file.exists() || !file.isDirectory()) {
            throw new InvalidBackupPathException("Invalid folder path: " + path);
        }

        BackupTask task = new BackupTask(path, priority, isCritical);
        queue.add(task);

        System.out.println("Scheduled: " + task);
    }

    public void executeBackups() {
        System.out.println("\nExecuting backups in priority order...");
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backup executed for: " + task.getFolderPath() + " | Priority: " + task.getPriority());
        }
    }

    public void showPendingBackups() {
        System.out.println("\nPending Tasks:");
        for (BackupTask task : queue) {
            System.out.println(task);
        }
    }
}
