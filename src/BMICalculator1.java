import java.util.Scanner;

/**
 * Kelas BMICalculator1 digunakan untuk menghitung Body Mass Index (BMI)
 * berdasarkan berat dan tinggi badan yang dimasukkan pengguna, serta menampilkan
 * kategori BMI.
 */
public class BMICalculator1 {

    // Konstanta kategori BMI
    private static final double UNDERWEIGHT_THRESHOLD = 18.5;
    private static final double NORMAL_THRESHOLD = 24.9;
    private static final double OVERWEIGHT_THRESHOLD = 29.9;

    private double weight; // Berat badan dalam kilogram
    private double height; // Tinggi badan dalam meter
    private double bmi;    // Nilai BMI

    /**
     * Mendapatkan nilai berat badan.
     * @return berat badan dalam kilogram.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Menentukan nilai berat badan.
     * @param weight berat badan dalam kilogram.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Mendapatkan nilai tinggi badan.
     * @return tinggi badan dalam meter.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Menentukan nilai tinggi badan.
     * @param height tinggi badan dalam meter.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Mendapatkan nilai BMI.
     * @return nilai BMI.
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * Menentukan nilai BMI.
     * @param bmi nilai BMI yang telah dihitung.
     */
    private void setBmi(double bmi) {
        this.bmi = bmi;
    }

    /**
     * Metode utama yang menjalankan program untuk menghitung dan menampilkan nilai BMI.
     * @param args argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        BMICalculator1 calculator = new BMICalculator1();
        calculator.setWeight(getUserInput("Masukkan berat badan (kg): "));
        calculator.setHeight(getUserInput("Masukkan tinggi badan (m): "));
        calculator.setBmi(computeBMI(calculator.getWeight(), calculator.getHeight()));

        System.out.println("BMI Anda adalah: " + calculator.getBmi());
        displayBMICategory(calculator.getBmi());
    }

    /**
     * Mendapatkan input dari pengguna.
     * @param message pesan yang ditampilkan kepada pengguna.
     * @return input yang dimasukkan pengguna sebagai angka desimal.
     */
    private static double getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    /**
     * Menghitung nilai BMI berdasarkan berat dan tinggi badan.
     * @param weight berat badan dalam kilogram.
     * @param height tinggi badan dalam meter.
     * @return nilai BMI yang dihitung.
     */
    private static double computeBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Menampilkan kategori BMI berdasarkan nilai BMI yang diberikan.
     * @param bmi nilai BMI yang dihitung.
     */
    private static void displayBMICategory(double bmi) {
        if (bmi < UNDERWEIGHT_THRESHOLD) {
            System.out.println("Kategori: Underweight");
        } else if (bmi <= NORMAL_THRESHOLD) {
            System.out.println("Kategori: Normal");
        } else if (bmi <= OVERWEIGHT_THRESHOLD) {
            System.out.println("Kategori: Overweight");
        } else {
            System.out.println("Kategori: Obese");
        }
    }
}
