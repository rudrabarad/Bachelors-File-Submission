/* ID - 18DCS007 */
/* NAME - RUDRA BARAD */

writeall([]).
writeall([P|Q]):- write(P),nl,writeall(Q).
