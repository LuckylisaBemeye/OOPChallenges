public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = { "B123", "C234", "A345", "B456", "C567", "A678", "B789", "C890" };

        for (String item : orderIds) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }
    }
}
