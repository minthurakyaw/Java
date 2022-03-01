import java.util.Scanner;

class Examiner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number  of student : ");
        int num_student = s.nextInt();

        String student_name[] = new String[num_student];
        int total[] = new int[num_student];
        String result[] = new String[num_student];
        String student_gender[] = new String[num_student];
        int min[] = new int[num_student];
        
        for ( int k = 0; k < num_student; k++){
            switch(k){
                case 0 : System.out.print("Enter 1st student's name : "); break;
                case 1 : System.out.print("Enter 2nd student's name : "); break;
                case 2 : System.out.print("Enter 3rd student's name : "); break;
                default : System.out.print("Enter " + (k+1) + "th student's name : "); break;
            }
            student_name[k] = s.next();
        }

        System.out.print("Enter number of Subjects : ");
        int num_subject = s.nextInt();
        
        String subject_name[] = new String[num_subject];
        int total_marks[] = new int[num_subject];
        float avg_marks[] = new float[num_subject];

        int marks[][] = new int[num_student][num_subject];

        for ( int j = 0; j < num_subject; j++){
            System.out.print("Subject " + (j+1) + " : ");
            subject_name[j] = s.next();
        }    

        int male = 0, female =0, total_total = 0,max = 0, fail = 0,highest_mark = 0, pass = 0;

        String highest_mark_name= "";
        
        //Start main loop
        for ( int i = 0; i < num_student; i++ ){
            switch(i){
                case 0 : System.out.println("Enter 1st student's name : " + student_name[i]); break;
                case 1 : System.out.println("Enter 2nd student's name : " + student_name[i]); break;
                case 2 : System.out.println("Enter 3rd student's name : " + student_name[i]); break;
                default : System.out.println("Enter " + (i+1) + "th student's name : "); break;
            }

            System.out.print("Enter "+ student_name[i] + "'s gender(M/F) : ");
            student_gender[i] = s.next();
            if (student_gender[i].equals("m") || student_gender[i].equals("M")) {
                male++;
                student_gender[i] = "Male";
            } else if (student_gender[i].equals("f") || student_gender[i].equals("F")) {
                female++;
                student_gender[i] = "Female";
            }

            //Nested loop
            boolean isDefaultMin = true;
            for ( int l = 0; l < num_subject; l++) {
                System.out.print("Enter " + student_name[i] + "'s " + subject_name[l] + " Marks : ");
                marks[i][l] = s.nextInt();
                total[i] += marks[i][l];
                total_marks[l] += marks[i][l];
                
                if(marks[i][l] ==0)
                isDefaultMin = false;

                if (min[i] >= marks[i][l]) {
                    min[i] = marks[i][l];
                } else if ( min[i] == 0 && isDefaultMin) {
                    min[i] = marks[i][l];
                }
            }
            total_total += total[i];
            if (min[i] < 40) {
                fail++;
                result[i] = "Failed";
            } else if (min[i] >= 40 && min[i] <= 100){
                pass++;
                result[i] = "Passed";
            };

            if(total[i] > max){
                max = total[i];
                highest_mark_name = student_name[i];
            }

            if (student_gender[i].equals("Male")){
                System.out.println("Total marks of Mg " + student_name[i] + " : " + total[i] + " (" + result[i] + ")");
            } else if (student_gender[i].equals("Female")) {
                System.out.println("Total marks of Ma " + student_name[i] + " : " + total[i] + " (" + result[i] + ")");
            }
        }
        
        if (pass == num_student) {
            System.out.println("All student passed  the Exam.");
        } else System.out.println( pass + "out of " + num_student + " student passed the Exam.");
        
        System.out.println("Number of Male students : " + male);
        System.out.println("Number of Female students : " + female);

        double pass_rate = pass*100/num_student;
        System.out.println("Passed Rate : " + pass_rate + "%");
        System.out.println("All student of total marks : " + total_total);

        float avg = total_total/(num_student*num_subject);
        System.out.println("Average Marks(All subject) : " + avg);
        System.out.println(highest_mark_name + " got highest marks with " + max);
        
        for (int n = 0; n< num_subject; n++) {
            avg_marks [n] = total_marks[n]/num_student;
            System.out.println("Average " + subject_name[n] + " : " + avg_marks[n]);
        }
        
        // table title
        System.out.print("Name\tGender\t");
        for ( int m=0; m<num_subject; m++){
                System.out.print(subject_name[m]+"\t");
            }
            System.out.println("Total\tPassed/Failed");

        //table elements
        for (int p = 0; p < num_student; p++){
            System.out.print( student_name[p] + "\t" );
            System.out.print( student_gender[p] + "\t" );
            for (int q =0; q < num_subject; q++ ){
                System.out.print( marks[p][q] + "\t" );
            }
            System.out.print( total[p] + "\t" );
            System.out.println( result[p] );
        }
    }
}