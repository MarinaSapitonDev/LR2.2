import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    int  i,j;
    int tmp=17;
    int  n,m;

    int[][]A;

    Scanner reader = new Scanner(System.in);

    public void input(){


        System.out.println("enter n and m");

        n=reader.nextInt();
        m=reader.nextInt();

        A=new int [n][m];

        System.out.println("enter matrix");
        for( i=0;i<n;i++)
            for( j=0;j<m;j++)
                A[i][j]=reader.nextInt();


    }

    public void output(){
        for(i=0;i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(A[i][j]);
            System.out.println();
        }
    }

    public int[] pack(int [] array){
        int index=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                array[index] = A[i][j];
                index++;
            }
        }

        return array;
    }

    public int[][] unpack(int [] array){

       int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m; j++)
            {
                A[i][j] = array[index];
                index++;
            }
        }
        return A;
    }
    public void sortManually() {

        System.out.println("before manually sort");
        output();

        //перепаковака
        int[] newMass = new int[n * m];
        newMass=pack(newMass);


        //sortirovka
        int k = 0;
        while (k < newMass.length - 1){
            for (int i = 0; i < newMass.length-1; i++)

                if (newMass[i] > newMass[i+1]) {
                    tmp = newMass[i];
                    newMass[i] = newMass[i + 1];
                    newMass[i+1] = tmp;
                }
                k++;
    }


     A=unpack(newMass);
        System.out.println("after manually sort");
       output();

    }

    public void sortAuto(){

        System.out.println("before auto sort");
        output();
        int[] newMass = new int[n * m];
        newMass=pack(newMass);

        Arrays.sort(newMass);

        A=unpack(newMass);

        System.out.println("after auto sort");
        output();
    }

    public void check(){
        int[]B=new int[n];

        System.out.println("enter array");
        for( i=0;i<n;i++)
            B[i]=reader.nextInt();

        //check
        int count=0;
        for( j=0;j<m;j++) {
            for (i = 0; i < n; i++) {
                System.out.print(A[i][j]);
                if(A[i][j]==B[i]){
                    count++;
                    continue;
                }
                else i++;
            }
            System.out.println();
        }
        if(count==n) System.out.println("yes");
        else System.out.println("no");



    }
}
