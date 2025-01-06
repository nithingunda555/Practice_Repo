public class StringManipulation {

    public static void main(String[] args) {
        String str = "java learning experience";

        // Example of String class methods
        System.out.println("=== String Class ===");

        // length()
        System.out.println("Length of str: " + str.length());

        // charAt()
        System.out.println("Character at index 5: " + str.charAt(5));

        // contains()
        System.out.println("Does str contain 'learning'? " + str.contains("learning"));

        // substring()
        System.out.println("Substring from index 5 to 15: " + str.substring(5, 15));

        // toUpperCase()
        System.out.println("str in upper case: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("str in lower case: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of 'learning': " + str.indexOf("learning"));

        // replace()
        System.out.println("Replaced 'learning' with 'coding': " + str.replace("learning", "coding"));

        // trim()
        String withSpaces = "   java learning experience   ";
        System.out.println("Trimmed string: '" + withSpaces.trim() + "'");

        // split()
        String[] words = str.split(" ");
        System.out.println("Split str into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Example of StringBuilder class
        System.out.println("\n=== StringBuilder Class ===");
        StringBuilder sb = new StringBuilder(str);
        // append() - appends the specified string to the current StringBuilder
        sb.append(" - is fun!");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(4, " programming");
        System.out.println("After insert: " + sb);

        // delete()
        sb.delete(4, 17);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // replace()
        sb.replace(0, 4, "Enjoy");
        System.out.println("After replace: " + sb);

        // toString()
        String finalStr = sb.toString();
        System.out.println("Converted to String: " + finalStr);

        // Example of StringBuffer class
        System.out.println("\n=== StringBuffer Class ===");
        StringBuffer buffer = new StringBuffer(str);
        
        // append()
        buffer.append(" is rewarding.");
        System.out.println("After append: " + buffer);

        // insert()
        buffer.insert(5, " advanced");
        System.out.println("After insert: " + buffer);

        // delete()
        buffer.delete(5, 13);
        System.out.println("After delete: " + buffer);
        
        //reverse
        buffer.reverse();
        System.out.println("After reverse: " + buffer);

        // capacity()
        System.out.println("Capacity of buffer: " + buffer.capacity());

        // ensureCapacity()
        buffer.ensureCapacity(50);
        System.out.println("After ensuring capacity 50: " + buffer.capacity());

        // toString()
        String finalBufferStr = buffer.toString();
        System.out.println("Converted to String: " + finalBufferStr);
    }
}
