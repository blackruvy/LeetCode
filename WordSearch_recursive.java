package LeetCode;

public class WordSearch_recursive {
	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}
		if (word == null || word.length() == 0) {
			return false;
		}
		boolean rst = false;
		// boolean[][] used = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(board, word, i, j, 0)) {
					rst = true;
				}
			}
		}
		return rst;
	}

	public boolean dfs(char[][] board, String word, int i, int j, int index) {

		if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) {
			return false;
		}

		if (board[i][j] == word.charAt(index)) {
			char tracker = board[i][j];
			board[i][j] = '#';
			if (index == word.length() - 1) {
				return true;
			} else {
				index++;
				if(dfs(board, word, i + 1, j, index)||
				dfs(board, word, i - 1, j, index)||
				dfs(board, word, i, j + 1, index)||
				dfs(board, word, i, j - 1, index)){
					return true;
				}
			}
			board[i][j] = tracker;
		}
		return false;
	}
}
