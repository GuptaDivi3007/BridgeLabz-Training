using System.Collections.Generic;

public class EngagementService
{
    public void RegisterCreator(CreatorStats record)
    {
        CreatorStats.EngagementBoard.Add(record);
    }

    public Dictionary<string, int> GetTopPostCounts(double likeThreshold)
    {
        Dictionary<string, int> result = new Dictionary<string, int>();

        foreach (var creator in CreatorStats.EngagementBoard)
        {
            int count = 0;
            foreach (var likes in creator.WeeklyLikes)
            {
                if (likes >= likeThreshold)
                {
                    count++;
                }
            }

            if (count > 0)
            {
                result[creator.CreatorName] = count;
            }
        }

        return result;
    }

    public double CalculateAverageLikes()
    {
        double totalLikes = 0;
        int totalWeeks = 0;

        foreach (var creator in CreatorStats.EngagementBoard)
        {
            foreach (var likes in creator.WeeklyLikes)
            {
                totalLikes += likes;
                totalWeeks++;
            }
        }

        if (totalWeeks == 0)
        {
            return 0;
        }

        return totalLikes / totalWeeks;
    }
}
