package com.Project17;
import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class ValidateDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String str = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date d = sdf.parse(str);
            System.out.println(d);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
