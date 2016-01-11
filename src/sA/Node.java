package sA;

import java.util.ArrayList;

public class Node {

	private String content;
	private ArrayList<Node> neighbors; //neighbor means here actually a node that is pointed to by this node
	public static int numberOfEdges = 0;
	
	public Node(String content, ArrayList<Node> neighbors) {
		this.content = content;
		this.neighbors = neighbors;	
	}
	
	public Node(String content) {
		this.content = content;
		this.neighbors = new ArrayList<Node>(); 
	}
		
	public void addNeighbor(Node n){
		neighbors.add(n);
		numberOfEdges++;
	}
	
	public ArrayList<Node> getNeighbors(){
		return neighbors;
	}
	
	public String getContent(){
		return content;
	}
	
	public static int getNumberOfEdges(){
		return numberOfEdges;
	}
	
	public String toString(){
		return getContent();
	}
	
}

