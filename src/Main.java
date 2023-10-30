import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();

        File file = new File("info/student_grades.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileReader);

        String line;
        while ((line = bfr.readLine()) != null ){
            list.add(line);
        }
//        list.forEach(System.out::println);

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String[] arr = list.get(i).split(",");
            studentList.add(new Student(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]),
                    Integer.parseInt(arr[7])));
        }

        FileWriter fileWriter = new FileWriter("info/studentinfo.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < studentList.size(); i++) {
            stringBuilder.append(studentList.get(i).writeInfo(studentList.get(i)));
            stringBuilder.append("\n--------------------\n");
        }
        bw.write(String.valueOf(stringBuilder));
        bfr.close();
        bw.close();
