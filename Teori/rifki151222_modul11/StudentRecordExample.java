/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifki151222_modul11;

/**
 *
 * @author mhdri
 */
public class StudentRecordExample {
   public static void main( String[] args ){ 
//membuat 3 object StudentRecord 
StudentRecord annaRecord = new StudentRecord();
StudentRecord aliRecord = new StudentRecord("Ali","Bukittinggi");

//Memberi nama siswa 
annaRecord.setName("Anna"); 
annaRecord.setAddress("Padang"); 
annaRecord.setAge(25); 
annaRecord.setMathGrade(70); 
annaRecord.setEnglishGrade(80);
annaRecord.setScienceGrade(80);

//Menampilkan nama siswa “Anna” 
System.out.println("Nama :"+annaRecord.getName() ); 
System.out.println("Umur :"+annaRecord.getAge () ); 
System.out.println("Matematika :"+annaRecord.getMathGrade() ); 
System.out.println("B.Inggris :"+annaRecord.getEnglishGrade() ); 
System.out.println("Pengetahuan :"+annaRecord.getScienceGrade() ); 
System.out.println("Rata-rata :"+annaRecord.getAverage() ); 

System.out.println(""); 

//Ali
aliRecord.print("");
aliRecord.print(90,80,70);

System.out.println(""); 

//Menampilkan jumlah siswa 
System.out.println("Jumlah siswa :"+StudentRecord.getStudentCount()
); 
} 
}