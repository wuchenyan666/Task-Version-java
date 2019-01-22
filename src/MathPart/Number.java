package MathPart;

//产生随机数，以数组的形式返回
public class Number {

    //产生的a个随机数是整数,范围是0-b
    public String[] integerNumber(int a,int b){
        //定义一个整形数组存放产生的整数
        String[] arrayNumber=new String[a];
        //把产生的随机数放进数组中
        for (int i=0;i<a;i++) {
            //随机产生整数
            int index1 = (int) (Math.random() * b);
            arrayNumber[i]=index1+"";
        }
        //返回产生的整数数组
        return arrayNumber;
    }

    //产生的a个随机数是小数,范围是0-b,小数点以后保留c位
    public String[] smallNumber(int a,double b,int c){
        //定义一个double形数组存放产生的数
        String[] arrayNumber=new String[a];
        //把产生的小数放到数组中
        for (int i=0;i<a;i++) {
            //随机产生小数
            float index1 = (float ) (Math.random() * b);
            arrayNumber[i]=index1+"";
        }
        return arrayNumber;
    }

}
