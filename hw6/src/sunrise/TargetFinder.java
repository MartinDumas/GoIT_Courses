package sunrise;

public class TargetFinder {
    private double distance(int[] point1, int[] point2) {
        int dx = point2[0] - point1[0];
        int dy = point2[1] - point1[1];
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Метод для знаходження найближчої цілі
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        if (targets == null || targets.length == 0) {
            return null; // Якщо масив цілей порожній, повертаємо null
        }

        int[] closestTarget = targets[0]; // Припускаємо, що перший елемент - найближча ціль
        double minDistance = distance(aiCoords, closestTarget); // Встановлюємо початкову мінімальну відстань

        // Проходимося по решті цілей та шукаємо ближчу
        for (int i = 1; i < targets.length; i++) {
            double dist = distance(aiCoords, targets[i]);
            if (dist < minDistance) {
                minDistance = dist;
                closestTarget = targets[i];
            }
        }

        return closestTarget; // Повертаємо координати найближчої цілі
    }

}
