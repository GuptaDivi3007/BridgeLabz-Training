public class BackupTask implements Comparable<BackupTask>{

	private String folderPath;
    private int priority; 
    private boolean isCritical;

    public BackupTask(String folderPath, int priority, boolean isCritical) {
        this.folderPath = folderPath;
        this.priority = priority;
        this.isCritical = isCritical;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCritical() {
        return isCritical;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "[Path: " + folderPath + ", Priority: " + priority + ", Critical: " + isCritical + "]";
    }
}
