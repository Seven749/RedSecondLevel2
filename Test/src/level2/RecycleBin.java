package level2;

public class RecycleBin {
    String[] recycleBin = new String[54];

    void nextLibrary(String[] usedPokers) {
        for ( String cache : usedPokers) {
            for (int index = 53; index >= 0; index--) {
                if (index != 0) {
                    recycleBin[index] = recycleBin[index - 1];
                } else
                    recycleBin[index] = cache;
            }
        }
        /*
        for (String cache : recycleBin) {
            System.out.print(cache + "\t");
        }
         */
    }
}