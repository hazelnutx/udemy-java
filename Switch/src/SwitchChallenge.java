public class SwitchChallenge {
    public static void main(String[] args){

        char switchValue = 'D';

        switch (switchValue){
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchValue + " was found");
                break;
            default:
                System.out.println("Char not found");
                break;
        }

        String month = "January";
        /**
         * toLowerCase() is String specific.
         * All the cases should be lowercase, otherwise it will go straight to default, because
         * this function (method) transforms every String into a lowercase.
         */

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Something else");
        }
    }
}
