package com.weekend.assignment;

public class SumOfCharacters {

		static int findTheSum(String alpha)
		{
			int score = 0;
			for(int i=0;i<alpha.length();i++)
			{
				if(alpha.charAt(i)>='A'&&alpha.charAt(i)<='Z')
					score+=alpha.charAt(i)-'A'+1;
				else
					score+=alpha.charAt(i)-'a'+1;
			}
			return score;
		}
		public static void main(String[] args) {
			String S = "abc";
			System.out.println(findTheSum(S));

			
			}


	}


