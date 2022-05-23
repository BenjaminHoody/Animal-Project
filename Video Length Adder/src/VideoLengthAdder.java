import java.util.Scanner;
public class VideoLengthAdder
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many hours is your first video?");
				int video1Hours = userInput.nextInt();
				System.out.println("How many minutes is your first video?");
				int video1Mins = userInput.nextInt();
				System.out.println("How many seconds is your first video?");
				int video1Seconds = userInput.nextInt();
				System.out.println("How many hours is your second video?");
				int video2Hours = userInput.nextInt();
				System.out.println("How many minutes is your second video?");
				int video2Mins = userInput.nextInt();
				System.out.println("How many seconds is your second video?");
				int video2Seconds = userInput.nextInt();
				
				int video3Hours = (video1Hours + video2Hours);
				int video3Mins = (video1Mins + video2Mins) % 60;
				int video3Seconds = (video1Seconds + video2Seconds) % 60;
				
				if(video1Seconds + video2Seconds >=60)
					{
						video3Mins++;
					}
					
				if(video1Mins + video2Mins >= 60 || video3Mins >= 60 )
					{
						video3Hours++;
						video3Mins = video3Mins - 60;
						
						if(video3Mins<0)
							{
								video3Mins = video3Mins + 60;
							}		
					}
				System.out.println("After adding your videos together your new video is " + video3Hours + ":" + video3Mins + ":" +  video3Seconds);
			}
	}
