package main

import (
	"fmt"
)

func main() {
	var N, M int64
	fmt.Scanf("%d %d", &N, &M)

	if N < M {
		fmt.Println(M - N)
	} else {
		fmt.Println(N - M)
	}
}