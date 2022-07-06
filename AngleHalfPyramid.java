class AngleHalfPyramid{
    
    public static void main(String[] args){
        int i,j;
        int n=4;
        for(i=1;i<=n;i++)
        {
            if(i==1)
                {
                    System.out.println("   *");
                }
                else if(i==2)
                {
                    System.out.println("  **");
                }
                else if(i==3)
                {
                    System.out.println(" ***");
                }
                else if(i==4)
                {
                    System.out.println("****");
                }
                else{
                    System.out.println("  ");
                }
            }
            System.out.println();

    }
}

