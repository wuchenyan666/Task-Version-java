package MathPart;

public class Symbol {

    //定义一个空数组存放随机得到的符号
    String[] symbol;

    //随机产生符号函数
    private String[] fuHao(int n , String[] arrayFuhao){

        symbol=new String[n];
        for (int i=0;i<n;i++){
            //随机选取数组下标
            int index=(int)(Math.random()*(arrayFuhao.length));
            //存放到symbol中
            symbol[i]=arrayFuhao[index];
        }
        return symbol;
    }

    //只产生N个四则运算的加减符号
    public String[] jiajian(int n){

        //定义一个String数组，存放加减乘除符号
        String[] strings={"+", "-"};

        String[] arrayFuhao=fuHao(n,strings);

        //选出符号，返回
        return arrayFuhao;
    }

    //只产生N个四则运算的乘除符号
    public String[] chengchu(int n){

        //定义一个String数组，存放加减乘除符号
        String[] strings = {"*", "/"};

        String[] arrayFuhao=fuHao(n,strings);

        //选出符号，返回
        return arrayFuhao;
    }

    //产生N个四则运算的加减乘除符号
    public String[] jiajianchengchu(int n){

        //定义一个String数组，存放加减乘除符号
        String[] strings = {"+", "-", "*", "/"};

        String[] arrayFuhao=fuHao(n,strings);

        //选出符号，返回
        return arrayFuhao;
    }

}
