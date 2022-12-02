mother(X,Y) :- parent(X,Y), female(X).
father(X,Y) :- parent(X,Y), male(X).
sister(X,Y) :- parent(Z,X), parent(Z,Y), female(X), X \= Y.
grandson(X,Y) :- parent(Z,X), parent(Y,Z).
  
  
female(avohm).
female(avohp).
female(mamae).
female(titia).
male(avowm).
male(avowp).
male(papai).
parent(avohm,mamae).
parent(avohm,titia).
parent(avowm,mamae).
parent(avowm,titia).
parent(avohp,papai).
parent(avowp,papai).
parent(mamae,filhote).
parent(papai,filhote).
mother(avohm,mamae).
father(avowm,mamae).
mother(avohp,papai).
father(avowp,papai).
mother(mamae,filhote).
father(papai,filhote).
