#Numerical Stability
a = 1000000000
for i in xrange(1000000):
    a = a + 1e-6
print a - 1000000000

#when doing numerical computation have to worry about calculating values that are too large or too small
#adding values that are very small compared to values that are very large can create many errors

#code gives .95
#math gives 1.0

