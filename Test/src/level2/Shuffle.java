package level2;

import java.util.Random;

public class Shuffle {
    private String[] cacheLibrary;
    private String cachePoker;
    String[] startShuffle(String[] nowLibrary) {
        cacheLibrary = nowLibrary;
        Random rA = new Random();
        int seedRandom= rA.nextInt(1000);
        for (int index = 0;index >= 0;index++) {
            Random rB = new Random(seedRandom);
            int indexRandom = rB.nextInt(53);
            if (index != indexRandom) {
                cachePoker = cacheLibrary[indexRandom];
                cacheLibrary[indexRandom] = cacheLibrary[index];
                cacheLibrary[index] = cachePoker;
            }
        }
        return nowLibrary;
    }
}
