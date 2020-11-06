Operating System: Raspbian Jessie


Save the folder as /home/pi/Desktop/Program
add the following lines to ~/.bashrc


cd /home/pi/Desktop/Program
python main.py

for first time, authenticate NGROK with authtoken from website
.bat files are deprecated and replaced with the .py files
Connect Relay to GPIO BCM 17

Configure Google assistant via ifttt and other url applications by getting url from ngrok dashboard

<http url>/switchon
<http url>/switchoff

These are useage url.

Use VNC or SSH to remote troubleshoot.
_______________________________________________________________________
|_______________________________________________________________________|
First time setup instructions:

Enable VNC, SSH, GPIO interfaces from raspi-config.

Save the folder as /home/pi/Desktop/Program
In terminal type
cd /home/pi/Desktop/Program
ngrok authtoken <AUTHTOKEN> 		(Get authtoken from ngrok.com)

Add the following lines to ~/.bashrc at the end

cd /home/pi/Desktop/Program
python main.py
