public class StringObject {
    
    public static void main(String[] args) {

        // String Buffer
        StringBuffer sBuff = new StringBuffer("hi");

        sBuff.append("Hello world");

        System.out.println(sBuff);

        // String Builder

        // The different between String Buffer and String Builder is:
        // String Buffer able to exist in multi thread environment
        // String Builder unable to exist in multi thread environment

        // Thread is a task ( multi thread mean that you can run all of the task at the same time )


        StringBuilder sBuild = new StringBuilder("Hello ");

        sBuild.append("Hello");
        sBuild.replace(0, 5, "Wassup!");

        System.out.println(sBuild);
    }
}
