
package clase_generica4;

public class CLASE_GENERICA4 {

    public static void main(String[] args) {
        String n1="3",n2="8";
        CNumeros nums=new CNumeros();
        try{
            nums=new CNumeros(Integer.parseInt(n1),
                    Integer.parseInt(n2));
        }catch (NumberFormatException e1){
            System.out.println("Error. - No es entero");
            try{
                nums=new CNumeros(Float.parseFloat(n1),
                        Float.parseFloat(n2));
            }catch (NumberFormatException e2){
                System.out.println("Error. - No es flotante");
            }
        }
        nums=Operaciones.suma(nums);
        System.out.println(nums.getRes());
    }
    
}

class Operaciones{
    public static CNumeros suma(CNumeros nums){
        if(nums.getN1()instanceof Integer){
            nums.setRes(nums.getN1().intValue()+nums.getN2().intValue());
        }
        if(nums.getN1()instanceof Float){
            nums.setRes(nums.getN1().floatValue()+nums.getN2().floatValue());
        }
        if(nums.getN1()instanceof Double){
            nums.setRes(nums.getN1().doubleValue()+nums.getN2().doubleValue());
        }
        return nums;
    }
    public static CNumeros<Integer>sumaInt(CNumeros<Integer>nums){
        nums.setRes(Integer.parseInt(nums.getN1().toString())+Integer.parseInt(nums.getN2().toString()));
        return nums;
    }
}

