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
                
        
        retWithDiag = np.zeros((len(cont), 3))
        
        #TO DO sort
        n= len(cont)
        print("Number of points : ", n)
        
        stepsize =float(cont[1][1])
        for i in range(len(cont)):
            for j in range(2):
                retWithDiag[i][j] = float(cont[i][j])/stepsize
            retWithDiag[i][2] = float(cont[i][2])
        
        numBins = max(max(retWithDiag[:,0]),max(retWithDiag[:,1]))
        
        print("numBins ",numBins)
        ret = np.zeros((int(len(cont)-numBins+1), 3))

        nextIn = 0
        for i in range(len(cont)):
            if retWithDiag[i][0] != retWithDiag[i][1]:
                ret[nextIn][:] = retWithDiag[i][:]
                nextIn += 1
                
        ret = ret[ret[:,0].argsort()]
        
        return ret
  
