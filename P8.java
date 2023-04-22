class P8 {
    int a = 0;
    void op(){
        for(int i = 0; i <= 5; i++){
            a +=i;
            System.out.println(a); 
        }
    }
    public static void main(String args[]){
        P8 o = new P8();
        o.op();
    }
}