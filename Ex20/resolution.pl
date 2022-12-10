resolution([p,q,r],[p,x,y]).
/* 

p :- q, r.
p :- x, y.

MGU = []
nova lista = [q,r,x,y]

*/

resolution([p(a)],[p(X)]).
/* 

p(a).
p(X).

MGU = [X -> a]
nova lista = []

*/

resolution([p(X,b),q(X)],[p(a,Y),r(Y)]).
/* 

p(X,b) :- q(x).
p(a,Y) :- r(Y).

MGU = [X -> a, Y -> b]
nova lista = [q(a), r(b)]

*/

resolution([append([],B,B)],[append(X,Y,[1,2])]).
/* 

append([],B,B).
append(X,Y,[1,2]).

MGU = [X -> [], Y -> [1,2], B -> [1,2]}]
nova lista = []

*/