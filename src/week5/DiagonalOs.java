package week5;

class DiagonalOs
{
    public static void main(String[] args)
    {
        int x,y;
        int numOfRow = 10;
        int spaces = 0;
        String msg="";
        for(x=0;x<numOfRow;++x)
        {
            for(y=0;y<spaces;++y)
            {
                System.out.println(msg+=" ");
            }
            System.out.println(msg+="O\n");;
            spaces++;
        }
    }
}
