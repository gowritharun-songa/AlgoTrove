class Main:
  def myAtio(self, str):
    sign, i = 1, 0
    res = 0
    # Leading white space
    while(i < len(str) and str[i] == ' '):
      i += 1
    # Determing the sign
    if(str[i] == '-'):
      sign = -1
      i += 1
    elif str[i] == '+':
      i += 1
    #Comuting the result
    while(i < len(str) and str[i].isdigit()):
      res = res * 10 + (ord(str[i]) - ord('0'))
      if sign * res > 2**31 - 1:
        return 2**31 - 1
      if sign * res < -2**31:
        return -2**31
      i += 1
    return sign * res

if __name__ == "__main__":
  main = Main()
  str = "1337c0d3"
  result = main.myAtio(str)
  print(result)