Scanner in = new Scanner(System.in);
Random random = new Random();
int guess;
int number = random.nextInt(100) + 1;
do {
    System.out.print("What's your guess? ");
    guess = in.nextInt();
} while(guess != number);
System.out.println("You got it! The number was " + number + ".");