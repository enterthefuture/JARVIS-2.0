/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javashell;

/**
 *
 * @author 2015-15
 */
public class  ElecUtils {
    private static final String[] colorCode = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey"};

    public static int ColorDecode(String StrOne, String StrTwo, String StrMul){
        int ValueOne=0, ValueTwo=0, ValueMul=0;
        int i=0;
        for(String s : colorCode)
        {
            if(StrOne.equals(s))
            {
                ValueOne = i;
            }
            i++;
        }
        i=0;
        for(String s : colorCode)
        {
            if(StrTwo.equals(s))
            {
                ValueTwo = i;
            }
            i++;
        }
        i=0;
        for(String s : colorCode)
        {
            if(StrMul.equals(s))
            {
                ValueMul = i;
            }
            i++;
        }
        int v =(int) (((ValueOne*10)+ValueTwo)*Math.pow(10,ValueMul));
        return v;
    }
    
    public static String ColorEncode(int value) {
        int ValueMul=0, ValueOne=0, ValueTwo=0;
        for(int i=0; i<=9; i++ ){
            if ((value/Math.pow(10, i)) < 100) {
                ValueMul=i;
                break;
            }
        }
        
        ValueOne = (int) (value/Math.pow(10,ValueMul+1));
        ValueTwo = (int) (value/Math.pow(10,ValueMul)-(ValueOne*10));
        
        return colorCode[ValueOne]+" "+colorCode[ValueTwo]+" "+colorCode[ValueMul];
    }
}
