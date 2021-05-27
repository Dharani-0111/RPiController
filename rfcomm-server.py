
import os
import glob
import time
import RPi.GPIO as GPIO
from bluetooth import *
GPIO.setwarnings(False)
os.system('modprobe w1-gpio')






server_sock=BluetoothSocket( RFCOMM )
server_sock.bind(("",PORT_ANY))
server_sock.listen(1)

port = server_sock.getsockname()[1]

uuid = "94f39d29-7d6d-437d-973b-fba39e49d4ee"
stt = ""
noo =""
val =""
advertise_service ( server_sock, "AquaPiServer",
                   service_id = uuid,
                   service_classes = [ uuid, SERIAL_PORT_CLASS ],
                   profiles = [ SERIAL_PORT_PROFILE ],
                   )
print "Waiting for connection on RFCOMM channel %d" % port

client_sock, client_info = server_sock.accept()
print "Established To MAC ", client_info
while True:          
	

	try:
	        data = client_sock.recv(1024)
        	if len(data) == 0: break
                print "received [%s]" % data
                stt=data[-3:]
                noo=data[:2]
                
		if stt == 'onn':
                        GPIO.setmode(GPIO.BCM)
                        GPIO.setup(int(noo), GPIO.OUT)
			GPIO.output(int(noo),False)
			data = 'GPIO on!'
		elif stt == 'off':
			GPIO.output(int(noo),True)
			data = 'GPIO off!'
		elif stt == 'red':
                        GPIO.setmode(GPIO.BCM)
                        GPIO.setup(int(noo), GPIO.IN)
                        val=str(GPIO.input(int(noo)))
			client_sock.send(val)
			print val
		elif stt =="bkr":
                        print "disconnected"
                        client_sock.close()
                        server_sock.close()
                        print "Connection Terminated"
                        break
		        

	except IOError:
		pass

	except KeyboardInterrupt:

		print "disconnected"

		client_sock.close()
		server_sock.close()
		print "Connection Terminated"

		break
