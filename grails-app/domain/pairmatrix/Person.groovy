package pairmatrix


class Person {
    static mapping = {
        table 'Person'
    }

    static constraints = {
        personId(unique: true, blank: false)
        name(nullable: false)
    }

    String personId
    String name
}
