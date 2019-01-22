package MathCount;

public class MathStack {

    //先判断表达式中有没有乘除号，先计算乘除
    boolean flag=false;
    protected boolean ifHasChengChu(String[] mathString){
        for (int i=0; i<mathString.length; i++){
            if (mathString[i].equals("*")||mathString[i].equals("/")){
                flag=true;
                break;
            }
        }
        return flag;
    }

    public String getMathIntStack(String[] mathString){

        //定义一个空数组
        String[] mathArray=null;
        //定义一个新的变量存放最终的计算结果
        String intCount="";

        if (ifHasChengChu(mathString)==true){
            //说明式子中有乘除号

            //定义一个下标
            int sign=0;

            if(mathString.length>=3) {
                mathArray=new String[mathString.length-2];
                //说明mathString中至少还有一个最简单的式子 形如 a+b,也说明下一次递归mathArray中只有一个数

                //查找得到数组中第一个乘除号的下标
                for (int i = 0; i < mathString.length; i++) {
                    if (mathString[i].equals("*") || mathString[i].equals(("/"))) {
                        sign = i;
                        break;
                    }
                }
                //把sign-1之前的式子、sign-1 sign sign+1之后的计算结果、和sign+1之后的式子按顺序放到新数组中
                //1.得到sign-1 sign sign+1 的实际String值
                String signLeft = mathString[sign - 1];
                String signRight = mathString[sign + 1];
                //2.计算sign-1 sign sign+1 的结果
                String signAdd = new GetAdd().getIntAdd(signLeft, signRight, mathString[sign]);
                //存放到定义好的数组中生成新的数学表达式数组，该数组比原来长度少2
                for (int i = 0; i < sign - 1; i++) {
                    mathArray[i] = mathString[i];
                }
                mathArray[sign-1]=signAdd;
                for (int i=sign; i<mathString.length; i++ ){
                    mathArray[i-2]=mathString[i];
                }

                //递归调用，知道mathArray中只有一个数为止
                mathString=mathArray;
                getMathIntStack(mathString);

            }else {
                //说明mathString中只有一个数，即式子运算的结果
                intCount=mathString[0];
            }

        }else {
            //说明式子中只有加减,就不用判断乘除法了，直接从左往右以此计算

            if(mathString.length>=3) {
                mathArray=new String[mathString.length-2];
                //说明mathString至少中还有一个最简单的式子 形如 a+b,也说明下一次递归mathArray中只有一个数

                //前三个数计算得出结果
                intCount=new GetAdd().getIntAdd(mathString[0],mathString[2],mathString[1]);
                //得到新的数组
                mathArray[0]=intCount;
                for (int i=3; i<mathString.length; i++){
                    mathArray[i-2]=mathString[i];
                }

                for(int i=0; i<mathArray.length; i++){
                    System.out.print(mathArray[i]);
                }

                System.out.println("数组长度:"+mathArray.length);

                //递归调用，直到mathArray中只有一个数为止
                mathString=mathArray;
                getMathIntStack(mathString);

            }else {
                //说明mathString中只有一个数，即式子运算的结果
                for(int i=0; i<mathString.length; i++){
                    System.out.println(mathString[i]);
                }
            }

        }

        return intCount;
    }

    public int getMathFloatStack(String[] mathString){



        return 0;
    }


    public static void main(String[] args){
        String[] test={"5","+","9","-","3"};
        System.out.print(new MathStack().getMathIntStack(test));
    }
}
