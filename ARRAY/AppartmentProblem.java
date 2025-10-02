package ARRAY;

import java.util.Arrays;

public class AppartmentProblem {
    public static int assignAppartment(int n,int m,int k,int[] applicants,int[] apartments){
        Arrays.sort(applicants); //45,60,60,80
        Arrays.sort(apartments); // 30,60,75

        int assigned=0;
        int appartIndex=0;
        for(int applicant: applicants){
            while(appartIndex<m && apartments[appartIndex] <applicant-k) {
                appartIndex++;
            }
            if(appartIndex<m && apartments[appartIndex]<applicant+k){
                assigned++;
                appartIndex++;
            }
        }
        return assigned;
    }
    public static void main(String[] args) {
        int n=4; // number of aplicants
        int m=3; //number of apartments
        int k=5; //max allowed difference

        int[] applicants= {60,45,80,60};
        int[] apartments={30,60,75};
        System.out.print("the number of applicants who will get an apartment : ");
        System.out.println(assignAppartment(n, m, k, applicants, apartments));
    }
}
