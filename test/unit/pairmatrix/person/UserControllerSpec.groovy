package pairmatrix.person

import grails.plugin.spock.ControllerSpec

import pairmatrix.Person

class UserControllerSpec extends ControllerSpec {
    def "should show all persons"() {
        given:
        def personOne = new Person(personId: "1001", name: "FengQian")
        def personTwo = new Person(personId: "1002", name: "XieJia")
        def personList = [personOne, personTwo]
        mockDomain(Person, personList)

        when:
        def persons = controller.show()

        then:
        persons["personList"].contains(personOne)
        persons["personList"].contains(personTwo)
    }
}
