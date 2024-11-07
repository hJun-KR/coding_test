import Foundation
var nums = readLine()!.split(separator: " ").map {Double($0)!}
var result = nums[0]

for i in 1..<nums.count { result/=nums[i] }

print(result)