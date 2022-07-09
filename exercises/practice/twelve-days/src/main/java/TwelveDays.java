class TwelveDays {
    String days[]={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String verses[]={"a Partridge in a Pear Tree.","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
    String verse(int verseNumber) {
        String res="";
        int number= verseNumber-1;
        String temp="On the "+days[number]+" day of Christmas my true love gave to me: "+verses[number];
       if(verseNumber==1)
            return temp+"\n";
        else
        {
            res="and "+verses[0];
            for(int i=1;i<verseNumber-1 && i<days.length;i++){
                res=verses[i]+", "+res;
            }
            res=temp+", "+res+"\n";
            return res;
        }
    }

    String verses(int startVerse, int endVerse) {
        String finalRes="";
        for(int number=startVerse;number<endVerse;number++){
            finalRes+=verse(number)+"\n";
        }
        finalRes+=verse(endVerse);
        return finalRes;
    }
    
    String sing() {
        String finalRes="";
        for(int number=1;number<verses.length;number++){
            finalRes+=verse(number)+"\n";
        }
        finalRes+=verse(verses.length);
        return finalRes;
    }
}
