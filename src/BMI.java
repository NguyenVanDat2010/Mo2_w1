import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        float weight=scanner.nextFloat();
        System.out.println("Nhập chiều cao: ");
        float height=scanner.nextFloat();
        float bmi= (float) (weight/Math.pow(height,2));
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi<18.5){
            System.out.println(bmi+"Underweight");
        }else
            if (bmi<25){
                System.out.printf("%-20s%s",bmi,"Normal");
            }else
                if (bmi<30){
                    System.out.printf("%-20s%s",bmi,"Overweight");
                }else {
                    System.out.printf("%-20s%s",bmi,"Obese");
                }
    }
}
