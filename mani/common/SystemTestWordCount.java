package com.mani.common;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemTestWordCount {

	public static void main(String[] args) {
		
		List<ProductReview> commentsList = new ArrayList<ProductReview>();
		commentsList.add(new ProductReview("1","I love this moisturizer"));
		commentsList.add(new ProductReview("2","Best product that i have ever used"));
		commentsList.add(new ProductReview("3","It leaves a soft feeling"));
		commentsList.add(new ProductReview("4","Good Product"));
		commentsList.add(new ProductReview("5","I love this product"));
		commentsList.add(new ProductReview("6","Its a great cream"));
		
		calculate(commentsList);
	}
	
	public static void calculate(List<ProductReview> commentsList) {
		
		List<String> wordList = new ArrayList<String>();
		
		for(ProductReview pr: commentsList) {
			
			String[] splitWords = pr.getComment().split(" ");
			wordList.addAll(Arrays.asList(splitWords));
		}
		// All words  
		System.out.println("Total word list: "+wordList);
		
        Map<String,Integer> wordAndCountMap = new HashMap<String , Integer>(); 
		
		for(String s: wordList) {
			
			if(wordAndCountMap.containsKey(s.toUpperCase())) {
				//get the previous count and increment by 1
				wordAndCountMap.put(s.toUpperCase(), wordAndCountMap.get(s.toUpperCase())+1);
				
			}else {
				wordAndCountMap.put(s.toUpperCase(), 1);
			}
		}
		
		//Print the lease and most used words
		int high=0;
		String mostUsedWord="";
		int low=99999;
		String leastUsedWord="";
		
		for(Map.Entry<String, Integer> entry : wordAndCountMap.entrySet()) {
			
			if(entry.getValue()>high) {
				high=entry.getValue();
				mostUsedWord=entry.getKey();
			} if(entry.getValue()<low) {
				low=entry.getValue();
				leastUsedWord=entry.getKey();
			}
				
		}
		
		// Results:
		
		System.out.println("\n\n\na. Most Used words in comments : " + mostUsedWord +" "+high);
		System.out.println("b. Least Used words in comments : " + leastUsedWord +" "+low);
		System.out.println("c. Average number of words in a commnents : " + (wordList.size()/commentsList.size()));
		
		System.out.println("\n\n\nReference :" + wordAndCountMap);
		
	}

}

class ProductReview{
	private String commentNumber;
	private String comment;
	
	public ProductReview(String number,String comment) {
		this.commentNumber=number;
		this.comment=comment;
	}
	
	public String getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(String commentNumber) {
		this.commentNumber = commentNumber;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
