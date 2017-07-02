//solved

import java.io.*;
import java.util.Scanner;

public class Compiler_Version
{
    public static void main(String[] args) throws IOException
    {
        try{
            Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			do{
			
				for(int i=0;i<str.length()-1;i++ ) {
					
					if( str.charAt(i)=='/' && str.charAt(i+1)=='/' ) break;
					
					if( str.charAt(i)=='-' && str.charAt(i+1)=='>' ) {
						char[] strChr = str.toCharArray();
						char[] strChrNew = new char[strChr.length-1];
						for(int j=0,k=0;j<strChrNew.length;j++,k++) {
							if(j!=i) {
								strChrNew[j]=strChr[k];
							}
							else {
								strChrNew[j]='.';
								k++;
							}
						}
						str=String.valueOf(strChrNew);
					}
					
				}
				System.out.println(str);
				str = sc.nextLine();
			}while( !str.isEmpty() ); 
            
            
        	}
		catch(Exception e){
            return;
        }
    }
}