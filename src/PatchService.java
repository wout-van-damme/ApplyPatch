import data.PatchData;

public class PatchService {

    public static PatchData parse(String diff) {
        PatchData data = new PatchData();

        setFilePaths(diff, data);
//        setDiffLines(diff, data);


        return data;
    }


    private static void setFilePaths(String diff, PatchData data) {

        for (String line: diff.split("\n")) {

            if (line.startsWith("--- ")) {
                data.setOldFilePath(line.substring(4));
            }

            if (line.startsWith("+++ ")) {
                data.setNewFilePath(line.substring(4));
            }
        }

    }



}

