class Add {
    public static void main(String[] args) {

        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            // int firstNumber = 100;
            // int secondNumber = 200;
            int result;
            result = firstNumber + secondNumber;
            System.out.println("Addition is: "+result); // + : concatenation/joining
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
