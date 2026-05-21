public int getPointsForRow(int targetRow) {
  int count = 0;
  Boolean isCol = True;
  for (int i = 0; i < board.size(); i++) {
    String sameCol = board.[targetRow][0].get(Color);
    count += board[targetRow][i].getPoints();
    if (! sameCol.equals(board[targetRow][i].get(Color))
      isCol = False;
  }
  if (isCol) {
    return 2 * count
  }
  else {
    return count;
  }
}
