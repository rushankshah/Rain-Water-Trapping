public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 0, 2, 0, 4 };

        int[] waterAtEachBuilding = new int[arr.length];
        waterAtEachBuilding[0] = 0;
        int[] maxLeft = new int[arr.length];
        int[] maxRight = new int[arr.length];
        int tempMax = Integer.MIN_VALUE;
        for (int i = 0; i < maxLeft.length; i++) {
            if (arr[i] > tempMax)
                tempMax = arr[i];
            maxLeft[i] = tempMax;
        }
        System.out.println("Max left array:");
        for (int i : maxLeft) {
            System.out.println(i);
        }
        tempMax = Integer.MIN_VALUE;
        for (int i = maxRight.length - 1; i >= 0; i--) {
            if (arr[i] > tempMax)
                tempMax = arr[i];
            maxRight[i] = tempMax;
        }
        System.out.println("Max right array:");
        for (int i : maxRight) {
            System.out.println(i);
        }
        for (int i = 1; i < waterAtEachBuilding.length; i++) {
            waterAtEachBuilding[i] = Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }
        System.out.println("Water at each building");
        for (int i : waterAtEachBuilding) {
            System.out.println(i);
        }
        int totalSum = 0;
        for (int i : waterAtEachBuilding) {
            totalSum += i;
        }
        System.out.println(totalSum);
    }
}