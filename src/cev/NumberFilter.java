package cev;

public final class NumberFilter extends StringSplitter implements INumberFilter {
    private float [] numbers;

    /**
     * Use getsArray() method to get the return of this String[].
     * @param string Split the string into a String[] Array that'll be filtered.
     */
    public NumberFilter(String string){
        this.split(string);
        int totnumber= 0;
        for (int c = 0; c < this.getsArray().length; c++) {
            for (int i = 0; i < this.getsArray()[c].length(); i++) {
                if (Character.isDigit(this.getsArray()[c].charAt(i))) {
                    totnumber++;
                }
            }
        }
        this.setNumbers(new float[totnumber]);
    }

    /**
     * Call getsArray() from StringSplitter and filter all the numbers into float[].
     * @return float[] of the filtered numbers into a Float Array.
     * If you already have filtered the numbers at this instance, use getNumbers() method instead.
     */
    @Override
    public float[] filterNumbers(){
        int numberArrayPos = 0;
        boolean found;
        try {
            for (int c = 0; c < this.getsArray().length; c++) {
                for (int i = 0; i < this.getsArray()[c].length(); i++) {
                    found = false;
                    if (Character.isDigit(this.getsArray()[c].charAt(i))) {
                        this.numbers[numberArrayPos] = Float.parseFloat(Character.toString(this.getsArray()[c].charAt(i)));
                        found = true;
                    }
                    if(found) numberArrayPos++;
                }
            }
        } catch (NumberFormatException ignore){}
        return this.getNumbers();
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

    private void setNumbers(float[] numbers) {
        this.numbers = numbers;
    }
}
