import javax.swing.JOptionPane;

public class NegativeArray_Cuizon{
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Enter the size of array:");
            int size = Integer.parseInt(input);
            int[] array = new int[size];

            JOptionPane.showMessageDialog(null, "Successfully created an array with the size of:  " + size);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error occured, The size you have inputed is not a number.");
        } catch (NegativeArraySizeException e) {
            JOptionPane.showMessageDialog(null, "Error occured, You have inputed a negative number for the size.");
        }
    }
}