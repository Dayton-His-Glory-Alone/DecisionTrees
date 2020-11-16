import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
    NB nb = new NB();
		System.out.println("Enter the filename:");
    String fileName= scan.nextLine();
    nb.parse(fileName);
	}
}
