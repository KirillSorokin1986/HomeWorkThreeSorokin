public class HW3 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        changeOneToZero();
        System.out.println();
        System.out.println("Задание 2:");
        printZeroToHundred();
        System.out.println();
        System.out.println("Задание 3:");
        lessThanSix();
        System.out.println();
        System.out.println("Задание 4:");
        printAwesomeQuad();
        System.out.println();
        System.out.println("Задание 5:");
        printArgArr (5, 60);



    }

    public static void changeOneToZero() {
        int[] arrOne = {1, 0, 1, 0, 1, 0, 1, 1};
        {
            for (int i = 0; i < arrOne.length; i++) {
                if (arrOne[i] == 0) {
                    arrOne[i] = 1;
                } else arrOne[i] = 0;
            }
            for (int i = 0; i < arrOne.length; i++) {
                System.out.print(arrOne[i]);
            }
        }
    }


    public static void printZeroToHundred() {
        int[] arrHundred = new int[100];
        {
            for (int i = 0; i < arrHundred.length; i++) {
                arrHundred[i] = i + 1;
            }

            for (int i = 0; i < arrHundred.length; i++) {
                System.out.print(arrHundred[i] + " ");

            }
        }

    }

    public static void lessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                } else arr[i] = arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void printAwesomeQuad() {
        int[][] arrQuad = new int[7][7];
        {
            for (int i = 0; i < arrQuad.length; i++) {

                for (int j = 0; j < arrQuad[i].length; j++)
                { int lastJ = (arrQuad[i].length-1);
                    if ( i == j || j == (lastJ - i)) {
                        arrQuad[i][j] = 1;}
                }

            }

            for (int i = 0; i < arrQuad.length; i++) {
                for (int j = 0; j < arrQuad[i].length; j++) {
                    System.out.print(arrQuad[i][j] + " ");

                }
                System.out.println();
            }
        }
    }


    public static void printArgArr (int len, int initialValue) {
        int [] arr = new int[len]; {
            for (int i = 0; i < arr.length ; i++) {
                arr[i]=initialValue;
            }
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+ " ");
            }

        }
    }

}
