# Eh necessário rodar esse comando antes de executar: chmod +x demo.sh

cd src
javac Principal.java 
java Principal
find . -type f -name "*.class" -delete
