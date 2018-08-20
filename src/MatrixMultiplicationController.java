import java.util.Scanner;

public class MatrixMultiplicationController
{
    private static MatrixMultiplicationView view = new MatrixMultiplicationView();
    private static MatrixMultiplicationModel model;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        while(true)
        {
            view.showMenu();
            String option = scan.next();

            switch(option)
            {
                case "1":

                   int[] sizeA = getSize("A");
                   int[] sizeB = getSize("B");

                    if(model == null)
                    {
                        model = new MatrixMultiplicationModel(sizeA,sizeB);
                    }
                    model.setMatrix("A",getValues("A",sizeA));
                    model.setMatrix("B",getValues("B",sizeB));

                    break;
                case "2.1":
                    try
                    {
                        model.matrixTransposition("A");
                        model.matrixTransposition("B");
                    }
                    catch (java.lang.NullPointerException err)
                    {
                        view.displayError("MatrixDoesntExist");
                    }
                    break;
                case "2.2":
                    try
                    {
                        model.MatrixMultiplication();
                    }
                    catch (ArithmeticException err)
                    {
                        view.displayError("WrongSize");
                    }
                    catch (java.lang.NullPointerException err2)
                    {
                        view.displayError("MatrixDoesntExist");
                    }
                    break;
                case "2.3":
                    try
                    {
                        model.matrixTransposition("C");
                    }
                    catch (java.lang.NullPointerException err)
                    {
                        view.displayError("MatrixDoesntExist");
                    }
                    break;
                case "3.1":
                    try
                    {
                        view.displayMatrix("A", model.getMatix("A"));
                        view.displayMatrix("B", model.getMatix("B"));
                    }
                    catch (java.lang.NullPointerException err)
                    {
                        view.displayError("MatrixDoesntExist");
                    }
                    break;
                case "3.2":
                    try
                    {
                        view.displayMatrix("wynikowej",model.getMatix("C"));
                    }
                    catch (java.lang.NullPointerException err)
                    {
                        view.displayError("MatrixDoesntExist");
                    }
                    break;
                case "4":
                    System.exit(0);
                    break;

                    default:
                        view.displayError("WrongOption");
                        break;

            }
        }



    }



    private static int[] getSize(String name)
    {
        System.out.print("Podaj wymiary macierzy " + name +" oddzielone spacja: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[] size = {rows,columns};
        return size;

    }
    private static int[][] getValues(String name,int size[]) {
        System.out.print("Podaj wartości macierzy " + name + " oddzielone spacja: ");

        int[][] values = new int[size[0]][size[1]];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = scan.nextInt();
            }
        }
        return values;
    }

}
