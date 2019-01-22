package MathString;

public class Strings {
    //得到算数表达式的集合

    //select   选择是整数还是小数, 0：整数式子，1：小数式子
    //howMuch  选择生成多少式子
    //hoeMany  选择生成的式子中含有多少个数
    //where    选择范围
    //type     选择加减乘除，0：加减法，1：乘除法，2：加减乘除
    public String[] getMathStrings(int select, int howMuch, int howMany ,int where, int type){

        //二维数组存放产生的式子
        String[] strings=new String[howMuch];

        if (select==0){
            //select为0代表整数式子
            String stringZhengShu="";
            for (int i=0; i<howMuch; i++) {
                IntegerFormula integerFormula = new IntegerFormula();
                stringZhengShu = integerFormula.formulaString(howMany, where,type);

                strings[i]=stringZhengShu;
            }

        }else if(select==1) {
            //select为1代表含有小数的式子

        }

        return strings;
    }
}
