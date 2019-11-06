use gift_me_five;

#------------------------------------------------------------
# Table: user
#-----------------------------------------------------------
INSERT INTO user (username,password,email)VALUES ( "Simone31","simonepassword","simonedejean@gmail.com");

#------------------------------------------------------------
# Table: list
#------------------------------------------------------------

INSERT INTO list(list_name,description,url_image,url_share,id_user) VALUES ("Noel", "Mes cadeaux de reve", "http://via.placeholder.com/540x260","",(select id_user from user where username = 'Simone31') );
INSERT INTO list (list_name,description,url_image,url_share,id_user) VALUES ("Anniversaire", "Mes super cadeaux pour mon Aniv", "http://via.placeholder.com/540x260","",(select id_user from user where username = 'Simone31'));

#------------------------------------------------------------
# Table: gift list 1
#------
INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( "Play-Doh Pate A Modeler Pizzeria, E4576EU4, Multicolour",
"TOUTES SORTES DE PIZZAS À IMAGINER : Les petits chefs s'amusent à concocter une création après l'autre avec cet ensemble à pizza Play-Doh pour les enfants à partir de 3 ans. Idéal pour un cadeau ou pour toute activité créative",
15.18,3,
"https://images-na.ssl-images-amazon.com/images/I/71zl2mb6F5L._SL1021_.jpg",
"https://www.amazon.fr/Play-Doh-Stamp-Pizza-E4576EU4-Multicolour/dp/B07KQRB2N8/ref=sr_1_1?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572959896&refinements=p_n_age_range%3A304554031&s=toys&sr=1-1",
(select id_list from list where id_list = 1),null);


INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( "Barbie Dreamtopia ",
"Barbie Dreamtopia poupée sirène lumière et danse aquatique à plonger dans l'eau, avec mouvements de nageoire, jouet pour enfant, GFL82",
19.80,3,
"https://images-na.ssl-images-amazon.com/images/I/71xmRrC5cAL._SL1500_.jpg",
"https://www.amazon.fr/Barbie-Dreamtopia-aquatique-mouvements-GFL82/dp/B07GL9RGQK/ref=sr_1_4?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572962426&refinements=p_n_age_range%3A304554031&s=toys&sr=1-4",
(select id_list from list where id_list = 1),null);


INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( "Barbie Dreamtopia ",
"Barbie Dreamtopia poupée sirène lumière et danse aquatique à plonger dans l'eau, avec mouvements de nageoire, jouet pour enfant, GFL82",
19.80,3,
"https://images-na.ssl-images-amazon.com/images/I/71xmRrC5cAL._SL1500_.jpg",
"https://www.amazon.fr/Barbie-Dreamtopia-aquatique-mouvements-GFL82/dp/B07GL9RGQK/ref=sr_1_4?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572962426&refinements=p_n_age_range%3A304554031&s=toys&sr=1-4",
(select id_list from list where id_list = 1),null);

#------------------------------------------------------------
# Table: gift list 2
#------

INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( 
"Dujardin Jeux - Burger Quiz",
"Pour jouer, il vous faut : - Des gens (Vous, Famille, Amis ou d'autres Gens que vous ne connaissez pas ça marche aussi). - Cette Boite de Jeu. ET C'EST TOUT !",
18.90,3,
"https://images-na.ssl-images-amazon.com/images/I/71uty%2BS6S8L._SL1002_.jpg",
"https://www.amazon.fr/Dujardin-Jeux-soci%C3%A9t%C3%A9-Burger-01095/dp/B07DHYJ7V6/ref=sr_1_2?pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=e188f974-9f87-4e73-941c-63ec850d480b&pf_rd_r=CN0HBVD651B3Y1QVC1YX&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572963107&refinements=p_n_age_range%3A304558031&s=toys&sr=1-2",
(select id_list from list where id_list = 2),null);

INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( 
"Goliath - Shit Happens - Jeu d'ambiance",
"Comme on dit, dans la vie « Shit Happens ",
14.90,3,
"https://images-na.ssl-images-amazon.com/images/I/61ubiWlYOSL._SL1500_.jpg",
"https://www.amazon.fr/Goliath-Jeu-Cartes-Shit-Happens/dp/B06XDLXJDX/ref=sxbs_sxwds-stvp?pd_rd_i=B06XDLXJDX&pd_rd_r=b367b440-7679-41c2-b3ea-7599c510e54c&pd_rd_w=nZykg&pd_rd_wg=q45kr&pf_rd_i=14312518031&pf_rd_m=A1X6FK5RDHNB96&pf_rd_p=b5ee69d3-6381-4897-8a23-e5b0b965bfb9&pf_rd_r=SGRNTY8M7TG301CVNXEY&pf_rd_s=merchandised-search-8&pf_rd_t=101&qid=1572963248&refinements=p_n_age_range%3A304558031&s=toys",
(select id_list from list where id_list = 2),null);

INSERT INTO gift (gift_name,description,price,preference,url_image,url_website,id_list,id_friend) VALUES ( 
"Homcom Moto électrique",
"MOTO ÉLECTRIQUE ENFANTS : Moto électrique chopper de police pour enfants à partir de 3 ans",
66.8,3,
"https://images-na.ssl-images-amazon.com/images/I/61ubiWlYOSL._SL1500_.jpg",
"https://www.amazon.fr/Homcom-%C3%A9lectrique-Enfants-Chopper-Lumineux/dp/B07ZJCK4TJ?ref_=Oct_NReleaseC_363713031_4&pf_rd_r=NYJYS7ZSETC4ZDD7YKEM&pf_rd_p=84f357c6-80b8-5ec2-a7ac-733fb674cc4c&pf_rd_s=merchandised-search-10&pf_rd_t=101&pf_rd_i=363713031&pf_rd_m=A1X6FK5RDHNB96",
(select id_list from list where id_list = 2),null);