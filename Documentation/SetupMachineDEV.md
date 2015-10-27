# Setup Machine: DEV

## Main Setup

- Open the /MachineSetup/DEV directory in a terminal window
- Run command: chmod 755 Setup.Main (only needed once)
- Run command: ./Setup.Main


## Manual Installations

- Install Eclipse @ https://www.eclipse.org/downloads/
- Install GitEye @ http://www.collab.net/products/giteye
- Connect to the johesmil/PSOS repository at GitHub and fetch files. Put in ~/git/PSOS directory

### Apache2

- Run command: sudo cp -R ~/git/PSOS/MachineSetup/DEV/000-default.conf /etc/apache2/sites-available
- Run command: sudo service apache2 restart
- Open localhost in browser and verify it works.

### Apache Tomcat
*Requires Java (7) to be installed*

#### Sources
http://www.liquidweb.com/kb/how-to-install-apache-tomcat-8-on-ubuntu-14-04/
http://www.krizna.com/ubuntu/install-tomcat-7-ubuntu-14-04/
https://www.digitalocean.com/community/tutorials/how-to-install-apache-tomcat-8-on-ubuntu-14-04


#### Install and setup Tomcat

- Run command: wget http://apache.mirrors.spacedump.net/tomcat/tomcat-8/v8.0.28/bin/apache-tomcat-8.0.28.tar.gz
- Run command: tar xvzf apache-tomcat-8.0.28.tar.gz
- Run command: sudo mv apache-tomcat-8.0.28 /opt/tomcat
- Run command: gedit ~/.bashrc
- Paste the following at the end of the file:

export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64  
export CATALINA_HOME=/opt/tomcat  

- Run command: $CATALINA_HOME/bin/startup.sh
- Verify that Tomcat is started by opening localhost:8080 in browser


#### Setup permissions
*These steps will create group and user called tomcat, and set their permissions to run the service.*

**Current user permissions (I think)**
- Run command: `sudo chmod 755 /etc/init.d/tomcat8028`

**Tomcat permissions**
- Run command: sudo groupadd tomcat
- Run command: sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
- Open /opt/tomcat/conf/tomcat-users.xml and add the following lines to the <tomcat-users> element, <password> replaced with the correct password:

<role rolename="manager-gui"/>
<role rolename="admin-gui"/>
<user username="tomcat" password="<password>" roles="manager-gui,admin-gui"/>

- Run command: cd /opt/tomcat
- Run command: sudo chgrp -R tomcat conf
- Run command: sudo chmod g+rwx conf
- Run command: sudo chmod g+r conf/*
- Run command: sudo mkdir -p /opt/tomcat/{work, temp. logs}
- Run command: sudo chown -R tomcat work/ temp/ logs/

#### Create service
- Run command: sudo cp -R ~/git/PSOS/MachineSetup/DEV/tomcat8028 /etc/init.d
- Run command: sudo /etc/init.d/tomcat8028 start
- Run command: sudo update-rc.d tomcat8028 defaults


