Module Program
    Sub Main()
        Dim n As Integer = Integer.Parse(Console.ReadLine())
        Dim total As Integer = 0
        
        For i As Integer = 0 To n - 1
            Dim a As Integer = Integer.Parse(Console.ReadLine())
            total += a
        Next
        
        Console.WriteLine(total)
    End Sub
End Module