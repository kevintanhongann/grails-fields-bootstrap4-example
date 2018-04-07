package grails.fields.bootstrap4.example

class Venue {

    String name
    String address1
    String address2
    String city
    String state
    String country

    static constraints = {
        name blank: false, nullable: false
        address1 blank: false, nullable: false
        address2 blank: false, nullable: false
        city blank: false, nullable: false
        state blank: false, nullable: false
        country blank: false, nullable: false
    }
}
