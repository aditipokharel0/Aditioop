package week2;

public class StudentGrades {
    public static void main(String[] args) {
        // Student names and points
        String[] names = {"Joe", "William", "Mary Sue", "Emma", "David"};
        int[] labPoints = {43, 50, 39, 48, 45};
        int[] bonusPoints = {7, 8, 10, 9, 6};

        // Print top border
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("== Student Points ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table header
        System.out.println("Name\tLab\tBonus\tTotal");
        System.out.println("----\t---\t-----\t-----");

        // Print student data
        for (int i = 0; i < names.length; i++) {
            int totalPoints = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + totalPoints);
        }
    }
}

