#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

#------------------------------------------------------------
# CREATE USER and ALL PRIVILEGES ON gift_me_five
#------------------------------------------------------------

CREATE USER 'greg'@'localhost' IDENTIFIED BY 'Greg.321';
use gift_me_five;
GRANT ALL PRIVILEGES ON gift_me_five.* TO 'greg'@'localhost';
FLUSH PRIVILEGES;