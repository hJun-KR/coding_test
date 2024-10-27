package main

import "fmt"

func main() {
    var n, total, a int
    fmt.Scan(&n)
    
    for i := 0; i < n; i++ {
        fmt.Scan(&a)
        total += a
    }
    
    fmt.Println(total)
}