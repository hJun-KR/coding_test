using System;

class Program {
    static void Main() {
        int n = int.Parse(Console.ReadLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = int.Parse(Console.ReadLine());
            total += a;
        }

        Console.WriteLine(total);
    }
}