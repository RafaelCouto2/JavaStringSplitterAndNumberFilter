package cev;

public final class NumberFilter extends StringSplitter implements INumberFilter {
    private float [] numbers;
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
