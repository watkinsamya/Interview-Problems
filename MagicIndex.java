public class MagicIndex {
    public static int findMagicIndex(int[] array) {
        return findMagicIndex(array, 0, array.length - 1);
    }

    private static int findMagicIndex(int[] array, int start, int end) {
        if (end < start) return -1;

        int mid = (start + end) / 2;

        if (array[mid] == mid) {
            return mid;
        } else if (array[mid] > mid) {
            return findMagicIndex(array, start, mid - 1);
        } else {
            return findMagicIndex(array, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 2, 4, 6};
        System.out.println(findMagicIndex(array)); // 2
    }
}
