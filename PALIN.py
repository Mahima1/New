from sys import stdin, stdout
import sys
t=stdin.readline()
#t =str(t)
#if not (isinstance(t,int)):
    #sys.exit('')
'''
try:
    t=int(t)
    print("going thru")
except ValueError:
    sys.exit('errororororororo')
'''
olist=list()
mlist=list()


def allNine(line, length):
    for k in range(0, length):
        if int(line[k]) != 9:
            return False
    return True



def main():
    olist = stdin.readlines()
    olist=[w.replace('\n','') for w in olist]
    #print (olist)
    for line in olist:
        length = len(line)
        mid = int(length / 2)


        if(length==0):
            line=''
            mlist.append('')
        elif (allNine(line, length)):
            line = int(line) + 2
            line = str(line)
            mlist.append(line)
        elif (length == 1 and int(line) != 9):
            line = int(line)
            line += 1
            line = str(line)
            mlist.append(line)

        elif (length % 2 == 0):
            fhalf = line[:mid]
            temp = fhalf[::-1]
            shalf = line[mid:]
            #print ("even length:\nfhalf: {}  shalf is: {}".format(fhalf, shalf))
            if (int(shalf) < int(fhalf)):
                line = fhalf + temp
                mlist.append(line)

            if (int(shalf) >= int(fhalf)):
                popy = int(fhalf[::-1])
                if (popy > int(shalf)):
                    line = fhalf + str(popy)
                    mlist.append(line)
                else:
                    r = int(fhalf)
                    r += 1
                    fhalf = str(r)
                    temp = fhalf[::-1]
                    line = fhalf + temp
                    mlist.append(line)

        elif (length % 2 != 0 and length != 1):
            fhalf = line[:mid]
            shalf = line[mid + 1:]
            #print ("odd length:\nfhalf: {} shalf is: {}".format(fhalf,shalf))
            if (int(shalf) == int(fhalf)):
                r = int(line[mid])
                r += 1
                r = str(r)
                line = fhalf + r + shalf
                mlist.append(line)
            if (int(shalf) > int(fhalf)):

                popy = int(fhalf[::-1])

                if (popy > int(shalf)):
                    line = line[:mid + 1] + str(popy)
                    mlist.append(line)
                else:
                    r = int(fhalf)
                    r += 1
                    fhalf = str(r)
                    temp = fhalf[::-1]
                    r = (line[mid:mid + 1])
                    line = fhalf + r + temp
                    mlist.append(line)
            if (int(shalf) < int(fhalf)):
                temp = fhalf[::-1]
                temp = fhalf[::-1]
                r = (line[mid:mid + 1])
                line = fhalf + r + temp
                mlist.append(line)
        #stdout.write(line)
        #stdout.write('\n')

    for elem in mlist:
        stdout.write(elem)
        stdout.write('\n')

if __name__ == "__main__":
    main()






