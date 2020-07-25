public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        String[] students=new String[3];
        students[0]="engin";
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("\n");

        for(String student:students){
            System.out.println(student);
        }

        int[][] numbers=new int[3][3];
        numbers[0][0]=1;
        numbers[1][0]=2;
        numbers[2][0]=3;
        for(int i=0;i<3;i++){
            System.out.println("--------");
            for(int j=0;j<3;j++){
                System.out.println(numbers[i][j]);
            }
        }

        int toplam=topla(1,2,3,4,5,6);
        System.out.println("Variable Arguments sayılar toplamı:"+toplam);
    }

    public static int topla(int... numbers){
        int toplam=0;
        for (int number:numbers){
            toplam+=number;
        }
        return toplam;
    }

}
