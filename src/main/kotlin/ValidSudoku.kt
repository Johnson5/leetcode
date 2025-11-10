class ValidSudoku {
    fun validSudoku(board: Array<CharArray>): Boolean {
        val rows = board.map { row -> row.filter { it != '.' }}

        val columns = board[0].indices.map { col ->
            board.map { row -> row[col] }.filter { it != '.' }
        }

        val squares: MutableList<List<Char>> = mutableListOf()
        for (squareX in 0 until 3) {
            for(squareY in 0 until 3) {
                val group: MutableList<Char> = mutableListOf()
                for (coordX in 0 until 3) {
                    for (coordY in 0 until 3){
                        val posX = squareX * 3 + coordX
                        val posY = squareY * 3 + coordY
                        val char = board[posY][posX]
                        if(char != '.') {
                            group.add(char)
                        }
                    }
                }
                squares.add(group)
            }
        }

        val allGroups = rows + columns + squares
        return allGroups.all { validGroup(it) }
    }

    fun validGroup(group: List<Char>): Boolean {
        return group.distinct().size == group.size
    }
}