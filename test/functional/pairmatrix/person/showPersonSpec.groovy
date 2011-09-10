package pairmatrix.person

import pairmatrix.functionaltests.PairMatrixGebSpec
import pairmatrix.Person
import pairmatrix.functionaltests.pages.HomePage


class showPersonSpec extends PairMatrixGebSpec {

    def 'should show all persons when show person is clicked'() {
        given:
        new Person(personId: "1001", personName: "FengQian")
        to HomePage

        when:
        ShowPersonLink.click()

        then:
        at ShowPersonPage
        SizeOfPersonTable == 1
    }
}
