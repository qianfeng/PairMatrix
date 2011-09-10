package pairmatrix.functionaltests.pages

import geb.Page


class HomePage extends Page {
    static at = { $("title").text() == "PairMatrix" }
    static url = "PairMatrix"
    static content = {
        ShowPersonLink {$("a", name: "showPersonList")}
    }
}
