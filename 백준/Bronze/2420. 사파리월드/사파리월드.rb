N, M = gets.split.map(&:to_i)

if N < M
  puts M - N
else
  puts N - M
end