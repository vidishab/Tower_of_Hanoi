public class toi 
{
public static void towerofhanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if ( n == 1 )
        {
            System.out.println("Move the disk" + n + "from node" + from_rod + "to" + to_rod);
            return;
        }
        towerofhanoi(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move the disk" + n + " from node" + from_rod + "to" + to_rod );
        towerofhanoi(n-1,aux_rod,to_rod,from_rod);
    }
    public static void main(String args[])
    {
        int n=4;
        towerofhanoi(4,'A','B','C');
    }
}
