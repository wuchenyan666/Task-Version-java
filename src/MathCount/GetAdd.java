package MathCount;

public class GetAdd {

    public String getIntAdd(String a,String b,String c){
        //把a和b转换成相应整数值然后进行计算
        int numberA=Integer.parseInt(a);
        int numberB=Integer.parseInt(b);
        int add=0;
        switch (c){
            case "+": add= numberA+numberB; break;
            case "-": add= numberA-numberB; break;
            case "*": add= numberA*numberB; break;
            case "/": add= (numberA-(numberA%numberB))/numberB; break;
        }
        return add+"";
    }

    public String getFloatAdd(String a,String b,String c){
        //把a和b转换成相应整数值然后进行计算
        float numberA=Float.parseFloat(a);
        float numberB=Float.parseFloat(b);
        float add=0;
        switch (c){
            case "+": add= numberA+numberB; break;
            case "-": add= numberA-numberB; break;
            case "*": add= numberA*numberB; break;
            case "/": add= numberA/numberB; break;
        }
        return add+"";
    }

}
