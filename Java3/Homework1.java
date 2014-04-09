package Java3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1 {
	public static void main(String[] args){
		int i;
		String robot = null, player = null; 
		
		while (true) {
			System.out
					.println("Please enter one: Scissors, Paper, Rock, Lizard, or Spock");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			try {
				player = br.readLine();
			} catch (IOException e) {
				System.out.println("Input error:" + e.getMessage());
			}
			i = (int) (Math.random() * 5);
			switch (i) {
			case 0:
				robot = "scissors";
				break;
			case 1:
				robot = "paper";
				break;
			case 2:
				robot = "rock";
				break;
			case 3:
				robot = "lizard";
				break;
			case 4:
				robot = "spock";
				break;
			default:
				break;
			}
			if (player.equalsIgnoreCase("scissors")) {
				if (i == 1 || i == 3) {
					System.out.println(player + " beats " + robot + ", you win!");
				} else if (i == 2 || i == 4) {
					System.out
							.println(robot + " beats " + player + ", you lose!");
				} else
					System.out.println(player + " vs " + robot + ", tie!");
			} else if (player.equalsIgnoreCase("paper")) {
				if (i == 2 || i == 4) {
					System.out.println(player + " beats " + robot + ", you win!");
				} else if (i == 0 || i == 3) {
					System.out
							.println(robot + " beats " + player + ", you lose!");
				} else
					System.out.println(player + " vs " + robot + ", tie!");
			} else if (player.equalsIgnoreCase("rock")) {
				if (i == 0 || i == 3) {
					System.out.println(player + " beats " + robot + ", you win!");
				} else if (i == 1 || i == 4) {
					System.out
							.println(robot + " beats " + player + ", you lose!");
				} else
					System.out.println(player + " vs " + robot + ", tie!");
			} else if (player.equalsIgnoreCase("lizard")) {
				if (i == 1 || i == 4) {
					System.out.println(player + " beats " + robot + ", you win!");
				} else if (i == 2 || i == 0) {
					System.out
							.println(robot + " beats " + player + ", you lose!");
				} else
					System.out.println(player + " vs " + robot + ", tie!");
			} else if (player.equalsIgnoreCase("spock")) {
				if (i == 0 || i == 2) {
					System.out.println(player + " beats " + robot + ", you win!");
				} else if (i == 1 || i == 3) {
					System.out
							.println(robot + " beats " + player + ", you lose!");
				} else
					System.out.println(player + " vs " + robot + ", tie!");
			}
		}
		 
	}

}
