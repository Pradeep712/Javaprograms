//splitting the array and adding the arr ele and checking the spiltted arra ele sums are equal
public class Problem1 {

public static void main(String[] args) throws IOException{
    Scanner scanner=new Scanner(System.in);
    ArrayList<Integer> array=new ArrayList<Integer>();
    int cases;
    System.out.println("Enter the test cases");
    cases=scanner.nextInt();

    for(int i=0;i<cases;i++){
        int size;


        size=scanner.nextInt();
        System.out.println("Enter the Initial array size : ");

        for(int j=0;j<size;j++){
            System.out.println("Enter elements in the array");
            int element;
            element=scanner.nextInt();
            array.add(element);
        }
    }

    if(validate(array)){
System.out.println("Array can be Partitioned");}
  else{
     System.out.println("Error");}

}

public static boolean validate(ArrayList<Integer> array){
    boolean flag=false;
    Collections.sort(array);
    System.out.println(array);
    int index=array.size();

    ArrayList<Integer> sub1=new ArrayList<Integer>();
    ArrayList<Integer> sub2=new ArrayList<Integer>();

    sub1.add(array.get(index-1));
    array.remove(index-1);

    index=array.size();
    sub2.add(array.get(index-1));
    array.remove(index-1);

    while(!array.isEmpty()){

    if(compareSum(sub1,sub2)){
        index=array.size();
        sub2.add(array.get(index-1));
        array.remove(index-1);
    }
    else{
        index=array.size();
        sub1.add(array.get(index-1));
        array.remove(index-1);
    }   
    }

    if(sumOfArray(sub1).equals(sumOfArray(sub2)))
        flag=true;
    else
        flag=false;

    return flag;
}

public static Integer sumOfArray(ArrayList<Integer> array){
    Iterator<Integer> it=array.iterator();
    Integer sum=0;
    while(it.hasNext()){
        sum +=it.next();
    }

    return sum;
}

public static boolean compareSum(ArrayList<Integer> sub1,ArrayList<Integer> sub2){
    boolean flag=false;

    int sum1=sumOfArray(sub1);
    int sum2=sumOfArray(sub2);

    if(sum1>sum2)
        flag=true;
    else
        flag=false;

    return flag;
}

}