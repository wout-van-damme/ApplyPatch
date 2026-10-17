package data;

public class PatchData {
    private String oldFilePath;
    private String newFilePath;
    private int oldStartLine;
    private int oldCoverLines;
    private int newStartLine;
    private int newCoverLines;


    public String getOldFilePath() {
        return oldFilePath;
    }

    public void setOldFilePath(String oldFilePath) {
        this.oldFilePath = oldFilePath;
    }

    public String getNewFilePath() {
        return newFilePath;
    }

    public void setNewFilePath(String newFilePath) {
        this.newFilePath = newFilePath;
    }

    public int getOldStartLine() {
        return oldStartLine;
    }

    public void setOldStartLine(int oldStartLine) {
        this.oldStartLine = oldStartLine;
    }

    public int getOldCoverLines() {
        return oldCoverLines;
    }

    public void setOldCoverLines(int oldCoverLines) {
        this.oldCoverLines = oldCoverLines;
    }

    public int getNewStartLine() {
        return newStartLine;
    }

    public void setNewStartLine(int newStartLine) {
        this.newStartLine = newStartLine;
    }

    public int getNewCoverLines() {
        return newCoverLines;
    }

    public void setNewCoverLines(int newCoverLines) {
        this.newCoverLines = newCoverLines;
    }

    @Override
    public String toString() {
        return String.format("""
                oldFilePath: %s
                newFilePath: %s
                oldStartLine: %d
                oldCoverLines: %d
                newStartLine: %d
                newCoverLines: %d
                """,
                this.oldFilePath,
                this.newFilePath,
                this.oldStartLine,
                this.oldCoverLines,
                this.newStartLine,
                this.newCoverLines
                );
    }
}
