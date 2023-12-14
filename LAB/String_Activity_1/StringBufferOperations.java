public class StringBufferOperations {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");

        // 1. Adds the string ”- This is a sample program” to existing string and display it.
        stringBuffer.append("- This is a sample program");
        System.out.println("1. Appended string: " + stringBuffer);

        // 2. Inserts the string “Object” into the existing string at 21st position and display it.
        stringBuffer.insert(20, "Object ");
        System.out.println("2. Inserted 'Object' at 21st position: " + stringBuffer);

        // 3. Reverses the entire string and displays it.
        stringBuffer.reverse();
        System.out.println("3. Reversed string: " + stringBuffer);

        // 4. Replaces the word “Buffer” with “Builder” and display it.
        int index = stringBuffer.indexOf("Buffer");
        if (index != -1) {
            stringBuffer.replace(index, index + "Buffer".length(), "Builder");
        }
        System.out.println("4. Replaced 'Buffer' with 'Builder': " + stringBuffer);
    }
}
