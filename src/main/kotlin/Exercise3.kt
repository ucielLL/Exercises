class Exercise3 {


    fun rotate(matrix: Array<IntArray>):Array<IntArray> {
        var n = if (matrix.size % 2 == 0) matrix.size / 2 else (matrix.size - 1) / 2

        for (c in 0 until n) {
            for (i in c until matrix.size - 1 - c) {

                var vertex1 = matrix[c][i]
                var vertex2 = matrix[i][matrix.size - 1 - c]
                matrix[i][matrix.size - 1 - c] = vertex1
                var vertex3 = matrix[matrix.size - 1 - c][matrix.size - 1 - i]
                matrix[matrix.size - 1 - c][matrix.size - 1 - i] = vertex2
                var vertex4 = matrix[matrix.size - 1 - i][c]
                matrix[matrix.size - 1 - i][c] = vertex3
                matrix[c][i] = vertex4
            }
        }
        return matrix

    }
}