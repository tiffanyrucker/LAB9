public class Validator {
    

    
    public boolean isValidRadius(String input)
    {
       boolean flag = false;
        
        try {
            double isNum = Double.parseDouble(input);
            flag = true;
            
        } catch (Exception e) {
          flag = false;
        }
        
        return flag;
    }
    
}
