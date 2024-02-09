package cev;

public final class __NumberFilter implements I__NumberFilter {
    private StringSplitter rootString;
    private float[] numbers;

    /**
     * @param l Get the String[] instance and filter the numbers.
     */
    public __NumberFilter(StringSplitter l){
        this.setRootString(l);
        int totnumber= 0;
        for (int c = 0; c < this.getRootString().getsArray().length; c++) {
            for (int i = 0; i < this.getRootString().getsArray()[c].length(); i++) {
                if (Character.isDigit(this.getRootString().getsArray()[c].charAt(i))) {
                    totnumber++;
                }
            }
        }
        this.setNumbers(new float[totnumber]);
    }

    /**
     * Call the String[] and filter all the numbers into float[].
     * @return float[] of the filtered numbers into a Float Array.
     * If you already have filtered the numbers at this instance, use getNumbers() method instead.
     */
    @Override
    public float[] filterNumber(){
        int numberArrayPos = 0;
        boolean found;
        try {
            for (int c = 0; c < this.getRootString().getsArray().length; c++) {
                for (int i = 0; i < this.getRootString().getsArray()[c].length(); i++) {
                    found = false;
                    if (Character.isDigit(this.getRootString().getsArray()[c].charAt(i))) {
                        this.numbers[numberArrayPos] = Float.parseFloat(Character.toString(this.getRootString().getsArray()[c].charAt(i)));
                        found = true;
                    }
                    if(found) numberArrayPos++;
                }
            }
        } catch (NumberFormatException ignore){}
        return this.getNumbers();
    }

    private void setRootString(StringSplitter rootString) {
        this.rootString = rootString;
    }

    private StringSplitter getRootString() {
        return this.rootString;
    }

    private void setNumbers(float[] numbers) {
        this.numbers = numbers;
    }

    /**
     * @return Array float[] of numbers who was into og. String[].
     * @throws NullPointerException if there's no index.
     */
    public float[] getNumbers() throws NullPointerException {
        if(this.numbers.length > 0 ) return this.numbers;
        else {
            throw new NullPointerException("There`s no number to be filtered");
        }
    }
}
