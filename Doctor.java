import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Eye left_eye = new Eye("Normal","Left Eye","Blue" );
        Eye right_eye = new Eye("Normal","Right Eye","Blue" );
        Heart heart = new Heart("None","Heart",65);
        Organ stomach = new Organ("Digestion","Stomach");
        Organ skin = new Organ("Burned","Skin");
            System.out.println("Patience Name: Tom");
            System.out.println("Age: 25");
            while (true) {
                System.out.println("Choose an Organ");
                System.out.println("    1. " + left_eye.getName());
                System.out.println("    2. " + right_eye.getName());
                System.out.println("    3. " + heart.getName());
                System.out.println("    4. " + stomach.getName());
                System.out.println("    5. " + skin.getName());
                System.out.println("    6. Quit ");
                Scanner in = new Scanner(System.in);
                int number = in.nextInt();
                if (number == 1) {
                    System.out.println("Name: " + left_eye.getName());
                    System.out.println("Medical Condition: " + left_eye.getMedicalCondition());
                    System.out.println("Color: " + left_eye.getColor());
                    System.out.println("    1. Close eye");
                    int number1 = in.nextInt();
                    if(number1 == 1){
                        System.out.println("Left Eye Closed");
                    }
                }
                if (number == 2) {
                    System.out.println("Name: " + right_eye.getName());
                    System.out.println("Medical Condition: " + right_eye.getMedicalCondition());
                    System.out.println("Color: " + right_eye.getColor());
                    System.out.println("    1. Close eye");
                    int number1 = in.nextInt();
                    if(number1 == 1){
                        System.out.println("Right Eye Closed");
                    }
                }
                if (number == 3) {
                    System.out.println("Name: " + heart.getName());
                    System.out.println("Medical Condition: " + heart.getMedicalCondition());
                    System.out.println("Heart Rate: " + heart.getHeartRate());
                    System.out.println("    1. Change Heart Rate");
                    int number1 = in.nextInt();
                    if(number1 == 1){
                        heart.setHeartRate(in.nextInt());
                        System.out.println("Heart Rate: " + heart.getHeartRate());
                    }
                }
                if (number == 4) {
                    System.out.println("Name: " + stomach.getName());
                    System.out.println("Medical Condition: " + stomach.getMedicalCondition());
                }
                if (number == 5) {
                    System.out.println("Name: " + skin.getName());
                    System.out.println("Medical Condition: " + skin.getMedicalCondition());
                }

                if(number == 6){
                    break;
                }
        }

    }
     static class Organ {
        private String medicalCondition;
        private String name;
        public Organ(){};
         public Organ(String medicalCondition, String name) {
             this.medicalCondition = medicalCondition;
             this.name = name;
         }

         public String getMedicalCondition() {
             return this.medicalCondition;
         }

         public void setMedicalCondition(String medicalCondition) {
             this.medicalCondition = medicalCondition;
         }

         public String getName() {
             return this.name;
         }

         public void setName(String name) {
             this.name = name;
         }
     }
     static class Eye extends Organ{
        private String color;

         public Eye(String medicalCondition, String name, String color) {
             super(medicalCondition, name);
             this.color = color;
         }

         public String getColor() {
             return color;
         }

         public void setColor(String color) {
             this.color = color;
         }
     }
     static class Heart extends Organ{
         private int heartRate;

         public Heart(String medicalCondition, String name, int heartRate) {
             super(medicalCondition, name);
             this.heartRate = heartRate;
         }

         public int getHeartRate() {
             return heartRate;
         }

         public void setHeartRate(int heartRate) {
             this.heartRate = heartRate;
         }
     }


}
