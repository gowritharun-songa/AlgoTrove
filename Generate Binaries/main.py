class Solution:
  def __init__(self, num):
    self.num = num

  def generateBinaries(self):
    res = []
    curr = ""
    self.backtrack(self.num, curr, res)
    return res

  def backtrack(self, n, curr, res):
    if n == len(curr):
      res.append(curr)
      return
    self.backtrack(n, curr + "0", res)
    if(len(curr) == 0 or curr[len(curr) - 1] != '1'):
      self.backtrack(n, curr + "1", res)
    
    

class Main:
  n = 3
  obj = Solution(n)
  res = obj.generateBinaries()

if __name__ == "__main__":
  main = Main()
  res = main.res
  print(res)