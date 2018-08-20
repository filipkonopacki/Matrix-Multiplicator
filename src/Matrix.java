public class Matrix {

    private int[][] matrixValues;
    private int numberOfColumns;
    private int numberOfRows;

    Matrix(int numberOfRows, int numberOfColumns)
    {
        matrixValues = new int[numberOfRows][numberOfColumns];
    }

    protected int[][] getMatix(String name)
    {
        return matrixValues;
    }

    protected void setMatrix(int[][] Matrix)
    {
           matrixValues = Matrix;
    }
    protected void transposeMatrix()
    {
        int[][] transpositionedMatrix;
        transpositionedMatrix = new int[numberOfColumns][numberOfRows];
        for(int i = 0; i < numberOfColumns;i++)
        {
            for (int j = 0;j < numberOfRows;j++)
            {
                transpositionedMatrix[i][j] = matrixValues[j][i];
            }
        }
        matrixValues = transpositionedMatrix;
    }

    protected Matrix multiplyMatrix(Matrix multiplierMatrix)
    {
        if(this.numberOfColumns != multiplierMatrix.numberOfRows)
        {
            throw new ArithmeticException("Wymiary macierzy sa niepoprawne!");
        }
        else
        {
            int tmp = 0;
            Matrix resultMatrix = new Matrix(this.numberOfRows,this.numberOfColumns);
            for(byte k =0;k<MatrixA.length;k++)
            {
                for (int i = 0; i < MatrixB.length; i++)
                {
                    for (int j = 0; j < MatrixB.length; j++)
                    {
                        tmp += MatrixA[k][j] * MatrixB[j][i];
                    }
                    ResultMatrix[k][i] = tmp;
                    tmp = 0;
                }
            }
        }

        return ResultMatrix;
    }
}
