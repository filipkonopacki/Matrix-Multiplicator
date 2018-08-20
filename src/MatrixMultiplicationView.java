public class MatrixMultiplicationView {

    MatrixMultiplicationView()
    {

    }

    protected void showMenu()
    {
        System.out.print("***************Mnozenie macierzy***************\n(1)Wprowadz macierze wejsciowe\n(2)Operacje arytmetyczne\n\t(2.1)Transponuj macierze wejsciowe\n\t(2.2)Pomnoz macierze wejsciowe\n\t(2.3)Transponuj macierz wynikowa\n(3)Wyswietl macierze\n\t(3.1)Wyswietl macierze wejsciowe\n\t(3.2)Wyswietl macierz wynikowa\n(4)Wyjscie\n\n\t\tWybierz jedna z opcji powyzej:\n~~");
    }

    protected void displayMatrix(String name,int[][] Matrix)
    {
        System.out.println("Elementy macierzy " + name);
        for(int i = 0;i<Matrix.length;i++)
        {
            for(int j = 0;j<Matrix[i].length;j++)
            {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    protected void displayError(String name)
    {
        switch (name)
        {
            case "MatrixDoesntExist":
                System.err.println("Nie mozna wykonac operacji, wymagane macierze nie istnieja!");
                break;
            case "WrongSize":
                System.err.println("Nie mozna wykonac operacji, utworzone macierze maja niepoprawne wymiary!");
                break;
            case "WrongOption":
                System.err.println("Wybrana opcja nie istnieje!");
                break;
        }
    }

}
