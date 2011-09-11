package pairmatrix.functionaltests.pages

import geb.Page


class ShowPersonPage extends Page {
    static at = {$("title").text() == "ShowPersonPage"}
    static url = "PairMatrix/person/show"
    static content = {
        SizeOfPersonTable {$("#person-list tbody tr:not(:first-child)").size()}
    }
}