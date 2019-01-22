package MathString;


import MathPart.Number;
import MathPart.Symbol;

//根据要求产生N个数的加减乘除的式子
public class IntegerFormula {

    //a个整数的加减乘除
    public String formulaString(int a,int b,int c){

        //随机生成a个整数,范围是0-b
        Number number = new Number();
        String[] arrayNumber=number.integerNumber(a,b);

        //随机生成a-1个符号
        Symbol symbol = new Symbol();
        String[] arrayFuhao={};
        if (c==0){
            //只有加减
            arrayFuhao= symbol.jiajian(a-1);
        }else if(c==1){
            //只有乘除
            arrayFuhao= symbol.chengchu(a-1);
        }else {
            //加减乘除都有
            arrayFuhao= symbol.jiajianchengchu(a-1);
        }

        //合并，并返回字符串数组
        AddString addstring= new AddString();
        String string=addstring.addString(arrayNumber,arrayFuhao);

        return string;
    }
}
