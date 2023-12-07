alphabet = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's', 'z=']
string = input()

for a in alphabet:
    string = string.replace(a, '*')

string = string.replace('=', '')
print(len(string))
