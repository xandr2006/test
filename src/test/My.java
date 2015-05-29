package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class My {
        public static String RS() throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }

        public static int RI() throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        }

        public static void readLn() throws Exception
        {
            My.RS();
        }
        public static String test()
        {
            return "test ok";
        }
    }

