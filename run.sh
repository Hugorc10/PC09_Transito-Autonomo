# Eh necessário rodar esse comando antes de executar: chmod +x demo.sh

cd src
javac Principal.java 
java Principal
find src -type f -name "*.class" -delete
