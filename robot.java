public class robot {
    public static void main(String[] args) {
        int[] commands = {4, -1, 3};
        int x=0;
        int y=0; 
        // int xcor=0; 
        // int ycor = 0;
        int commsize = commands.length;
        System.out.println("Commsize : "+commsize);
        for(int i=0; i<commsize; i++){
            for(int j=i+1;j<commsize;j++){
                if(commands[j]==-1){
                    x = commands[j];
                }else{
                    y = commands[i] + commands[j];
                }
            }
        }

        

        System.out.println("(" + x + "," + y + ")");

    }
}
