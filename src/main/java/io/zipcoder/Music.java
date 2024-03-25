package io.zipcoder;


import java.util.LinkedList;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        //looping forward

        int fSkips = 0;
        int bSkips = 0;

        for (int forwards = startIndex; forwards < playList.length; forwards++) {

            if (playList[forwards] != selection) {
                fSkips++;
            } else {
                break;
            }
        }


        //looping backward
            for (int backwards = startIndex; backwards >= 0; backwards--) {

            if (playList[backwards] != selection) {
                bSkips++;

            } else {
                break;
            }
        }
      return Math.min(fSkips,bSkips);
    }
}