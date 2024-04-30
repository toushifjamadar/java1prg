class room 
 {
    int length;
    int breadth;
    room (int x,int y)
   {
    length=x;
    breadth=y;
   }
   void area()
   {
    int a=length*breadth;
    System.out.println("Area="+a);
   }    
}
class room1 extends room
{
    int height;
    room1 (int x,int y,int z)
    {
        super(x,y);
        height=z;
    }
    void volume()
    {
        int=length A breadth * height;
        System.out.println("Volume="+V);
    }

}
public class SingleInher{
    public static void main(String args[]) 
    {
                                                                                                                                                       {
        room1 r1=new room1(4,6,7);
              r1.area();
              r1.volume();
                                                                                                                                                       }
    }
}
