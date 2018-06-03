import os
import xml.etree.ElementTree as ET



def ngrams(input,n):
    input = input.split(' ')
    output = {}
    for i in range(len(input)-n+1):
        g = ' '.join(input[i:i+n])
        output.setdefault(g, 0)
        output[g] += 1
    return output


for root, dirs, files in os.walk("D:/doc/assignment/CS918 Natural Language Processing/Material/1.exercise one/art_Corpus/ART_Corpus"):    
    #although we have root and dirs variables - doing anything with them is optional.
    
    for file in files:
        if file.endswith(".xml"):
            tree = ET.parse(os.path.join(root,file))
            roots = tree.getroot()
            for sent in roots.iter("s"):
                print ("".join(sent.itertext()))
            