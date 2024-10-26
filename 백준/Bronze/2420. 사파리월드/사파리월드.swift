import Foundation

if let input = readLine() {
    let numbers = input.split(separator: " ").map { Int($0)! }
    let N = numbers[0]
    let M = numbers[1]
    
    if N < M {
        print(M - N)
    } else {
        print(N - M)
    }
}