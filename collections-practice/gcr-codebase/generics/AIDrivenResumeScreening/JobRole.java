public abstract class JobRole {

    private final String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public final String getRoleName() {
        return roleName;
    }

    public abstract int getMinimumScore();
}
