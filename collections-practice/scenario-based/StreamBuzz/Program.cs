using System;
using System.Collections.Generic;

public class Program
{
    public static void Main(string[] args)
    {
        EngagementService service = new EngagementService();

        while (true)
        {
            Console.WriteLine("1. Register Creator");
            Console.WriteLine("2. Show Top Posts");
            Console.WriteLine("3. Calculate Average Likes");
            Console.WriteLine("4. Exit");

            int choice = int.Parse(Console.ReadLine());

            if (choice == 1)
            {
                CreatorStats creator = new CreatorStats();
                creator.WeeklyLikes = new double[4];

                Console.WriteLine("Enter Creator Name:");
                creator.CreatorName = Console.ReadLine();

                for (int i = 0; i < 4; i++)
                {
                    creator.WeeklyLikes[i] = double.Parse(Console.ReadLine());
                }

                service.RegisterCreator(creator);
            }
            else if (choice == 2)
            {
                double threshold = double.Parse(Console.ReadLine());
                Dictionary<string, int> result = service.GetTopPostCounts(threshold);

                foreach (var entry in result)
                {
                    Console.WriteLine(entry.Key + " " + entry.Value);
                }
            }
            else if (choice == 3)
            {
                Console.WriteLine(service.CalculateAverageLikes());
            }
            else if (choice == 4)
            {
                break;
            }
        }
    }
}
