# Setup Machine: DEV

## Initial Setup

- Open the /MachineSetup/DEV directory in a terminal window
- Run command: chmod 755 Setup.Main (only needed once)
- Run command: ./Setup.Main


## Manual Installations

- Install GitEye @ http://www.collab.net/products/giteye
- Install Eclipse @ https://www.eclipse.org/downloads/
- Connect to the johesmil/PSOS repository at GitHub and fetch files. Put in /home/johannes/git/PSOS directory

## Configurations

### Apache2

- Run command: sudo cp -R /home/git/PSOS/MachineSetup/DEV/000-default.conf /etc/apache2/sites-available
- Run command: sudo service apache2 restart
- Open 127.0.0.1 or localhost in browser and verify it works.



