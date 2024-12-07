#!/bin/bash
java_pid=$(ps aux | grep it.daniele.transfermarket.TransfermarketApplication | grep spring | awk '!/awk/ {print $2}')

if [ -z "$java_pid" ]; then
    echo "Nessun processo Java trovato con il nome: $process_name"
else
    echo "Terminazione del processo Java con PID: $java_pid"
    kill -9 "$java_pid"
fi


nohup mvn clean spring-boot:run &
tail -f nohup.out

