class RnaTranscription {

    String transcribe(String dnaStrand) {
        String res="";
        for(int i=0;i<dnaStrand.length();i++){
            char ch=dnaStrand.charAt(i);
            if(ch=='G')
                res+="C";
            else if(ch=='C')
                res+="G";
            else if(ch=='T')
                res+="A";
            else 
                res+="U";
        }
        return res;
    }

}
