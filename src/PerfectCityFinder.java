
    public class PerfectCityFinder {

        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static boolean isMagical(int city1, int city2) {
            return gcd(city1, city2) == 1;
        }

        public static int findPerfectCity(int[] zombiePercentages) {
            int n = zombiePercentages.length;
            for (int i = 0; i < n - 1; i++) {
                if (isMagical(zombiePercentages[i], zombiePercentages[i + 1]) &&
                        zombiePercentages[i] > zombiePercentages[i + 1]) {
                    return i;
                }
            }
            // If no perfect city is found, you can return -1 or throw an exception
            throw new IllegalArgumentException("No perfect city found");
        }

        public static void main(String[] args) {
            // Example usage:
            int[] zombiePercentages = {70, 60, 40, 30, 20,33,2};
            int perfectCityIndex = findPerfectCity(zombiePercentages);
            System.out.println("Perfect city index: " + perfectCityIndex);
        }
    }
