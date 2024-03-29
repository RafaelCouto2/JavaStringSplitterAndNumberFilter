package cev;
//REMEMBER! CHANGE THE PACKAGE NAME!
public class StringSplitter implements IStringSplitter {


    //SEPARA, A CADA ESPAÇAMENTO, SUBSTRINGS DE UMA STRING EM UM VETOR DE STRINGS.
    private String txt;
    private String[] sArray;
    private boolean spr;

    /**
     * String ex = "THIS STRING WILL BE SEPARATED IN ARRAYS FOR EACH SPACE OR \",\" .";
     * @return Return the substrings of ex into a String[] Arrays.
     * Use getsArray() method if you already have the String >>at this instance<<.**/
    @Override
    public final String[] split(String txt)  {
        try {
            this.setTxt(txt);
            if (this.isSpr()) {
                this.setsArray(new String[this.totSpaces()]);
                int range = 0;
                for (int c = 0; c < this.getsArray().length; c++) {
                    for (int i = range; i < this.getTxt().length(); i++) {
                        if (this.getTxt().charAt(i) == ' ') {
                            this.sArray[c] = this.getTxt().substring(range, i);
                            range = i + 1;
                            break;
                        } else if((this.getTxt().charAt(i) == ',' || this.getTxt().charAt(i) == '.') &&
                                (this.getTxt().charAt(i-1) != '"' && this.getTxt().charAt(i+1) != '"')) {
                            this.sArray[c] = this.getTxt().substring(range, i);
                            range = i + 2;
                            break;
                        }
                    }
                }
            } else throw new NullPointerException();
        } catch (NullPointerException e) {
            System.err.println("EMPTY OR NULL!");
        }
        return this.getsArray();
    }

    private int totSpaces() {
        int tot = 0;
        if(this.isSpr()) {
            for (int i = 0; i < this.getTxt().length(); i++) {
                if (this.getTxt().charAt(i) == ' ' /*|| i >= this.getTxt().length()*/) {
                    tot++;
                }
            }
            this.setTxt(this.getTxt() + " ");
            return tot + 1;
        } else {
            return 0;
        }
    }

    private String getTxt() {
        return this.txt;
    }

    private void setTxt(String txt) {
        try {
            this.txt = txt;
            this.setSpr(true);
            if(txt.isBlank()){
                this.setSpr(false);
            }
        } catch (NullPointerException e) { this.setSpr(false); }
    }

    /**
     * @return The String[] array.
     */
    public final String[] getsArray() {
        return this.sArray;
    }

    private void setsArray(String[] sArray) {
        this.sArray = sArray;
    }

    private void setSpr(boolean spr) {
        this.spr = spr;
    }

    private boolean isSpr() {
        return this.spr;
    }

}
