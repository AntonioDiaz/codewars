package com.kata7

import javax.naming.OperationNotSupportedException

//https://www.codewars.com/kata/going-to-the-cinema


fun movie(card:Int, ticket:Int, perc:Double):Int {
    var tickets = 0
    var priceTicketB = ticket.toDouble()
    var systemA = 0.0
    var systemB = card.toDouble()
    do {
        priceTicketB *= perc
        systemA += ticket
        systemB += priceTicketB
        tickets++
    } while (systemA<=Math.ceil(systemB))
    return tickets
}