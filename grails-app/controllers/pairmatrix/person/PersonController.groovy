package pairmatrix.person

import pairmatrix.Person


class PersonController {

    def create = {
        [personList: Person.list()]
    }

    def show = {
        [personList: Person.findAll()]
    }

    def save = {
        new Person(personId: params.userId, name: params.userName).save(flush: true)
        redirect(action: 'show')
    }

    def delete = {
        def deletePerson = Person.findByPersonId(params.id)
        if (deletePerson != null) {
            deletePerson.delete();
        }
        redirect(action: 'show')
    }
}
