using System;

class Program
{
    static void Main()
    {
        string[] inputs = Console.ReadLine().Split(' ');
        long N = long.Parse(inputs[0]);
        long M = long.Parse(inputs[1]);

        if (N < M)
        {
            Console.WriteLine(M - N);
        }
        else
        {
            Console.WriteLine(N - M);
        }
    }
}