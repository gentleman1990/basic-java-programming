package construction.enums;

public enum JenkinsStatus {
    SUCCESFULL(true),
    FAILED(true),
    ABORTED(false),
    UNSTABLE(true),
    UNDETERMINED(false);

    public boolean hasFinished;

    JenkinsStatus(boolean hasFinished) {
        this.hasFinished = hasFinished;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
