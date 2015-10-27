# Common server terminal commands

## General

**Open browser as admin**  
`gksu nautilus`

**Open gedit as admin**  
`gksu gedit`

**Update installer**  
`sudo apt-get update`

**Install application**  
`sudo apt-get install <application>`

*Example: `sudo apt-get install bum`*

**Create file as admin**  
`sudo touch <path to file to create, including extension>`

*Example: `sudo touch /Documents/myNewFile.txt`*

**Copy file as admin**  
`sudo cp -R <path to file to copy> <copy to destination>`

**Create directory in root**  
`sudo mkdir /<new dir>`

*Example: `sudo mkdir /opt/tomcat`*

*Example 2, multiple directories: `sudo mkdir -p /opt/tomcat/{work,temp,logs}`*

**View running services (needs to have bum installed)**  
`sudo bum`


## Apache2


## Apache Tomcat
*tomcat8028 refers to name of the service file used in this installation, and could be changed to anything*

**Start service**  
`sudo /etc/init.d/tomcat8028 start`

**Restart service**  
`sudo /etc/init.d/tomcat8028 restart`

**Stop service**  
`sudo /etc/init.d/tomcat8028 stop`
