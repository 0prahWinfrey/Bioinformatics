# 3DFlies
## Running Python
This code is run by using  python3 threedflies.py <input_data> 

this file is found in src/main/python

The configuration file is found in src/main/python under the name settings.yaml


You can install the dependencies yourself using either pip/conda or you can run the bash script in setup

## Building java WORK IN PROGRESS 
Requires : maven java

mvn install:install-file -Dfile=resources/jswarm-pso_2_08.jar -DgroupId=net.sourceforge -DartifactId=jswarm_pso -Dversion=1.0 -Dpackaging=jar

mvn clean install

Jar is in target
