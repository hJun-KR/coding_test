Module Module1
    Sub Main()
        Dim N, M As Long
        Dim input() As String = Console.ReadLine().Split(" "c)
        N = Convert.ToInt64(input(0))
        M = Convert.ToInt64(input(1))

        If N < M Then
            Console.WriteLine(M - N)
        Else
            Console.WriteLine(N - M)
        End If
    End Sub
End Module