class LabelledLoop {
    public static void main(String[] args) {
        
        // *****
        // *****
        // *****
        // *****
        // *****

        loop1: for(int i = 1; i <= 5; i++) // rows
        {
            loop2: for(int j = 1; j <= 5; j++) // columns
            {
                System.out.print("*");

                if(j == 5)
                {
                    break loop1;
                }
            }
            System.out.println();
        }
    }
}