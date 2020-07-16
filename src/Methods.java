public class Methods {
    public static void main(String[] args){
         String f  = new Methods().getFields("001010111");

        System.out.println(f);
    }


    public String getFields(String bitmap) {
        String fields = "";
        int counter = 1;
        for (int i = 0; i < bitmap.length(); i++) {
            if (bitmap.charAt(i) == '1') {
                fields = fields + ("," + counter);
            }
            counter = counter + 1;
        }
        return fields.substring(1);
    }
}