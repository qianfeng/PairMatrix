package pairmatrix.person

import pairmatrix.functionaltests.PairMatrixGebSpec
import pairmatrix.Person
import pairmatrix.functionaltests.pages.HomePage
import pairmatrix.functionaltests.pages.ShowPersonPage


class showPersonSpec extends PairMatrixGebSpec {

    def 'should show all persons when show person is clicked'() {
        setup:
        new Person(personId: "1001", name: "FengQian").save(flush: true)

        when:
        to HomePage

        and:
        ShowPersonLink.click()

        then:
        at ShowPersonPage
        SizeOfPersonTable == 1
    }
}
