public int moreHistoryThanMathAbsences() {
  int hisCount = 0;
  int mathCount = 0;

  for (int i = 0; i < historyList.size(); i++) {
    if (historyList.get(i).getStudentID() in mathList) {
      hisCount += historyList.get(i).getAbsences();
    }
    
  for (int i = 0; i < mathList.size(); i++) {
    if (mathList.get(i).getStudentID() in historyList) {
      mathList += historyList.get(i).getAbsences();
    }
    
    if (hisCount > mathCount) {
      return hisCount - mathCount;
    } else if (mathCount > hisCount) {
      return mathCount - hisCount;
    } else {
      return 0;
    }
    
  }  
}
