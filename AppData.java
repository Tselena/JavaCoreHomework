package LessonFive_AppData;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class AppData<buffer> {

        private String[] header;
        private int[][] data;

//        public AppData(String[] header, int[][] data){
//            this.header = header;
//            this.data = data;
//        }

        public String[] getHeader() {
            return header;
        }

        public int[][] getData() {
            return data;
        }

        public void readFile (String file) {
            ArrayList<int[]> rowsList = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                header = reader.readLine().split(";"); // first line
                while ((line = reader.readLine()) != null) {
                    String[] tokensStr = line.split(";");
                    int[] tokensInt = new int[tokensStr.length];
                    for (int i = 0; i< tokensInt.length; i++) {
                        tokensInt[i] = Integer.parseInt(tokensStr[i]);
                    }
                    rowsList.add(tokensInt);
                }
                data = rowsList.toArray(new int[][]{});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void writeToCsv (String file, String newFile) {

            try (BufferedReader reader = new BufferedReader(new FileReader(file));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile))))
             {
                char[] buffer = new char[getHeader().length];
                while(reader.ready()) {
                    int real = reader.read(buffer);
                    writer.write(buffer, 0, real);
                }

            }  catch (IOException e) {
                e.printStackTrace();
            }

        }




}
