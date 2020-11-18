import csv
import numpy as np

class loadFile:
    def __init__(self, file=""):
        ''' Constructor for this class. '''
        self.inFile = file
    
    def loadFileFunc(inFile):
        with open(inFile, 'r') as f:
            reader = csv.reader(f,delimiter='\t')
            cont = []
            for row in reader:
                cont.append(row)
            lenOfRow = len(row)
            if lenOfRow == 3:
                print("this is a sparse matrix")
            else:
                print("ERROR square mat not yet implemented")
                
        ret = np.zeros((len(cont), 3))
        #TO DO sort
        n= len(cont)
        print("Number of points : ", n)
        
        stepsize =float(cont[1][1])
        for i in range(len(cont)):
            for j in range(2):
                ret[i][j] = float(cont[i][j])/stepsize
            ret[i][2] = float(cont[i][2])

        return ret
  
